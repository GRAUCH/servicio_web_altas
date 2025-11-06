package serviciowebaltas

import grails.transaction.Transactional
import org.codehaus.groovy.grails.web.mapping.LinkGenerator
import org.springframework.web.context.request.RequestContextHolder
import serviciowebaltasnn.*

import java.text.ParseException
import java.text.SimpleDateFormat

@Transactional
class CitaService {
    LinkGenerator grailsLinkGenerator


    def updateCita(params) {
        Cita cita = Cita.findById(params.id)
        cita.title = params.title
        cita.numeroExpediente = params.numeroExpediente
        cita.description = params.description
        Date[] fechas = dateFormatter(params.startTime, params.endTime, cita.config)
        cita.startTime = fechas[0]
        cita.endTime = fechas[1]
        if (cita.validate()) {
            cita.save(flush: true)
        }
        return cita
    }

    def deleteCita(params) {
        String name
        Cita cita = Cita.findById(params.id)
        name = cita.title
        cita.delete()
        return name
    }

    def saveCita(params) {
        Cita cita = new Cita()
        cita.config = Configuracion.findById(params.config)
        cita.title = params.title
        cita.numeroExpediente = params.numeroExpediente
        cita.company = Companya.findById(params.company)
        cita.description = params.description

        Date[] fechas = dateFormatter(params.startTime, params.endTime, cita.config)
        cita.startTime = fechas[0]
        cita.endTime = fechas[1]

        if (cita.validate()) {
            cita = cita.save(flush: true)
        }
        return cita
    }

    def dateFormatter(startTime, endTime, Configuracion config) {
        def formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm")
        formatter.setTimeZone(TimeZone.getTimeZone(config.getPais().getTimezone()))
        Date[] fechas = new Date[2]
        fechas[0] = formatter.parse(startTime)
        if (endTime) {
            fechas[1] = formatter.parse(endTime)
        } else {
            fechas[1] = getEndTime(fechas[0], config)
        }
        return fechas
    }

    private getEndTime(Date entrada, Configuracion config) {
        Slot slot = Slot.findByConfig(config)
        Calendar calendar = Calendar.getInstance()
        calendar.setTime(entrada)
        calendar.add(Calendar.MINUTE, Integer.parseInt(slot.tiempoPorTurno))
        return calendar.getTime()

    }

    def parseo(Cita cita) {
        def eventList = []
        eventList << [
                id         : cita.id,
                config     : cita.config,
                company    : cita.company,
                title      : cita.title,
                description: cita.description,
                url        : "${grailsLinkGenerator.link(controller: "citas", action: "show", id: cita.id, absolute: true)}",
                allDay     : false,
                start      : cita.startTime,
                end        : cita.endTime,

        ]
        return eventList
    }

    Date tryParse(String dateString) {
        List<String> formatStrings = Arrays.asList("yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd'T'HH:mm:ssXXX", "EEE MMM dd yyyy", "EEE MMM d yyyy")
        SimpleDateFormat simpleDateFormat
        Date parsed = null
        for (String formatString : formatStrings) {
            try {
                simpleDateFormat = new SimpleDateFormat(formatString, Locale.ENGLISH)
                parsed = simpleDateFormat.parse(dateString)
                break
            } catch (ParseException e) {
                log.debug("Error parseo : ${e.getMessage()}")
            }
        }

        return parsed
    }

    def getList(params) {
        def session = RequestContextHolder.currentRequestAttributes().getSession()
        Date begining, end, start

        if (params.start && params.end) {
            begining = tryParse(params.start)
            end = tryParse(params.end)
            if(params.button && params.type) {
                if("prev".equals((String)params.button)) {
                    begining = getPrevNextDate(begining, params.type, false, false)
                    end = getPrevNextDate(end, params.type, false, true)
                } else if ("next".equals((String)params.button)) {
                    begining = getPrevNextDate(begining, params.type, true, false)
                    end = getPrevNextDate(end, params.type,  true, true)
                }
            }
        }

        ArrayList<Configuracion> configuraciones = new ArrayList<>()
        ArrayList<Cita> citas = new ArrayList<>()
        if (params.pais) {
            Pais pais = Pais.findById(params.pais)
            configuraciones.addAll(Configuracion.findAllByPais(pais))
            for (Configuracion configuracion : configuraciones) {
                citas.addAll(Cita.findAllByStartTimeBetweenAndConfig(begining, end, configuracion))
            }
        } else {
            citas.addAll(Cita.findAllByStartTimeBetween(begining, end))
        }

        def eventList = []
        citas?.collect {
            Cita cita ->
                eventList << [
                        id         : cita.id,
                        config     : cita.config,
                        company    : cita.company,
                        title      : cita.title,
                        description: cita.description,
                        url        : "${grailsLinkGenerator.link(controller: "citas", action: "show", id: cita.id, absolute: true)}",
                        allDay     : false,
                        start      : cita.startTime,
                        end        : cita.endTime,
                        color      : Integer.parseInt(cita.company?.codigoST) == 0 ? '#10689a' : '#2EB2FF'
//                        occurrenceStart: now.toInstant().millis,
//                        occurrenceEnd  : now.plusHours(1).toInstant().millis
                ]
        }
        return eventList
    }

    private static Calendar getCalendarForNow() {
        Calendar calendar = GregorianCalendar.getInstance()
        calendar.setTime(new Date())
        return calendar
    }

    private Date getPrevNextDate(Date entrada, String type, boolean next, boolean last) {
        Calendar calendar = Calendar.getInstance()
        calendar.setTime(entrada)
        if(type.equals("timeGridDay")) {
            if(next) {
                calendar.add(Calendar.DAY_OF_YEAR, 1)
            } else {
                calendar.add(Calendar.DAY_OF_YEAR, -1)
            }
        }
        if(type.equals("timeGridWeek")) {
            if(next) {
                calendar.add(Calendar.DAY_OF_YEAR, 7)
            } else {
                calendar.add(Calendar.DAY_OF_YEAR, -7)
            }
        }
        if(type.equals("dayGridMonth")) {
            if(entrada.date > 20) {
                calendar.add(Calendar.MONTH, 1)
            }
            calendar.set(Calendar.DAY_OF_MONTH, 1)
            if(next) {
                calendar.add(Calendar.MONTH, 1)
            } else {
                calendar.add(Calendar.MONTH, -1)
            }
            if (last) {
                calendar.add(Calendar.DAY_OF_YEAR, 15)
            } else {
                calendar.add(Calendar.DAY_OF_YEAR, -4)
            }

        }
        if(type.equals("listMonth")) {
            if(entrada.date > 20) {
                calendar.add(Calendar.MONTH, 1)
            }
            calendar.set(Calendar.DAY_OF_MONTH, 1)
            if(next) {
                calendar.add(Calendar.MONTH, 1)
            } else {
                calendar.add(Calendar.MONTH, -1)
            }
        }
        Date date = calendar.getTime()
        return date
    }

}
