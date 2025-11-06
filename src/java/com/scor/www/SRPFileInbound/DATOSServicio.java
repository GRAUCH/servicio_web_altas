/**
 * DATOSServicio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scor.www.SRPFileInbound;

public class DATOSServicio  implements java.io.Serializable {
    private java.lang.String tipoServicios;

    private java.lang.String codigoServicio;

    private java.lang.String descripcionServicio;

    private java.lang.String filler;

    public DATOSServicio() {
    }

    public DATOSServicio(
           java.lang.String tipoServicios,
           java.lang.String codigoServicio,
           java.lang.String descripcionServicio,
           java.lang.String filler) {
           this.tipoServicios = tipoServicios;
           this.codigoServicio = codigoServicio;
           this.descripcionServicio = descripcionServicio;
           this.filler = filler;
    }


    /**
     * Gets the tipoServicios value for this DATOSServicio.
     * 
     * @return tipoServicios
     */
    public java.lang.String getTipoServicios() {
        return tipoServicios;
    }


    /**
     * Sets the tipoServicios value for this DATOSServicio.
     * 
     * @param tipoServicios
     */
    public void setTipoServicios(java.lang.String tipoServicios) {
        this.tipoServicios = tipoServicios;
    }


    /**
     * Gets the codigoServicio value for this DATOSServicio.
     * 
     * @return codigoServicio
     */
    public java.lang.String getCodigoServicio() {
        return codigoServicio;
    }


    /**
     * Sets the codigoServicio value for this DATOSServicio.
     * 
     * @param codigoServicio
     */
    public void setCodigoServicio(java.lang.String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }


    /**
     * Gets the descripcionServicio value for this DATOSServicio.
     * 
     * @return descripcionServicio
     */
    public java.lang.String getDescripcionServicio() {
        return descripcionServicio;
    }


    /**
     * Sets the descripcionServicio value for this DATOSServicio.
     * 
     * @param descripcionServicio
     */
    public void setDescripcionServicio(java.lang.String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }


    /**
     * Gets the filler value for this DATOSServicio.
     * 
     * @return filler
     */
    public java.lang.String getFiller() {
        return filler;
    }


    /**
     * Sets the filler value for this DATOSServicio.
     * 
     * @param filler
     */
    public void setFiller(java.lang.String filler) {
        this.filler = filler;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DATOSServicio)) return false;
        DATOSServicio other = (DATOSServicio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoServicios==null && other.getTipoServicios()==null) || 
             (this.tipoServicios!=null &&
              this.tipoServicios.equals(other.getTipoServicios()))) &&
            ((this.codigoServicio==null && other.getCodigoServicio()==null) || 
             (this.codigoServicio!=null &&
              this.codigoServicio.equals(other.getCodigoServicio()))) &&
            ((this.descripcionServicio==null && other.getDescripcionServicio()==null) || 
             (this.descripcionServicio!=null &&
              this.descripcionServicio.equals(other.getDescripcionServicio()))) &&
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
        if (getTipoServicios() != null) {
            _hashCode += getTipoServicios().hashCode();
        }
        if (getCodigoServicio() != null) {
            _hashCode += getCodigoServicio().hashCode();
        }
        if (getDescripcionServicio() != null) {
            _hashCode += getDescripcionServicio().hashCode();
        }
        if (getFiller() != null) {
            _hashCode += getFiller().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DATOSServicio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", ">DATOS>servicio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoServicios");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "tipoServicios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "codigoServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "descripcionServicio"));
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
