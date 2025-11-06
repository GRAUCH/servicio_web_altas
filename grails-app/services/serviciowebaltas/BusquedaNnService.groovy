package serviciowebaltas

import org.codehaus.groovy.grails.commons.GrailsApplication

import java.text.DateFormat
import java.text.Format
import java.text.SimpleDateFormat

import org.apache.axis.types.Token

import serviciowebaltann.FechaUtils
import serviciowebaltann.ValorUtils
import serviciowebaltann.ClienteMapper;
import serviciowebaltann.PolizaMapper;

import com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRP_ServiceLocator
import com.scor.www.SRPFileInbound.DATOS
import com.scor.www.SRPFileInbound.DATOSCoberturas
import com.scor.www.SRPFileInbound.DATOSServicio
import com.scor.www.SRPFileInbound.REGISTRO_DATOS
import com.scor.www.SRPFileInbound.RootElement
import com.scor.www.SRPFileInbound.RootElementCABECERA
import com.scor.www.SRPFileInbound.RootElementPIE
import com.scortelemed.servicios.ClaveFiltro
import com.scortelemed.servicios.ErrorCRM
import com.scortelemed.servicios.Expediente
import com.scortelemed.servicios.Filtro
import com.scortelemed.servicios.Frontal
import com.scortelemed.servicios.FrontalServiceLocator
import com.scortelemed.servicios.RespuestaCRM
import com.scortelemed.servicios.Siniestro
import com.scortelemed.servicios.TipoEstadoExpediente
import com.scortelemed.servicios.TipoExpediente
import com.scortelemed.servicios.TipoMotivoEstadoExpediente
import com.scortelemed.servicios.Usuario
import com.scortelemed.servicios.PreguntaRespuesta
import com.scortelemed.servicios.TipoDato
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import es.ingnn.www.NN_ServiciosStub
import es.ingnn.www.ObtenerInfoClienteDocument
import es.ingnn.www.ObtenerInfoClienteResponseDocument
import es.ingnn.www.ObtenerTokenDocument
import es.ingnn.www.ObtenerTokenResponseDocument
import es.ingnn.www.ObtenerInfoClienteDocument.ObtenerInfoCliente
import es.ingnn.www.ObtenerInfoClienteResponseDocument.ObtenerInfoClienteResponse
import es.ingnn.www.ObtenerTokenDocument.ObtenerToken
import es.ingnn.www.ObtenerTokenResponseDocument.ObtenerTokenResponse
import grails.transaction.Transactional

@Transactional
class BusquedaNnService {

    def commonService
    GrailsApplication grailsApplication
     private static Log log = LogFactory.getLog("logNN." + BusquedaNnService.class.getName())

    def serviceMethod() {
    }

    def obtenerToken(String wsdl, String dni, String poliza, String pass, String user) {

        NN_ServiciosStub stub = new NN_ServiciosStub(wsdl)

        ObtenerTokenDocument obtenerTokenDocument = ObtenerTokenDocument.Factory.newInstance()
        ObtenerTokenResponseDocument obtenerTokenResponseDocument


        ObtenerToken obtenerToken = ObtenerToken.Factory.newInstance()

        obtenerToken.setPassword(pass)
        obtenerToken.setUser(user)
        obtenerToken.setDni(dni.toUpperCase())
        obtenerToken.setPoliza(poliza)

        obtenerTokenDocument.setObtenerToken(obtenerToken)

        obtenerTokenResponseDocument = stub.obtenerToken(obtenerTokenDocument)

        ObtenerTokenResponse obtenerTokenResponse = obtenerTokenResponseDocument.getObtenerTokenResponse()

        //log.info "obtenerToken: volvemos con " + obtenerTokenResponse.getObtenerTokenResult()

        return obtenerTokenResponse.getObtenerTokenResult()
    }


    def obtenerInfoCliente(String wsdl, String token, String dni, String producto, String poliza) {

        NN_ServiciosStub stub = new NN_ServiciosStub(wsdl)

        ObtenerInfoClienteDocument obtenerInfoClienteDocument = ObtenerInfoClienteDocument.Factory.newInstance()
        ObtenerInfoClienteResponseDocument obtenerInfoClienteResponseDocument

        ObtenerInfoCliente obtenerInfoCliente = ObtenerInfoCliente.Factory.newInstance()

        obtenerInfoCliente.setToken(token)
        obtenerInfoCliente.setDni(dni.toUpperCase())
        obtenerInfoCliente.setPoliza(poliza)
        obtenerInfoCliente.setProducto(producto)

        obtenerInfoClienteDocument.setObtenerInfoCliente(obtenerInfoCliente)

        obtenerInfoClienteResponseDocument = stub.obtenerInfoCliente(obtenerInfoClienteDocument)

        ObtenerInfoClienteResponse obtenerInfoClienteResponse = obtenerInfoClienteResponseDocument.getObtenerInfoClienteResponse()

        return obtenerInfoClienteResponse.getObtenerInfoClienteResult()
    }


