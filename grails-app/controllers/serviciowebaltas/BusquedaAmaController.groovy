package serviciowebaltas

import com.amaseguros.saludenfermedad.webservices.ConsultaPolizasEnfermedadesStub
import com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRP_PortType
import com.scor.www.SRPFileInbound.RootElement
import com.scortelemed.servicios.Expediente
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.security.access.annotation.Secured
import serviciowebaltann.TransformacionUtils

import java.text.SimpleDateFormat

@Secured('permitAll')
class BusquedaAmaController {
    def variable
    ConsultaPolizasEnfermedadesStub.RespuestaConsulta respuestaConsulta
    ConsultaPolizasEnfermedadesStub.ResultadoOperacionConsulta resultadoOperacionConsulta
    ConsultaPolizasEnfermedadesStub.PolizaSimple[] polizas
    ConsultaPolizasEnfermedadesStub.RespuestaAuditada detallePoliza
    ConsultaPolizasEnfermedadesStub.Poliza poliza

    def CreacionExpedienteAsyncSRP_PortType conexionBpel
    def RootElement payload
    def springSecurityService
    def busquedaAmaService
    def exclusiones = []
    def garantias = []
    def intervinientes = []
    def polizaSeleccionada = false
    def parametrosDeBusqueda
    private static Log log = LogFactory.getLog("logAMA." + BusquedaAmaController.class.getName())
    def static userDetails
    TransformacionUtils transformacionUtils = new TransformacionUtils()
    def commonService


    def index() {
        flash.error = ""
        flash.message = ""
        session.setAttribute("noVigente", false)
        userDetails = springSecurityService.principal
        session.setAttribute("numPolizaSeleccionada", null)
        String pattern = "dd/MM/yyyy"
        String dateInString = new SimpleDateFormat(pattern).format(new Date())
        params.fecha = dateInString
        model:
        [params: params]
    }

