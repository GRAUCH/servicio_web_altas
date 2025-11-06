package serviciowebaltas

import org.codehaus.groovy.grails.commons.GrailsApplication

import java.text.SimpleDateFormat
import java.time.ZoneId


import serviciowebaltann.ClienteMapper
import serviciowebaltann.PolizaMapper
import serviciowebaltann.BeneficiarioPolizaMapper
import serviciowebaltann.GarantiaPolizaMapper
import serviciowebaltann.ClienteRestMapper
import serviciowebaltann.Token


import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

import com.velogica.client.nn_senior.api.PoliciesApi
import com.velogica.client.nn_senior.model.ClientData
import com.velogica.client.nn_senior.model.ThirdPartiesPoliciesListResponse
import com.velogica.client.nn_senior.model.ThirdPartiesPolicyItemResponse
import com.velogica.client.nn_senior.model.InsuredsData
import com.velogica.client.nn_senior.model.CoversData
import com.velogica.client.nn_senior.model.ParticipantsData
import com.velogica.client.services.NNService

class BusquedaRestNnService {

    def commonService
    GrailsApplication grailsApplication

    // private ApiClient apiClient
    // private static final String HTTP_CODE_HEADERS_BODY_ERROR = '\n http code: {}\n headers: {}\n body: {}'
    private  ClienteRestMapper data = new ClienteRestMapper()

    private static Log log = LogFactory.getLog('logNN.' + BusquedaRestNnService.getName())

    private static final String GRANT_TYPE_KEY = 'grant_type'
    private static final String CLIENT_SECRET_KEY = 'client_secret'
    private static final String CLIENT_ID_KEY = 'client_id'

    
    def cleanData() {
        data = new ClienteRestMapper()
    }