    def obtenerUsuario(String clave, String dominio, String unidadOrganizativa, String nombreUsuario) {
        return new Usuario(clave, dominio, unidadOrganizativa, nombreUsuario);
    }

    def buildPayload(PolizaMapper poliza, ClienteMapper cliente, String cia, def garantias) {

        RootElement payload = new RootElement()
        payload.setCABECERA(buildCabecera(cia))
        payload.setDATOS(buildDatos(cliente, poliza, cia, garantias))
        payload.setPIE(buildPie(payload.getDATOS()))
        return payload
    }

    def buildCabecera(String cia) {

        RootElementCABECERA cabecera = new RootElementCABECERA()

        cabecera.setCodigoCia(cia)
        cabecera.setContadorSecuencial("1")
        cabecera.setFechaGeneracion(FechaUtils.getCurrentDateAsString())
        cabecera.setFiller("")
        cabecera.setTipoFichero("1")

        return cabecera
    }

    def buildPie(DATOS[] registros) {

        RootElementPIE pie = new RootElementPIE()

        pie.setFiller("")

        int numFilasFichero = 100
        pie.setNumFilasFichero(numFilasFichero)

        if (ValorUtils.hasElements(registros)) {
            pie.setNumRegistros(registros.length)
        } else {
            pie.setNumRegistros(0)
        }

        return pie
    }

    def buildDatos(ClienteMapper cliente, PolizaMapper poliza, String cia, def garantias) {


        DATOS[] datos = new DATOS[1]
        DATOS dato = new DATOS()
        
        log.info "Cliente: " + cliente
        log.info "Poliza: " + poliza
        log.info "Garantia: " + garantias

        dato.setRegistro(buildRegistro(cliente, poliza, cia, garantias))
        dato.setServicio(buildServicios(poliza))

        datos[0] = dato

        return datos
    }

    def buildCoberturas() {

        DATOSCoberturas[] datosCoberturas = new DATOSCoberturas[1]

        datosCoberturas[0] = new DATOSCoberturas()
        datosCoberturas[0].setCodigoCobertura("COB5")
        datosCoberturas[0].setNombreCobertura("Fallecimiento")
        datosCoberturas[0].setCapital(0.0)
        datosCoberturas[0].setFiller("")

        return datosCoberturas
    }

    def buildRegistro(ClienteMapper cliente, PolizaMapper poliza, String cia, def garantias) {

        REGISTRO_DATOS datos = new REGISTRO_DATOS()

        setDatosCandidato(datos, cliente, poliza)
        setDatosExpediente(datos, poliza, cia, garantias)
        setCamposGenericos(datos)

        return datos
    }

    private void setCamposGenericos(REGISTRO_DATOS datos) {

        datos.setCampo1("es")
        datos.setCampo2("")
        datos.setCampo3("ES")
        datos.setCampo4("")
        datos.setCampo5("")
        datos.setCampo6("")
        datos.setCampo7("")
        datos.setCampo8("")
        datos.setCampo9("")
        datos.setCampo10("")
        datos.setCampo11("")
        datos.setCampo12("")
        datos.setCampo13("")
        datos.setCampo14("")
        datos.setCampo15("")
        datos.setCampo16("")
        datos.setCampo17("")
        datos.setCampo18("")
        datos.setCampo19("")
        datos.setCampo20("")
    }


    def buildServicios(PolizaMapper poliza) {

        DATOSServicio[] datosServicios = new DATOSServicio[1];

        datosServicios[0] = new DATOSServicio();

        if (poliza.getCompany() != null) {

            if (poliza.getCompany().equals("V")) {
                datosServicios[0].setCodigoServicio("V")
            } else if (poliza.getCompany().equals("G")) {
                datosServicios[0].setCodigoServicio("G")
            } else {
                datosServicios[0].setCodigoServicio("V")
            }
        }

        datosServicios[0].setDescripcionServicio("")
        datosServicios[0].setTipoServicios("S")
        datosServicios[0].setFiller("")

        return datosServicios
    }

