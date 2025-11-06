package serviciowebaltas

import com.amaseguros.saludenfermedad.webservices.ConsultaPolizasEnfermedadesStub
import com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRP_ServiceLocator
import com.scor.www.SRPFileInbound.*
import com.scortelemed.servicios.*
import org.apache.axis.types.Token
import org.apache.axis2.client.Options
import org.apache.axis2.client.ServiceClient
import org.apache.axis2.transport.http.HTTPConstants
import org.apache.commons.httpclient.Header
import org.apache.commons.lang.StringUtils
import serviciowebaltann.FechaUtils
import serviciowebaltann.TransformacionUtils
import serviciowebaltann.ValorUtils

import javax.xml.datatype.DatatypeFactory
import javax.xml.datatype.XMLGregorianCalendar
import java.rmi.RemoteException
import java.text.DateFormat
import java.text.SimpleDateFormat

class BusquedaAmaService {

    def commonService

    def serviceMethod() {
    }

    /**INVOCACION AL SERVICIO DE AMA PARA LISTADO DE POLIZAS
     *
     * @param pass
     * @param user
     * @param wsdlAma
     * @param params
     * @return
     * @throws MalformedURLException
     * @throws Exception
     */
    def obtenerPolizas(pass, user, wsdlAma, params) throws MalformedURLException, NumberFormatException, RemoteException, Exception {
        log.info("Entro al servicio")
        ConsultaPolizasEnfermedadesStub consPolizaStub = new ConsultaPolizasEnfermedadesStub(wsdlAma)
        ConsultaPolizasEnfermedadesStub.GetPolizasE rqGetPolizaE = new ConsultaPolizasEnfermedadesStub.GetPolizasE()
        ConsultaPolizasEnfermedadesStub.GetPolizas rqGetPoliza = new ConsultaPolizasEnfermedadesStub.GetPolizas()
        log.info("Instancio: ConsultaPolizasEnfermedades")

        List<Header> namedValuePairs = new ArrayList<Header>()
        namedValuePairs.add(new Header("USERNAME", user))
        namedValuePairs.add(new Header("PASSWORD", pass))

        ServiceClient sc = consPolizaStub._getServiceClient()
        Options opts = sc.getOptions()
        opts.setProperty(HTTPConstants.HTTP_HEADERS, namedValuePairs)

        ConsultaPolizasEnfermedadesStub.PeticionConsulta req = new ConsultaPolizasEnfermedadesStub.PeticionConsulta()
        ConsultaPolizasEnfermedadesStub.IntervinienteSimple interviniente = new ConsultaPolizasEnfermedadesStub.IntervinienteSimple()

        String apellidos = params.apellidos ? params.apellidos : null
        String nombre = params.nombre ? params.nombre : null
        String documento = params.documento ? params.documento : null

        long mutualista = params.mutualista ? Long.parseLong(params.mutualista.toString().trim()) : 0

        interviniente.setApellidos(apellidos)
        interviniente.setNombre(nombre)
        interviniente.setNumeroDocumento(documento)
        interviniente.setNumeroMutualista(mutualista)

        String codigoCia = params.cia ? params.cia : null
        int codigoPais = params.pais ? Integer.parseInt(params.pais) : 0
        int ramo = params.ramo ? Integer.parseInt(params.ramo) : 0
        String fecha = params.fecha
        if ("dd/MM/yyyy".equals(FechaUtils.getDateFormat(params.fecha))) {
            Date paramDate = Date.parse("dd/MM/yyyy", params.fecha)
            fecha = FechaUtils.dateToString(paramDate, "yyyy/MM/dd")
        } else if ("dd-MM-yyyy".equals(FechaUtils.getDateFormat(params.fecha))) {
            Date paramDate = Date.parse("dd-MM-yyyy", params.fecha)
            fecha = FechaUtils.dateToString(paramDate, "yyyy/MM/dd")
        }
        XMLGregorianCalendar fechaConsulta = params.fecha ? FechaUtils.fromStringToXmlCalendar(fecha) : null
        Calendar calendario = fechaConsulta.toGregorianCalendar()
        log.debug("Calendar:" + calendario.getTime().format("dd/MM/yyyy"))
        long poliza = params.poliza ? Long.parseLong(params.poliza.toString().trim()) : 0
        long suplemento = params.suplemento ? Long.parseLong(params.suplemento.toString().trim()) : -1

        req.setCodigoCompania(codigoCia)
        req.setCodigoPais(codigoPais)
        req.setCodigoRamo(ramo)
        req.setFechaConsulta(calendario)
        if (interviniente.getNumeroDocumento() != null) {
            req.setInterviniente(interviniente)
        }
        req.setNumeroPoliza(poliza)
        if (suplemento > -1) {
            req.setNumeroSuplemento(suplemento)
        }
        log.info("Insertamos todo los parametros en la request")

        rqGetPoliza.setArg0(req)
        rqGetPolizaE.setGetPolizas(rqGetPoliza)

        return consPolizaStub.getPolizas(rqGetPolizaE).getGetPolizasResponse().get_return()
    }

