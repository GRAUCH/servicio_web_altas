package serviciowebaltasnn

class Conf {

    String name
    String description
    String value

    static constraints = {
        name blank: false, unique: true
        description nullable: true
        value nullable: true
    }

    static mapping = {
        table 'conf'
    }
}