package serviciowebaltasnn

class Siniestro implements Serializable{

	private static final long serialVersionUID = -5265079553173330201L

	String numSiniestro
	String numPoliza
	String company
	String producto
	String tipo	
	String causa
	Date fechaOcurrencia
	Date fechaTerminacion
	String estado
	String minusvalia
	
	static constraints = {
    }

	String getNumSiniestro() {
		return numSiniestro
	}

	void setNumSiniestro(String numSiniestro) {
		this.numSiniestro = numSiniestro
	}

	String getNumPoliza() {
		return numPoliza
	}

	void setNumPoliza(String numPoliza) {
		this.numPoliza = numPoliza
	}

	String getCompany() {
		return company
	}

	void setCompany(String company) {
		this.company = company
	}

	String getProducto() {
		return producto
	}

	void setProducto(String producto) {
		this.producto = producto
	}

	String getTipo() {
		return tipo
	}

	void setTipo(String tipo) {
		this.tipo = tipo
	}

	String getCausa() {
		return causa
	}

	void setCausa(String causa) {
		this.causa = causa
	}

	Date getFechaOcurrencia() {
		return fechaOcurrencia
	}

	void setFechaOcurrencia(Date fechaOcurrencia) {
		this.fechaOcurrencia = fechaOcurrencia
	}

	Date getFechaTerminacion() {
		return fechaTerminacion
	}

	void setFechaTerminacion(Date fechaTerminacion) {
		this.fechaTerminacion = fechaTerminacion
	}

	String getEstado() {
		return estado
	}

	void setEstado(String estado) {
		this.estado = estado
	}

	String getMinusvalia() {
		return minusvalia
	}

	void setMinusvalia(String minusvalia) {
		this.minusvalia = minusvalia
	}

	boolean equals(o) {
		if (this.is(o)) return true
		if (getClass() != o.class) return false

		Siniestro siniestro = (Siniestro) o

		if (causa != siniestro.causa) return false
		if (company != siniestro.company) return false
		if (estado != siniestro.estado) return false
		if (fechaOcurrencia != siniestro.fechaOcurrencia) return false
		if (fechaTerminacion != siniestro.fechaTerminacion) return false
		if (id != siniestro.id) return false
		if (minusvalia != siniestro.minusvalia) return false
		if (numPoliza != siniestro.numPoliza) return false
		if (numSiniestro != siniestro.numSiniestro) return false
		if (producto != siniestro.producto) return false
		if (tipo != siniestro.tipo) return false
		if (version != siniestro.version) return false

		return true
	}

	int hashCode() {
		int result
		result = (numSiniestro != null ? numSiniestro.hashCode() : 0)
		result = 31 * result + (numPoliza != null ? numPoliza.hashCode() : 0)
		result = 31 * result + (company != null ? company.hashCode() : 0)
		result = 31 * result + (producto != null ? producto.hashCode() : 0)
		result = 31 * result + (tipo != null ? tipo.hashCode() : 0)
		result = 31 * result + (causa != null ? causa.hashCode() : 0)
		result = 31 * result + (fechaOcurrencia != null ? fechaOcurrencia.hashCode() : 0)
		result = 31 * result + (fechaTerminacion != null ? fechaTerminacion.hashCode() : 0)
		result = 31 * result + (estado != null ? estado.hashCode() : 0)
		result = 31 * result + (minusvalia != null ? minusvalia.hashCode() : 0)
		result = 31 * result + (id != null ? id.hashCode() : 0)
		result = 31 * result + (version != null ? version.hashCode() : 0)
		return result
	}


	@Override
	public String toString() {
		return "Siniestro{" +
				"id=" + id +
				", version=" + version +
				", numSiniestro='" + numSiniestro + '\'' +
				", numPoliza='" + numPoliza + '\'' +
				", company='" + company + '\'' +
				", producto='" + producto + '\'' +
				", tipo='" + tipo + '\'' +
				", causa='" + causa + '\'' +
				", fechaOcurrencia=" + fechaOcurrencia +
				", fechaTerminacion=" + fechaTerminacion +
				", estado='" + estado + '\'' +
				", minusvalia='" + minusvalia + '\'' +
				'}';
	}
}

