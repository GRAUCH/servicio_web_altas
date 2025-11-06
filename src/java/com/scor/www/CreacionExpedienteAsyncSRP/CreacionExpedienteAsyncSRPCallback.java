/**
 * CreacionExpedienteAsyncSRPCallback.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.scor.www.CreacionExpedienteAsyncSRP;

public interface CreacionExpedienteAsyncSRPCallback extends java.rmi.Remote {
    public void onResult(com.scor.www.CreacionExpedienteAsyncSRP.CreacionExpedienteAsyncSRPProcessResponse payload) throws java.rmi.RemoteException;
    public void onException(java.lang.String errorCode, java.lang.String errorDesc, java.lang.String systemId, java.lang.String systemErrorCode, java.lang.String details) throws java.rmi.RemoteException;
    public void onSystemException(java.lang.String code, java.lang.String summary, java.lang.String detail) throws java.rmi.RemoteException;
}
