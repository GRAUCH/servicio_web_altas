/**
 * RootElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scor.www.SRPFileInbound;

public class RootElement  implements java.io.Serializable {
    private com.scor.www.SRPFileInbound.RootElementCABECERA CABECERA;

    private com.scor.www.SRPFileInbound.DATOS[] DATOS;

    private com.scor.www.SRPFileInbound.RootElementPIE PIE;

    public RootElement() {
    }

    public RootElement(
           com.scor.www.SRPFileInbound.RootElementCABECERA CABECERA,
           com.scor.www.SRPFileInbound.DATOS[] DATOS,
           com.scor.www.SRPFileInbound.RootElementPIE PIE) {
           this.CABECERA = CABECERA;
           this.DATOS = DATOS;
           this.PIE = PIE;
    }


    /**
     * Gets the CABECERA value for this RootElement.
     * 
     * @return CABECERA
     */
    public com.scor.www.SRPFileInbound.RootElementCABECERA getCABECERA() {
        return CABECERA;
    }


    /**
     * Sets the CABECERA value for this RootElement.
     * 
     * @param CABECERA
     */
    public void setCABECERA(com.scor.www.SRPFileInbound.RootElementCABECERA CABECERA) {
        this.CABECERA = CABECERA;
    }


    /**
     * Gets the DATOS value for this RootElement.
     * 
     * @return DATOS
     */
    public com.scor.www.SRPFileInbound.DATOS[] getDATOS() {
        return DATOS;
    }


    /**
     * Sets the DATOS value for this RootElement.
     * 
     * @param DATOS
     */
    public void setDATOS(com.scor.www.SRPFileInbound.DATOS[] DATOS) {
        this.DATOS = DATOS;
    }

    public com.scor.www.SRPFileInbound.DATOS getDATOS(int i) {
        return this.DATOS[i];
    }

    public void setDATOS(int i, com.scor.www.SRPFileInbound.DATOS _value) {
        this.DATOS[i] = _value;
    }


    /**
     * Gets the PIE value for this RootElement.
     * 
     * @return PIE
     */
    public com.scor.www.SRPFileInbound.RootElementPIE getPIE() {
        return PIE;
    }


    /**
     * Sets the PIE value for this RootElement.
     * 
     * @param PIE
     */
    public void setPIE(com.scor.www.SRPFileInbound.RootElementPIE PIE) {
        this.PIE = PIE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RootElement)) return false;
        RootElement other = (RootElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CABECERA==null && other.getCABECERA()==null) || 
             (this.CABECERA!=null &&
              this.CABECERA.equals(other.getCABECERA()))) &&
            ((this.DATOS==null && other.getDATOS()==null) || 
             (this.DATOS!=null &&
              java.util.Arrays.equals(this.DATOS, other.getDATOS()))) &&
            ((this.PIE==null && other.getPIE()==null) || 
             (this.PIE!=null &&
              this.PIE.equals(other.getPIE())));
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
        if (getCABECERA() != null) {
            _hashCode += getCABECERA().hashCode();
        }
        if (getDATOS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDATOS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDATOS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPIE() != null) {
            _hashCode += getPIE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RootElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", ">Root-Element"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CABECERA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "CABECERA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", ">>Root-Element>CABECERA"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATOS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "DATOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "DATOS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PIE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "PIE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", ">>Root-Element>PIE"));
        elemField.setMinOccurs(0);
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