    /**METODO QUE EN FUNCION DE LOS DATOS INTRODUCIDOS DEVUELVE EL LISTADO DE POLIZAS ASOCIADO
     *
     * @param params
     * @return
     */
    def buscar(params) {

        log.info "Usuario_" + "- Obteniendo polizas para valores dni: " + params.documento + " y poliza: " + params.poliza

        flash.error = null
        flash.message = null
		session.setAttribute("msg", "")

        try {

            respuestaConsulta = busquedaAmaService.obtenerPolizas(grailsApplication.config.ama.pass, grailsApplication.config.ama.user, grailsApplication.config.ama.wsdl, params)

            if (respuestaConsulta.getResultadoOperacion().getResultado() == ConsultaPolizasEnfermedadesStub.TipoResultado.SUCCESS) {

                log.info "Usuario_" + "-" + "La consutla ha devuelto polizas"
                session.setAttribute("resultadoOperacionConsulta", (ConsultaPolizasEnfermedadesStub.ResultadoOperacionConsulta) respuestaConsulta.getResultadoOperacion())
                session.setAttribute("parametrosDeBusqueda", params)
                //def result = (ConsultaPolizasEnfermedadesStub.ResultadoOperacionConsulta) respuestaConsulta?.getResultadoOperacion()
                //result = resultadoOperacionConsulta?.getListadoPolizas()?.getPoliza()
                //session.setAttribute("listaPoliza", result)
                redirect action: "resultados"
            }else if (respuestaConsulta.getResultadoOperacion().getResultado() == ConsultaPolizasEnfermedadesStub.TipoResultado.SUCCESS_WARN) {

                if (respuestaConsulta.getResultadoOperacion().getMensajes() != null && respuestaConsulta.getResultadoOperacion().getMensajes().getMensaje() != null > 0 && respuestaConsulta.getResultadoOperacion().getMensajes().getMensaje().size() > 0 && respuestaConsulta.getResultadoOperacion().getMensajes().getMensaje().getAt(0).getCodigoMensaje().toString().equals("WARN_NO_REGISTROS")) {

                    /**Cuando obtenemos este mensaje mostramos el contenido pero son polizas no vigentes
                     *                    */
                    respuestaConsulta = busquedaAmaService.obtenerPolizasNoVigentes(grailsApplication.config.ama.pass, grailsApplication.config.ama.user, grailsApplication.config.ama.wsdl, params)

                    if (respuestaConsulta.getResultadoOperacion().getResultado() == ConsultaPolizasEnfermedadesStub.TipoResultado.ERROR) {
                        flash.error = busquedaAmaService.codificacionMensajes(respuestaConsulta.getResultadoOperacion().getMensajes().getMensaje())
                        log.info "Usuario_" + "-" + flash.error
                        render view: 'contenido', model: [flash: flash]
                    } else if (respuestaConsulta.getResultadoOperacion().getResultado() == ConsultaPolizasEnfermedadesStub.TipoResultado.SUCCESS_WARN) {
                        flash.message = busquedaAmaService.codificacionMensajes(respuestaConsulta.getResultadoOperacion().getMensajes().getMensaje())
                        log.info "Usuario_" + "-" + flash.message
                        render view: 'contenido', model: [flash: flash]
                    } else {
                        log.info "Usuario_" + "-" + "La consulta ha devuelto polizas"
                        log.info ("Resultado operacion: " +respuestaConsulta.getResultadoOperacion().getResultado())

                        session.setAttribute("resultadoOperacionConsulta", (ConsultaPolizasEnfermedadesStub.ResultadoOperacionConsulta) respuestaConsulta.getResultadoOperacion())
                        session.setAttribute("parametrosDeBusqueda", params)
                        session.setAttribute("msg", "Poliza no vigente.") //(no PolizaMapper) 
                        session.setAttribute("noVigente", true)

//                        def resultado = ((ConsultaPolizasEnfermedadesStub.ResultadoOperacionConsulta) respuestaConsulta.getResultadoOperacion()).getListadoPolizas()?.getPoliza()
//
//                        List<Poliza> listPoliza = new ArrayList<Poliza>()
//
//                        resultado.each {
//                            Poliza poliza = new Poliza()
//                            poliza.codigoCompania = it.codigoCompania
//                            poliza.codigoCompaniaSpecified = it.codigoCompaniaSpecified
//                            poliza.codigoPais = it.codigoPais
//                            poliza.codigoPaisSpecified = it.codigoPaisSpecified
//                            poliza.codigoRamo = it.codigoRamo
//                            poliza.codigoRamoSpecified = it.codigoRamoSpecified
//                            poliza.descripcionRiesgo = it.descripcionRiesgo
//                            poliza.descripcionRiesgoSpecified = it.descripcionRiesgoSpecified
//                            poliza.fechaEfecto = it.fechaEfecto
//                            poliza.fechaEfectoSpecified = it.fechaEfectoSpecified
//                            poliza.descripcionProducto = it.descripcionProducto
//                            poliza.descripcionProductoSpecified = it.descripcionProductoSpecified
//                            poliza.descripcionTomador = it.descripcionTomador
//                            poliza.descripcionTomadorSpecified = it.descripcionTomadorSpecified
//                            poliza.numeroSuplemento = it.numeroSuplemento
//                            poliza.numeroPoliza = it.numeroPoliza
//                            poliza.numeroPolizaSpecified = it.numeroPolizaSpecified
//                            poliza.numeroCertificado = it.numeroCertificado
//                            poliza.numeroCertificadoSpecified = it.numeroCertificadoSpecified
//                            poliza.fechaVencimiento = it.fechaVencimiento
//                            poliza.fechaVencimientoSpecified = it.fechaVencimientoSpecified
//                            poliza.numeroSuplementoSpecified = it.numeroSuplementoSpecified
//                            listPoliza.add(poliza)
//                        }
                        //session.setAttribute("listaPoliza", resultadoOperacionConsulta?.getListadoPolizas()?.getPoliza())
                        redirect action: "resultados"
                    }
                } else {
                    flash.error = busquedaAmaService.codificacionMensajes(respuestaConsulta.getResultadoOperacion().getMensajes().getMensaje())
                    log.info "Usuario_" + "-" + "La consutla ha devuelto polizas. " + busquedaAmaService.codificacionMensajes(respuestaConsulta.getResultadoOperacion().getMensajes().getMensaje())
                    session.setAttribute("resultadoOperacionConsulta", (ConsultaPolizasEnfermedadesStub.ResultadoOperacionConsulta) respuestaConsulta.getResultadoOperacion())
                    session.setAttribute("parametrosDeBusqueda", params)
                    render view: 'contenido', model: [flash: flash, params: params]
                }
            }

            if (respuestaConsulta.getResultadoOperacion().getResultado() == ConsultaPolizasEnfermedadesStub.TipoResultado.ERROR) {

                flash.error = busquedaAmaService.codificacionMensajes(respuestaConsulta.getResultadoOperacion().getMensajes().getMensaje())
                log.info "Usuario_" + "-" + flash.error
                render view: 'contenido', model: [flash: flash]
            }
        } catch (MalformedURLException e) {

            flash.error = e.getMessage()
            log.error "Usuario_" + "-" + flash.error
            render view: 'contenido', model: [flash: flash]
        } catch (Exception e) {

            log.error "Usuario_" + "-" + e.getMessage()
            flash.error = transformacionUtils.transformarTipoMensajesErrorAma(e.getMessage().toString())
            render view: 'contenido', model: [flash: flash, params: params]
        } catch (NumberFormatException e) {

            log.error "Usuario_" + "-" + e.getMessage()
            flash.error = transformacionUtils.transformarTipoMensajesErrorAma(e.getMessage().toString())
            render view: 'contenido', model: [flash: flash, params: params]
        }
    }