    /*
     * Metodo para obtener la informacion por dni
     *
    */
    def obtenerInfoClienteByDni(String dni) {
        // SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")

        if (dni.isEmpty()) {
            log.info 'No se ha introducido ningun DNI para recuperar'
            data.existeError = true
        }  else {
            //recuperamos token
            //log.info("obtenerInfoCliente: grant_type: ${grailsApplication.config.nn.grant_type}")
            //log.info("obtenerInfoCliente: client_id: ${grailsApplication.config.nn.client_id}")
            //log.info("obtenerInfoCliente: client_secret: ${grailsApplication.config.nn.client_secret}")

            log.info 'Obteniendo informacion para cliente via REST_API de NN con DNI: ' + dni

            Map<String, String> credentials = new HashMap<>()
            credentials.put(GRANT_TYPE_KEY, grailsApplication.config.nn.grant_type)
            credentials.put(CLIENT_ID_KEY, grailsApplication.config.nn.client_id)
            credentials.put(CLIENT_SECRET_KEY, grailsApplication.config.nn.client_secret)

            String token = NNService.getAccessToken(grailsApplication.config.nn.urlToken, credentials).getAccessToken()

            //log.debug("obtenerInfoCliente: token: ${token}")
            log.info("Token generado correctamente para REST_API de NN")

            //para comprobar si el token se ha recuperado correctamente,
            // no lo guardamos en el atributo setExisteError, para poder diferenciar en el Controller
            // si el error es de recuperacion de token o de datos
            if (token != null) {
                
                data.setTokenError(false)

                Map<String, String> headers = new HashMap<>()
                headers.put('Accept', '*/*')
                headers.put('Authorization', "Bearer ${token}".toString())
                headers.put('Ocp-Apim-Subscription-Key',  grailsApplication.config.nn.suscription_key)
                headers.put('SubscriptionKey',  grailsApplication.config.nn.suscription_key)

                log.info("Url servicio: ${grailsApplication.config.nn.url_base_NNSennior}/customers/${dni}/policies")
                
                ThirdPartiesPoliciesListResponse lsCustomers = null

                try {
                    while (dni.length() < 9) {
                        dni = "0" + dni
                    }
                    lsCustomers = NNService.getCustomersByDni(
                    "${grailsApplication.config.nn.url_base_NNSennior}/customers/${dni}/policies".toString(),
                    headers, token)
                    //log.info("obtenerInfoCliente: Body response: ${lsCustomers}")
                } catch (Throwable e) {
                    log.error 'Error obtener Info Cliente por Dni via REST_API de NN:'
                    log.error e
                    data.setExisteError(true)
                }
                
                try {
                    
                    if (lsCustomers != null) {
                        
                        data.setThirdPartiesPoliciesListResponse(lsCustomers)                        
                       
                        if (data.getThirdPartiesPolicyItemResponse() == null) {      
                            log.info 'obtenerInfoCliente: Recuperando polizas usuario ' + dni + '. Num polizas a recuperar:' + lsCustomers.getData().size()
                            for (int i = 0; i < lsCustomers.getData().size(); i++) {
                                log.info 'obtenerInfoCliente: Recorremos la  poliza ' + (i+1) +'/' + lsCustomers.getData().size() + ' del usuario ' + dni 
                                if (isValidState(lsCustomers.getData().get(i).getConditions().getPolicy().getState())) {
                                    log.info 'obtenerInfoCliente: Recuperando los datos de la poliza ' + lsCustomers.getData().get(i).getConditions().getPolicy().getPolicyNo() + '(' + (i+1) +'/' + lsCustomers.getData().size() + ') del usuario ' + dni 
                                    //Recupero datos de poliza por poliza
                                    //Cambio el 25/10/24
                                    //obtenerInfoClienteByPoliza(lsCustomers.getData().get(i).getConditions().getPolicy().getPolicyId(), dni)
                                    obtenerInfoClienteByPoliza(lsCustomers.getData().get(i).getConditions().getPolicy().getPolicyNo(), dni)
                                    log.info 'obtenerInfoCliente: Fin recuperacion de los datos de la poliza ' + lsCustomers.getData().get(i).getConditions().getPolicy().getPolicyNo() + '(' + (i+1) +'/' + lsCustomers.getData().size() + ') del usuario ' + dni 


                                    //Mapeo datos

                                    //asegurado
                                    log.info 'obtenerInfoCliente: Procesamos los datos de cliente del Usuario con dni: ' + dni + ' devuelto por Nationale Nederlader'
                                    ClienteMapper clienteTmp = mapearAsegurado(lsCustomers)
                                    data.setCliente(clienteTmp)
                                    log.info 'obtenerInfoCliente: Fin del procesamiento de los datos de cliente del Usuario con dni: ' + dni + ' devuelto por Nationale Nederlader'
                                    
                                
                                    //poliza
                                    log.info 'obtenerInfoCliente: Procesamos los datos de la poliza del Usuario con dni: ' + dni + ' devuelto por Nationale Nederlader '
                                    List<PolizaMapper> polizasTmp = mapearPoliza(data.getThirdPartiesPolicyItemResponse(),lsCustomers.getData().get(i).getConditions().getPolicy().getPolicyNo())
                                    data.setPolizas(polizasTmp)
                                    log.info 'obtenerInfoCliente: Fin del procesamiento de los datos de la poliza del Usuario con dni: ' + dni + ' devuelto por Nationale Nederlader '


                                    //garantias poliza
                                    log.info 'obtenerInfoCliente: Procesamos los datos de las garantias del Usuario con dni: ' + dni + ' devuelto por Nationale Nederlader ' 
                                    data.setGarantiasPolizas(mapearGarantiasPolizas(data.getThirdPartiesPolicyItemResponse()))
                                    log.info 'obtenerInfoCliente: Fin del procesamiento de los datos de las garantias del Usuario con dni: ' + dni + ' devuelto por Nationale Nederlader ' 


                                    //beneficiarios
                                    log.info 'obtenerInfoCliente: Procesamos los datos de los beneficiarios del Usuario con dni: ' + dni + ' devuelto por Nationale Nederlader ' 
                                    data.setBeneficiariosPoliza(mapearBeneficiarios(data.getThirdPartiesPolicyItemResponse()))
                                    log.info 'obtenerInfoCliente: Fin del procesamiento de los datos de los beneficiarios del Usuario con dni: ' + dni + ' devuelto por Nationale Nederlader ' 


                                    //Revisamos si el cliente y el asegurado son la misma persona   
                                    log.info 'obtenerInfoCliente: PHOLDER y BENEFICENT son ????' 
                                    if (clienteTmp.getDni()!=polizasTmp[0].getDni()) {
                                        log.info 'obtenerInfoCliente: PHOLDER y BENEFICENT son distintos' 
                                        clienteTmp.setDni(polizasTmp[0].getDni())
                                        for (ParticipantsData participant : data.getThirdPartiesPolicyItemResponse().getParticipants()) {                                            
                                            if (participant.getPersonalData().getIdentificationNumber().equals(polizasTmp[0].getDni())) {
                                                clienteTmp.setNombre(participant.getPersonalData().getName())
                                                clienteTmp.setApellido1(participant.getPersonalData().getSurname1())
                                                clienteTmp.setApellido2(participant.getPersonalData().getSurname2())
                                            }
                                        }
                                        data.setCliente(clienteTmp)
                                        log.info 'obtenerInfoCliente:  PHOLDER y BENEFICENT han sido actualizados'
                                    }
                                    log.info 'obtenerInfoCliente: Fin del procesamiento del PHOLDER y BENEFICENT son ????' 
                                    data.setExisteError(false)

                                } else {
                                    log.info 'obtenerInfoCliente: No se recuperando poliza ' + (i+1) +'/' + lsCustomers.getData().size() + ' del usuario ' + dni + 'por no tener el estado adecuado (0, 11, 12 o 30)'
                                }
                            }
                        } else {
                            log.info 'obtenerInfoCliente: Usuario con dni: ' + dni + ' no ha devuelto ninguna poliza'
                        }
                    }else {
                        log.error('obtenerInfoCliente: Error recuperando datos de los participantes via REST_API de NN:')
                        data.setExisteError(true)
                    }
                } catch (Throwable e1) {
                    log.error 'obtenerInfoCliente: Error obtener al procesar la Info de Cliente por Dni via REST_API de NN:'
                    log.error e
                    data.setExisteError(true)
                }
            } else {
                log.error('obtenerInfoCliente: Error al recuperar el token')
                data.setTokenError(true)
            }
        }
        return data
    }

