/**
 * DATOSCoberturas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scor.www.SRPFileInbound;

public class DATOSCoberturas  implements java.io.Serializable {
    private java.lang.String codigoCobertura;

    private java.lang.String nombreCobertura;

    private float capital;

    private java.lang.String filler;

    public DATOSCoberturas() {
    }

    public DATOSCoberturas(
           java.lang.String codigoCobertura,
           java.lang.String nombreCobertura,
           float capital,
           java.lang.String filler) {
           this.codigoCobertura = codigoCobertura;
           this.nombreCobertura = nombreCobertura;
           this.capital = capital;
           this.filler = filler;
    }


    /**
     * Gets the codigoCobertura value for this DATOSCoberturas.
     * 
     * @return codigoCobertura
     */
    public java.lang.String getCodigoCobertura() {
        return codigoCobertura;
    }


    /**
     * Sets the codigoCobertura value for this DATOSCoberturas.
     * 
     * @param codigoCobertura
     */
    public void setCodigoCobertura(java.lang.String codigoCobertura) {
        this.codigoCobertura = codigoCobertura;
    }


    /**
     * Gets the nombreCobertura value for this DATOSCoberturas.
     * 
     * @return nombreCobertura
     */
    public java.lang.String getNombreCobertura() {
        return nombreCobertura;
    }


    /**
     * Sets the nombreCobertura value for this DATOSCoberturas.
     * 
     * @param nombreCobertura
     */
    public void setNombreCobertura(java.lang.String nombreCobertura) {
        this.nombreCobertura = nombreCobertura;
    }


    /**
     * Gets the capital value for this DATOSCoberturas.
     * 
     * @return capital
     */
    public float getCapital() {
        return capital;
    }


    /**
     * Sets the capital value for this DATOSCoberturas.
     * 
     * @param capital
     */
    public void setCapital(float capital) {
        this.capital = capital;
    }


    /**
     * Gets the filler value for this DATOSCoberturas.
     * 
     * @return filler
     */
    public java.lang.String getFiller() {
        return filler;
    }


    /**
     * Sets the filler value for this DATOSCoberturas.
     * 
     * @param filler
     */
    public void setFiller(java.lang.String filler) {
        this.filler = filler;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DATOSCoberturas)) return false;
        DATOSCoberturas other = (DATOSCoberturas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoCobertura==null && other.getCodigoCobertura()==null) || 
             (this.codigoCobertura!=null &&
              this.codigoCobertura.equals(other.getCodigoCobertura()))) &&
            ((this.nombreCobertura==null && other.getNombreCobertura()==null) || 
             (this.nombreCobertura!=null &&
              this.nombreCobertura.equals(other.getNombreCobertura()))) &&
            this.capital == other.getCapital() &&
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
        if (getCodigoCobertura() != null) {
            _hashCode += getCodigoCobertura().hashCode();
        }
        if (getNombreCobertura() != null) {
            _hashCode += getNombreCobertura().hashCode();
        }
        _hashCode += new Float(getCapital()).hashCode();
        if (getFiller() != null) {
            _hashCode += getFiller().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DATOSCoberturas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", ">DATOS>coberturas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCobertura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "codigoCobertura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreCobertura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "nombreCobertura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