    def obtenerPolizasNoVigentes(pass, user, wsdlAma, params) throws MalformedURLException, NumberFormatException, Exception {


        log.info("Entro al servicio")
        ConsultaPolizasEnfermedadesStub consPolizaStub = new ConsultaPolizasEnfermedadesStub(wsdlAma)
        ConsultaPolizasEnfermedadesStub.GetPolizasNoVigentesE rqGetPolizaE = new ConsultaPolizasEnfermedadesStub.GetPolizasNoVigentesE()
        ConsultaPolizasEnfermedadesStub.GetPolizasNoVigentes rqGetPoliza = new ConsultaPolizasEnfermedadesStub.GetPolizasNoVigentes()
        log.info("Insntacio :ConsultaPolizasEnfermedades")

        List<Header> namedValuePairs = new ArrayList<Header>()
        namedValuePairs.add(new Header("USERNAME", user))
        namedValuePairs.add(new Header("PASSWORD", pass))
        ServiceClient sc = consPolizaStub._getServiceClient()
        Options opts = sc.getOptions()
        opts.setProperty(HTTPConstants.HTTP_HEADERS, namedValuePairs)

        ConsultaPolizasEnfermedadesStub.PeticionNoVigentes req = new ConsultaPolizasEnfermedadesStub.PeticionNoVigentes()
        ConsultaPolizasEnfermedadesStub.IntervinienteSimple interviniente = new ConsultaPolizasEnfermedadesStub.IntervinienteSimple()

        String apellidos = params.apellidos ? params.apellidos : null
        String nombre = params.nombre ? params.nombre : null
        String documento = params.documento ? params.documento : null

        long mutualista = params.mutualista ? Long.parseLong(params.mutualista.toString().trim()) : 0

        interviniente.setApellidos(apellidos)
        interviniente.setNombre(nombre)
        interviniente.setNumeroDocumento(documento)
        interviniente.setNumeroMutualista(mutualista)

        String codigoCia = params.cia ? params.cia : null
        int codigoPais = params.pais ? Integer.parseInt(params.pais) : 0
        int ramo = params.ramo ? Integer.parseInt(params.ramo) : 0

        String fecha = params.fecha
        if ("dd/MM/yyyy".equals(FechaUtils.getDateFormat(params.fecha))) {
            Date paramDate = Date.parse("dd/MM/yyyy", params.fecha)
            fecha = FechaUtils.dateToString(paramDate, "yyyy/MM/dd")
        } else if ("dd-MM-yyyy".equals(FechaUtils.getDateFormat(params.fecha))) {
            Date paramDate = Date.parse("dd-MM-yyyy", params.fecha)
            fecha = FechaUtils.dateToString(paramDate, "yyyy/MM/dd")
        }
        XMLGregorianCalendar fechaConsulta = params.fecha ? FechaUtils.fromStringToXmlCalendar(fecha) : null
        Calendar calendario = fechaConsulta.toGregorianCalendar()
        String certificado = params.certificado ? params.certificado : null
        long poliza = params.poliza ? Long.parseLong(params.poliza.toString().trim()) : 0
        long suplemento = params.suplemento ? Long.parseLong(params.suplemento.toString().trim()) : -1

        req.setCodigoCompania(codigoCia)
        req.setCodigoPais(codigoPais)
        req.setCodigoRamo(ramo)
        req.setFechaConsulta(calendario)
        req.setNumeroPoliza(poliza)
        if (suplemento > -1) {
            req.setNumeroSuplemento(suplemento)
        }

        rqGetPoliza.setArg0(req)
        rqGetPolizaE.setGetPolizasNoVigentes(rqGetPoliza)

        return consPolizaStub.getPolizasNoVigentes(rqGetPolizaE).getGetPolizasNoVigentesResponse().get_return()
    }


    def codificacionMensajes(List<Object> mensajes) {

        def msg = ""

        for (int i = 0; i < mensajes.size(); i++) {
            msg += mensajes.get(i).getDescripcionMensaje()
        }

        return msg
    }

    def codificacionMensajes(ConsultaPolizasEnfermedadesStub.Mensaje[] mensajes) {
        return codificacionMensajes(mensajes.toList())
    }