    /**METODO QUE MUESTRA LAS POLIZAS
     *
     * @param params
     * @return
     */
    def resultados() {
        def listaPolizas = []


        resultadoOperacionConsulta = session.getAttribute("resultadoOperacionConsulta")
        parametrosDeBusqueda = session.getAttribute("parametrosDeBusqueda")
        flash.message = session.getAttribute("msg")


        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")

        if (resultadoOperacionConsulta?.getListadoPolizas() != null && resultadoOperacionConsulta?.getListadoPolizas().getPoliza() != null) {
            listaPolizas = resultadoOperacionConsulta?.getListadoPolizas().getPoliza()
            log.info("resultadoOperacionConsulta?.getListadoPolizas() ${listaPolizas.each { it }}")
        } else {
            parametrosDeBusqueda = session.getAttribute("parametrosDeBusqueda")
            detallePoliza = busquedaAmaService.informacionPoliza(grailsApplication.config.ama.pass, grailsApplication.config.ama.user, grailsApplication.config.ama.wsdl, params, parametrosDeBusqueda?.fecha)
            log.info("detallePoliza?.getResultadoOperacionDetalle()?.getDetallePoliza()   ${detallePoliza?.getResultadoOperacionDetalle()?.getDetallePoliza()}")
            if (detallePoliza?.getResultadoOperacionDetalle()?.getDetallePoliza() != null)
                listaPolizas.add(detallePoliza?.getResultadoOperacionDetalle()?.getDetallePoliza())
        }

        session.setAttribute("listaPolizasIniciales", listaPolizas)


        [polizas: listaPolizas]
    }

