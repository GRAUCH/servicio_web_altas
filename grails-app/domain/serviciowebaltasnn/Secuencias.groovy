package serviciowebaltasnn

import java.util.Date;

class Secuencias {
	
	String clave
	int secuencia

	static constraints = {
		clave(nullable:false)
		secuencia(nullable:false)
	}

}