    /**INVOCACION AL SERVICIO DE AMA PARA DETALLE DE POLIZA SELECCIONA
     *
     * @param pass
     * @param user
     * @param wsdlAma
     * @param params
     * @param fecha
     * @return
     * @throws MalformedURLException
     * @throws Exception
     */
    def informacionPoliza(pass, user, wsdlAma, params, fecha) throws MalformedURLException, Exception {


        log.info("Entro al servicio")
        ConsultaPolizasEnfermedadesStub consPolizaStub = new ConsultaPolizasEnfermedadesStub(wsdlAma)
        ConsultaPolizasEnfermedadesStub.GetDetallePolizaE rqGetPolizaE = new ConsultaPolizasEnfermedadesStub.GetDetallePolizaE()
        ConsultaPolizasEnfermedadesStub.GetDetallePoliza rqGetPoliza = new ConsultaPolizasEnfermedadesStub.GetDetallePoliza()
        log.info("Instancio :ConsultaPolizasEnfermedades")

        List<Header> namedValuePairs = new ArrayList<Header>()
        namedValuePairs.add(new Header("USERNAME", user))
        namedValuePairs.add(new Header("PASSWORD", pass))
        ServiceClient sc = consPolizaStub._getServiceClient()
        Options opts = sc.getOptions()
        opts.setProperty(HTTPConstants.HTTP_HEADERS, namedValuePairs)

        ConsultaPolizasEnfermedadesStub.PeticionNoVigentes req = new ConsultaPolizasEnfermedadesStub.PeticionNoVigentes()
        ConsultaPolizasEnfermedadesStub.IntervinienteSimple interviniente = new ConsultaPolizasEnfermedadesStub.IntervinienteSimple()

        GregorianCalendar fCon = new GregorianCalendar();
        fCon.setTime(new Date());
        fCon.add(Calendar.DAY_OF_YEAR, -1);
        XMLGregorianCalendar xmlFCon;
        xmlFCon = DatatypeFactory.newInstance().newXMLGregorianCalendar(fCon)

        String codigoCia = params.cia ? params.cia : null
        int codigoPais = params.pais ? Integer.parseInt(params.pais) : Integer.parseInt("0")
        int ramo = params.ramo ? Integer.parseInt(params.ramo) : 0
        //Calendar fechaConsulta = fecha?FechaUtils.fromStringToCalendar(fecha):null
        String certificado = params.certificado ? params.certificado : null
        long poliza = params.poliza ? Long.parseLong(params.poliza.toString().trim()) : 0
        long suplemento = params.suplemento ? Long.parseLong(params.suplemento.toString().trim()) : -1

        ConsultaPolizasEnfermedadesStub.PeticionDetalle detalle = new ConsultaPolizasEnfermedadesStub.PeticionDetalle()
        Calendar calendario = xmlFCon.toGregorianCalendar()
        detalle.setCodigoCompania(codigoCia)
        detalle.setCodigoPais(codigoPais)
        detalle.setCodigoRamo(ramo)
        detalle.setFechaConsulta(calendario)
        detalle.setNumeroCertificado(certificado)
        detalle.setNumeroPoliza(poliza)
        detalle.setNumeroSuplemento(suplemento)

        rqGetPoliza.setArg0(detalle)
        rqGetPolizaE.setGetDetallePoliza(rqGetPoliza)

        return consPolizaStub.getDetallePoliza(rqGetPolizaE).getDetallePolizaResponse.get_return()
    }

    /**CONSTRUCCION OBJETO BPEL
     *
     * @param poliza
     * @param interviniente
     * @param polizaSimple
     * @param cia
     * @return
     */
    def buildPayload(ConsultaPolizasEnfermedadesStub.Poliza poliza, ConsultaPolizasEnfermedadesStub.Interviniente interviniente, ConsultaPolizasEnfermedadesStub.PolizaSimple polizaSimple, String cia, String idOperacionAma) {

        RootElement payload = new RootElement()

        payload.setCABECERA(buildCabecera(cia))

        payload.setDATOS(buildDatos(interviniente, poliza, cia, polizaSimple, idOperacionAma))

        payload.setPIE(buildPie(payload.getDATOS()))

        return payload
    }

    /**CABECERA OBJETO BPEL
     *
     * @param cia
     * @return
     */
    def buildCabecera(String cia) {

        RootElementCABECERA cabecera = new RootElementCABECERA()

        cabecera.setCodigoCia(cia)
        cabecera.setContadorSecuencial("1")
        cabecera.setFechaGeneracion(FechaUtils.getCurrentDateAsString())
        cabecera.setFiller("")
        cabecera.setTipoFichero("1")

        return cabecera
    }

    /**PIE OBJETO BPEL
     *
     * @param cia
     * @return
     */
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

    /**CUERPO OBJETO BPEL
     *
     * @param cia
     * @return
     */
    def buildDatos(ConsultaPolizasEnfermedadesStub.Interviniente interviniente, ConsultaPolizasEnfermedadesStub.Poliza poliza, String cia, ConsultaPolizasEnfermedadesStub.PolizaSimple polizaSimple, String idOperacionAma) {


        DATOS[] datos = new DATOS[1]
        DATOS dato = new DATOS()

        dato.setRegistro(buildRegistro(interviniente, poliza, cia, polizaSimple, idOperacionAma))
        dato.setServicio(buildServicios(poliza))

        datos[0] = dato

        return datos
    }

    /**COBERTURAS POR DEFECTO
     *
     * @return
     */
    def buildCoberturas() {

        DATOSCoberturas[] datosCoberturas = new DATOSCoberturas[1]

        datosCoberturas[0] = new DATOSCoberturas()
        datosCoberturas[0].setCodigoCobertura("COB5")
        datosCoberturas[0].setNombreCobertura("Fallecimiento")
        datosCoberturas[0].setCapital(0.0)
        datosCoberturas[0].setFiller("")

        return datosCoberturas
    }

    /**CONSTRUCCION DEL OBJETO REGISTRO_DATOS QUE SE ENVIA AL BPEL
     *
     * @param interviniente
     * @param poliza
     * @param cia
     * @param polizaSimple
     * @return
     */
    def buildRegistro(ConsultaPolizasEnfermedadesStub.Interviniente interviniente, ConsultaPolizasEnfermedadesStub.Poliza poliza, String cia, ConsultaPolizasEnfermedadesStub.PolizaSimple polizaSimple, String idOperacionAma) {

        REGISTRO_DATOS datos = new REGISTRO_DATOS()

        setDatosCandidato(datos, interviniente, poliza, polizaSimple)
        setDatosExpediente(datos, poliza, cia, polizaSimple, idOperacionAma)
        setCamposGenericos(datos)

        return datos
    }

    /**CAMPOS GENERICOS NECESARIOS PARA LA CREACION
     *
     * @param datos
     */
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

