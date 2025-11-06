package serviciowebaltas

import com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRP_PortType
import com.scor.www.SRPFileInbound.RootElement
import com.scortelemed.servicios.Expediente
import com.scortelemed.servicios.RespuestaCRM
import es.ingnn.www.NNSalida
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.security.access.annotation.Secured
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import org.xml.sax.InputSource
import serviciowebaltann.BeneficiarioPolizaMapper
import serviciowebaltann.ClienteMapper
import serviciowebaltann.GarantiaPolizaMapper
import serviciowebaltann.PolizaMapper
import serviciowebaltasnn.Siniestro
import serviciowebaltann.ClienteRestMapper
import util.GestionException
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import java.text.SimpleDateFormat

@Secured('permitAll')
class BusquedaNnController {

    def busquedaNnService
    def busquedaRestNnService
    def springSecurityService
    NNSalida token
    NNSalida infoCliente
    ClienteRestMapper clienteRestData
    def static xmlString = ""
    def clientes = []
    def polizas = []
    def garantias = []
    def beneficiarios = []
    def siniestros = []
    def polizaSeleccionada = false
    CreacionExpedienteAsyncSRP_PortType conexionBpel
    RootElement payload
    def resultadoService
    RespuestaCRM respuestaCrm
    def commonService

    private static Log log = LogFactory.getLog("logNN." + BusquedaNnController.class.getName())
    def static userDetails

    def index() {
        flash.error = ""
        flash.message = ""
        userDetails = springSecurityService.principal
        session.setAttribute("numPolizaSeleccionada", null)
    }

    /**M�todo que en funcion de los datos introducidos recupera el token y la informaci�n asociada al candidato
     *
     * @param params
     * @return
     */
    def buscar(params) {

        if (params.dni.isEmpty()) {
            log.info 'No se ha introducido ningun DNI para recuperar'
            data.existeError = true
        }  else {

            log.info("Obteniendo token para valores dni: " + params.dni + " y poliza: " + params.poliza)

            boolean viejoSistemaError = false;
            boolean nuevoSistemaError = false;

            busquedaRestNnService.cleanData()
            session.setAttribute("clienteRestData", null)
            session.setAttribute("xmlString",null)

            try {
                //log.info("WSDL: ${grailsApplication.config.nn.wsdl}")
                //log.info("userNN: ${grailsApplication.config.nn.user}")
                //log.info("passNN: ${grailsApplication.config.nn.pass}")

                log.info "Obteniendo token del servicio WSDL"
                token = busquedaNnService.obtenerToken(grailsApplication.config.nn.wsdl, params.dni.trim(), params.poliza.trim(), grailsApplication.config.nn.pass, grailsApplication.config.nn.user)

                if (token == null || token?.existeError) {
                    log.info "No se ha obtenido el token del servicio WSDL"
                    if (token)
                        flash.error = token?.getMsgError()?.toString()
                    viejoSistemaError = true
                } else {
                    //Se obtienen los datos del sistema antiguo
                    log.info "Token obtenido del servicio WSDL"
                    log.info "Obteniendo informacion cliente del servicio WSDL"
                    infoCliente = busquedaNnService.obtenerInfoCliente(grailsApplication.config.nn.wsdl, token.getValor(), params.dni.trim(), params.producto.trim(), params.poliza.trim())

                    if (infoCliente.existeError) {
                        log.info "No se ha obtenido la informacion de cliente del servicio WSDL"
                        log.info infoCliente.getMsgError().toString()
                        flash.error = "No se ha obtenido la información del cliente del servicio WSDL con dni: " + params.dni.trim() + ". Contactar con IT"
                        viejoSistemaError = true
                    } else {
                        log.info "Informacion cliente obtenida del servicio WSDL"
                        flash.error = ""
                        session.setAttribute("xmlString", infoCliente.getDatos().xmlText())
                    }
                }
            } catch (Exception e) {
                def exception = new GestionException(this.getClass(), "buscar", e)
                log.error "Usuario del servicio WSDL " + userDetails?.getUsername() + "-" + exception.toString()
                log.error e.printStackTrace()
                if (flash.error != null) {
                    flash.error = token?.getMsgError()?.toString()
                    log.info "Usuario del servicio WSDL" + userDetails?.getUsername() + "-" + token?.getMsgError()?.toString()
                } else {
                    flash.error = "Error al obtener el token de seguridad del servicio WSDL. Contactar con IT"
                    log.info "Error al obtener el token de seguridad del servicio WSDL. Contactar con IT"
                }
                viejoSistemaError = true

            }

            try {
                log.info "Obteniendo informacion del cliente REST_API con dni " + params.dni.trim()
                clienteRestData = busquedaRestNnService.obtenerInfoClienteByDni(params.dni.trim())

                if (clienteRestData.getTokenError()) {
                    flash.error = "Error al obtener el token de seguridad del cliente REST_API. Contactar con IT"
                    nuevoSistemaError = true
                } else {

                    if (clienteRestData.existeError) {
                        log.info "No se ha obtenido la informacion de cliente REST_API"
                        flash.error = "No se ha obtenido la información del cliente REST_API con dni: " + params.dni.trim() + ". Contactar con IT"
                        nuevoSistemaError = true
                    } else {
                        log.info "Si se ha obtenido la informacion de cliente del REST_API"
                        flash.error = ""
                        session.setAttribute("clienteRestData", clienteRestData)
                    }
                }


            } catch (Exception e) {
                log.error e.printStackTrace()
                flash.error = "Error al obtener informacion del cliente REST_API. Contactar con IT"
                nuevoSistemaError = true
            }



            //Se comprueba que el cliente buscado no este en ninguno de los dos sistemas para devolver error
            if (!(viejoSistemaError && nuevoSistemaError)) {
                flash.error = ""
            }


            // si el atributo error no esta vacio se renderiza para mostrarlo por pantalla
            if (!flash?.error?.empty) {
                log.error "Usuario del cliente REST_API" + userDetails?.getUsername() + "-" + flash?.error
                render view: 'contenido', model: [flash: flash]
            } else {
                redirect(action: "resultados")
            }
        }
    }