    /**METODO QUE DEVUELVE EL DETALLE DE UNA POLIZA SELECCIONADA
     *
     * @param params
     * @return
     */
    def verPoliza(params) {

        def mensajeError = null
        flash.error = null
        flash.message = null
        session.setAttribute("msg", "")

        log.info "Usuario_" + "- Obteniendo detalle poliza para valores dni: " + params.documento + " y poliza: " + params.poliza
        parametrosDeBusqueda = session.getAttribute("parametrosDeBusqueda")

        try {

            detallePoliza = busquedaAmaService.informacionPoliza(grailsApplication.config.ama.pass, grailsApplication.config.ama.user, grailsApplication.config.ama.wsdl, params, parametrosDeBusqueda.fecha)

            if (detallePoliza.getResultadoOperacion().getResultado() == ConsultaPolizasEnfermedadesStub.TipoResultado.SUCCESS) {

                log.info "Usuario_" + "-" + "La consutla ha devuelto el detalle de la poliza"
            }

            if (detallePoliza.getResultadoOperacion().getResultado() == ConsultaPolizasEnfermedadesStub.TipoResultado.SUCCESS_WARN) {
                flash.error = "No se han encontrado datos para la poliza"
                log.info "Usuario_" + "-" + flash.error
                [flash: flash]
            }

            if (detallePoliza.getResultadoOperacion().getResultado() == ConsultaPolizasEnfermedadesStub.TipoResultado.ERROR) {
                flash.error = detallePoliza.getResultadoOperacion().getMensajes().getMensaje()[0].getCodigoMensaje()
                log.info "Usuario_" + "-" + flash.error
                [flash: flash]
            }



            def numPolizaSeleccionada = params.poliza

            exclusiones = []
            garantias = []
            intervinientes = []

            polizaSeleccionada = true
            log.info("Completo poliza con detalle poliza")
            poliza = detallePoliza?.getResultadoOperacion()?.getDetallePoliza()
            /**SE RECUPERAN EXCLUSIONES
             *            */
            log.info("Comienzo a ver exclusiones")
            if (poliza.getExclusiones() != null && poliza.getExclusiones().getExclusion() != null && poliza.getExclusiones().getExclusion().size() > 0) {
                for (int i = 0; i < poliza.getExclusiones().getExclusion().size(); i++) {
                    exclusiones << poliza?.getExclusiones()?.getExclusion()?.getAt(i)
                }
            }
            /**SE RECUPERAN GARANTIAS
             *            */
            log.info("Comienzo a ver garantias")
            if (poliza.getGarantias() != null && poliza.getGarantias().getGarantia() != null && poliza.getGarantias().getGarantia().size() > 0) {
                for (int i = 0; i < poliza.getGarantias().getGarantia().size(); i++) {
                    garantias << poliza?.getGarantias()?.getGarantia()?.getAt(i)
                }
            }
            /**SE RECUPERAN INTERVINIENTES
             *            */
            log.info("Comienzo a ver intervinientes")
            if (poliza.getIntervinientes() != null && poliza.getIntervinientes().getInterviniente() != null && poliza.getIntervinientes().getInterviniente().size() > 0) {
                for (int i = 0; i < poliza.getIntervinientes().getInterviniente().size(); i++) {
                    intervinientes << poliza?.getIntervinientes()?.getInterviniente()?.getAt(i)
                }
            }
            /**SE METEN LOS DATOS EN LA SESION PARA PODER UTILIZARLOS A LO LARGO DEL PROCESO DE ALTA
             *            */
            session.setAttribute("numPolizaSeleccionada", numPolizaSeleccionada)
            session.setAttribute("poliza", poliza)
            session.setAttribute("exclusiones", exclusiones)
            session.setAttribute("garantias", garantias)
            session.setAttribute("intervinientes", intervinientes)
            session.setAttribute("idOperacionAma", detallePoliza.getIdOperacion().toString())

            /**SE MUESTRA EL DETALLE DE LA POLIZA SELECCIONADA
             *            */
            render(view: "/busquedaAma/detallePoliza", model: [flash: flash, exclusiones: exclusiones, garantias: garantias, intervinientes: intervinientes, detalle: poliza, expedienteCreado: false, procedimientoTramitacion: detallePoliza?.getResultadoOperacionDetalle()?.getProcedimientoTramitacion()?.toString()])
        } catch (MalformedURLException e) {

            flash.error = e.getMessage()
            log.error "Usuario_" + "-" + flash.error
            [flash: flash]
        } catch (Exception e) {

            log.error "Usuario_" + "-" + e.getMessage()

            flash.error = transformacionUtils.transformarTipoMensajesErrorAma(e.getMessage().toString())
            [flash: flash, params: params]
        }
    }

