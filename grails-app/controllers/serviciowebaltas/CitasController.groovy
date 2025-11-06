package serviciowebaltas

import org.springframework.security.web.context.HttpSessionSecurityContextRepository
import serviciowebaltasnn.*

class CitasController {

    CitaService citaService
    CitasAccessLogService citasAccessLogService


    def indexGeneral = {

    }
    def index() {
        Pais pais
        ArrayList<Pais> paises = Pais.findAll()
        if(params.pais_id) {
            pais = Pais.findById(params.pais_id)
        } else {
            pais = paises.get(0)
        }
        ArrayList<Companya> companyas = Companya.findAllByPais(pais)
        ArrayList<Configuracion> configuraciones = Configuracion.findAllByPaisAndHastaIsNull(pais)
        ArrayList<Slot> slots = new ArrayList<>()
        for (Configuracion conf : configuraciones) {
            slots.addAll(Slot.findAllByConfig(conf))
        }
        model: [configuraciones: configuraciones, companyas: companyas, slots: slots, paises: paises, pais: pais]
    }

    def list = {
        def eventList = []
        eventList = citaService.getList(params)
        render(view: "index", contentType: "application/json") {
            eventList
        }
    }

    def show = {
        if (params.id) {
            Cita cita = Cita.findById(params.id)
            Configuracion config = cita.config
            ArrayList<Slot> slots = Slot.findAllByConfig(config)
            return render(view: "show", model: [citaInstance: cita, slots: slots])
        } else {
            flash.message = 'cita invalida'
            return redirect(action: "index")
        }
    }

    def refresh = {
        Pais pais = Pais.findById(params.pais_id)
        ArrayList<Companya> companyas = Companya.findAllByPais(pais)
        ArrayList<Configuracion> configuraciones = Configuracion.findAllByPais(pais)
        ArrayList<Slot> slots = new ArrayList<Slot>()
        for (Configuracion conf : configuraciones) {
            slots.addAll(Slot.findAllByConfig(conf))
        }
        render(view: 'index', model: [configuraciones: configuraciones, companyas: companyas, slots: slots, paises: Pais.getAll(),pais: pais])
    }

    def edit = {
        if (params.id)
            return render(view: "edit", model: [citaInstance: Cita.findById(params.id)])
        else {
            flash.message = 'cita invalida'
            return redirect(action: "index")
        }
    }

    def delete = {
        if (params.id) {
            Cita cita = Cita.findById(params.id)
            def pais_id = cita?.config?.pais?.id
            def name = citaService.deleteCita(params)
            flash.message = 'Cita '+name+' borrada'
            def userDetails = request.getSession().getAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY)
            citasAccessLogService.saveFromRequest(request,cita,Action.DELETE,userDetails)
            return redirect(action: "index", params:[pais_id: pais_id])
        } else {
            flash.message = 'Cita Invalida'
            return redirect(action: "index")
        }
    }


    def update = {
        if (params.id) {
            def resultadoCita = citaService.updateCita(params)
            if (resultadoCita.hasErrors()) {
                flash.message = 'Error al guardar la cita!'
                return redirect(action: "index")
            } else {
                def pais_id = resultadoCita?.config?.pais?.id
                def userDetails = request.getSession().getAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY)
                citasAccessLogService.saveFromRequest(request,resultadoCita,Action.UPDATE,userDetails)
                flash.message = 'Cita Actualizada!'
                return redirect(action: "index", params:[pais_id: pais_id])
            }
        } else {
            flash.message = 'cita invalida'
            return redirect(action: "index")
        }
    }

    def nueva = {
        def configuracion = Configuracion.findById(params.config)
        def slot = Slot.findByConfig(configuracion)
        Date[] fechas = citaService.dateFormatter(params.startTime, params.endTime, configuracion)
        if(Cita.findAllByConfigAndStartTimeLessThanEqualsAndEndTimeGreaterThanEquals(configuracion,fechas[0],fechas[0]).size() > Integer.parseInt(slot.plazasPorTurno) && !session.sobrecarga) {
            session.sobrecarga = true
            return render(status: 400, text: 'ATENCIÓN: Existe una sobrecarga de citas en esta franja horaria.\n' +
                    'Podrá crearla de todos modos, volviendo a pulsar el botón "Crear"')
        }
        def resultadoCita = citaService.saveCita(params)
        session.sobrecarga = false
        if (resultadoCita.hasErrors()) {
            flash.message = 'Error al guardar la cita!'
            return redirect(action: "index")
        } else {
            def userDetails = request.getSession().getAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY)
            citasAccessLogService.saveFromRequest(request,resultadoCita,Action.SAVE,userDetails)
            def eventList = []
            render(view: "index", contentType: "application/json") {
                eventList = citaService.parseo(resultadoCita)
            }
        }
    }
}
