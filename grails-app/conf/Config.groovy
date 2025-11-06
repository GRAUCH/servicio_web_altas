import org.apache.log4j.DailyRollingFileAppender

grails.gorm.default.mapping = {
    id generator: 'seqhilo', params: [max_lo: 1000]
}

log4j = {
    appenders {
        appender new DailyRollingFileAppender(
                name: 'appenderNN',
                datePattern: "'.'yyyy-MM-dd",  // See the API for all patterns.
                fileName: '/var/log/wildfly/appLogs/webaltascitas/serviciowebaltasnn.log',
                layout: pattern(conversionPattern:'%d [%t] %-5p %c{2} %x - %m%n')
        )
        appender new DailyRollingFileAppender(
                name: 'appenderAMA',
                datePattern: "'.'yyyy-MM-dd",  // See the API for all patterns.
                fileName: '/var/log/wildfly/appLogs/webaltascitas/serviciowebaltasama.log',
                layout: pattern(conversionPattern:'%d [%t] %-5p %c{2} %x - %m%n')
        )
    }

    all appenderNN:'logNN', appenderAMA:'logAMA', additivity:false

    error   'org.codehaus.groovy.grails.web.servlet',        // controllers
            'org.codehaus.groovy.grails.web.pages',          // GSP
            'org.codehaus.groovy.grails.web.sitemesh',       // layouts
            'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
            'org.codehaus.groovy.grails.web.mapping',        // URL mapping
            'org.codehaus.groovy.grails.commons',            // core / classloading
            'org.codehaus.groovy.grails.plugins',            // plugins
            'org.codehaus.groovy.grails.orm.hibernate',      // hibernate integration
            'org.springframework',
            'org.hibernate',
            'net.sf.ehcache.hibernate'

    warn    'org.springframework',
            'org.hibernate',
            'grails.plugins.springsecurity',
            'groovyx.net.http'

    all     'grails.app'
}

// LDAP config
//grails.plugin.springsecurity.ldap.authorities.retrieveDatabaseRoles = true
grails.plugin.springsecurity.ldap.context.managerDn = 'admin-qurius'
grails.plugin.springsecurity.ldap.context.managerPassword = 'd!vz#GW7xw9'
grails.plugin.springsecurity.ldap.context.server = 'ldap://172.22.0.3:389'
grails.plugin.springsecurity.ldap.authorities.ignorePartialResultException = true // typically needed for Active Directory
grails.plugin.springsecurity.ldap.search.base = 'DC=scor-telemed,DC=local'
grails.plugin.springsecurity.ldap.search.filter = 'sAMAccountName={0}' // for Active Directory you need this
grails.plugin.springsecurity.ldap.search.searchSubtree = true
grails.plugin.springsecurity.ldap.auth.hideUserNotFoundExceptions = false
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
        '/':                              ['IS_AUTHENTICATED_FULLY'],
        '/**':                            ['IS_AUTHENTICATED_FULLY'],//para real
        //'/**':                            ['permitAll'], //para local
        '/view/index':                    ['IS_AUTHENTICATED_FULLY'],
        '/index.gsp':                     ['permitAll'],
        '/**/js/**':                      ['permitAll'],
        '/**/css/**':                     ['permitAll'],
        '/**/images/**':                  ['permitAll'],
        '/**/favicon.ico':                ['permitAll'],
        '/assets/**':                     ['permitAll']]

