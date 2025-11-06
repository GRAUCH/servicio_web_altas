package serviciowebaltasnn

class Cita {

    Companya company
    Configuracion config
    Date dateCreated = new Date()
    String title
    String location
    String description
    String numeroExpediente
    Date startTime
    Date endTime
    Date fechaCita
    String codigoST
    String tipoTUW
    String agente

    static belongsTo = [Configuracion, Companya]

    static constraints = {
        company nullable: false
        config nullable: false
        numeroExpediente nullable: true
        fechaCita nullable: true
        codigoST nullable: true
        tipoTUW  nullable: true
        agente nullable: true
        description nullable: true
        startTime nullable: true
        endTime nullable: true
        location nullable: true
        title nullable: true
    }



}
