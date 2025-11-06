package serviciowebaltasnn

class Configuracion {

    Pais pais
    String nombre
    Date desde
    Date hasta

    static belongsTo = [Pais]

    Configuracion(Pais pais, String nombre) {
        this.pais = pais
        this.nombre = nombre
        this.desde = new Date()
    }

    static constraints = {
        pais nullable: false
        nombre nullable: true
        desde nullable: true
        hasta nullable: true
    }
}