environments {
    localProIncidencias {
        println "Carga configuración entorno 'localProIncidencias'"
        crm {
            url = 'http://172.22.0.94/'
            user = 'usuarioBPM'
            dominio = 'Scor-Telemed.local'
            pass = '7Q%NN!v5'
            unidad = 'ES'
        }
        frontal {
            port = 'http://172.26.0.2:8003/FrontalServiciosCRM/FrontalService'
        }
        orabpel {
            crearExpediente = 'http://172.26.0.2:8888/orabpel/default/CreacionExpedienteAsyncSRP/5.0'
        }
        ama {
            wsdl = 'https://servicios.amaseguros.com/servicios/externos/ilts/v1.0.0'
            user = 'aplCORWS'
            pass = 'Wh1t3p&&$'
            codigoSt = '1060'
        }
        nn {
            wsdl = 'https://externalwebservices.nnseguros.es/INGNN_SW_CS_IntegracionSiniestros/NN_Servicios.asmx'
            user = 'wsprodusernet'
            pass = 'Prod!Token$scor2014'
            codigoSt = '1017'
            //productCode
            proCode = 'SENIOR'
            proCompany = 'G'
        }
    }

    local {
        println "Carga configuración entorno 'local'"
        crm {
            url = 'http://172.17.0.36/'
            user = 'gcaballero-es'
            dominio = 'scor.local'
            pass = 'P@ssword'
            unidad = 'ES'
        }
        frontal {
            port = 'http://172.17.0.33:8003/FrontalServiciosCRM/FrontalService'
        }
        orabpel {
            crearExpediente = 'http://172.17.0.33:8888/orabpel/default/CreacionExpedienteAsyncSRP/4.0'
        }
        ama {
            wsdl = 'https://servicios.amaseguros.com/servicios/externos/ilts/v1.0.0'
            user = 'aplCORWS'
            pass = 'Wh1t3p&&$'
            codigoSt = '1061'
        }

        nn {
            wsdl = ''
            user = 'wstestusernet'
            pass = 'test!token$2014'
            codigoSt = '1031'

            //Api client NNSenior configuration
            suscription_key = 'e5ec5950a0644ad48b5567b3034cb532'
            url_base_NNSennior = 'https://lorca.nnespana.es/external/outer/products/senior/3rdparties/V1'
            //url_base_NNSennior = 'http://localhost:8081/external/outer/products/senior/3rdparties/V1'

            //Api client NNSenior security configuration
            urlToken = 'https://login.microsoftonline.com/fed95e69-8d73-43fe-affb-a7d85ede36fb/oauth2/token'
            grant_type = 'client_credentials'
            client_id = '4c32b605-5ca4-4c8e-a798-195893bad69e'
            client_secret = 'By08Q~-cczAj6VPe9rAXRz7BS5P~SobgTnt.udzw'

            //productCode
            proCode = 'SENIOR'
            proCompany = 'G'
        }
    }

    development {
        println "Carga configuración entorno 'development'"
        crm {
            url = 'http://172.17.0.36/'
            user = 'gcaballero-es'
            dominio = 'scor.local'
            pass = 'P@ssword'
            unidad = 'ES'
        }
        frontal {
            port = 'http://172.17.0.33:8003/FrontalServiciosCRM/FrontalService'
        }
        orabpel {
            crearExpediente = 'http://172.17.0.33:8888/orabpel/default/CreacionExpedienteAsyncSRP/4.0'
        }
        ama {
            wsdl = 'https://servicios.amaseguros.com/servicios/externos/ilts/v1.0.0'
            user = 'aplCORWS'
            pass = 'Wh1t3p&&$'
            codigoSt = '1061'
        }
        nn {
            wsdl = 'https://externalwebservicesnnt.nne.es/INGNN_SW_CS_IntegracionSiniestros/NN_Servicios.asmx'
            user = 'wstestusernet'
            pass = 'test!token$2014'
            codigoSt = '1031'

            //Api client NNSenior configuration
            suscription_key = 'e5ec5950a0644ad48b5567b3034cb532'
            url_base_NNSennior = 'https://lorca.nnespana.es/external/outer/products/senior/3rdparties/V1'
            //url_base_NNSennior = 'http://localhost:8081/external/outer/products/senior/3rdparties/V1'

            //Api client NNSenior security configuration
            urlToken = 'https://login.microsoftonline.com/fed95e69-8d73-43fe-affb-a7d85ede36fb/oauth2/token'
            grant_type = 'client_credentials'
            client_id = '4c32b605-5ca4-4c8e-a798-195893bad69e'
            client_secret = 'By08Q~-cczAj6VPe9rAXRz7BS5P~SobgTnt.udzw'

            //productCode
            proCode = 'SENIOR'
            proCompany = 'G'
        }
    }

    integration {
        println "Carga configuración entorno 'integration'"
        crm {
            url = 'http://172.17.0.36/'
            user = 'gcaballero-es'
            dominio = 'scor.local'
            pass = 'P@ssword'
            unidad = 'ES'
        }
        frontal {
            port = 'http://172.17.0.33:8003/FrontalServiciosCRM/FrontalService'
        }
        orabpel {
            crearExpediente = 'http://172.17.0.33:8888/orabpel/default/CreacionExpedienteAsyncSRP/4.0'
        }
        ama {
            wsdl = 'https://servicios.amaseguros.com/servicios/externos/ilts/v1.0.0'
            user = 'aplCORWS'
            pass = 'Wh1t3p&&$'
            codigoSt = '1061'
        }
        nn {
            wsdl = 'https://externalwebservicesnnt.nne.es/INGNN_SW_CS_IntegracionSiniestros/NN_Servicios.asmx'
            user = 'wstestusernet'
            pass = 'test!token$2014'
            codigoSt = '1031'


            //Api client NNSenior configuration
            suscription_key = 'e5ec5950a0644ad48b5567b3034cb532'
            url_base_NNSennior = 'https://lorca.nnespana.es/external/outer/products/senior/3rdparties/V1'
            //url_base_NNSennior = 'http://localhost:8081/external/outer/products/senior/3rdparties/V1'

            //Api client NNSenior security configuration
            urlToken = 'https://login.microsoftonline.com/fed95e69-8d73-43fe-affb-a7d85ede36fb/oauth2/token'
            grant_type = 'client_credentials'
            client_id = '4c32b605-5ca4-4c8e-a798-195893bad69e'
            client_secret = 'By08Q~-cczAj6VPe9rAXRz7BS5P~SobgTnt.udzw'


            //productCode
            proCode = 'SENIOR'
            proCompany = 'G'
        }
    }

    preproduction {
        println "Carga configuración entorno 'preproduction'"
        crm {
            url = 'http://172.17.0.36/'
            user = 'gcaballero-es'
            dominio = 'scor.local'
            pass = 'P@ssword'
            unidad = 'ES'
        }
        frontal {
            port = 'http://172.17.0.33:8003/FrontalServiciosCRM/FrontalService'
        }
        orabpel {
            crearExpediente = 'http://172.17.0.33:8888/orabpel/default/CreacionExpedienteAsyncSRP/4.0'
        }
        ama {
            wsdl = 'https://pre-servicios.amaseguros.com/AmaPublish/ama/services/consultaPolizasEnfermedades'
            user = 'aplCORWSPRE'
            pass = 'IE4tKQA6'
            codigoSt = '1061'
        }
        nn {
            wsdl = 'https://externalwebservicesnnt.nne.es/DESARROLLO/INGNN_SW_CS_IntegracionSiniestrosD/NN_Servicios.asmx'
            user = 'wstestusernet'
            pass = 'test!token$2014'
            codigoSt = '1031'

            //Api client NNSenior configuration
            suscription_key = 'c8ae544ccff04bcf9a6e757ced8a0bee'
            url_base_NNSennior = 'https://lorca.nnespana.es/external/outer/products/senior/3rdparties/V1'
            //url_base_NNSennior = 'http://localhost:8081/external/outer/products/senior/3rdparties/V1'

            //Api client NNSenior security configuration
            urlToken = 'https://login.microsoftonline.com/fed95e69-8d73-43fe-affb-a7d85ede36fb/oauth2/token'
            grant_type = 'client_credentials'
            client_id = '4c32b605-5ca4-4c8e-a798-195893bad69e'
            client_secret = 'zr_8Q~PxGZ7VZgA_Hm5FNFA6IjMeGu4XZqNvRdoT'

            //productCode
            proCode = 'SENIOR'
            proCompany = 'G'
        }
    }

    production {
        println "Carga configuración entorno 'production'"
        println "WARNING: borrar GSON 2.2.4"
        crm {
            url = 'http://172.22.0.94/'
            user = 'usuarioBPM'
            dominio = 'Scor-Telemed.local'
            pass = '7Q%NN!v5'
            unidad = 'ES'
        }
        frontal {
            port = 'http://172.26.0.2:8003/FrontalServiciosCRM/FrontalService'
        }
        orabpel {
            crearExpediente = 'http://172.26.0.2:8888/orabpel/default/CreacionExpedienteAsyncSRP/5.0'
        }
        ama {
            wsdl = 'https://servicios.amaseguros.com/servicios/externos/ilts/v1.0.0'
            user = 'aplCORWS'
            pass = 'Wh1t3p&&$'
            codigoSt = '1060'
        }
        nn {
            wsdl = 'https://externalwebservices.nnseguros.es/INGNN_SW_CS_IntegracionSiniestros/NN_Servicios.asmx'
            user = 'wsprodusernet'
            pass = 'Prod!Token$scor2014'
            codigoSt = '1017'

            //Api client NNSenior configuration
            suscription_key = '6ea8fd83e05b44d1889a60d0b5424cc4'
            url_base_NNSennior = 'https://cervantes.nnespana.es/external/outer/products/senior/3rdparties/V1'
            //url_base_NNSennior = 'http://localhost:8081/external/outer/products/senior/3rdparties/V1'

            //Api client NNSenior security configuration
            urlToken = 'https://login.microsoftonline.com/fed95e69-8d73-43fe-affb-a7d85ede36fb/oauth2/token'
            grant_type = 'client_credentials'
            //client_id = 'e8b7068c-30ed-4ec0-90d4-cb0a93f52be6'
            //client_secret = '9b38Q~tHR-YU-mrOquvZT.zZ9Gm0uvPqPjj6Ba.R'
            client_id = '263bd2ea-6924-4427-bfaa-661949718702'
            client_secret = 'yDO8Q~xuGklyYYmtcW02bIox.G39F5MTvD-08bWP'

            //productCode
            proCode = 'SENIOR'
            proCompany = 'G'
        }
    }

    /**
     * Entorno para modificar con los dsatos del entorno necesario en vez de modificar cada entorno
     * ejemplo a 07-03-2023 entorno de api de national Nederlanded de produccion pero, demas datos de desarrollo
     */
    test {
        println "Carga configuración entorno 'test'"
        crm {
            url = 'http://172.17.0.36/'
            user = 'gcaballero-es'
            dominio = 'scor.local'
            pass = 'P@ssword'
            unidad = 'ES'
        }
        frontal {
            port = 'http://172.17.0.33:8003/FrontalServiciosCRM/FrontalService'
        }
        orabpel {
            crearExpediente = 'http://172.17.0.33:8888/orabpel/default/CreacionExpedienteAsyncSRP/4.0'
        }
        ama {
            wsdl = 'https://servicios.amaseguros.com/servicios/externos/ilts/v1.0.0'
            user = 'aplCORWS'
            pass = 'Wh1t3p&&$'
            codigoSt = '1061'
        }
        nn {
            wsdl = 'https://externalwebservicesnnt.nne.es/INGNN_SW_CS_IntegracionSiniestros/NN_Servicios.asmx'
            user = 'wstestusernet'
            pass = 'test!token$2014'
            codigoSt = '1031'

            //Api client NNSenior configuration
            suscription_key = '6ea8fd83e05b44d1889a60d0b5424cc4'
            url_base_NNSennior = 'https://cervantes.nnespana.es/external/outer/products/senior/3rdparties/V1'


            //Api client NNSenior security configuration
            urlToken = 'https://login.microsoftonline.com/fed95e69-8d73-43fe-affb-a7d85ede36fb/oauth2/token'
            grant_type = 'client_credentials'
            client_id = 'e8b7068c-30ed-4ec0-90d4-cb0a93f52be6'
            client_secret = '9b38Q~tHR-YU-mrOquvZT.zZ9Gm0uvPqPjj6Ba.R'

            //productCode
            proCode = 'SENIOR'
            proCompany = 'G'
        }
    }
}
