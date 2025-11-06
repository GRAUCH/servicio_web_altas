/**
 * DATOS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scor.www.SRPFileInbound;

public class DATOS  implements java.io.Serializable {
    private com.scor.www.SRPFileInbound.REGISTRO_DATOS registro;

    private com.scor.www.SRPFileInbound.DATOSPregunta[] pregunta;

    private com.scor.www.SRPFileInbound.DATOSServicio[] servicio;

    private com.scor.www.SRPFileInbound.DATOSCoberturas[] coberturas;

    public DATOS() {
    }

    public DATOS(
           com.scor.www.SRPFileInbound.REGISTRO_DATOS registro,
           com.scor.www.SRPFileInbound.DATOSPregunta[] pregunta,
           com.scor.www.SRPFileInbound.DATOSServicio[] servicio,
           com.scor.www.SRPFileInbound.DATOSCoberturas[] coberturas) {
           this.registro = registro;
           this.pregunta = pregunta;
           this.servicio = servicio;
           this.coberturas = coberturas;
    }


    /**
     * Gets the registro value for this DATOS.
     * 
     * @return registro
     */
    public com.scor.www.SRPFileInbound.REGISTRO_DATOS getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this DATOS.
     * 
     * @param registro
     */
    public void setRegistro(com.scor.www.SRPFileInbound.REGISTRO_DATOS registro) {
        this.registro = registro;
    }


    /**
     * Gets the pregunta value for this DATOS.
     * 
     * @return pregunta
     */
    public com.scor.www.SRPFileInbound.DATOSPregunta[] getPregunta() {
        return pregunta;
    }


    /**
     * Sets the pregunta value for this DATOS.
     * 
     * @param pregunta
     */
    public void setPregunta(com.scor.www.SRPFileInbound.DATOSPregunta[] pregunta) {
        this.pregunta = pregunta;
    }

    public com.scor.www.SRPFileInbound.DATOSPregunta getPregunta(int i) {
        return this.pregunta[i];
    }

    public void setPregunta(int i, com.scor.www.SRPFileInbound.DATOSPregunta _value) {
        this.pregunta[i] = _value;
    }


    /**
     * Gets the servicio value for this DATOS.
     * 
     * @return servicio
     */
    public com.scor.www.SRPFileInbound.DATOSServicio[] getServicio() {
        return servicio;
    }


    /**
     * Sets the servicio value for this DATOS.
     * 
     * @param servicio
     */
    public void setServicio(com.scor.www.SRPFileInbound.DATOSServicio[] servicio) {
        this.servicio = servicio;
    }

    public com.scor.www.SRPFileInbound.DATOSServicio getServicio(int i) {
        return this.servicio[i];
    }

    public void setServicio(int i, com.scor.www.SRPFileInbound.DATOSServicio _value) {
        this.servicio[i] = _value;
    }


    /**
     * Gets the coberturas value for this DATOS.
     * 
     * @return coberturas
     */
    public com.scor.www.SRPFileInbound.DATOSCoberturas[] getCoberturas() {
        return coberturas;
    }


    /**
     * Sets the coberturas value for this DATOS.
     * 
     * @param coberturas
     */
    public void setCoberturas(com.scor.www.SRPFileInbound.DATOSCoberturas[] coberturas) {
        this.coberturas = coberturas;
    }

    public com.scor.www.SRPFileInbound.DATOSCoberturas getCoberturas(int i) {
        return this.coberturas[i];
    }

    public void setCoberturas(int i, com.scor.www.SRPFileInbound.DATOSCoberturas _value) {
        this.coberturas[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DATOS)) return false;
        DATOS other = (DATOS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registro==null && other.getRegistro()==null) || 
             (this.registro!=null &&
              this.registro.equals(other.getRegistro()))) &&
            ((this.pregunta==null && other.getPregunta()==null) || 
             (this.pregunta!=null &&
              java.util.Arrays.equals(this.pregunta, other.getPregunta()))) &&
            ((this.servicio==null && other.getServicio()==null) || 
             (this.servicio!=null &&
              java.util.Arrays.equals(this.servicio, other.getServicio()))) &&
            ((this.coberturas==null && other.getCoberturas()==null) || 
             (this.coberturas!=null &&
              java.util.Arrays.equals(this.coberturas, other.getCoberturas())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRegistro() != null) {
            _hashCode += getRegistro().hashCode();
        }
        if (getPregunta() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPregunta());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPregunta(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServicio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicio(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCoberturas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCoberturas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCoberturas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DATOS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "DATOS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "registro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "REGISTRO_DATOS"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pregunta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "pregunta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", ">DATOS>pregunta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "servicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", ">DATOS>servicio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coberturas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "coberturas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", ">DATOS>coberturas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
