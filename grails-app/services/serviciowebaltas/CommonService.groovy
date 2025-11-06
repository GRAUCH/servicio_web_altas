package serviciowebaltas

import com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRP_ServiceLocator
import com.scortelemed.servicios.Expediente
import com.scortelemed.servicios.Filtro
import com.scortelemed.servicios.Frontal
import com.scortelemed.servicios.FrontalServiceLocator
import com.scortelemed.servicios.RespuestaCRM
import com.scortelemed.servicios.Siniestro
import com.scortelemed.servicios.Usuario
import grails.transaction.Transactional

import java.text.SimpleDateFormat

class CommonService {

    /**CONEXION BPEL
     *
     * @param orabpel
     * @return
     */
    def obtenerConexionBpel(String orabpel) {

        CreacionExpedienteAsyncSRP_ServiceLocator serviceLocator = new CreacionExpedienteAsyncSRP_ServiceLocator()
        URL portAddress = new URL(orabpel);

        return serviceLocator.getCreacionExpedienteAsyncSRPPort(portAddress)
    }

    /**SE INSTANCIA EL FRONTAL
     *
     * @param intervinientes
     * @return
     */
    def instanciarFrontal(String frontalPortAddress) {

        FrontalServiceLocator fs = new FrontalServiceLocator();
        fs.setFrontalPortEndpointAddress(frontalPortAddress);
        Frontal frontal = fs.getFrontalPort();

        return frontal;
    }

    RespuestaCRM consultaExpedienteFrontal(Frontal frontal, Usuario usuario, Filtro filtro, int limiteBusquedaMax) {

        boolean expedienteEncontradoEnCRM = false;
        int limiteBusqueda = 0;

        RespuestaCRM respuestaCRM = null
        log.info("consultaExpedienteFrontal para póliza " + filtro.getValor() + ": " + limiteBusqueda)
        while (!expedienteEncontradoEnCRM && limiteBusqueda < limiteBusquedaMax) {
            Thread.sleep(5000)
            log.info("consultaExpedienteFrontal intento: " + limiteBusqueda)
            log.info("consultaExpedienteFrontal usuario: " + usuario)
            log.info("consultaExpedienteFrontal filtro: " + filtro)
           
            respuestaCRM = frontal.consultaExpediente(usuario, filtro)

             log.info("consultaExpedienteFrontal volvemos del frontal con filtro: " + filtro)

            if (respuestaCRM != null && respuestaCRM.getListaExpedientes() != null && respuestaCRM.getListaExpedientes().size() > 0) {
                log.info("consultaExpedienteFrontal expediente encontrado")
                expedienteEncontradoEnCRM = true
            }
            limiteBusqueda++
        }
    log.info("consultaExpedienteFrontal salimos de póliza " + filtro.getValor() + ": " + limiteBusqueda)
        return respuestaCRM
    }

    RespuestaCRM consultaExpedienteSiniestroFrontal(Frontal frontal, Usuario usuario, Filtro filtro, int limiteBusquedaMax) {

        boolean expedienteEncontradoEnCRM = false;
        int limiteBusqueda = 0;

        RespuestaCRM respuestaCRM = null
        log.info("consultaExpedienteSiniestroFrontal para expediente " + filtro.getValor() + ": " + limiteBusqueda)
        while (!expedienteEncontradoEnCRM && limiteBusqueda < limiteBusquedaMax) {
            Thread.sleep(5000)
            log.info("consultaExpedienteSiniestroFrontal intento: " + limiteBusqueda)
            respuestaCRM = frontal.consultaExpedienteSiniestro(usuario, filtro)
            if (respuestaCRM != null && respuestaCRM.getListaExpedientes() != null && respuestaCRM.getListaExpedientes().size() > 0) {
                expedienteEncontradoEnCRM = true
            }
            limiteBusqueda++
        }

        return respuestaCRM
    }

    RespuestaCRM modificaExpedienteFrontal (Frontal frontal, Usuario usuario, Expediente expediente, int limiteBusquedaMax) {

        boolean expedienteModificadoEnCRM = false;
        int limiteBusqueda = 0;

        RespuestaCRM respuestaCRM = null
        log.info("modificaExpedienteFrontal para expediente " + expediente.getCodigoST() + ": " + limiteBusqueda)
        while (!expedienteModificadoEnCRM && limiteBusqueda < limiteBusquedaMax) {
            Thread.sleep(5000)
            log.info("modificaExpedienteFrontal intento: " + limiteBusqueda)
            respuestaCRM = frontal.modificaExpediente(usuario, expediente, null, null)

            if (respuestaCRM.getErrorCRM() == null || respuestaCRM.getErrorCRM().getDetalle() == null) {
                expedienteModificadoEnCRM = true
            }
            limiteBusqueda++
        }

        return respuestaCRM
    }

    RespuestaCRM modificaExpedienteSiniestroFrontal (Frontal frontal, Usuario usuario, Expediente expediente, Siniestro siniestro, int limiteBusquedaMax) {

        boolean expedienteModificadoEnCRM = false;
        int limiteBusqueda = 0;

        RespuestaCRM respuestaCRM = null
        log.info("modificaExpedienteSiniestroFrontal para expediente " + expediente.getCodigoST() + ": " + limiteBusqueda)
        while (!expedienteModificadoEnCRM && limiteBusqueda < limiteBusquedaMax) {
            Thread.sleep(5000)

            log.info("modificaExpedienteSiniestroFrontal intento: " + limiteBusqueda)
            respuestaCRM = frontal.modificaSiniestroExpediente(usuario, expediente, siniestro)


            if (respuestaCRM.getErrorCRM() == null) {
                expedienteModificadoEnCRM = true
            }
            limiteBusqueda++
        }

        return respuestaCRM
    }

    public List obtenerExpedientesDeSiniestro(RespuestaCRM respuestaCrmSiniestro, SimpleDateFormat formatter, RespuestaCRM respuestaCrmExpediente, boolean encontrado, Expediente expediente) {
        Expediente expSiniestro
        try {
            log.info("obtenerExpedientesDeSiniestro")
            if (respuestaCrmSiniestro != null && respuestaCrmSiniestro.getListaExpedientes() != null && 
                respuestaCrmSiniestro.getListaExpedientes().size() > 0) {
                log.info("obtenerExpedientesDeSiniestro para expediente " + expediente.getCodigoST() + " recuperamos la el primer elemento de la lista de Expedientes")
                expSiniestro = respuestaCrmSiniestro.getListaExpedientes(0)

                if (expSiniestro.getListaSiniestros() == null && expSiniestro.getFechaApertura().equals(formatter.format(new Date()))) {
                    expediente = expSiniestro
                    encontrado = true
                    Expediente[] expedientes = new Expediente[1]
                    expedientes[0] = expediente
                    respuestaCrmExpediente.setListaExpedientes(expedientes)
                    log.info("obtenerExpedientesDeSiniestro para expediente " + expediente.getCodigoST() + " añadimos un siniestro")
                } else {
                    log.info("obtenerExpedientesDeSiniestro para expediente " + expediente.getCodigoST() + " la lista de Expedientes esta vacia y la fecha de apertura no es hoy")
                }

            } else {
                log.info("obtenerExpedientesDeSiniestro para expediente " + expediente.getCodigoST() + " esta vacia")
            }
        } catch (Exception e) {
            log.info("error en obtenerExpedientesDeSiniestro para expediente " + expediente.getCodigoST() + ": " + e.toString())
        }
        [respuestaCrmExpediente, encontrado, expediente]
    }
}