    def isValidState(String state) {
        boolean valret = false;
        log.info 'obtenerInfoCliente: Validamos el state ' + state
        if (state == "0" || state == "11" || state == "12" || state == "30") {
            valret = true;
        }
        return valret;
    }


    /*
     * Metodo para obtener la informacion por poliza
     *
    */
    def obtenerInfoClienteByPoliza(String poliza, String dni) {
        // SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")

        log.info 'obtenerInfoClienteByPoliza: Usuario_' + 'userDetails?.getUsername()'

        if (poliza.isEmpty()) {
            log.info "No tenemos la políza para recuperar cliente"
            data.existeError = true
        }  else {
            //recuperamos token
            //log.info("obtenerInfoClienteByPoliza: grant_type: ${grailsApplication.config.nn.grant_type}")
            //log.info("obtenerInfoClienteByPoliza: client_id: ${grailsApplication.config.nn.client_id}")
            //log.info("obtenerInfoClienteByPoliza: client_secret: ${grailsApplication.config.nn.client_secret}")

            Map<String, String> credentials = new HashMap<>()
            credentials.put(GRANT_TYPE_KEY, grailsApplication.config.nn.grant_type)
            credentials.put(CLIENT_ID_KEY, grailsApplication.config.nn.client_id)
            credentials.put(CLIENT_SECRET_KEY, grailsApplication.config.nn.client_secret)

            String token = NNService.getAccessToken(grailsApplication.config.nn.urlToken, credentials).getAccessToken()

            //log.info("obtenerInfoClienteByPoliza: token: ${token}")

            //para comprobar si el token se ha recuperado correctamente,
            // no lo guardamos en el atributo setExisteError, para poder diferenciar en el Controller
            // si el error es de recuperacion de token o de datos
            if (token != null) {
                try {
                    data.setTokenError(false)

                    Map<String, String> headers = new HashMap<>()
                    headers.put('Accept', '*/*')
                    headers.put('Authorization', "Bearer ${token}".toString())
                    headers.put('Ocp-Apim-Subscription-Key',  grailsApplication.config.nn.suscription_key)
                    headers.put('SubscriptionKey',  grailsApplication.config.nn.suscription_key)
                    log.debug("obtenerInfoClienteByPoliza")

                    ThirdPartiesPolicyItemResponse policy = NNService.getPolicyByPolicyNumber(
                        "${grailsApplication.config.nn.url_base_NNSennior}/policies/${poliza}".toString(),
                        headers, token)

                    log.info("obtenerInfoClienteByPoliza: Url servicio: ${grailsApplication.config.nn.url_base_NNSennior}/policies/${poliza}")
                    //log.info("obtenerInfoClienteByPoliza: Body response: ${policy}")

                    if (policy != null) {

                        data.setThirdPartiesPolicyItemResponse(policy)

                        //Recupero datos de poliza por poliza
                        // se comprueba que no tengas ya el cliente (por si el primer metodo llamado hubiera sido
                        // obtenerclienteByDni)
                        if (data.getThirdPartiesPoliciesListResponse() == null) {
                            //Recupero datos de poliza por dni
                            obtenerInfoClienteByDni(policy.getClient().getIdentificationNumber())

                            //Mapeo datos
                            //asegurado
                            ClienteMapper clienteTmp = mapearAsegurado(data.getThirdPartiesPoliciesListResponse())
                            data.setCliente(clienteTmp)
                            //poliza
                            List<PolizaMapper> polizaTmp = mapearPoliza(policy,${poliza})
                            data.setPolizas(polizaTmp)
                            //garantias poliza
                            List<PolizaMapper> polizasTmp = mapearGarantiasPolizas(policy)
                            data.setGarantiasPolizas(polizasTmp)
                            //beneficiarios
                            data.setBeneficiariosPoliza(mapearBeneficiarios(policy))

                            data.setExisteError(false)

                            log.info 'obtenerInfoClienteByPoliza: Usuario con dni: ' + dni + ' termina de recupear polizas'  
                        }
                        
                    } else {
                        log.error('obtenerInfoClienteByPoliza: Error recuperando datos de las polizas ' + poliza + ' de la api de NN del dni ' + dni)
                        data.setExisteError(true)
                    }
                } catch (Throwable e) {
                    log.error 'obtenerInfoClienteByPoliza: Error recuperando datos de las polizas de la api de NN:'
                    log.error e
                    data.setExisteError(true)
                }
            }else {
                data.setTokenError(true)
            }
        }
        return data
    }

