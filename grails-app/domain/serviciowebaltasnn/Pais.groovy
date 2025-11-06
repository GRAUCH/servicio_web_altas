package serviciowebaltasnn

class Pais {

    String nombre
    String timezone

    Pais (String nombre, String timezone) {
        this.nombre = nombre
        this.timezone = timezone
    }

    static constraints = {
        nombre nullable: false, unique: true
        timezone nullable: false
    }
}
