package serviciowebaltann

import com.scortelemed.servicios.Expediente
import com.scortelemed.servicios.Pago
import com.scortelemed.servicios.Siniestro


public class RespuestaCrmDynamics {


    private List<Siniestro> listaSiniestros;
    private List<Pago> listaPagos;
    private List<Expediente> listaExpedientes;
    
	public List<Siniestro> getListaSiniestros() {
		return listaSiniestros;
	}

	public void setListaSiniestros(List<Siniestro> listaSiniestros) {
		this.listaSiniestros = listaSiniestros;
	}

	public List<Pago> getListaPagos() {
		return listaPagos;
	}

	public void setListaPagos(List<Pago> listaPagos) {
		this.listaPagos = listaPagos;
	}

	public List<Expediente> getListaExpedientes() {
		return listaExpedientes;
	}

	public void setListaExpedientes(List<Expediente> listaExpedientes) {
		this.listaExpedientes = listaExpedientes;
	}    
}


