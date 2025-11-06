package serviciowebaltann

class BeneficiarioPolizaMapper implements Serializable {

	private static final long serialVersionUID = -5265079553173330120L

	String numPoliza
	String codigo
	String descripcion
	String orden
	
	static constraints = {
	}

	String getNumPoliza() {
		return numPoliza
	}

	void setNumPoliza(String numPoliza) {
		this.numPoliza = numPoliza
	}

	String getCodigo() {
		return codigo
	}

	void setCodigo(String codigo) {
		this.codigo = codigo
	}

	String getDescripcion() {
		return descripcion
	}

	void setDescripcion(String descripcion) {
		this.descripcion = descripcion
	}

	String getOrden() {
		return orden
	}

	void setOrden(String orden) {
		this.orden = orden
	}

	boolean equals(o) {
		if (this.is(o)) return true
		if (getClass() != o.class) return false

		BeneficiarioPolizaMapper that = (BeneficiarioPolizaMapper) o

		if (codigo != that.codigo) return false
		if (descripcion != that.descripcion) return false
		if (numPoliza != that.numPoliza) return false
		if (orden != that.orden) return false

		return true
	}

	int hashCode() {
		int result
		result = (numPoliza != null ? numPoliza.hashCode() : 0)
		result = 31 * result + (codigo != null ? codigo.hashCode() : 0)
		result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0)
		result = 31 * result + (orden != null ? orden.hashCode() : 0)
		return result
	}

	@Override
	public String toString() {
		return "BeneficiarioPolizaMapper{" +
				"numPoliza='" + numPoliza + '\'' +
				", codigo='" + codigo + '\'' +
				", descripcion='" + descripcion + '\'' +
				", orden='" + orden + '\'' +
				'}';
	}
}