    /**SERVICIO POR DEFECTO
     *
     * @return
     */
    def buildServicios(ConsultaPolizasEnfermedadesStub.Poliza poliza) {

        DATOSServicio[] datosServicios = new DATOSServicio[1];

        datosServicios[0] = new DATOSServicio();

        datosServicios[0].setCodigoServicio("Gestion Siniestro ILT")
        datosServicios[0].setDescripcionServicio("")
        datosServicios[0].setTipoServicios("S")
        datosServicios[0].setFiller("")

        return datosServicios
    }

    /**DATOS DEL CANDIDATO
     *
     * @return
     */
    def setDatosCandidato(REGISTRO_DATOS datos, ConsultaPolizasEnfermedadesStub.Interviniente interviniente, ConsultaPolizasEnfermedadesStub.Poliza poliza, ConsultaPolizasEnfermedadesStub.PolizaSimple polizaSimple) {

        String apellidos = ""
        String direccion = ""


        if (interviniente.getNombre() != null) {
            datos.setNombreCliente(interviniente.getNombre().trim())
        }

        if (interviniente.getApellidos() != null) {
            datos.setApellidosCliente(interviniente.getApellidos().trim())
        }

        if (interviniente.getGenero() != null && !interviniente.getGenero().toString().isEmpty()) {
            if (interviniente.getGenero().toString().toUpperCase().equals("HOMBRE")) {
                datos.setSexo("V")
            } else {
                datos.setSexo("M")
            }
        }

        if (interviniente.getInfoContacto().getTelefonoFijo() == null && interviniente.getInfoContacto().getTelefonoMovil() == null) {
            datos.setTelefono1("999999999")
            datos.setTelefono2("")
        } else {

            if (interviniente.getInfoContacto().getTelefonoFijo() != null && !interviniente.getInfoContacto().getTelefonoFijo().isEmpty() && !interviniente.getInfoContacto().getTelefonoFijo().equals("0")) {
                datos.setTelefono1(interviniente.getInfoContacto().getTelefonoFijo())
            } else if (!interviniente.getInfoContacto().getTelefonoMovil().isEmpty() && !interviniente.getInfoContacto().getTelefonoMovil().equals("0")) {
                datos.setTelefono1(interviniente.getInfoContacto().getTelefonoMovil())
            } else {
                datos.setTelefono1("999999999")
            }

            if (interviniente.getInfoContacto().getTelefonoMovil() != null && !interviniente.getInfoContacto().getTelefonoMovil().isEmpty() && !interviniente.getInfoContacto().getTelefonoMovil().equals("0")) {
                datos.setTelefono2(interviniente.getInfoContacto().getTelefonoMovil())
            } else {
                datos.setTelefono2("")
            }
        }

        if (interviniente.getInfoContacto().getEmail() != null && !interviniente.getInfoContacto().getEmail().isEmpty()) {
            datos.setEmail(interviniente.getInfoContacto().getEmail().trim())
        } else {
            datos.setEmail("")
        }

        if (interviniente.getDireccion() != null && interviniente.getDireccion().getProvincia() != null && !interviniente.getDireccion().getProvincia().isEmpty()) {
            datos.setProvincia(interviniente.getDireccion().getProvincia().trim())
        } else {
            datos.setProvincia(".")
        }

        if (interviniente.getDireccion() != null && interviniente.getDireccion().getLocalidad() != null && !interviniente.getDireccion().getLocalidad().isEmpty()) {
            datos.setPoblacion(interviniente.getDireccion().getLocalidad().trim())
        } else {
            datos.setPoblacion(".")
        }

        if (interviniente.getDireccion() != null && interviniente.getDireccion().getCodPostal() != null && !interviniente.getDireccion().getCodPostal().isEmpty()) {
            datos.setCodigoPostal(interviniente.getDireccion().getCodPostal())
        } else {
            datos.setCodigoPostal(".")
        }

        if (interviniente.getDireccion() != null && interviniente.getDireccion().getTipo() != null && !interviniente.getDireccion().getTipo().isEmpty()) {
            direccion = direccion + interviniente.getDireccion().getTipo().trim() + " "
        }

        if (interviniente.getDireccion() != null && interviniente.getDireccion().getLineaDireccion() != null && !interviniente.getDireccion().getLineaDireccion().isEmpty()) {
            direccion = direccion + interviniente.getDireccion().getLineaDireccion().trim() + " "
        }

        if (interviniente.getDireccion() != null && interviniente.getDireccion().getLineaDireccion2() != null && !interviniente.getDireccion().getLineaDireccion2().isEmpty()) {
            direccion = direccion + interviniente.getDireccion().getLineaDireccion2().trim() + " "
        }

        if (interviniente.getDireccion() != null && interviniente.getDireccion().getEscalera() != null && !interviniente.getDireccion().getEscalera().isEmpty()) {
            direccion = direccion + interviniente.getDireccion().getEscalera().trim() + " "
        }

        if (interviniente.getDireccion() != null && interviniente.getDireccion().getNumero() != null && !interviniente.getDireccion().getNumero().isEmpty()) {
            direccion = direccion + interviniente.getDireccion().getNumero().trim() + " "
        }

        if (direccion != null && !direccion.isEmpty()) {
            datos.setDireccionCliente(direccion)
        } else {
            datos.setDireccionCliente(".")
        }

        if (interviniente.getNumeroDocumento()) {
            datos.setDni(interviniente.getNumeroDocumento())
        }

        if (interviniente.getFechaNacimiento()) {
            datos.setFechaNacimiento(interviniente.getFechaNacimiento())
        }

        datos.setTelefono3("")
        datos.setLugarNacimiento("")
        datos.setPais("ES")
        datos.setClaveValidacionCliente("")
        datos.setCodigoAgencia(poliza.getCodigoOficinaGestora() != null ? poliza.getCodigoOficinaGestora().toString() : "" + poliza.getDescripcionOficinaGestora() != null ? " " + poliza.getDescripcionOficinaGestora().toString() : "")
        datos.setNomApellAgente(poliza.getCodigoOficinaAbridora() != null ? poliza.getCodigoOficinaAbridora().toString() : "" + poliza.getDescripcionOficinaAbridora() != null ? "  " + poliza.getDescripcionOficinaAbridora().toString() : "")
        datos.setTelefonoAgente("")
        datos.setEmailAgente(" ")
        datos.setEstadoCivil(" ")
        datos.setTipoCliente("N")
        datos.setFranjaHoraria("")
        datos.setCodigoCuestionario("")
        datos.setObservaciones("")
    }

