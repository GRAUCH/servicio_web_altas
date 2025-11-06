/**
 * RootElementPIE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scor.www.SRPFileInbound;

public class RootElementPIE  implements java.io.Serializable {
    private int numRegistros;

    private int numFilasFichero;

    private java.lang.String filler;

    public RootElementPIE() {
    }

    public RootElementPIE(
           int numRegistros,
           int numFilasFichero,
           java.lang.String filler) {
           this.numRegistros = numRegistros;
           this.numFilasFichero = numFilasFichero;
           this.filler = filler;
    }


    /**
     * Gets the numRegistros value for this RootElementPIE.
     * 
     * @return numRegistros
     */
    public int getNumRegistros() {
        return numRegistros;
    }


    /**
     * Sets the numRegistros value for this RootElementPIE.
     * 
     * @param numRegistros
     */
    public void setNumRegistros(int numRegistros) {
        this.numRegistros = numRegistros;
    }


    /**
     * Gets the numFilasFichero value for this RootElementPIE.
     * 
     * @return numFilasFichero
     */
    public int getNumFilasFichero() {
        return numFilasFichero;
    }


    /**
     * Sets the numFilasFichero value for this RootElementPIE.
     * 
     * @param numFilasFichero
     */
    public void setNumFilasFichero(int numFilasFichero) {
        this.numFilasFichero = numFilasFichero;
    }


    /**
     * Gets the filler value for this RootElementPIE.
     * 
     * @return filler
     */
    public java.lang.String getFiller() {
        return filler;
    }


    /**
     * Sets the filler value for this RootElementPIE.
     * 
     * @param filler
     */
    public void setFiller(java.lang.String filler) {
        this.filler = filler;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RootElementPIE)) return false;
        RootElementPIE other = (RootElementPIE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.numRegistros == other.getNumRegistros() &&
            this.numFilasFichero == other.getNumFilasFichero() &&
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
        _hashCode += getNumRegistros();
        _hashCode += getNumFilasFichero();
        if (getFiller() != null) {
            _hashCode += getFiller().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RootElementPIE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", ">>Root-Element>PIE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRegistros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "numRegistros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numFilasFichero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "numFilasFichero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