    /**Metodo que en funcion de los datos introducidos recupera el token y la informaci�n asociada al candidato desde la vista de resultado
     *
     * @param params
     * @return
     */
    def buscarDesdeResultado(params) {
        log.info "Buscando informacion para cliente"

        busquedaRestNnService.cleanData()
        session.setAttribute("clienteRestData", null)
        session.setAttribute("xmlString",null)

        log.info "Obteniendo token para valores dni a traves del servicio WSDL: " + params.dni + " y poliza: " + params.poliza
        token = busquedaNnService.obtenerToken(grailsApplication.config.nn.wsdl, params.dni.trim(), params.poliza.trim(), grailsApplication.config.nn.pass, grailsApplication.config.nn.user)
        if (token?.existeError) {

            log.error "No se ha obtenido el token a traves de servicio WSDL"
            flash.error = token.getMsgError().toString()
        } else {
            log.info "Token obtenido del servicio WSDL"
            log.info "Invocamos al servicio WSDL - obtener info cliente"
            infoCliente = busquedaNnService.obtenerInfoCliente(grailsApplication.config.nn.wsdl, token.getValor(), params.dni.trim(), params.producto.trim(), params.poliza.trim())
            log.info "Invocamos al servicio API REST - obtener client rest data"
            clienteRestData = busquedaRestNnService.obtenerInfoCliente(grailsApplication.config.nn.wsdl, token.getValor(), params.dni.trim(), infoCliente.getDatos().xmlText())
            session.setAttribute("clienteRestData", clienteRestData)
            if (infoCliente.existeError) {
                log.error "No se ha obtenido la informacion de cliente del servicio WSDL"
                flash.error = infoCliente.getMsgError().toString()
                //Buscar datos de cliente via API
                if (!clienteRestData.existeError) {
                    log.info "Se ha obtenido la informacion de cliente del servicio REST_API"
                    flash.error = ""
                }
            } else {

                flash.error = ""
                if (clienteRestData.existeError) {
                    log.info "Usuario del servicio REST_API" + userDetails.getUsername() + "-No se ha obtenido la informacion de cliente REST"
                    flash.error = ""
                }
            }
        }

        if (flash.error.empty) {

            xmlString = infoCliente.getDatos().xmlText()
            session.setAttribute("xmlString", infoCliente.getDatos().xmlText())
            redirect(action: "resultados")
        } else {

            log.error "Usuario_" + userDetails.getUsername() + "-" + flash.error
            xmlString = null
            redirect(action: "resultados")
        }
    }

