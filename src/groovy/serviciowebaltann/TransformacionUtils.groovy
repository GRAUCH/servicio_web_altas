package serviciowebaltann

import serviciowebaltasnn.Secuencias

class TransformacionUtils {

	String transformarTipoMensajesErrorAma (String msgIn) {

		String msgOut = null
		
		if (msgIn.contains("Read timed out")){
			msgOut = "El servicio de Ama no esta devolviendo datos. Contactar con IT"
		} else if (msgIn.contains("Unmarshalling Error")){
			msgOut = "Error en mapeo de datos. Contactar con IT"
		} else if (msgIn.contains("For input string:")){
			msgOut = "Error en los datos de entrada. Los valores deben ser numericos."
		} else if (msgIn.contains("response code: 503")) {
			msgOut = "Error de conexion con AMA. No estamos recibiendo datos. "
		} else {
			msgOut = "Error en los datos de entrada. Contactar con IT"
		}
		
		return msgOut
	}
	
	
	String dameSecuencial(String clave) {
		
		 def secuenciaRecuperada = Secuencias.findByClave(clave)
		 
		 String secuenciaGenerada = null
		 
		 if (secuenciaRecuperada != null) {
			 
			 Secuencias secuencia = Secuencias.get(secuenciaRecuperada.id)
			 
			 int secuencial = secuencia.getSecuencia()
			 
			 secuencia.secuencia = secuencial+1
			 
			 secuencia.save(flush: true)
			 
			 secuenciaGenerada = secuencia.secuencia
			 
		 } else {
		 
			 Secuencias secuencia = new Secuencias()
			 secuencia.setClave(clave)
			 secuencia.setSecuencia(1)
			 secuencia.save(flush: true)
			 
			 secuenciaGenerada = secuencia.secuencia
			 
		 }
		
		return secuenciaGenerada
		
	}
	
}
