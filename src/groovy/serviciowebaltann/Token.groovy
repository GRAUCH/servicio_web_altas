package serviciowebaltann

import com.scortelemed.servicios.OrdenTrabajo

class Token implements Serializable {

	private  String token_type
	private String expires_in;
	private String ext_expires_in;
	private String expires_on;
	private String not_before;
	private String resource;
	private String access_token;


	String getToken_type() {
		return token_type
	}

	void setToken_type(String token_type) {
		this.token_type = token_type
	}

	String getExpires_in() {
		return expires_in
	}

	void setExpires_in(String expires_in) {
		this.expires_in = expires_in
	}

	String getExt_expires_in() {
		return ext_expires_in
	}

	void setExt_expires_in(String ext_expires_in) {
		this.ext_expires_in = ext_expires_in
	}

	String getExpires_on() {
		return expires_on
	}

	void setExpires_on(String expires_on) {
		this.expires_on = expires_on
	}

	String getNot_before() {
		return not_before
	}

	void setNot_before(String not_before) {
		this.not_before = not_before
	}

	String getResource() {
		return resource
	}

	void setResource(String resource) {
		this.resource = resource
	}

	String getAccess_token() {
		return access_token
	}

	void setAccess_token(String access_token) {
		this.access_token = access_token
	}

	static getConstraints() {
		return constraints
	}

	static void setConstraints(constraints) {
		Token.constraints = constraints
	}

	boolean equals(o) {
		if (this.is(o)) return true
		if (getClass() != o.class) return false

		Token token = (Token) o

		if (access_token != token.access_token) return false
		if (expires_in != token.expires_in) return false
		if (expires_on != token.expires_on) return false
		if (ext_expires_in != token.ext_expires_in) return false
		if (not_before != token.not_before) return false
		if (resource != token.resource) return false
		if (token_type != token.token_type) return false

		return true
	}

	int hashCode() {
		int result
		result = (token_type != null ? token_type.hashCode() : 0)
		result = 31 * result + (expires_in != null ? expires_in.hashCode() : 0)
		result = 31 * result + (ext_expires_in != null ? ext_expires_in.hashCode() : 0)
		result = 31 * result + (expires_on != null ? expires_on.hashCode() : 0)
		result = 31 * result + (not_before != null ? not_before.hashCode() : 0)
		result = 31 * result + (resource != null ? resource.hashCode() : 0)
		result = 31 * result + (access_token != null ? access_token.hashCode() : 0)
		return result
	}


	@Override
	public String toString() {
		return "Token{" +
				"token_type='" + token_type + '\'' +
				", expires_in='" + expires_in + '\'' +
				", ext_expires_in='" + ext_expires_in + '\'' +
				", expires_on='" + expires_on + '\'' +
				", not_before='" + not_before + '\'' +
				", resource='" + resource + '\'' +
				", access_token='" + access_token + '\'' +
				'}';
	}
}