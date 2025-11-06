package serviciowebaltann

class GarantiaPolizaMapper implements Serializable {

	private static final long serialVersionUID = -5265079553173330189L


	String numPoliza
	String codGarantia
	String garantia
	String capital
	Date fechaVencimientoGarantia
	Date fechaVencimientoPrima
	
	static constraints = {
	}

	String getNumPoliza() {
		return numPoliza
	}

	void setNumPoliza(String numPoliza) {
		this.numPoliza = numPoliza
	}

	String getCodGarantia() {
		return codGarantia
	}

	void setCodGarantia(String codGarantia) {
		this.codGarantia = codGarantia
	}

	String getGarantia() {
		return garantia
	}

	void setGarantia(String garantia) {
		this.garantia = garantia
	}

	String getCapital() {
		return capital
	}

	void setCapital(String capital) {
		this.capital = capital
	}

	Date getFechaVencimientoGarantia() {
		return fechaVencimientoGarantia
	}

	void setFechaVencimientoGarantia(Date fechaVencimientoGarantia) {
		this.fechaVencimientoGarantia = fechaVencimientoGarantia
	}

	Date getFechaVencimientoPrima() {
		return fechaVencimientoPrima
	}

	void setFechaVencimientoPrima(Date fechaVencimientoPrima) {
		this.fechaVencimientoPrima = fechaVencimientoPrima
	}

	boolean equals(o) {
		if (this.is(o)) return true
		if (getClass() != o.class) return false

		GarantiaPolizaMapper that = (GarantiaPolizaMapper) o

		if (capital != that.capital) return false
		if (codGarantia != that.codGarantia) return false
		if (fechaVencimientoGarantia != that.fechaVencimientoGarantia) return false
		if (fechaVencimientoPrima != that.fechaVencimientoPrima) return false
		if (garantia != that.garantia) return false
		if (numPoliza != that.numPoliza) return false

		return true
	}

	int hashCode() {
		int result
		result = (numPoliza != null ? numPoliza.hashCode() : 0)
		result = 31 * result + (codGarantia != null ? codGarantia.hashCode() : 0)
		result = 31 * result + (garantia != null ? garantia.hashCode() : 0)
		result = 31 * result + (capital != null ? capital.hashCode() : 0)
		result = 31 * result + (fechaVencimientoGarantia != null ? fechaVencimientoGarantia.hashCode() : 0)
		result = 31 * result + (fechaVencimientoPrima != null ? fechaVencimientoPrima.hashCode() : 0)
		return result
	}


	@Override
	public String toString() {
		return "GarantiaPolizaMapper{" +
				"numPoliza='" + numPoliza + '\'' +
				", codGarantia='" + codGarantia + '\'' +
				", garantia='" + garantia + '\'' +
				", capital='" + capital + '\'' +
				", fechaVencimientoGarantia=" + fechaVencimientoGarantia +
				", fechaVencimientoPrima=" + fechaVencimientoPrima +
				'}';
	}
}
