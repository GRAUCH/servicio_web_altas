import java.text.SimpleDateFormat
import serviciowebaltasnn.*
import grails.util.Environment

class BootStrap {

    def init = { servletContext ->

        def env = Environment.current.name

        if (!(env in ['development', 'local'])) {
            println "⛔ BootStrap NO se ejecuta en entorno: ${env}"
            return
        }


        def formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm")

            // =========================
            // PAÍSES
            // =========================
            Pais españa = Pais.findByNombre('ESPAÑA') ?: new Pais('ESPAÑA', 'Europe/Madrid').save(flush: true)
            Pais italia = Pais.findByNombre('ITALIA') ?: new Pais('ITALIA', 'Europe/Madrid').save(flush: true)
            Pais portugal = Pais.findByNombre('PORTUGAL') ?: new Pais('PORTUGAL', 'Europe/Lisbon').save(flush: true)
            Pais francia = Pais.findByNombre('FRANCIA') ?: new Pais('FRANCIA', 'Europe/Madrid').save(flush: true)

            // =========================
            // COMPAÑÍAS
            // =========================
            Companya ama = Companya.findByNameAndPais('A.M.A.',españa) ?: new Companya(españa,'A.M.A.','1059').save(flush: true)
            Companya caser = Companya.findByNameAndPais('Caser',españa) ?: new Companya(españa,'Caser','1061').save(flush: true)
            Companya psn = Companya.findByNameAndPais('PSN',españa) ?: new Companya(españa,'PSN','1030').save(flush: true)

            // =========================
            // CONFIGURACIÓN
            // =========================
            Configuracion config_ES = Configuracion.findByNombreAndPais('Estandar',españa) ?: new Configuracion(españa, 'Estandar').save(flush:true)

            // =========================
            // SLOT
            // =========================
            Slot slot_ES = Slot.findByConfig(config_ES) ?: new Slot(
                    config_ES,
                    formatter.parse("01/06/2020 08:00"),
                    formatter.parse("01/06/2020 21:00"),
                    '2',
                    '15'
            ).save(flush:true)

            // =========================
            // SECUENCIAS
            // =========================
            if (!Secuencias.findByClave("SEQ_CITAS")) {
                new Secuencias(clave: "SEQ_CITAS", secuencia: 1000).save(flush:true)
                new Secuencias(clave: "SEQ_EXPEDIENTES", secuencia: 2000).save(flush:true)
                new Secuencias(clave: "SEQ_SINIESTROS", secuencia: 3000).save(flush:true)
            }

            // =========================
            // CONF
            // =========================
            if (!Conf.findByName("API_USER")) {

                // 🔹 Credenciales aplicación
                new Conf(
                        name: "API_USER",
                        description: "Usuario servicio externo",
                        value: "aplCORWS"
                ).save(flush:true)

                new Conf(
                        name: "API_PASSWORD",
                        description: "Contraseña servicio externo",
                        value: "Wh1t3p&&\$"
                ).save(flush:true)

                new Conf(
                        name: "API_URL_TOKEN",
                        description: "URL para obtener token",
                        value: "https://pre-appapis.amaseguros.com/token"
                ).save(flush:true)

                // 🔹 Credenciales para obtener token (client credentials)
                new Conf(
                        name: "API_TOKEN_USERNAME",
                        description: "Username para petición de token",
                        value: "pSXNhjtQb0MycMO3Tg0ZjwYLZntkDFvEissLeTv7AfinvGCH"
                ).save(flush:true)

                new Conf(
                        name: "API_TOKEN_PASSWORD",
                        description: "Password para petición de token",
                        value: "vN4qipBr6lZV0o5k3j5Q7vnbvrH0Skv0c5Ggc3acPqqz8Z6T33GhXcGl9BaLvKdl"
                ).save(flush:true)

                new Conf(
                        name: "API_WSDL_URL",
                        description: "URL del servicio WSDL ILT",
                        value: "https://pre-appapis.amaseguros.com/soa/opm/ext/consultapolizasenfermedadws/services/consultapolizas"
                ).save(flush:true)
            }

            // =========================
            // CITAS
            // =========================
            if (Cita.count() == 0) {

                new Cita(
                        agente: "Agente1",
                        codigost: "ST001",
                        company: ama,
                        config: config_ES,
                        dateCreated: new Date(),
                        description: "Cita médica",
                        startTime: new Date() + 1,
                        endTime: new Date() + 2,
                        fechaCita: new Date() + 1,
                        location: "Madrid",
                        numeroExpediente: "EXP001",
                        tipotuw: "TIPO1",
                        title: "Consulta"
                ).save(flush:true)

                new Cita(
                        agente: "Agente2",
                        codigost: "ST002",
                        company: caser,
                        config: config_ES,
                        dateCreated: new Date(),
                        description: "Revisión",
                        startTime: new Date() + 2,
                        endTime: new Date() + 3,
                        fechaCita: new Date() + 2,
                        location: "Barcelona",
                        numeroExpediente: "EXP002",
                        tipotuw: "TIPO2",
                        title: "Revisión anual"
                ).save(flush:true)
            }

            // =========================
            // SINIESTROS
            // =========================
            if (Siniestro.count() == 0) {

                new Siniestro(
                        causa: "Accidente laboral",
                        company: "A.M.A.",
                        estado: "ABIERTO",
                        fecha_ocurrencia: new Date() - 5,
                        fecha_terminacion: new Date() + 10,
                        minusvalia: "Leve",
                        num_poliza: "POL001",
                        num_siniestro: "SIN001",
                        producto: "ILT AMA",
                        tipo: "INCAPACIDAD"
                ).save(flush:true)

                new Siniestro(
                        causa: "Enfermedad común",
                        company: "Caser",
                        estado: "CERRADO",
                        fecha_ocurrencia: new Date() - 20,
                        fecha_terminacion: new Date() - 2,
                        minusvalia: "Moderada",
                        num_poliza: "POL002",
                        num_siniestro: "SIN002",
                        producto: "ILT AMA",
                        tipo: "INCAPACIDAD"
                ).save(flush:true)
            }

            // =========================
            // LOGS
            // =========================
            if (CitasAccessLog.count() == 0) {

                new CitasAccessLog(
                        action: "LOGIN",
                        browser: "Chrome",
                        codigost: "ST001",
                        createdDate: new Date(),
                        description: "Acceso al sistema",
                        fullName: "Juan Pérez",
                        ipAddress: "127.0.0.1",
                        operatingSystem: "Windows",
                        pais: "España",
                        title: "Login"
                ).save(flush:true)

                new CitasAccessLog(
                        action: "VIEW",
                        browser: "Firefox",
                        codigost: "ST002",
                        createdDate: new Date(),
                        description: "Consulta de cita",
                        fullName: "María García",
                        ipAddress: "127.0.0.1",
                        operatingSystem: "Linux",
                        pais: "España",
                        title: "Consulta"
                ).save(flush:true)
            }

            println "✅ BootStrap cargado correctamente"
        }

    def destroy = {}
}