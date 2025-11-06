package serviciowebaltann

class PolizaMapper {
	private static final long serialVersionUID = -5265079553173330495L

	String numPoliza
	String dni
	String codSituacion
	String situacion
	String company
	String producto
	String codProducto
	String polizaId
	Date fechaEfecto
	String formaPago
	Date fechaVencimientoCobro
	int diasFranquicia
	int duracionRenta
	String asegurado
	String tomador1
	String tomador2
	String osteoporosis
	String osteopenia


    static constraints = {
    }

	@Override
	public String toString() {
		return "PolizaMapper{" +
				"numPoliza='" + numPoliza + '\'' +
				", dni='" + dni + '\'' +
				", codSituacion='" + codSituacion + '\'' +
				", situacion='" + situacion + '\'' +
				", company='" + company + '\'' +
				", producto=" + producto +
				", codProducto=" + codProducto +
				", polizaId=" + polizaId +
				", fechaEfecto=" + fechaEfecto +
				", formaPago=" + formaPago +
				", fechaVencimientoCobro=" + fechaVencimientoCobro +
				", diasFranquicia=" + diasFranquicia +
				", duracionRenta=" + duracionRenta +
				", asegurado=" + asegurado +
				", tomador1=" + tomador1 +
				", tomador2=" + tomador2 +
				", osteoporosis=" + osteoporosis +
				", osteopenia=" + osteopenia +
				'}';
	}
}