    /**DATOS DEL EXPEDIENTE
     *
     * @return
     */
    def setDatosExpediente(REGISTRO_DATOS datos, ConsultaPolizasEnfermedadesStub.Poliza poliza, String cia, ConsultaPolizasEnfermedadesStub.PolizaSimple polizaSimple, idOperacionAma) {

        DateFormat df = new SimpleDateFormat("yyyyMMdd");

        datos.setEstadoExpediente(TipoEstadoExpediente.PREAPERTURADO.toString())

        datos.setCodigoCia(cia)
        datos.setTipoServicio(0)

        datos.setCodigoProducto("ILT AMA")
        datos.setFechaGeneracion(new Token())
        datos.setFechaEnvio(FechaUtils.dateFechaInternaToString(new Date()))
        datos.setNumPoliza(poliza.getNumeroPoliza().toString())
        datos.setNumMovimiento(polizaSimple.getNumeroSuplemento().toString())
        datos.setNumCertificado(polizaSimple.getNumeroCertificado().toString())
        datos.setNumSolicitud(idOperacionAma)
        datos.setNumSecuencia("")
        datos.setModificarSolicitudesDuplicadas("N")
        datos.setCapitalFallecimiento(0)
        datos.setCoberturaFallecimiento("COB5")
        datos.setCapitalInvalidez(0)
        datos.setCoberturaInvalidez("COB4")
    }