    private ClienteMapper mapearAsegurado(ThirdPartiesPoliciesListResponse customer) {
        ClienteMapper clienteMapper = null
        for (int i = 0; i < customer.getData().size(); i++) {
            clienteMapper = new ClienteMapper()
            clienteMapper.setRowId(String.valueOf(i))
            ClientData participant = customer.getData().get(i).getParticipant()
            clienteMapper.setNombre(participant.getName())
            clienteMapper.setApellido1(participant.getSurname1())
            clienteMapper.setApellido2(participant.getSurname2())
            clienteMapper.setDni(participant.getIdentificationNumber())
            clienteMapper.setCodCliente(participant.getIdentificationNumber())
            clienteMapper.setSexo('')
            clienteMapper.setTelFijo(participant.getContacts().getMobile())
            clienteMapper.setTelMovil(participant.getContacts().getMobile())
            clienteMapper.setCodProfesion('')
            clienteMapper.setProfesion('')
            clienteMapper.setFechaNacimiento(new Date())
            //Rellenar participante
            clienteMapper.setAsegurado(customer.getData().get(0).getParticipant().getName())
            clienteMapper.setTomador1('')
            clienteMapper.setTomador2('')
            clienteMapper.setTipoVia(participant.getAddress().getStreetType())
            clienteMapper.setDireccion(participant.getAddress().getName()
                    + participant.getAddress().getNumber()
                    + participant.getAddress().getOthers())
            clienteMapper.setPoblacion(participant.getAddress().getCity())
            clienteMapper.setProvincia(participant.getAddress().getRegion())
            clienteMapper.setCodPostal(participant.getAddress().getPostCode())
            clienteMapper.setPais(participant.getAddress().getCountryCode())
        }
        return clienteMapper
    }

