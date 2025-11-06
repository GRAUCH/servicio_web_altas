/**
 * CreacionExpedienteAsyncSRPCallbackServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scor.www.CreacionExpedienteAsyncSRP;

public class CreacionExpedienteAsyncSRPCallbackServiceLocator extends org.apache.axis.client.Service implements com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRPCallbackService {

    public CreacionExpedienteAsyncSRPCallbackServiceLocator() {
    }


    public CreacionExpedienteAsyncSRPCallbackServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreacionExpedienteAsyncSRPCallbackServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreacionExpedienteAsyncSRPCallbackPort
    private java.lang.String CreacionExpedienteAsyncSRPCallbackPort_address = "http://set.by.caller";

    public java.lang.String getCreacionExpedienteAsyncSRPCallbackPortAddress() {
        return CreacionExpedienteAsyncSRPCallbackPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreacionExpedienteAsyncSRPCallbackPortWSDDServiceName = "CreacionExpedienteAsyncSRPCallbackPort";

    public java.lang.String getCreacionExpedienteAsyncSRPCallbackPortWSDDServiceName() {
        return CreacionExpedienteAsyncSRPCallbackPortWSDDServiceName;
    }

    public void setCreacionExpedienteAsyncSRPCallbackPortWSDDServiceName(java.lang.String name) {
        CreacionExpedienteAsyncSRPCallbackPortWSDDServiceName = name;
    }

    public com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRPCallback getCreacionExpedienteAsyncSRPCallbackPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreacionExpedienteAsyncSRPCallbackPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreacionExpedienteAsyncSRPCallbackPort(endpoint);
    }

    public com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRPCallback getCreacionExpedienteAsyncSRPCallbackPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRPCallbackBindingStub _stub = new com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRPCallbackBindingStub(portAddress, this);
            _stub.setPortName(getCreacionExpedienteAsyncSRPCallbackPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreacionExpedienteAsyncSRPCallbackPortEndpointAddress(java.lang.String address) {
        CreacionExpedienteAsyncSRPCallbackPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRPCallback.class.isAssignableFrom(serviceEndpointInterface)) {
                com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRPCallbackBindingStub _stub = new com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRPCallbackBindingStub(new java.net.URL(CreacionExpedienteAsyncSRPCallbackPort_address), this);
                _stub.setPortName(getCreacionExpedienteAsyncSRPCallbackPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CreacionExpedienteAsyncSRPCallbackPort".equals(inputPortName)) {
            return getCreacionExpedienteAsyncSRPCallbackPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.scor.com/CreacionExpedienteAsyncSRP", "CreacionExpedienteAsyncSRPCallbackService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.scor.com/CreacionExpedienteAsyncSRP", "CreacionExpedienteAsyncSRPCallbackPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreacionExpedienteAsyncSRPCallbackPort".equals(portName)) {
            setCreacionExpedienteAsyncSRPCallbackPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