    /**METODO QUE MODIFCA EL EXPEDIENTE CREADO YA EN BPEL. MODIFICA EL EXPEDIENTE A TIPO SINIESTRO Y CREA EL SINIESTRO CON DATOS INICIALES
     *
     * @param username
     * @param numPolizaSeleccionada
     * @param poliza
     * @param intervinientes
     * @param frontalPortAddress
     * @param user
     * @param dominio
     * @param pass
     * @param unidad
     * @return
     */
    def modificacionesExpediente(String username, String numPolizaSeleccionada, ConsultaPolizasEnfermedadesStub.Poliza poliza, intervinientes, String frontalPortAddress, String user, String dominio, String pass, String unidad, boolean noVigente) {

        Frontal frontal
        Usuario usuario
        RespuestaCRM respuestaCrmExpediente
        RespuestaCRM respuestaCrmSiniestro
        Expediente exp
        Expediente expSiniestro
        ConsultaPolizasEnfermedadesStub.Interviniente asegurado
        ConsultaPolizasEnfermedadesStub.Interviniente tomador
        boolean tomadorDistintoAsegurado

        def limite = 0
        def encontrado = false
        String exclusiones = ""

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat formatBpel = new SimpleDateFormat("yyyyMMdd");


        DateFormat format = new SimpleDateFormat("yyyyMMdd");

        Expediente expediente = new Expediente()
        Siniestro siniestro = new Siniestro()

        ErrorCRM errorCRM = new ErrorCRM()

        frontal = commonService.instanciarFrontal(frontalPortAddress)

        TransformacionUtils transformacionUtils = new TransformacionUtils()

        try {
            if (frontal == null) {
                throw new Exception("Error al instanciar el frontal")
            }

            usuario = obtenerUsuario(pass, dominio, unidad, user)

            if (usuario == null) {
                throw new Exception("Error al recuperar el usuario CRM")
            }

            Filtro filtro = new Filtro();

            /**BLOQUE DE CODIGO QUE VERIFICA QUE EL EXPEDIENTE NO EXISTE PREVIAMENTE
             *
             */
            List obtenerExpedientesDeSiniestroRetorno
            while (!encontrado && limite < 2) {

                filtro.setClave(ClaveFiltro.NUM_POLIZA);
                filtro.setValor(numPolizaSeleccionada);

                log.info("Modificando Póliza seleccionada: " + numPolizaSeleccionada)

                respuestaCrmExpediente = commonService.consultaExpedienteFrontal(frontal, usuario, filtro, 30)

                if (respuestaCrmExpediente != null && respuestaCrmExpediente.getListaExpedientes() != null && respuestaCrmExpediente.getListaExpedientes().size() > 0) {

                    for (int i = 0; i < respuestaCrmExpediente.getListaExpedientes().size(); i++) {
                        log.info("Expediente " + (i+1) + " de " + respuestaCrmExpediente.getListaExpedientes().size())

                        exp = respuestaCrmExpediente.getListaExpedientes(i)

                        filtro.setClave(ClaveFiltro.EXPEDIENTE)
                        filtro.setValor(exp.getCodigoST())

                        respuestaCrmSiniestro = commonService.consultaExpedienteSiniestroFrontal(frontal, usuario, filtro, 30)

                        obtenerExpedientesDeSiniestroRetorno = commonService.obtenerExpedientesDeSiniestro(respuestaCrmSiniestro, formatter, respuestaCrmExpediente, encontrado, expediente)

                        respuestaCrmExpediente = obtenerExpedientesDeSiniestroRetorno.get(0)
                        encontrado = obtenerExpedientesDeSiniestroRetorno.get(1)
                        expediente = obtenerExpedientesDeSiniestroRetorno.get(2)
                    }
                }

                limite++
            }

            if (limite == 10) {
                throw new Exception("No se ha podido crear la póliza con número: " + numPolizaSeleccionada)
            } else {

                asegurado = obtenerAsegurado(intervinientes)
                tomador = obtenerTomador(intervinientes)

                /**DATOS DEL EXPEDIENTE
                 *
                 */
                expediente.setTipoExpediente(TipoExpediente.SINIESTROS)
                expediente.setCodigoEstado(TipoEstadoExpediente.PREAPERTURADO)
                expediente.setTipoMotivoEstadoExpediente(TipoMotivoEstadoExpediente.PTE_DOC_ASEGURADO)
                expediente.setNombreProductoCIA(poliza.getDescripcionProducto())
                expediente.setCodigoProductoCIA(String.valueOf(poliza.getCodigoRamo()))

                if (poliza.getFechaBaja() != null && !poliza.getFechaBaja().isEmpty() && !poliza.getFechaBaja().equals("0")) {
                    expediente.setFechaBajaPoliza(formatter.format(formatBpel.parse(poliza.getFechaBaja())))
                }
                if (poliza.getFechaVencimiento() != null && !poliza.getFechaVencimiento().isEmpty() && !poliza.getFechaVencimiento().equals("0")) {
                    expediente.setFechaVencimientoCobro(formatter.format(formatBpel.parse(poliza.getFechaVencimiento())))
                }
                if (poliza.getFechaEfecto() != null && poliza.getFechaEfecto() && !poliza.getFechaEfecto().equals("0")) {
                    expediente.setFechaApertura(format.format(formatBpel.parse(poliza.getFechaEfecto())))
                }

                /**TOMADOR DEL EXPEDIENTE
                 *
                 */
                if (tomador != null && asegurado != null && !tomador.getNumeroMutualista().toString().equals(asegurado.getNumeroMutualista().toString())) {

                    Candidato candidato = new Candidato()
                    candidato.setInterviniente(tomador.getNumeroMutualista().toString())
                    candidato.setNombre(tomador.getNombre())
                    candidato.setApellidos(tomador.getApellidos())
                    candidato.setNumeroDocumento(tomador.getNumeroDocumento())
                    candidato.setSexo(tomador.getGenero().toString().toUpperCase().equals("HOMBRE") ? TipoSexo.HOMBRE : TipoSexo.MUJER)
                    candidato.setCorreo1((tomador.getInfoContacto().getEmail() != null && !tomador.getInfoContacto().getEmail().trim().isEmpty() && !tomador.getInfoContacto().getEmail().equals("0")) ? tomador.getInfoContacto().getEmail().trim() : "")
                    candidato.setTipoDocumento(tomador.getTipoDocumento().equals("P") ? TipoDocumentoIdentidad.PASAPORTE : TipoDocumentoIdentidad.DNI)

                    if (tomador.getInfoContacto().getTelefonoFijo() == null && tomador.getInfoContacto().getTelefonoMovil() == null) {
                        candidato.setTelefono1("999999999")
                        candidato.setTipoTelefono1(TipoTelefono.FIJO)
                        candidato.setTelefono2("")
                        candidato.setTipoTelefono2(TipoTelefono.FIJO)
                    } else {

                        if (telefonoFijoInformado(tomador)) {
                            candidato.setTelefono1(tomador.getInfoContacto().getTelefonoFijo())
                            candidato.setTipoTelefono1(TipoTelefono.FIJO)
                        } else if (telefonoMovilInformado(tomador)) {
                            candidato.setTelefono1(tomador.getInfoContacto().getTelefonoMovil())
                            candidato.setTipoTelefono1(TipoTelefono.MOVIL)
                        } else {
                            candidato.setTelefono1("999999999")
                            candidato.setTipoTelefono1(TipoTelefono.FIJO)
                        }

                        if (telefonoMovilInformado(tomador)) {
                            candidato.setTelefono2(tomador.getInfoContacto().getTelefonoMovil())
                            candidato.setTipoTelefono2(TipoTelefono.MOVIL)
                        } else {
                            candidato.setTelefono2("")
                            candidato.setTipoTelefono2(TipoTelefono.FIJO)
                        }
                    }

                    if (tomador.getFechaNacimiento() != null && !tomador.getFechaNacimiento().isEmpty() && !tomador.getFechaNacimiento().equals("0")) {
                        candidato.setFechaNacimiento(formatter.format(formatBpel.parse(tomador.getFechaNacimiento())))
                    }
                    candidato.setInterviniente(tomador.getNumeroMutualista().toString())
                    candidato.setCompanya(expediente.getCandidato().getCompanya())
                    candidato.setPais("ES")
                    candidato.setCodigoPostal(tomador.getDireccion().getCodPostal() != null ? tomador.getDireccion().getCodPostal() : ".")
                    candidato.setLocalidad(tomador.getDireccion().getLocalidad() != null ? tomador.getDireccion().getLocalidad().toString() : ".")
                    candidato.setProvincia(tomador.getDireccion().getCodPostal() != null ? tomador.getDireccion().getCodPostal().toString() : ".")
                    candidato.setDireccion(tomador.getDireccion() != null ? tomador.getDireccion().toString() : ".")
                    candidato.setEdadActuarial("0")
                    candidato.setTipoCandidato(TipoCandidato.NORMAL)

                    expediente.setTomador(candidato)

                    tomadorDistintoAsegurado = true
                } else {
                    /**SIEMPRE SE TIENE QUE INFORMAR TOMADOR. EN CASO DE QUE NO EXISTA TOMADOR SE METE EL CANDIDATO
                     *
                     */
                    expediente.setTomador(expediente.getCandidato())
                }

                /**CANDIDATO DEL EXPEDIENTE
                 *
                 */
                expediente.getCandidato().setInterviniente(asegurado.getNumeroMutualista().toString())
                expediente.getCandidato().setIban((poliza.getInfoCuentaBancaria() != null && poliza.getInfoCuentaBancaria().getIban() != null) ? poliza.getInfoCuentaBancaria().getIban() : "")
                expediente.getCandidato().setNumCuenta((poliza.getInfoCuentaBancaria() != null && poliza.getInfoCuentaBancaria().getNumeroCuenta() != null) ? poliza.getInfoCuentaBancaria().getNumeroCuenta() : "")
                expediente.getCandidato().setTipoDocumento(asegurado.getTipoDocumento().equals("P") ? TipoDocumentoIdentidad.PASAPORTE : TipoDocumentoIdentidad.DNI)
                expediente.getCandidato().setCorreo1((tomadorDistintoAsegurado && asegurado.getInfoContacto().getEmail() != null && !asegurado.getInfoContacto().getEmail().trim().isEmpty() && !asegurado.getInfoContacto().getEmail().trim().equals("0")) ? asegurado.getInfoContacto().getEmail().trim() : tomador.getInfoContacto().getEmail().trim())

                if ((asegurado.getInfoContacto().getTelefonoFijo() == null || asegurado.getInfoContacto().getTelefonoFijo().trim().isEmpty()) && (asegurado.getInfoContacto().getTelefonoMovil() == null || asegurado.getInfoContacto().getTelefonoMovil().trim().isEmpty)) {
                    expediente.getCandidato().setTelefono1("999999999")
                    expediente.getCandidato().setTipoTelefono1(TipoTelefono.FIJO)
                    expediente.getCandidato().setTelefono2("")
                    expediente.getCandidato().setTipoTelefono2(TipoTelefono.FIJO)
                } else {

                    if (telefonoFijoInformado(asegurado)) {
                        expediente.getCandidato().setTelefono1(asegurado.getInfoContacto().getTelefonoFijo())
                        expediente.getCandidato().setTipoTelefono1(TipoTelefono.FIJO)
                    } else if (telefonoMovilInformado(asegurado)) {
                        expediente.getCandidato().setTelefono1(asegurado.getInfoContacto().getTelefonoMovil())
                        expediente.getCandidato().setTipoTelefono1(TipoTelefono.MOVIL)
                    } else {
                        expediente.getCandidato().setTelefono1((tomadorDistintoAsegurado && tomador.getInfoContacto().getTelefonoFijo() != null && !tomador.getInfoContacto().getTelefonoFijo().trim().isEmpty() && !tomador.getInfoContacto().getTelefonoFijo().equals("0")) ? tomador.getInfoContacto().getTelefonoFijo() : "999999999")
                        expediente.getCandidato().setTipoTelefono1(TipoTelefono.FIJO)
                    }

                    if (telefonoMovilInformado(asegurado)) {
                        expediente.getCandidato().setTelefono2(asegurado.getInfoContacto().getTelefonoMovil())
                        expediente.getCandidato().setTipoTelefono2(TipoTelefono.MOVIL)
                    } else {
                        expediente.getCandidato().setTelefono2((tomadorDistintoAsegurado && tomador.getInfoContacto().getTelefonoMovil() != null && !tomador.getInfoContacto().getTelefonoMovil().trim().isEmpty() && !tomador.getInfoContacto().getTelefonoMovil().equals("0")) ? tomador.getInfoContacto().getTelefonoMovil() : "")
                        expediente.getCandidato().setTipoTelefono2(TipoTelefono.MOVIL)
                    }
                }

                /**CAMBIO DATOS DEL EXPEDIENTE REFERENTES AL SINIESTRO
                 *
                 */

                respuestaCrmExpediente = commonService.modificaExpedienteFrontal(frontal, usuario, expediente, 30)

                if (respuestaCrmExpediente.getErrorCRM() != null) {
                    throw new Exception("No se ha podido completar el expediente con número de póliza: " + numPolizaSeleccionada + " y codigoSt: " + expediente.getCodigoST() + " al tipo de SINIESTRO")
                } else {

                    /**PROFESION
                     *
                     */
                    siniestro.setTextoBeneficiarios("")

                    if (poliza != null && poliza.getDescripcionProfesion() != null && !poliza.getDescripcionProfesion().isEmpty()) {
                        siniestro.setProfesion(poliza.getDescripcionProfesion())
                    }

                    /**INTRODUCIMOS EXCLUSIONES EN LAS OBSERVACIONES DEL SINIESTRO
                     *
                     */
                    if (poliza.getExclusiones() != null && poliza.getExclusiones().getExclusion() != null && poliza.getExclusiones().getExclusion().size() > 0) {
                        for (int i = 0; i < poliza.getExclusiones().getExclusion().size(); i++) {
                            exclusiones = exclusiones + poliza.getExclusiones().getExclusion()[i].getCodigoGarantia().trim() + "-" + poliza.getExclusiones().getExclusion()[i].getDescripcion().trim() + "\n"
                        }
                    }

                    if (exclusiones != null && !exclusiones.isEmpty()) {
                        siniestro.setObservaciones(exclusiones)
                    }

                    siniestro.setFranquicia("")

                    /**ID AMA
                     *
                     */
                    // El siniestro consta de 12 dígitos: XXXYYZZ00000 donde
                    // XXX: código de la oficina gestora de la póliza: se comunica en el webservice de consulta
                    // YY: código de ramo: se comunica en el webservice de consulta o bien puede extraerse con los 2 primeros dígitos del nº de póliza
                    // ZZ: año de la fecha de declaración
                    // 00000: secuencial de siniestros para oficina, ramo y año

                    def xxx = StringUtils.leftPad(String.valueOf(poliza.getCodigoOficinaGestora()), 3, "0")
                    def yy = StringUtils.leftPad(String.valueOf(poliza.getCodigoRamo()), 2, "0")
                    def zz = String.valueOf(Calendar.getInstance().get(Calendar.YEAR)).substring(2, 4)

                    def secuencial = transformacionUtils.dameSecuencial("AMA_" + xxx + yy + zz)

                    if (!noVigente) {
                        siniestro.setSiniestroNN(xxx + yy + zz + secuencial)
                    }

                    if (poliza.getIndemnizacionDiaria() != null) {
                        siniestro.setYsi(poliza.getIndemnizacionDiaria().toString())
                    }

                    /**PARA TODOS LOS CASOS ES INCAPACIDAD_TRANSITORIA
                     *
                     */
                    siniestro.setTipoDano(TipoDano.INCAPACIDAD_TRANSITORIA)

                    /**CREAMOS SINIESTRO
                     *
                     */
                    respuestaCrmSiniestro = commonService.modificaExpedienteSiniestroFrontal(frontal, usuario, expediente, siniestro, 30)

                    if (respuestaCrmSiniestro.getErrorCRM() != null) {
                        throw new Exception("No se ha podido asignar el siniestro al expediente con número de póliza: " + numPolizaSeleccionada + " y codigoSt: " + expediente.getCodigoST() + ". Error: " + respuestaCrmSiniestro.getErrorCRM().getDetalle())
                    } else {
                        respuestaCrmSiniestro.setErrorCRM(null)
                        respuestaCrmSiniestro.setListaExpedientes(respuestaCrmExpediente.getListaExpedientes())
                    }
                }
            }
        } catch (Exception e) {
            errorCRM.setDetalle(e.getMessage())
            respuestaCrmSiniestro.setErrorCRM(errorCRM)
        }

        return respuestaCrmSiniestro
    }

