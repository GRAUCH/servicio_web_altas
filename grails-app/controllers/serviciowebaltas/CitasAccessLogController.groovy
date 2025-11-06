package serviciowebaltas

import org.springframework.security.access.annotation.Secured
import serviciowebaltasnn.CitasAccessLog


@Secured(['ROLE_ADMIN'])
class CitasAccessLogController {


    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        [citasAccessLogList: CitasAccessLog.list(params), citasAccessLogTotal: CitasAccessLog.count()]
    }

    def show(Long id) {
        respond CitasAccessLog.get(id)
    }


}