    /**M�todo que lee el XML devuelto por NN y lo transforma a objetos en memoria
     *
     * @return
     */
    def resultados() {

        clientes = []
        polizas = []
        garantias = []
        beneficiarios = []
        siniestros = []
        def xmlString = session.getAttribute("xmlString")
        ClienteRestMapper clienteRestData = session.getAttribute("clienteRestData")



        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")

     
        if (xmlString != null) {

            log.info "Obteniendo datos del servicio WSDL"

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance()
            DocumentBuilder builder = factory.newDocumentBuilder()

            InputSource is = new InputSource(new StringReader(xmlString))
            is.setEncoding("UTF-8")
            Document doc = builder.parse(is)


            doc.getDocumentElement().normalize()

            NodeList nList = doc.getElementsByTagName("CLIENTE")

            log.info "Obteniendo datos del cliente"

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp)

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    def apellido2 = null
                    def sexo = null
                    def codProfesion = null
                    def profesion = null
                    def fechaNacimiento = null

                    Element eElement = (Element) nNode;

                    if (eElement.getElementsByTagName("APELLIDO2").item(0) != null) {
                        apellido2 = eElement.getElementsByTagName("APELLIDO2").item(0).getTextContent()
                    }

                    if (eElement.getElementsByTagName("SEXO").item(0) != null) {
                        sexo = eElement.getElementsByTagName("SEXO").item(0).getTextContent()
                    }

                    if (eElement.getElementsByTagName("CODPROFESION").item(0) != null) {
                        codProfesion = eElement.getElementsByTagName("CODPROFESION").item(0).getTextContent()
                    }

                    if (eElement.getElementsByTagName("PROFESION").item(0) != null) {
                        profesion = eElement.getElementsByTagName("PROFESION").item(0).getTextContent()
                    }

                    if (eElement.getElementsByTagName("FECHANAC").item(0) != null) {
                        fechaNacimiento = eElement.getElementsByTagName("FECHANAC").item(0).getTextContent()
                    }


                    ClienteMapper cliente = new ClienteMapper(
                            rowId: eElement.getElementsByTagName("ROW_ID").item(0).getTextContent(),
                            nombre: eElement.getElementsByTagName("NOMBRE").item(0).getTextContent(),
                            apellido1: eElement.getElementsByTagName("APELLIDO1").item(0).getTextContent(),
                            apellido2: apellido2 != null ? apellido2 : "",
                            dni: eElement.getElementsByTagName("DNI").item(0).getTextContent(),
                            codCliente: eElement.getElementsByTagName("CODCLIENTE").item(0).getTextContent(),
                            sexo: sexo != null ? sexo : "",
                            telFijo: eElement.getElementsByTagName("TEL_FIJO").item(0).getTextContent(),
                            telMovil: eElement.getElementsByTagName("TEL_MOVIL").item(0) != null ? eElement.getElementsByTagName("TEL_MOVIL").item(0).getTextContent() : "",
                            codProfesion: codProfesion != null ? codProfesion : "",
                            profesion: profesion != null ? profesion : "",
                            fechaNacimiento: fechaNacimiento != null ? formatter.parse(fechaNacimiento) : null,
                            asegurado: eElement.getElementsByTagName("ASEGURADO").item(0) != null ? eElement.getElementsByTagName("ASEGURADO").item(0).getTextContent() : "",
                            tomador1: eElement.getElementsByTagName("TOMADOR1").item(0) != null ? eElement.getElementsByTagName("TOMADOR1").item(0).getTextContent() : "",
                            tomador2: eElement.getElementsByTagName("TOMADOR2").item(0) != null ? eElement.getElementsByTagName("TOMADOR2").item(0).getTextContent() : "",
                            tipoVia: eElement.getElementsByTagName("TIPOVIA").item(0).getTextContent(),
                            direccion: eElement.getElementsByTagName("DIRECCION").item(0).getTextContent(),
                            poblacion: eElement.getElementsByTagName("POBLACION").item(0).getTextContent(),
                            provincia: eElement.getElementsByTagName("PROVINCIA").item(0).getTextContent(),
                            codPostal: eElement.getElementsByTagName("CPOSTAL").item(0).getTextContent(),
                            pais: eElement.getElementsByTagName("PAIS").item(0).getTextContent())

                    clientes << cliente
                }
            }

            log.info "Datos del cliente obtenidos correctamente"

            nList = doc.getElementsByTagName("POLIZA")

            log.info "Obteniendo datos de las polizas"

            for (int temp = 0; temp < nList.getLength(); temp++) {

                def diasFranquicia = 0
                def duracionRenta = 0
                def fechaEfecto = null
                def fechaVctCobro = null
                def formaDePago = ""

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    // Función auxiliar para obtener texto seguro con logging
                    def getText = { String tag ->
                        def node = eElement.getElementsByTagName(tag)?.item(0)
                        if (node == null) {
                            log.warn "Campo '${tag}' no encontrado en la póliza."
                            return null
                        }
                        def text = node.getTextContent()?.trim()
                        if (!text) {
                            log.warn "Campo '${tag}' está vacío en la póliza."
                            return null
                        }
                        return text
                    }

                    // FECEFECTO
                    def fechaEfectoStr = getText("FECEFECTO")
                    if (fechaEfectoStr) {
                        fechaEfecto = fechaEfectoStr
                    }

                    // FECVTOCOBRO
                    def fechaVtoCobroStr = getText("FECVTOCOBRO")
                    if (fechaVtoCobroStr) {
                        fechaVctCobro = fechaVtoCobroStr
                    }

                    // DIASFRANQUICIA
                    def diasStr = getText("DIASFRANQUICIA")
                    if (diasStr) {
                        try {
                            diasFranquicia = Integer.parseInt(diasStr)
                        } catch (NumberFormatException e) {
                            log.warn "DIASFRANQUICIA no es un número válido: '${diasStr}'"
                        }
                    }

                    // DUR_RENTA
                    def duracionStr = getText("DUR_RENTA")
                    if (duracionStr) {
                        try {
                            duracionRenta = Integer.parseInt(duracionStr)
                        } catch (NumberFormatException e) {
                            log.warn "DUR_RENTA no es un número válido: '${duracionStr}'"
                        }
                    }

                    // FORMAPAGO
                    def formaPagoStr = getText("FORMAPAGO")
                    if (formaPagoStr) {
                        formaDePago = formaPagoStr
                    }

                    PolizaMapper poliza = new PolizaMapper(
                        numPoliza: getText("NUMPOLIZA"),
                        dni: getText("DNI"),
                        codSituacion: getText("CODSITUACION"),
                        situacion: getText("SITUACION"),
                        company: getText("COMPANY"),
                        producto: getText("DESCPRODUCTO"),
                        codProducto: getText("CODPRODUCTO"),
                        polizaId: getText("POLIZAID"),
                        fechaEfecto: fechaEfecto ? formatter.parse(fechaEfecto) : null,
                        formaPago: formaDePago,
                        fechaVencimientoCobro: fechaVctCobro ? formatter.parse(fechaVctCobro) : null,
                        diasFranquicia: diasFranquicia,
                        duracionRenta: duracionRenta,
                        asegurado: getText("ASEGURADO"),
                        tomador1: getText("TOMADOR1"),
                        tomador2: getText("TOMADOR2")
                    )

                    polizas << poliza

                }

            }

            log.info "Datos de poliza obtenidos correctamente"

            nList = doc.getElementsByTagName("GARANTIA_POLIZA");

            log.info "Obteniendo garantias poliza"

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    GarantiaPolizaMapper garantiaPoliza = new GarantiaPolizaMapper(
                            numPoliza: eElement.getElementsByTagName("NUMPOLIZA").item(0).getTextContent(),
                            codGarantia: eElement.getElementsByTagName("CODGARANTIA").item(0).getTextContent(),
                            garantia: eElement.getElementsByTagName("GARANTIA").item(0).getTextContent(),
                            capital: eElement.getElementsByTagName("CAPITAL").item(0).getTextContent(),
                            fechaVencimientoGarantia: formatter.parse(eElement.getElementsByTagName("FECVTOGARANTIA").item(0).getTextContent()),
                            fechaVencimientoPrima: formatter.parse(eElement.getElementsByTagName("FECVTOPRIMA").item(0).getTextContent()))

                    garantias << garantiaPoliza

                }
            }

            log.info "Datos de garantias obtenidos correctamente"

            nList = doc.getElementsByTagName("BENEFICIARIO_POLIZA");

            log.info "Obteniendo datos de los beneficiarios"


            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    BeneficiarioPolizaMapper beneficiarioPoliza = new BeneficiarioPolizaMapper(
                            numPoliza: eElement.getElementsByTagName("NUMPOLIZA").item(0).getTextContent(),
                            codigo: eElement.getElementsByTagName("CODIGO").item(0).getTextContent(),
                            descripcion: eElement.getElementsByTagName("DESCRIPCION").item(0).getTextContent(),
                            orden: eElement.getElementsByTagName("ORDEN").item(0).getTextContent())

                    beneficiarios << beneficiarioPoliza
                }
            }

            log.info "Datos de beneficiarios obtenidos correctamente"

            nList = doc.getElementsByTagName("SINIESTRO");

            log.info "Obteniendo datos de siniestros"


            for (int temp = 0; temp < nList.getLength(); temp++) {

                def fechaOcurrencia = null
                def fechaTerminacion = null
                def minusvalia = null
                def causa = null

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    if (eElement.getElementsByTagName("FECOCURRENCIA").item(0) != null) {

                        fechaOcurrencia = eElement.getElementsByTagName("FECOCURRENCIA").item(0).getTextContent()
                    }
                    if (eElement.getElementsByTagName("FECTERMINACION").item(0) != null) {

                        fechaTerminacion = eElement.getElementsByTagName("FECTERMINACION").item(0).getTextContent()
                    }
                    if (eElement.getElementsByTagName("MINUSVALIA").item(0) != null) {

                        minusvalia = eElement.getElementsByTagName("MINUSVALIA").item(0).getTextContent()
                    }

                    if (eElement.getElementsByTagName("CAUSA").item(0) != null) {

                        causa = eElement.getElementsByTagName("CAUSA").item(0).getTextContent()
                    }

                    Siniestro siniestro = new Siniestro(
                            numSiniestro: eElement.getElementsByTagName("NUMSINIESTRO").item(0).getTextContent(),
                            numPoliza: eElement.getElementsByTagName("NUMPOLIZA").item(0).getTextContent(),
                            company: eElement.getElementsByTagName("COMPANY").item(0).getTextContent(),
                            producto: eElement.getElementsByTagName("PRODUCTO").item(0).getTextContent(),
                            tipo: eElement.getElementsByTagName("TIPO").item(0).getTextContent(),
                            causa: causa != null ? causa : null,
                            fechaOcurrencia: fechaOcurrencia != null ? formatter.parse(fechaOcurrencia) : null,
                            fechaTerminacion: fechaTerminacion != null ? formatter.parse(fechaTerminacion) : null,
                            estado: eElement.getElementsByTagName("ESTADO").item(0).getTextContent(),
                            minusvalia: minusvalia != null ? minusvalia : 0)


                    siniestros << siniestro
                }
            }

            log.info "Datos del siniestro obtenidos correctamente"

            log.info "Fin de obteniendo datos para el servicio WSDL"
        }

        if (clienteRestData != null) {

            log.info "obteniendo datos del servicio REST_API"    

            if (clientes != null && clientes.size == 0) {
                //Incluimos datos del cliente
                log.info "Obtenido datos de cliente"
                clientes << clienteRestData.cliente
                log.info "Datos de cliente obtenidos correctamente"
            }

            log.info "Obteniendo datos de polizas"
            if (clienteRestData.polizas != null && clienteRestData.polizas.size > 0) {
                for (int temp = 0; temp < clienteRestData.polizas.size(); temp++) {
                    polizas << clienteRestData.polizas[temp]
                }
            }
            log.info "Datos de poliza obtenidos correctamente"

            log.info "Obteniendo datos de garantias"
            if (clienteRestData.garantiasPolizas != null && clienteRestData.garantiasPolizas.size > 0) {
                for (int temp = 0; temp < clienteRestData.garantiasPolizas.size(); temp++) {
                    garantias << clienteRestData.garantiasPolizas[temp]
                }
            }
            log.info "Datos de garantias obtenidos correctamente"

            log.info "Obteniendo datos de beneficiarios"
            if (clienteRestData.beneficiariosPoliza != null && clienteRestData.beneficiariosPoliza.size > 0) {
                for (int temp = 0; temp < clienteRestData.beneficiariosPoliza.size(); temp++) {
                    beneficiarios << clienteRestData.beneficiariosPoliza[temp]
                }
            }
            log.info "Datos de beneficiarios obtenidos correctamente"

            
            log.info "Obteniendo datos de siniestros"
            if (clienteRestData.siniestros != null && clienteRestData.siniestros.size > 0) {
                for (int temp = 0; temp < clienteRestData.siniestros.size(); temp++) {
                    siniestros << clienteRestData.siniestros[temp]
                }
            }
            log.info "Datos de siniestros obtenidos correctamente"

        }

        log.info "Fin de obteniendo datos para el servicio REST_API"
       
        if (clienteRestData != null || xmlString != null) {
            session.setAttribute("clientes", clientes)
            session.setAttribute("polizas", polizas)
            session.setAttribute("garantias", garantias)
            session.setAttribute("beneficiarios", beneficiarios)
            session.setAttribute("siniestros", siniestros)

            polizaSeleccionada = false
        }


        [clientes: clientes, polizas: polizas, garantias: garantias, beneficiarios: beneficiarios, polizaSeleccionada: polizaSeleccionada, siniestros: siniestros]
    }

    /**M�todo que recupera las garantias y beneficiarios a la p�iza seleccioanada por el usuario
     *
     * @param params
     * @return
     */
    def verGarantias(params) {

        log.info "Recuperando garantias"

        def numPolizaSeleccionada = params.poliza

        def listaGarantias = session.getAttribute("garantias")
        def listaBeneficiarios = session.getAttribute("beneficiarios")
        def listaSiniestros = session.getAttribute("siniestros")

        garantias = []
        beneficiarios = []
        siniestros = []

        polizaSeleccionada = true;

        /**Se recuperan las garant�as asociada a la p�iza seleccionada por el usuario
         *
         */
        for (int i = 0; i < listaGarantias.size(); i++) {
            if (listaGarantias[i].getNumPoliza().equals(numPolizaSeleccionada)) {
                garantias << listaGarantias[i]
            }
        }

        /**Se recuperan los beneficiarios asociados a la p�iza seleccionada por el usuario
         *
         */
        for (int i = 0; i < listaBeneficiarios.size(); i++) {
            if (listaBeneficiarios[i].getNumPoliza().equals(numPolizaSeleccionada)) {
                beneficiarios << listaBeneficiarios[i]
            }
        }

        /**Se recuperan los siniestros asociados a la p�iza seleccionada por el usuario
         *
         */
        for (int i = 0; i < listaSiniestros.size(); i++) {
            if (listaSiniestros[i].getNumPoliza().equals(numPolizaSeleccionada)) {
                siniestros << listaSiniestros[i]
            }
        }

        session.setAttribute("numPolizaSeleccionada", numPolizaSeleccionada)

        log.info "Garantias recuperadas correctamente"

        /**Se muestran las garantias y beneficiarios asociados a la p�iza seleccionada por el usuario
         *
         */

        render(view: "/busquedaNn/garantiasBeneficiarios", model: [garantias: garantias, beneficiarios: beneficiarios, siniestros: siniestros, expedienteCreado: false])

    }

    /**Creaci�n del expediente
     *
     * @return
     */
    def crear() {

        def clientes = session.getAttribute("clientes")
        def polizas = session.getAttribute("polizas")
        def garantias = session.getAttribute("garantias")
        def beneficiarios = session.getAttribute("beneficiarios")
        def numPolizaSeleccionada = session.getAttribute("numPolizaSeleccionada")
        def respuestaCRM
        def clienteSeleccionado
        def polizaSeleccionada
        def textoBeneficiarios = ""
        Expediente expedienteModificado

        if (numPolizaSeleccionada != null) {

            /**Se recupera la informaci�n del candidato asegurado
             *
             */
            log.info "crear: tenemos " + clientes.size() + " usuarios" 
            //log.info "-->" + clientes

            if (clientes.size() > 1) {
                for (int i = 0; i < clientes.size(); i++) {
                    if (clientes[i].getAsegurado() != null && clientes[i].getAsegurado().toUpperCase().equals("Y")) {
                        clienteSeleccionado = clientes[i]
                    }
                }
            } else {
                clienteSeleccionado = clientes[0]
            }
            log.info "crear: seleccionamos el cliente " + clienteSeleccionado 

            /**Se recupera la informaci�n de la p�iza seleccionada por el usuario
             *
             */
            for (int i = 0; i < polizas.size(); i++) {
                if (polizas[i].getNumPoliza().equals(numPolizaSeleccionada)) {
                    polizaSeleccionada = polizas[i]
                }
            }

            /**Se recupera la informaci�n de los beneficiarios de la p�iza seleccionada por el usuario
             *
             */
            for (int i = 0; i < beneficiarios.size(); i++) {
                if (beneficiarios[i].getNumPoliza().equals(numPolizaSeleccionada)) {
                    textoBeneficiarios = textoBeneficiarios + beneficiarios[i].getOrden() + "-" + beneficiarios[i].getDescripcion() + " "
                }
            }
            if (clienteSeleccionado?.telFijo?.isEmpty() || clienteSeleccionado?.telFijo == ' ') {
                log.error("La poliza: ${numPolizaSeleccionada} llego sin telefono fijo.  Se le asigna el telefono movil. ${clienteSeleccionado.telMovil}")
                if (!clienteSeleccionado?.telMovil.isEmpty()) {
                    clienteSeleccionado.telFijo = clienteSeleccionado.telMovil
                } else {
                    log.error("La poliza llego sin ningun telefono. Dara fallos en el Bpel.")
                }
            }

            try {

                log.info "Usuario_" + userDetails.getUsername() + "-Iniciando conexion con BPEL...."
                conexionBpel = commonService.obtenerConexionBpel(grailsApplication.config.orabpel.crearExpediente)

                log.info "Usuario_" + userDetails.getUsername() + "-Conexion con BPEL establecida"

                payload = busquedaNnService.buildPayload(polizaSeleccionada, clienteSeleccionado, grailsApplication.config.nn.codigoSt, garantias)
              
                log.info "Usuario_" + userDetails.getUsername() + "- Iniciando creacion poliza: " + numPolizaSeleccionada
  
                conexionBpel.initiate(payload)
                
                log.info "Usuario_" + userDetails.getUsername() + "- Creacion poliza " + numPolizaSeleccionada + " OK "

                log.info "Usuario_" + userDetails.getUsername() + "- Iniciando modificacion expediente..."

                respuestaCRM = busquedaNnService.modificacionesExpediente(userDetails.getUsername(), numPolizaSeleccionada, textoBeneficiarios, polizaSeleccionada, clienteSeleccionado, grailsApplication.config.frontal.port, grailsApplication.config.crm.user, grailsApplication.config.crm.dominio, grailsApplication.config.crm.pass, grailsApplication.config.crm.unidad)

                if (respuestaCRM.getErrorCRM() != null) {

                    flash.error = respuestaCRM.getErrorCRM().getDetalle()
                    log.error "Usuario_" + userDetails.getUsername() + "-" + respuestaCRM.getErrorCRM().getDetalle()
                    render view: 'resultados', model: [flash: flash, clientes: clientes, polizas: polizas]
                    return
                } else {
                    expedienteModificado = respuestaCRM.getListaExpedientes(0)
                    log.info "Usuario_" + userDetails.getUsername() + "-Modificacion expediente: " + expedienteModificado.getCodigoST() + " OK"
                    session.setAttribute("numPolizaSeleccionada", null)
                    flash.message = "Expediente creado satisfactoriamente con número de poliza: " + numPolizaSeleccionada + " y codigoSt: " + expedienteModificado.getCodigoST()
                    log.info "Usuario_" + userDetails.getUsername() + "-Proceso terminado OK"
                    String expedienteId = grailsApplication.config.crm.url + "ScorTelemed/userdefined/edit.aspx?id=%7b" + expedienteModificado.getExpedienteId().replace("{", "").replace("}", "") + "%7d&etc=10006"
                    render view: 'resultados', model: [flash: flash, clientes: clientes, polizas: polizas, expedienteCreado: true, expedienteId: expedienteId]
                    return
                }
            } catch (Exception ex) {
                def exception = new GestionException(this.getClass(), "crear", ex)
                flash.error = exception.toString()
                log.error "Usuario_" + userDetails.getUsername() + "-Error en la creacion de la poliza: " + numPolizaSeleccionada + ". " + ex.getStackTrace().toString()
                render view: 'resultados', model: [flash: flash, clientes: clientes, polizas: polizas]
                return
            }
        } else {

            flash.error = "No se ha seleccionado ninguna poliza"
            render view: 'resultados', model: [flash: flash, clientes: clientes, polizas: polizas]
            return
        }
    }
}
