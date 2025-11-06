package serviciowebaltas

class Poliza {


    def listaPolizas


    static constraints = {
        listaPolizas nullable: false
    }


    String codigoCompania

    boolean codigoCompaniaSpecified = false

    BigDecimal codigoPais

    boolean codigoPaisSpecified = false

    int codigoRamo


    boolean codigoRamoSpecified = false



    String descripcionRiesgo

    boolean descripcionRiesgoSpecified = false


    String fechaEfecto


    boolean fechaEfectoSpecified = false


    String descripcionProducto

    boolean descripcionProductoSpecified = false


    String descripcionTomador


    boolean descripcionTomadorSpecified = false



    long numeroSuplemento


    long numeroPoliza



    boolean numeroPolizaSpecified = false



    long numeroCertificado


    boolean numeroCertificadoSpecified = false



    String fechaVencimiento


    boolean fechaVencimientoSpecified = false


    boolean numeroSuplementoSpecified = false


}
