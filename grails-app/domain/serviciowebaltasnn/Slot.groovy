package serviciowebaltasnn

class Slot {

    Configuracion config
    Date horaInicio
    Date horaFin
    String plazasPorTurno
    String tiempoPorTurno

    static belongsTo = [Configuracion]

    Slot(Configuracion config, Date horaInicio, Date horaFin, String plazasPorTurno, String tiempoPorTurno) {
        this.config = config
        this.horaInicio = horaInicio
        this.horaFin = horaFin
        this.plazasPorTurno = plazasPorTurno
        this.tiempoPorTurno = tiempoPorTurno
    }

    static constraints = {
        config nullable: false
        horaInicio nullable: true
        horaFin nullable: true
        plazasPorTurno nullable: true
        tiempoPorTurno nullable: true
    }

}
