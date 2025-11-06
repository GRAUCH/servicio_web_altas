package serviciowebaltasnn

class CitasAccessLog {

    //Accion
    Action action
    //Datos del usuario
    String ipAddress
    String browser
    String operatingSystem
    //Datos de la cita
    String title
    String description
    String codigoST
    String fullName
    Date createdDate = new Date()
    String pais



    static constraints = {
        action nullable: true
        ipAddress nullable: true
        browser nullable: true
        operatingSystem nullable: true
        title nullable: true
        description nullable: true
        codigoST nullable: true
        createdDate nullable: true
        fullName nullable: true
        pais nullable: true
    }
}

enum Action {
    UPLOAD, DOWNLOAD, UPDATE, DELETE, FORBIDDEN,SAVE
}
