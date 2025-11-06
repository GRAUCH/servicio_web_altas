/**
 * CreacionExpedienteAsyncSRP_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scor.www.CreacionExpedienteAsyncSRP;

public class CreacionExpedienteAsyncSRP_ServiceLocator extends org.apache.axis.client.Service implements com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRP_Service {

    public CreacionExpedienteAsyncSRP_ServiceLocator() {
    }


    public CreacionExpedienteAsyncSRP_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreacionExpedienteAsyncSRP_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreacionExpedienteAsyncSRPPort
    private java.lang.String CreacionExpedienteAsyncSRPPort_address = "http://SCOR0-BPM01:8888/orabpel/default/CreacionExpedienteAsyncSRP/5.0";

    public java.lang.String getCreacionExpedienteAsyncSRPPortAddress() {
        return CreacionExpedienteAsyncSRPPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreacionExpedienteAsyncSRPPortWSDDServiceName = "CreacionExpedienteAsyncSRPPort";

    public java.lang.String getCreacionExpedienteAsyncSRPPortWSDDServiceName() {
        return CreacionExpedienteAsyncSRPPortWSDDServiceName;
    }

    public void setCreacionExpedienteAsyncSRPPortWSDDServiceName(java.lang.String name) {
        CreacionExpedienteAsyncSRPPortWSDDServiceName = name;
    }

    public com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRP_PortType getCreacionExpedienteAsyncSRPPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreacionExpedienteAsyncSRPPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreacionExpedienteAsyncSRPPort(endpoint);
    }

    public com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRP_PortType getCreacionExpedienteAsyncSRPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRPBindingStub _stub = new com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRPBindingStub(portAddress, this);
            _stub.setPortName(getCreacionExpedienteAsyncSRPPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreacionExpedienteAsyncSRPPortEndpointAddress(java.lang.String address) {
        CreacionExpedienteAsyncSRPPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRP_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRPBindingStub _stub = new com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRPBindingStub(new java.net.URL(CreacionExpedienteAsyncSRPPort_address), this);
                _stub.setPortName(getCreacionExpedienteAsyncSRPPortWSDDServiceName());
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
        if ("CreacionExpedienteAsyncSRPPort".equals(inputPortName)) {
            return getCreacionExpedienteAsyncSRPPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.scor.com/CreacionExpedienteAsyncSRP", "CreacionExpedienteAsyncSRP");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.scor.com/CreacionExpedienteAsyncSRP", "CreacionExpedienteAsyncSRPPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreacionExpedienteAsyncSRPPort".equals(portName)) {
            setCreacionExpedienteAsyncSRPPortEndpointAddress(address);
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