    private List<PolizaMapper> mapearPoliza(ThirdPartiesPolicyItemResponse policies, String poliza) {
        List<PolizaMapper> lsPolizaMappers = []
        PolizaMapper polizaMapper
        String participant1 = null;
        String participant2 = null;
        String participant3 = null;
        String dni1 = null;
        String dni2 = null;
        String dni3 = null;
        log.info 'mapearPoliza: Iniciamos procesamiento de poliza'

        polizaMapper = new PolizaMapper()
        
        //Origen
         //polizaMapper.setNumPoliza(policies.getConditions().getPolicy().getPolicyId())

        //Cambio 25/01/2024
        //Igualamos numPoliza con el campo PolicyNo en lugar de con PolicyId
        //polizaMapper.setNumPoliza(policies.getConditions().getPolicy().getPolicyNo())

        //Cambio 01/02/204
        //El cambio anterior da problema por los que vamos a mapear la reves: PolicyId contra PolicyNum y viceversa
        //polizaMapper.setPolizaId(policies.getConditions().getPolicy().getPolicyNo())
        //polizaMapper.setNumPoliza(policies.getConditions().getPolicy().getPolicyId())

        //Cambio 02/02/204
        //Puestos al habla con NN nos indican que el campo poliyNNo viene vacio, por el lo pasamos como parametro a la funcion
        polizaMapper.setPolizaId(policies.getConditions().getPolicy().getPolicyId())
        polizaMapper.setNumPoliza(poliza)
        
        //polizaMapper.setDni(policies.getClient().getIdentificationNumber())
        polizaMapper.setCodSituacion(policies.getConditions().getPolicy().getState())
        polizaMapper.setSituacion(policies.getConditions().getPolicy().getStateName())
        polizaMapper.setCompany(grailsApplication.config.nn.proCompany)
        //OSTEOPOROSIS
        log.info 'mapearPoliza: Iniciamos procesamiento de datos basicos'
        //TODO change to property
        polizaMapper.setCodProducto(grailsApplication.config.nn.proCode)
        polizaMapper.setFechaEfecto(Date.from(policies.getConditions().getEffectiveDate().atStartOfDay(ZoneId.systemDefault()).toInstant()))
        polizaMapper.setFormaPago('')
        polizaMapper.setFechaVencimientoCobro(Date.from(policies.getConditions().getExpireDate().atStartOfDay(ZoneId.systemDefault()).toInstant()))
        polizaMapper.setDiasFranquicia(0)
        polizaMapper.setDuracionRenta(transformToDays(policies.getConditions().getDuration(), policies.getConditions().getDurationUnits()))
        log.info 'mapearPoliza: Iniciamos procesamiento de participantes'
        // se ha tomado como que el participante 1 es el tomador1 siempre
        if (policies.getParticipants().size() > 1) {
            log.info 'mapearPoliza: Iniciamos procesamiento de participantes - Hay participantes'
            for (ParticipantsData participant : policies.getParticipants()) {
                log.info 'mapearPoliza: Iniciamos procesamiento de participantes - Hay participantes ' + participant.getParticipantRole()
                if (participant.getParticipantRole().equals('BENEFICENT')) {
                    participant1 = participant.getPersonalData().getName();
                    dni1 = participant.getPersonalData().getIdentificationNumber();
                } else if (participant.getParticipantRole().equals('PHOLDER')) {
                    participant2 = participant.getPersonalData().getName();
                    dni2 = participant.getPersonalData().getIdentificationNumber();
                } else {
                    //if (participant3 == null) {
                        participant3 = participant.getPersonalData().getName();
                        dni3 = participant.getPersonalData().getIdentificationNumber();
                    //}
                }
            }
            log.info 'mapearPoliza: Fin procesamiento de participantes. Procedemos a su asignacion'
            log.info 'mapearPoliza: Los valores disponible son participan1: ' + participant1 + ' participan2: ' + participant2 + ' participan3: ' + participant3
            if (participant1) {
                polizaMapper.setDni(dni1);
                polizaMapper.setAsegurado(participant1)
                polizaMapper.setTomador1(participant1);
            }
            if (participant2) {
                polizaMapper.setTomador2(participant2);
                if (!participant1) {
                    polizaMapper.setAsegurado(participant2)
                    polizaMapper.setTomador1(participant2);
                    polizaMapper.setDni(dni2);
                } 
            }
            if (!participant1 && participant2 && participant3) {
                polizaMapper.setTomador2(participant3);
            }
            
        }
         log.info 'mapearPoliza: Iniciamos procesamiento de Osteoporosis y Osteopenia'
        //Questionary
        polizaMapper.setOsteoporosis("")
        polizaMapper.setOsteopenia("")
        if (policies.getConditions()!=null && policies.getConditions().getQuestionary()!=null) {
            polizaMapper.setOsteoporosis("No")
            polizaMapper.setOsteopenia("No")
            if (policies.getConditions()!=null && policies.getConditions().getQuestionary()!=null && policies.getConditions().getQuestionary().getOsteoporosis()!=null) {
                log.info("mapearPoliza: Value for osteoporosis: ${policies.getConditions().getQuestionary().getOsteoporosis()}")
                if (policies.getConditions().getQuestionary().getOsteoporosis()==true) {
                    polizaMapper.setOsteoporosis("Si")
                }
            }
            if (policies.getConditions()!=null && policies.getConditions().getQuestionary()!=null && policies.getConditions().getQuestionary().getOsteopenia()!=null) {
                log.info("mapearPoliza: Value for osteopenia: ${policies.getConditions().getQuestionary().getOsteopenia()}")
                if (policies.getConditions().getQuestionary().getOsteopenia()==true) {
                    polizaMapper.setOsteopenia("Si")
                }
            }
        }
            
        lsPolizaMappers.add(polizaMapper)

        log.info 'mapearPoliza: Finalizamos procesamiento de poliza'

        return lsPolizaMappers
    }