    /**METODO QUE INICIA LA CRACION DEL EXPEDIENTE
     *
     * @return
     */
    def crear() {

        def numPolizaSeleccionada = session.getAttribute("numPolizaSeleccionada")
        def poliza = session.getAttribute("poliza")
        def exclusiones = session.getAttribute("exclusiones")
        def garantias = session.getAttribute("garantias")
        def intervinientes = session.getAttribute("intervinientes")
        def listaPolizasIniciales = session.getAttribute("listaPolizasIniciales")
        def idOperacionAma = session.getAttribute("idOperacionAma")
        def noVigente = session.getAttribute("noVigente")
        def respuestaCRM
        def clienteSeleccionado
        ConsultaPolizasEnfermedadesStub.Poliza polizaSeleccionada
        def textoBeneficiarios = ""
        Expediente expedienteModificado
        ConsultaPolizasEnfermedadesStub.PolizaSimple polizaInicial

        String pattern = "dd/MM/yyyy"
        String dateInString = new SimpleDateFormat(pattern).format(new Date())
        def fecha = dateInString

        if (numPolizaSeleccionada != null) {

            /**SE SELECCIONA LA POLIZA DE ENTRE EL CONJUNTO TOTAL DE POLIZAS
             *
             *            */
            for (int i = 0; i < listaPolizasIniciales.size(); i++) {
                if (listaPolizasIniciales[i].getNumeroPoliza().toString().equals(numPolizaSeleccionada)) {
                    polizaInicial = listaPolizasIniciales[i]
                }
            }

            /**SE SELECCIONA EL ASEGURADO DE LA LISTA DE INTERVINIENTES
             *            */
            if (intervinientes != null && intervinientes.size() > 0) {
                for (int i = 0; i < intervinientes.size(); i++) {
                    if (intervinientes[i].getTipo() != null && intervinientes[i].getTipo().toString().toUpperCase().equals("ASEGURADO")) {
                        clienteSeleccionado = intervinientes[i]
                    }
                }
            } else {
                clienteSeleccionado = intervinientes[0]
            }

            /**SE RECUPERA EL DETALLE DE LA POLIZA SELECIONADA
             *            */
            if (poliza != null && poliza.getNumeroPoliza().toString().equals(numPolizaSeleccionada)) {
                polizaSeleccionada = poliza
            }

            log.info "Usuario_" + "-Iniciando conexion con BPEL...."

            /**CREAMOS CONEXION BPEL
             *            */
            conexionBpel = commonService.obtenerConexionBpel(grailsApplication.config.orabpel.crearExpediente)

            log.info "Usuario_" + "-Conexion con BPEL establecida"

            /**SE CONSTRUYE EL OBJETO PARA BPEL PARA LA CARGA
             *            */
            payload = busquedaAmaService.buildPayload(polizaSeleccionada, clienteSeleccionado, polizaInicial, grailsApplication.config.ama.codigoSt, idOperacionAma)

            try {

                log.info "Usuario_" + "- Iniciando creacion poliza: " + numPolizaSeleccionada

                /**SE LLAMA AL BPEL PARA LA CARGA DEL EXPEDIENTE CON LOS DATOS MINIMOS
                 *                */
                conexionBpel.initiate(payload)
                log.info "Usuario_" + "- Creacion poliza " + numPolizaSeleccionada + " OK "

                log.info "Usuario_" + "- Iniciando modificacion expediente..."

                /**SE LLAMA AL MODIFICA EXPEDIENTE PARA COMPLETAR EL EXPEDIENTE
                 *                */
                respuestaCRM = busquedaAmaService.modificacionesExpediente(userDetails.getUsername(), numPolizaSeleccionada, polizaSeleccionada, intervinientes, grailsApplication.config.frontal.port, grailsApplication.config.crm.user, grailsApplication.config.crm.dominio, grailsApplication.config.crm.pass, grailsApplication.config.crm.unidad, noVigente)

                if (respuestaCRM.getErrorCRM() != null ) {
                    flash.error = respuestaCRM.getErrorCRM().getDetalle()
                    log.error "Usuario_" + "-" + respuestaCRM.getErrorCRM().getDetalle()

                    render view: 'resultados', model: [flash: flash, fecha: fecha, exclusiones: exclusiones, garantias: garantias, intervinientes: intervinientes, detalle: poliza, polizas: listaPolizasIniciales]
                } else if (respuestaCRM.getListaExpedientes(0) == 0) {
                    flash.error "Expediente no creado en CRM"
                    log.error "Expediente no creado en CRM"

                    render view: 'resultados', model: [flash: flash, fecha: fecha, exclusiones: exclusiones, garantias: garantias, intervinientes: intervinientes, detalle: poliza, polizas: listaPolizasIniciales]
                } else{

                    Thread.sleep(10000);
                    expedienteModificado = respuestaCRM.getListaExpedientes(0)
                    log.info "Usuario_" + "-Modificacion expediente: " + expedienteModificado.getCodigoST() + " OK"
                    Thread.sleep(10000);
                    session.setAttribute("numPolizaSeleccionada", null)
                    flash.message = "Expediente creado satisfactoriamente con numero de poliza: " + numPolizaSeleccionada + " y codigoSt: " + expedienteModificado.getCodigoST()

                    /**SE LLAMA A LA VISTA 'resultados' QUE ABRIRA UNA NUEVA VISTA MOSTRANTO EL EXPEDIENTE CREADO
                     *                    */
                    render view: 'resultados', model: [flash: flash, exclusiones: exclusiones, garantias: garantias, intervinientes: intervinientes, detalle: poliza, polizas: listaPolizasIniciales, expedienteCreado: true, expedienteId: expedienteModificado.getExpedienteId().replace("{", "").replace("}", "")]
                    log.info "Usuario_" + "-Proceso terminado OK"
                }
            } catch (Exception ex) {

                flash.error = "Usuario_" + "-Error en la creacion de la poliza: " + numPolizaSeleccionada + ". " + ex.getStackTrace().toString()
                log.error "Usuario_" + "-Error en la creacion de la poliza: " + numPolizaSeleccionada + ". " + ex.getStackTrace().toString()
                render view: 'resultados', model: [flash: flash, expedienteCreado: false]
            }
        } else {

            listaPolizasIniciales = session.getAttribute("listaPolizasIniciales")
            flash.error = "No se ha seleccionado ninguna poliza"
            render view: 'resultados', model: [flash: flash, fecha: fecha, intervinientes: intervinientes, polizas: listaPolizasIniciales]
        }
    }
}