    def setDatosCandidato(REGISTRO_DATOS datos, ClienteMapper cliente, PolizaMapper poliza) {

        def String apellidos
        def String direccion


        if (cliente.getNombre() != null) {
            datos.setNombreCliente(cliente.getNombre())
        }

        if (cliente.getApellido1() != null) {

            apellidos = cliente.getApellido1()
        }

        if (cliente.getApellido1() != null) {

            apellidos = apellidos + " " + cliente.getApellido2()
        }

        datos.setApellidosCliente(apellidos)

        if (cliente.getSexo() != null) {
            if (cliente.getSexo().equals("M")) {
                datos.setSexo("V")
            } else {
                datos.setSexo("M")
            }
        }

        if ((cliente.getTelFijo() == null || cliente.getTelFijo().trim().isEmpty()) && (cliente.getTelMovil() == null || cliente.getTelMovil().trim().isEmpty())) {
            datos.setTelefono1("999999999")
            datos.setTelefono2("")
        } else {

            if (cliente.getTelFijo()) {
                datos.setTelefono1(cliente.getTelFijo())
            } else {
                datos.setTelefono1(cliente.getTelMovil())
            }

            if (cliente.getTelMovil()) {
                datos.setTelefono2(cliente.getTelMovil())
            } else {
                datos.setTelefono2("")
            }
        }
        if (cliente.getProvincia() != null) {
            datos.setProvincia(cliente.getProvincia())
        }

        if (cliente.getPoblacion() != null) {
            datos.setPoblacion(cliente.getPoblacion())
        }

        if (cliente.getTipoVia() != null) {
            direccion = cliente.getTipoVia()
        }

        if (cliente.getDireccion() != null) {

            direccion = direccion + " " + cliente.getDireccion()
        }

        datos.setDireccionCliente(direccion)

        if (cliente.getCodPostal()) {
            datos.setCodigoPostal(cliente.getCodPostal())
        }

        if (cliente.getDni()) {
            datos.setDni(cliente.getDni())
        }

        if (cliente.getFechaNacimiento()) {
            datos.setFechaNacimiento(FechaUtils.dateToString(cliente.getFechaNacimiento(), "yyyyMMdd"))
        }

        //Ponemos la edad actuail fija debido a que el servicio de calcularEdadActuarial del BPEL no esta funcionando bien y devuelve un -1
        //y esto generar un error en el CRM
        datos.setEdadActuarial(50)
        datos.setTelefono3("")
        datos.setEmail("")
        datos.setLugarNacimiento("")
        datos.setPais("ES")
        datos.setClaveValidacionCliente("")
        datos.setNomApellAgente("")
        datos.setTelefonoAgente("")
        datos.setEmailAgente("")
        datos.setEstadoCivil("")
        datos.setTipoCliente("N")
        datos.setFranjaHoraria("")
        datos.setCodigoCuestionario("")
        datos.setObservaciones("")
    }

    def setDatosExpediente(REGISTRO_DATOS datos, PolizaMapper poliza, String cia, def garantias) {

        DateFormat df = new SimpleDateFormat("yyyyMMdd");

        datos.setEstadoExpediente(TipoEstadoExpediente.PREAPERTURADO.toString())

        datos.setCodigoCia(cia)
        datos.setCodigoAgencia(cia)
        datos.setTipoServicio(0)


        if (poliza.getCompany() != null) {

            if (poliza.getCodProducto().equalsIgnoreCase("430")) {
                String codGarantia = obtenerGarantia(garantias, "T430")
                if (codGarantia) {
                    datos.setCodigoProducto("SNMA")
                } else {
                    datos.setCodigoProducto("vida")
                }
            } else if (poliza.getCompany().equals("V")) {
                datos.setCodigoProducto("vida")
            } else if (poliza.getCompany().equals("G")) {
                datos.setCodigoProducto("general")
            }
            //TODO Revisar con datos reales
            else {
                log.info "codProducto: " + poliza.getCodProducto()
                log.info "codCompany: " + poliza.getCompany()
                datos.setCodigoProducto(poliza.getCodProducto())
            }
        }

        datos.setFechaGeneracion(new Token(FechaUtils.dateFechaInternaToString(new Date())));
        datos.setFechaEnvio(FechaUtils.dateFechaInternaToString(new Date()))
        datos.setNumPoliza(poliza.getNumPoliza())
        datos.setNumSolicitud("0")
        datos.setNumSecuencia(" ")
        datos.setNumMovimiento(" ")
        datos.setNumCertificado(" ")
        datos.setModificarSolicitudesDuplicadas("N")
        datos.setCapitalFallecimiento(0)
        datos.setCoberturaFallecimiento("COB5")
        datos.setCapitalInvalidez(0)
        datos.setCoberturaInvalidez("COB4")
    }