    /**SE OBTIENE EL USAURIO
     *
     * @param intervinientes
     * @return
     */
    def obtenerUsuario(String clave, String dominio, String unidadOrganizativa, String nombreUsuario) {
        return new Usuario(clave, dominio, unidadOrganizativa, nombreUsuario);
    }

    /**SE OBTIENE EL ASEGURADO
     *
     * @param intervinientes
     * @return
     */
    def obtenerAsegurado(intervinientes) {

        ConsultaPolizasEnfermedadesStub.Interviniente asegurado

        if (intervinientes != null && intervinientes.size() > 0) {
            for (int i = 0; i < intervinientes.size(); i++) {
                if (intervinientes[i].getTipo() != null && intervinientes[i].getTipo().toString().toUpperCase().equals("ASEGURADO")) {
                    asegurado = intervinientes[i]
                }
            }
        } else {
            asegurado = null
        }

        return asegurado
    }

    /**SE OBTIENE EL TOMADOR
     *
     * @param intervinientes
     * @return
     */
    def obtenerTomador(intervinientes) {

        ConsultaPolizasEnfermedadesStub.Interviniente tomador

        if (intervinientes != null && intervinientes.size() > 0) {
            for (int i = 0; i < intervinientes.size(); i++) {
                if (intervinientes[i].getTipo() != null && intervinientes[i].getTipo().toString().toUpperCase().equals("MUTUALISTA_TOMADOR")) {
                    tomador = intervinientes[i]
                }
            }
        } else {
            tomador = intervinientes[0]
        }

        return tomador

    }

    def telefonoFijoInformado(ConsultaPolizasEnfermedadesStub.Interviniente interviniete) {

        return interviniete.getInfoContacto().getTelefonoFijo() != null && !interviniete.getInfoContacto().getTelefonoFijo().trim().isEmpty() && !interviniete.getInfoContacto().getTelefonoFijo().equals("0")

    }

    def telefonoMovilInformado(ConsultaPolizasEnfermedadesStub.Interviniente interviniete) {

        return interviniete.getInfoContacto().getTelefonoMovil() != null && !interviniete.getInfoContacto().getTelefonoMovil().trim().isEmpty() && !interviniete.getInfoContacto().getTelefonoMovil().equals("0")

    }

}
