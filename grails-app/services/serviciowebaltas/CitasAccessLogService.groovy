package serviciowebaltas

import org.springframework.transaction.annotation.Transactional
import serviciowebaltasnn.Action
import serviciowebaltasnn.Cita
import serviciowebaltasnn.CitasAccessLog
import ua_parser.Client
import ua_parser.Parser

import javax.servlet.http.HttpServletRequest

@Transactional
class CitasAccessLogService {


    CitasAccessLog saveFromRequest(HttpServletRequest request, Cita cita, Action action, userDetails) {
        String userAgent = request.getHeader('User-Agent')
        String ipAddress = request.getHeader('X-FORWARDED-FOR') ?: request.remoteAddr

        save(ipAddress, userAgent, cita, action, userDetails)
    }

    CitasAccessLog save(String ipAddress, String userAgent, Cita cita, Action action, userDetails) {
        Map userAgentInfo = parseUserAgent(userAgent)
        CitasAccessLog accessLog = new CitasAccessLog([ipAddress: ipAddress, createdDate: new Date(), action: action, title: cita.title, description: cita.description, codigoST: cita.codigoST, fullName: userDetails.authentication.principal.fullname, pais: cita.getCompany().getPais().getNombre()] + userAgentInfo)
        accessLog.save(flush: true)
        accessLog
    }

    private Map parseUserAgent(String userAgent) {

        Parser userAgentParser = new Parser()

        Client client = userAgentParser.parse(userAgent)

        [browser: "${client.userAgent.family} ${client.userAgent.major}.${client.userAgent.minor}", operatingSystem: "${client.os.family} ${client.os.major}.${client.os.minor}"]
    }

}