    private List<GarantiaPolizaMapper> mapearGarantiasPolizas(ThirdPartiesPolicyItemResponse policies) {
        //log.info("Start method mapearGarantiasPolizas, parameters: policies ${policies}")

        List<GarantiaPolizaMapper> lsGarantiaPolizaMapper = []
        GarantiaPolizaMapper garantiaPolizaMapper = new GarantiaPolizaMapper()

        garantiaPolizaMapper.setNumPoliza(policies.getConditions().getPolicy().getPolicyId())

        for (InsuredsData InsuredsData : policies.getInsureds()) {
            garantiaPolizaMapper.setCapital(String.valueOf(InsuredsData.getObjects().getInsuredAmount()))

            for (CoversData coverData : InsuredsData.getObjects().getCovers()) {
                garantiaPolizaMapper.setCodGarantia(String.valueOf(coverData.getCode()))
                garantiaPolizaMapper.setGarantia(coverData.getDescription())
                garantiaPolizaMapper.setFechaVencimientoGarantia(Date.from(coverData.getInsrEnd().atStartOfDay(ZoneId.systemDefault()).toInstant()))
                garantiaPolizaMapper.setFechaVencimientoPrima(Date.from(coverData.getInsrBegin().atStartOfDay(ZoneId.systemDefault()).toInstant()))
            }
            lsGarantiaPolizaMapper.add(garantiaPolizaMapper)
        }
        //log.info('Finish method mapearGarantiasPolizas')

        return lsGarantiaPolizaMapper
    }

    private List<BeneficiarioPolizaMapper> mapearBeneficiarios(ThirdPartiesPolicyItemResponse policies) {
        List<BeneficiarioPolizaMapper> lsBeneficiarioPolizaMapper = []
        BeneficiarioPolizaMapper beneficiarioPolizaMapper = null
        for (int i = 0; i < policies.getParticipants().size(); i++) {
            //TODO pendiente de definicion, cambiar blanco por palabra beneficiario
            if (policies.getParticipants().get(i).getParticipantRole() == 'BENEFICENT') {
                beneficiarioPolizaMapper = new BeneficiarioPolizaMapper()
                beneficiarioPolizaMapper.setNumPoliza(policies.getConditions().getPolicy().getPolicyId())
                beneficiarioPolizaMapper.setCodigo(policies.getParticipants().get(i).getPersonalData().getIdentificationNumber())
                // TODO pendiente de definicion
                beneficiarioPolizaMapper.setDescripcion()
                // TODO pendiente de definicion
                beneficiarioPolizaMapper.setOrden()
                lsBeneficiarioPolizaMapper.add(beneficiarioPolizaMapper)
            }
        }
        return lsBeneficiarioPolizaMapper
    }

    private int transformToDays(BigDecimal ammount, String unit) {
        int result = ammount
        switch (unit.toLowerCase()) {
            case 'y':
                result *=   365
                break
            case 'm':
                result *= 30
                break
        }
        return result
    }

}
