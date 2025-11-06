package serviciowebaltann

class ClienteMapper implements  Serializable {

	private static final long serialVersionUID = -5265079553173330626L

	String rowId
	String nombre
	String apellido1
	String apellido2
	String dni
	String codCliente
	String sexo
	String telFijo
	String telMovil
	String codProfesion
	String profesion
	Date fechaNacimiento
	String asegurado
	String tomador1
	String tomador2
	String tipoVia
	String direccion
	String poblacion
	String provincia
	String codPostal
	String pais

    static constraints = {
    }

	String getRowId() {
		return rowId
	}

	void setRowId(String rowId) {
		this.rowId = rowId
	}

	String getNombre() {
		return nombre
	}

	void setNombre(String nombre) {
		this.nombre = nombre
	}

	String getApellido1() {
		return apellido1
	}

	void setApellido1(String apellido1) {
		this.apellido1 = apellido1
	}

	String getApellido2() {
		return apellido2
	}

	void setApellido2(String apellido2) {
		this.apellido2 = apellido2
	}

	String getDni() {
		return dni
	}

	void setDni(String dni) {
		this.dni = dni
	}

	String getCodCliente() {
		return codCliente
	}

	void setCodCliente(String codCliente) {
		this.codCliente = codCliente
	}

	String getSexo() {
		return sexo
	}

	void setSexo(String sexo) {
		this.sexo = sexo
	}

	String getTelFijo() {
		return telFijo
	}

	void setTelFijo(String telFijo) {
		this.telFijo = telFijo
	}

	String getTelMovil() {
		return telMovil
	}

	void setTelMovil(String telMovil) {
		this.telMovil = telMovil
	}

	String getCodProfesion() {
		return codProfesion
	}

	void setCodProfesion(String codProfesion) {
		this.codProfesion = codProfesion
	}

	String getProfesion() {
		return profesion
	}

	void setProfesion(String profesion) {
		this.profesion = profesion
	}

	Date getFechaNacimiento() {
		return fechaNacimiento
	}

	void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento
	}

	String getAsegurado() {
		return asegurado
	}

	void setAsegurado(String asegurado) {
		this.asegurado = asegurado
	}

	String getTomador1() {
		return tomador1
	}

	void setTomador1(String tomador1) {
		this.tomador1 = tomador1
	}

	String getTomador2() {
		return tomador2
	}

	void setTomador2(String tomador2) {
		this.tomador2 = tomador2
	}

	String getTipoVia() {
		return tipoVia
	}

	void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia
	}

	String getDireccion() {
		return direccion
	}

	void setDireccion(String direccion) {
		this.direccion = direccion
	}

	String getPoblacion() {
		return poblacion
	}

	void setPoblacion(String poblacion) {
		this.poblacion = poblacion
	}

	String getProvincia() {
		return provincia
	}

	void setProvincia(String provincia) {
		this.provincia = provincia
	}

	String getCodPostal() {
		return codPostal
	}

	void setCodPostal(String codPostal) {
		this.codPostal = codPostal
	}

	String getPais() {
		return pais
	}

	void setPais(String pais) {
		this.pais = pais
	}

	boolean equals(o) {
		if (this.is(o)) return true
		if (getClass() != o.class) return false

		ClienteMapper that = (ClienteMapper) o

		if (apellido1 != that.apellido1) return false
		if (apellido2 != that.apellido2) return false
		if (asegurado != that.asegurado) return false
		if (codCliente != that.codCliente) return false
		if (codPostal != that.codPostal) return false
		if (codProfesion != that.codProfesion) return false
		if (direccion != that.direccion) return false
		if (dni != that.dni) return false
		if (fechaNacimiento != that.fechaNacimiento) return false
		if (nombre != that.nombre) return false
		if (pais != that.pais) return false
		if (poblacion != that.poblacion) return false
		if (profesion != that.profesion) return false
		if (provincia != that.provincia) return false
		if (rowId != that.rowId) return false
		if (sexo != that.sexo) return false
		if (telFijo != that.telFijo) return false
		if (telMovil != that.telMovil) return false
		if (tipoVia != that.tipoVia) return false
		if (tomador1 != that.tomador1) return false
		if (tomador2 != that.tomador2) return false

		return true
	}

	int hashCode() {
		int result
		result = (rowId != null ? rowId.hashCode() : 0)
		result = 31 * result + (nombre != null ? nombre.hashCode() : 0)
		result = 31 * result + (apellido1 != null ? apellido1.hashCode() : 0)
		result = 31 * result + (apellido2 != null ? apellido2.hashCode() : 0)
		result = 31 * result + (dni != null ? dni.hashCode() : 0)
		result = 31 * result + (codCliente != null ? codCliente.hashCode() : 0)
		result = 31 * result + (sexo != null ? sexo.hashCode() : 0)
		result = 31 * result + (telFijo != null ? telFijo.hashCode() : 0)
		result = 31 * result + (telMovil != null ? telMovil.hashCode() : 0)
		result = 31 * result + (codProfesion != null ? codProfesion.hashCode() : 0)
		result = 31 * result + (profesion != null ? profesion.hashCode() : 0)
		result = 31 * result + (fechaNacimiento != null ? fechaNacimiento.hashCode() : 0)
		result = 31 * result + (asegurado != null ? asegurado.hashCode() : 0)
		result = 31 * result + (tomador1 != null ? tomador1.hashCode() : 0)
		result = 31 * result + (tomador2 != null ? tomador2.hashCode() : 0)
		result = 31 * result + (tipoVia != null ? tipoVia.hashCode() : 0)
		result = 31 * result + (direccion != null ? direccion.hashCode() : 0)
		result = 31 * result + (poblacion != null ? poblacion.hashCode() : 0)
		result = 31 * result + (provincia != null ? provincia.hashCode() : 0)
		result = 31 * result + (codPostal != null ? codPostal.hashCode() : 0)
		result = 31 * result + (pais != null ? pais.hashCode() : 0)
		return result
	}


	@Override
	public String toString() {
		return "ClienteMapper{" +
				"rowId='" + rowId + '\'' +
				", nombre='" + nombre + '\'' +
				", apellido1='" + apellido1 + '\'' +
				", apellido2='" + apellido2 + '\'' +
				", dni='" + dni + '\'' +
				", codCliente='" + codCliente + '\'' +
				", sexo='" + sexo + '\'' +
				", telFijo='" + telFijo + '\'' +
				", telMovil='" + telMovil + '\'' +
				", codProfesion='" + codProfesion + '\'' +
				", profesion='" + profesion + '\'' +
				", fechaNacimiento=" + fechaNacimiento +
				", asegurado='" + asegurado + '\'' +
				", tomador1='" + tomador1 + '\'' +
				", tomador2='" + tomador2 + '\'' +
				", tipoVia='" + tipoVia + '\'' +
				", direccion='" + direccion + '\'' +
				", poblacion='" + poblacion + '\'' +
				", provincia='" + provincia + '\'' +
				", codPostal='" + codPostal + '\'' +
				", pais='" + pais + '\'' +
				'}';
	}
}
