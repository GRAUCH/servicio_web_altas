package serviciowebaltasnn

class Companya {

	Pais pais
    String name
	String codigoST

	static belongsTo = [Pais]

	Companya (Pais pais, String name, String codigoST) {
		this.pais = pais
		this.name = name
		this.codigoST = codigoST
	}

	static constraints = {
		pais nullable: false
		name(blank:false, unique:true)
    	codigoST(blank:false, unique:true)
	}

}
