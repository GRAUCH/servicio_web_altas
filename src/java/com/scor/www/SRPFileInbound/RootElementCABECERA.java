/**
 * RootElementCABECERA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scor.www.SRPFileInbound;

public class RootElementCABECERA  implements java.io.Serializable {
    private java.lang.String contadorSecuencial;

    private java.lang.String fechaGeneracion;

    private java.lang.String tipoFichero;

    private java.lang.String codigoCia;

    private java.lang.String filler;

    public RootElementCABECERA() {
    }

    public RootElementCABECERA(
           java.lang.String contadorSecuencial,
           java.lang.String fechaGeneracion,
           java.lang.String tipoFichero,
           java.lang.String codigoCia,
           java.lang.String filler) {
           this.contadorSecuencial = contadorSecuencial;
           this.fechaGeneracion = fechaGeneracion;
           this.tipoFichero = tipoFichero;
           this.codigoCia = codigoCia;
           this.filler = filler;
    }


    /**
     * Gets the contadorSecuencial value for this RootElementCABECERA.
     * 
     * @return contadorSecuencial
     */
    public java.lang.String getContadorSecuencial() {
        return contadorSecuencial;
    }


    /**
     * Sets the contadorSecuencial value for this RootElementCABECERA.
     * 
     * @param contadorSecuencial
     */
    public void setContadorSecuencial(java.lang.String contadorSecuencial) {
        this.contadorSecuencial = contadorSecuencial;
    }


    /**
     * Gets the fechaGeneracion value for this RootElementCABECERA.
     * 
     * @return fechaGeneracion
     */
    public java.lang.String getFechaGeneracion() {
        return fechaGeneracion;
    }


    /**
     * Sets the fechaGeneracion value for this RootElementCABECERA.
     * 
     * @param fechaGeneracion
     */
    public void setFechaGeneracion(java.lang.String fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }


    /**
     * Gets the tipoFichero value for this RootElementCABECERA.
     * 
     * @return tipoFichero
     */
    public java.lang.String getTipoFichero() {
        return tipoFichero;
    }


    /**
     * Sets the tipoFichero value for this RootElementCABECERA.
     * 
     * @param tipoFichero
     */
    public void setTipoFichero(java.lang.String tipoFichero) {
        this.tipoFichero = tipoFichero;
    }


    /**
     * Gets the codigoCia value for this RootElementCABECERA.
     * 
     * @return codigoCia
     */
    public java.lang.String getCodigoCia() {
        return codigoCia;
    }


    /**
     * Sets the codigoCia value for this RootElementCABECERA.
     * 
     * @param codigoCia
     */
    public void setCodigoCia(java.lang.String codigoCia) {
        this.codigoCia = codigoCia;
    }


    /**
     * Gets the filler value for this RootElementCABECERA.
     * 
     * @return filler
     */
    public java.lang.String getFiller() {
        return filler;
    }


    /**
     * Sets the filler value for this RootElementCABECERA.
     * 
     * @param filler
     */
    public void setFiller(java.lang.String filler) {
        this.filler = filler;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RootElementCABECERA)) return false;
        RootElementCABECERA other = (RootElementCABECERA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contadorSecuencial==null && other.getContadorSecuencial()==null) || 
             (this.contadorSecuencial!=null &&
              this.contadorSecuencial.equals(other.getContadorSecuencial()))) &&
            ((this.fechaGeneracion==null && other.getFechaGeneracion()==null) || 
             (this.fechaGeneracion!=null &&
              this.fechaGeneracion.equals(other.getFechaGeneracion()))) &&
            ((this.tipoFichero==null && other.getTipoFichero()==null) || 
             (this.tipoFichero!=null &&
              this.tipoFichero.equals(other.getTipoFichero()))) &&
            ((this.codigoCia==null && other.getCodigoCia()==null) || 
             (this.codigoCia!=null &&
              this.codigoCia.equals(other.getCodigoCia()))) &&
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
        if (getContadorSecuencial() != null) {
            _hashCode += getContadorSecuencial().hashCode();
        }
        if (getFechaGeneracion() != null) {
            _hashCode += getFechaGeneracion().hashCode();
        }
        if (getTipoFichero() != null) {
            _hashCode += getTipoFichero().hashCode();
        }
        if (getCodigoCia() != null) {
            _hashCode += getCodigoCia().hashCode();
        }
        if (getFiller() != null) {
            _hashCode += getFiller().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RootElementCABECERA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", ">>Root-Element>CABECERA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contadorSecuencial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "contadorSecuencial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaGeneracion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "fechaGeneracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoFichero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "tipoFichero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.scor.com/SRPFileInbound", "codigoCia"));
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
