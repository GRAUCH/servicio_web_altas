/**
 * DATOSPregunta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scor.www.SRPFileInbound;

public class DATOSPregunta  implements java.io.Serializable {
    private java.lang.String tipoDatos;

    private java.lang.String codigoPregunta;

    private java.lang.String respuesta;

    private java.lang.String filler;

    public DATOSPregunta() {
    }

    public DATOSPregunta(
           java.lang.String tipoDatos,
           java.lang.String codigoPregunta,
           java.lang.String respuesta,
           java.lang.String filler) {
           this.tipoDatos = tipoDatos;
           this.codigoPregunta = codigoPregunta;
           this.respuesta = respuesta;
           this.filler = filler;
    }


    /**
     * Gets the tipoDatos value for this DATOSPregunta.
     * 
     * @return tipoDatos
     */
    public java.lang.String getTipoDatos() {
        return tipoDatos;
    }


    /**
     * Sets the tipoDatos value for this DATOSPregunta.
     * 
     * @param tipoDatos
     */
    public void setTipoDatos(java.lang.String tipoDatos) {
        this.tipoDatos = tipoDatos;
    }


    /**
     * Gets the codigoPregunta value for this DATOSPregunta.
     * 
     * @return codigoPregunta
     */
    public java.lang.String getCodigoPregunta() {
        return codigoPregunta;
    }


    /**
     * Sets the codigoPregunta value for this DATOSPregunta.
     * 
     * @param codigoPregunta
     */
    public void setCodigoPregunta(java.lang.String codigoPregunta) {
        this.codigoPregunta = codigoPregunta;
    }


    /**
     * Gets the respuesta value for this DATOSPregunta.
     * 
     * @return respuesta
     */
    public java.lang.String getRespuesta() {
        return respuesta;
    }


    /**
     * Sets the respuesta value for this DATOSPregunta.
     * 
     * @param respuesta
     */
    public void setRespuesta(java.lang.String respuesta) {
        this.respuesta = respuesta;
    }


    /**
     * Gets the filler value for this DATOSPregunta.
     * 
     * @return filler
     */
    public java.lang.String getFiller() {
        return filler;
    }


    /**
     * Sets the filler value for this DATOSPregunta.
     * 
     * @param filler
     */
    public void setFiller(java.lang.String filler) {
        this.filler = filler;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DATOSPregunta)) return false;
        DATOSPregunta other = (DATOSPregunta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoDatos==null && other.getTipoDatos()==null) || 
             (this.tipoDatos!=null &&
              this.tipoDatos.equals(other.getTipoDatos()))) &&
            ((this.codigoPregunta==null && other.getCodigoPregunta()==null) || 
             (this.codigoPregunta!=null &&
              this.codigoPregunta.equals(other.getCodigoPregunta()))) &&
            ((this.respuesta==null && other.getRespuesta()==null) || 
             (this.respuesta!=null &&
              this.respuesta.equals(other.getRespuesta()))) &&
            ((this.filler==null && other.getFiller()==null) || 
             (this.filler!=null &&
              this.filler.equals(other.getFiller())));
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
        if (getTipoDatos() != null) {
            _hashCode += getTipoDatos().hashCode();
        }
        if (getCodigoPregunta() != null) {
            _hashCode += getCodigoPregunta().hashCode();
        }
        if (getRespuesta() != null) {
            _hashCode += getRespuesta().hashCode();
        }
        if (getFiller() != null) {
            _hashCode += getFiller().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DATOSPregunta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", ">DATOS>pregunta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDatos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "tipoDatos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPregunta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "codigoPregunta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "respuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filler");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "filler"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