    String obtenerGarantia(def garantias, String codGarantia) {
        String salida = null
        if (garantias && codGarantia) {
            for (def garantia : garantias) {
                if (garantia.codGarantia && codGarantia.equals(garantia.codGarantia)) {
                    salida = codGarantia
                    break
                }
            }
        }
        return salida
    }

    def modificacionesExpediente(String username, String numPolizaSeleccionada, String textoBeneficiarios, PolizaMapper poliza, ClienteMapper cliente, String frontalPortAddress, String user, String dominio, String pass, String unidad) {

        Frontal frontal
        Usuario usuario
        RespuestaCRM respuestaCrmExpediente
        RespuestaCRM respuestaCrmSiniestro = new RespuestaCRM()
        Expediente exp
        Expediente expSiniestro

        def limite = 0
        def encontrado = false
        def intentos = 3

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Format format = new SimpleDateFormat("yyyyMMdd");

        Expediente expediente = new Expediente()
        Siniestro siniestro = new Siniestro()

        ErrorCRM errorCRM = new ErrorCRM()
        log.info "Modificacion expediente Entramos bucle"
        frontal = commonService.instanciarFrontal(frontalPortAddress)

        try {
            if (frontal == null) {
                throw new Exception("Error al instanciar el frontal")
            }
            log.info "Modificacion expediente obtenerUsuario"
            usuario = obtenerUsuario(pass, dominio, unidad, user)

            if (usuario == null) {
                throw new Exception("Error al recuperar el usuario CRM")
            }

            Filtro filtro = new Filtro();

            /**BLOQUE DE CODIGO QUE VERIFICA QUE EL EXPEDIENTE NO EXISTE PREVIAMENTE
             *
             */
            List obtenerExpedientesDeSiniestroRetorno

            log.info "Entramos bucle"
            while (!encontrado && limite < intentos) {
                filtro.setClave(ClaveFiltro.NUM_POLIZA);
                filtro.setValor(numPolizaSeleccionada);

                log.info("Intentando modificar póliza seleccionada: " + numPolizaSeleccionada + " - Intento: " + limite)

                respuestaCrmExpediente = commonService.consultaExpedienteFrontal(frontal, usuario, filtro, 30)

                if (respuestaCrmExpediente != null && respuestaCrmExpediente.getListaExpedientes() != null && respuestaCrmExpediente.getListaExpedientes().size() > 0) {

                    for (int i = 0; i < respuestaCrmExpediente.getListaExpedientes().size(); i++) {
                        log.info("Expediente " + (i+1) + " de " + respuestaCrmExpediente.getListaExpedientes().size())

                        exp = respuestaCrmExpediente.getListaExpedientes(i)

                        filtro.setClave(ClaveFiltro.EXPEDIENTE)
                        filtro.setValor(exp.getCodigoST())

                        log.info("Del expediente " + exp.getCodigoST() + " recuperamos el sinistro" )

                        respuestaCrmSiniestro = commonService.consultaExpedienteSiniestroFrontal(frontal, usuario, filtro, 30)

                        log.info("respuestaCrmSiniestro " +  respuestaCrmSiniestro)                        
                        log.info("respuestaCrmSiniestro.getListaExpedientes() " +  respuestaCrmSiniestro.getListaExpedientes() )
                        if (respuestaCrmSiniestro.getListaExpedientes() != null) {
                            log.info("respuestaCrmSiniestro.getListaExpedientes().size() " +  respuestaCrmSiniestro.getListaExpedientes().size())
                        } else {
                            log.info("respuestaCrmSiniestro.getListaExpedientes().size() -1" )
                        }

                        obtenerExpedientesDeSiniestroRetorno = commonService.obtenerExpedientesDeSiniestro(respuestaCrmSiniestro, formatter, respuestaCrmExpediente, encontrado, expediente)

                        log.info("respuestaCrmExpediente " +  obtenerExpedientesDeSiniestroRetorno.get(0))                        
                        log.info("encontrado " +  obtenerExpedientesDeSiniestroRetorno.get(1))                        
                        log.info("expediente " +  obtenerExpedientesDeSiniestroRetorno.get(2).getCodigoST())                        
                        
                        
                        respuestaCrmExpediente = obtenerExpedientesDeSiniestroRetorno.get(0)
                        encontrado = obtenerExpedientesDeSiniestroRetorno.get(1)
                        expediente = obtenerExpedientesDeSiniestroRetorno.get(2)
                    }
                }

                limite++
            }

            if (limite == intentos) {
                log.info("No se ha podido crear la póliza con número: " + numPolizaSeleccionada)
                errorCRM.setDetalle("No se ha podido crear la póliza con número: " + numPolizaSeleccionada)

                //throw new Exception("No se ha podido crear la póliza con número: " + numPolizaSeleccionada)
            } else {
                log.info("La Póliza seleccionada: " + numPolizaSeleccionada + "ha sido modificada")
                log.info("Procesamos el expediente: " + expediente)
                expediente.setTipoExpediente(TipoExpediente.SINIESTROS)
                expediente.setCodigoEstado(TipoEstadoExpediente.PREAPERTURADO)
                expediente.setTipoMotivoEstadoExpediente(TipoMotivoEstadoExpediente.PTE_DOC_ASEGURADO)
                expediente.setNombreProductoCIA(poliza.getProducto())
                expediente.setCodigoProductoCIA(poliza.getCodProducto())
                //
                //            if (poliza.getFechaEfecto() != null && poliza.getFechaEfecto()){
                //                //expediente.setFechaDeAltaPoliza(format.format(poliza.getFechaEfecto()))
                //            }
                //

                log.info("Gestion de candidatos: " )
                log.info("Gestion de candidatos -> getCandidato(): " + expediente.getCandidato())
                log.info("Gestion de candidatos: " + cliente.getCodCliente() )
                if (expediente.getCandidato() != null) {
                    expediente.getCandidato().setInterviniente(cliente.getCodCliente().toString())
                } 

                //SOlo se graba para SENIOR
                if (poliza.getCodProducto() == grailsApplication.config.nn.proCode) {
                    if (poliza.getOsteoporosis()!="" && poliza.getOsteopenia()!="") {
                        PreguntaRespuesta[] listPregResp = new PreguntaRespuesta[2];
				        listPregResp[0] = crearPreguntaRespuesta(poliza.getOsteoporosis(),"Osteoporosis", expediente.getCodigoST());
                        listPregResp[1] = crearPreguntaRespuesta(poliza.getOsteopenia(),"Osteopenia", expediente.getCodigoST());
                        expediente.setPreguntasRespuestas(listPregResp);
                    }
                }

                /**CAMBIO DATOS DEL EXPEDIENTE REFERENTES AL SINIESTRO
                 *
                 */
                respuestaCrmExpediente = commonService.modificaExpedienteFrontal(frontal, usuario, expediente, 30)

                if (respuestaCrmExpediente.getErrorCRM() != null && respuestaCrmExpediente.getErrorCRM().getDetalle() != null) {
                    throw new Exception("No se ha podido completar el expediente con numero de poliza: " + numPolizaSeleccionada + " y codigoSt: " + expediente.getCodigoST() + " al tipo de SINIESTRO")
                } else {

                    /**AHORA ASIGNAMOS EL SINIESTRO AL EXPEDIENTE
                     *
                     */
                    siniestro.setTextoBeneficiarios(textoBeneficiarios)
                    siniestro.setProfesion(cliente.getProfesion())
                    siniestro.setFranquicia(poliza.getDiasFranquicia().toString())                    

                    respuestaCrmSiniestro = commonService.modificaExpedienteSiniestroFrontal(frontal, usuario, expediente, siniestro, 30)

                    if (respuestaCrmSiniestro.getErrorCRM() != null) {
                        throw new Exception("No se ha podido asignar el siniestro al expediente con numero de poliza: " + numPolizaSeleccionada + " y codigoSt: " + expediente.getCodigoST())
                    } else {
                        respuestaCrmSiniestro.setErrorCRM(null)
                        respuestaCrmSiniestro.setListaExpedientes(respuestaCrmExpediente.getListaExpedientes())
                    }
                }
            }
        } catch (Exception e) {
            log.info "Error en modificacionesExpediente " + e.getMessage()
            errorCRM.setDetalle(e.getMessage())
            if (respuestaCrmSiniestro) {
                respuestaCrmSiniestro.setErrorCRM(errorCRM)
            }
        }

        return respuestaCrmSiniestro
    }

    public PreguntaRespuesta crearPreguntaRespuesta(String respuesta, String etiqueta, String codigoST) {
		PreguntaRespuesta pregRespuesta = new PreguntaRespuesta();
		pregRespuesta.setCodigoPregunta(etiqueta);
		pregRespuesta.setPregunta(etiqueta);
		pregRespuesta.setCodigoSTExpediente(codigoST);
		pregRespuesta.setTipoDato(TipoDato.STRING);
		pregRespuesta.setRespuesta(respuesta);
		return pregRespuesta;
	}
    
}
