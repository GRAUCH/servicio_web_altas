
/**
 * ConsultaPolizasEnfermedadesStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.amaseguros.saludenfermedad.webservices;

/*
*  ConsultaPolizasEnfermedadesStub java implementation
*/

public class ConsultaPolizasEnfermedadesStub extends org.apache.axis2.client.Stub {
	protected org.apache.axis2.description.AxisOperation[] _operations;

	// hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}
		counter = counter + 1;
		return Long.toString(System.currentTimeMillis()) + "_" + counter;
	}

	private void populateAxisService() throws org.apache.axis2.AxisFault {

		// creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService("ConsultaPolizasEnfermedades" + getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[3];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://webservices.saludenfermedad.amaseguros.com/",
				"getDetallePoliza"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(
				new javax.xml.namespace.QName("http://webservices.saludenfermedad.amaseguros.com/", "getPolizas"));
		_service.addOperation(__operation);

		_operations[1] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://webservices.saludenfermedad.amaseguros.com/",
				"getPolizasNoVigentes"));
		_service.addOperation(__operation);

		_operations[2] = __operation;

	}

	// populates the faults
	private void populateFaults() {

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public ConsultaPolizasEnfermedadesStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public ConsultaPolizasEnfermedadesStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			String targetEndpoint, boolean useSeparateListener) throws org.apache.axis2.AxisFault {
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

		_serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

	}

	/**
	 * Default Constructor
	 */
	public ConsultaPolizasEnfermedadesStub(org.apache.axis2.context.ConfigurationContext configurationContext)
			throws org.apache.axis2.AxisFault {

		this(configurationContext,
				"https://ESPRELSESB01:8243/AmaPublish/ama/consultaPolizasEnfermedades.consultaPolizasEnfermedadesHttpsSoap11Endpoint");

	}

	/**
	 * Default Constructor
	 */
	public ConsultaPolizasEnfermedadesStub() throws org.apache.axis2.AxisFault {

		this("https://ESPRELSESB01:8243/AmaPublish/ama/consultaPolizasEnfermedades.consultaPolizasEnfermedadesHttpsSoap11Endpoint");

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public ConsultaPolizasEnfermedadesStub(String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.amaseguros.saludenfermedad.webservices.ConsultaPolizasEnfermedades#getDetallePoliza
	 * @param getDetallePoliza0
	 * 
	 */

	public GetDetallePolizaResponseE getDetallePoliza(

			GetDetallePolizaE getDetallePoliza0)

			throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[0].getName());
			_operationClient.getOptions().setAction("urn:GetDetallePoliza");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getDetallePoliza0,
					optimizeContent(new javax.xml.namespace.QName("http://webservices.saludenfermedad.amaseguros.com/",
							"getDetallePoliza")),
					new javax.xml.namespace.QName("http://webservices.saludenfermedad.amaseguros.com/",
							"getDetallePoliza"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);
			System.out.println(_messageContext.getEnvelope().toString());
			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					GetDetallePolizaResponseE.class,
					getEnvelopeNamespaces(_returnEnv));

			return (GetDetallePolizaResponseE) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getDetallePoliza"))) {
					// make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getDetallePoliza"));
						Class exceptionClass = Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());
						// message class
						String messageClassName = (String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getDetallePoliza"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[] { messageClass });
						m.invoke(ex, new Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.amaseguros.saludenfermedad.webservices.ConsultaPolizasEnfermedades#startgetDetallePoliza
	 * @param getDetallePoliza0
	 * 
	 */
	public void startgetDetallePoliza(

			GetDetallePolizaE getDetallePoliza0,

			final ConsultaPolizasEnfermedadesCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[0].getName());
		_operationClient.getOptions().setAction("urn:GetDetallePoliza");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getDetallePoliza0,
				optimizeContent(new javax.xml.namespace.QName("http://webservices.saludenfermedad.amaseguros.com/",
						"getDetallePoliza")),
				new javax.xml.namespace.QName("http://webservices.saludenfermedad.amaseguros.com/",
						"getDetallePoliza"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(),
							GetDetallePolizaResponseE.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetDetallePoliza(
							(GetDetallePolizaResponseE) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetDetallePoliza(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getDetallePoliza"))) {
							// make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"getDetallePoliza"));
								Class exceptionClass = Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());
								// message class
								String messageClassName = (String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"getDetallePoliza"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[] { messageClass });
								m.invoke(ex, new Object[] { messageObject });

								callback.receiveErrorgetDetallePoliza(
										new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDetallePoliza(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDetallePoliza(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDetallePoliza(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDetallePoliza(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDetallePoliza(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDetallePoliza(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDetallePoliza(f);
							}
						} else {
							callback.receiveErrorgetDetallePoliza(f);
						}
					} else {
						callback.receiveErrorgetDetallePoliza(f);
					}
				} else {
					callback.receiveErrorgetDetallePoliza(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetDetallePoliza(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[0].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.amaseguros.saludenfermedad.webservices.ConsultaPolizasEnfermedades#getPolizas
	 * @param getPolizas2
	 * 
	 */

	public GetPolizasResponseE getPolizas(

			GetPolizasE getPolizas2)

			throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction("urn:GetPolizas");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getPolizas2,
					optimizeContent(new javax.xml.namespace.QName("http://webservices.saludenfermedad.amaseguros.com/",
							"getPolizas")),
					new javax.xml.namespace.QName("http://webservices.saludenfermedad.amaseguros.com/", "getPolizas"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					GetPolizasResponseE.class,
					getEnvelopeNamespaces(_returnEnv));

			return (GetPolizasResponseE) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap
						.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPolizas"))) {
					// make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPolizas"));
						Class exceptionClass = Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());
						// message class
						String messageClassName = (String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPolizas"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[] { messageClass });
						m.invoke(ex, new Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.amaseguros.saludenfermedad.webservices.ConsultaPolizasEnfermedades#startgetPolizas
	 * @param getPolizas2
	 * 
	 */
	public void startgetPolizas(

			GetPolizasE getPolizas2,

			final ConsultaPolizasEnfermedadesCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[1].getName());
		_operationClient.getOptions().setAction("urn:GetPolizas");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getPolizas2,
				optimizeContent(new javax.xml.namespace.QName("http://webservices.saludenfermedad.amaseguros.com/",
						"getPolizas")),
				new javax.xml.namespace.QName("http://webservices.saludenfermedad.amaseguros.com/", "getPolizas"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(),
							GetPolizasResponseE.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetPolizas(
							(GetPolizasResponseE) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetPolizas(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPolizas"))) {
							// make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPolizas"));
								Class exceptionClass = Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());
								// message class
								String messageClassName = (String) faultMessageMap.get(
										new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPolizas"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[] { messageClass });
								m.invoke(ex, new Object[] { messageObject });

								callback.receiveErrorgetPolizas(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPolizas(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPolizas(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPolizas(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPolizas(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPolizas(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPolizas(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPolizas(f);
							}
						} else {
							callback.receiveErrorgetPolizas(f);
						}
					} else {
						callback.receiveErrorgetPolizas(f);
					}
				} else {
					callback.receiveErrorgetPolizas(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetPolizas(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[1].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see com.amaseguros.saludenfermedad.webservices.ConsultaPolizasEnfermedades#getPolizasNoVigentes
	 * @param getPolizasNoVigentes4
	 * 
	 */

	public GetPolizasNoVigentesResponseE getPolizasNoVigentes(

			GetPolizasNoVigentesE getPolizasNoVigentes4)

			throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[2].getName());
			_operationClient.getOptions().setAction("urn:GetPolizasNoVigentes");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getPolizasNoVigentes4,
					optimizeContent(new javax.xml.namespace.QName("http://webservices.saludenfermedad.amaseguros.com/",
							"getPolizasNoVigentes")),
					new javax.xml.namespace.QName("http://webservices.saludenfermedad.amaseguros.com/",
							"getPolizasNoVigentes"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					GetPolizasNoVigentesResponseE.class,
					getEnvelopeNamespaces(_returnEnv));

			return (GetPolizasNoVigentesResponseE) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPolizasNoVigentes"))) {
					// make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPolizasNoVigentes"));
						Class exceptionClass = Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());
						// message class
						String messageClassName = (String) faultMessageMap.get(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPolizasNoVigentes"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[] { messageClass });
						m.invoke(ex, new Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see com.amaseguros.saludenfermedad.webservices.ConsultaPolizasEnfermedades#startgetPolizasNoVigentes
	 * @param getPolizasNoVigentes4
	 * 
	 */
	public void startgetPolizasNoVigentes(

			GetPolizasNoVigentesE getPolizasNoVigentes4,

			final ConsultaPolizasEnfermedadesCallbackHandler callback)

			throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[2].getName());
		_operationClient.getOptions().setAction("urn:GetPolizasNoVigentes");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getPolizasNoVigentes4,
				optimizeContent(new javax.xml.namespace.QName("http://webservices.saludenfermedad.amaseguros.com/",
						"getPolizasNoVigentes")),
				new javax.xml.namespace.QName("http://webservices.saludenfermedad.amaseguros.com/",
						"getPolizasNoVigentes"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(),
							GetPolizasNoVigentesResponseE.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetPolizasNoVigentes(
							(GetPolizasNoVigentesResponseE) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetPolizasNoVigentes(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPolizasNoVigentes"))) {
							// make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"getPolizasNoVigentes"));
								Class exceptionClass = Class.forName(exceptionClassName);
								java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());
								// message class
								String messageClassName = (String) faultMessageMap
										.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
												"getPolizasNoVigentes"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[] { messageClass });
								m.invoke(ex, new Object[] { messageObject });

								callback.receiveErrorgetPolizasNoVigentes(
										new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPolizasNoVigentes(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPolizasNoVigentes(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPolizasNoVigentes(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPolizasNoVigentes(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPolizasNoVigentes(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPolizasNoVigentes(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetPolizasNoVigentes(f);
							}
						} else {
							callback.receiveErrorgetPolizasNoVigentes(f);
						}
					} else {
						callback.receiveErrorgetPolizasNoVigentes(f);
					}
				} else {
					callback.receiveErrorgetPolizasNoVigentes(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetPolizasNoVigentes(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[2].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[2].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

	private javax.xml.namespace.QName[] opNameArray = null;

	private boolean optimizeContent(javax.xml.namespace.QName opName) {

		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;
			}
		}
		return false;
	}

	// https://ESPRELSESB01:8243/AmaPublish/ama/consultaPolizasEnfermedades.consultaPolizasEnfermedadesHttpsSoap11Endpoint
	public static class Respuesta implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name = respuesta
		 * Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for FechaOperacion
		 */

		protected java.util.Calendar localFechaOperacion;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localFechaOperacionTracker = false;

		public boolean isFechaOperacionSpecified() {
			return localFechaOperacionTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.util.Calendar
		 */
		public java.util.Calendar getFechaOperacion() {
			return localFechaOperacion;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param FechaOperacion
		 */
		public void setFechaOperacion(java.util.Calendar param) {
			localFechaOperacionTracker = param != null;

			this.localFechaOperacion = param;

		}

		/**
		 * field for ResultadoOperacion
		 */

		protected ResultadoOperacion localResultadoOperacion;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localResultadoOperacionTracker = false;

		public boolean isResultadoOperacionSpecified() {
			return localResultadoOperacionTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return ResultadoOperacion
		 */
		public ResultadoOperacion getResultadoOperacion() {
			return localResultadoOperacion;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param ResultadoOperacion
		 */
		public void setResultadoOperacion(ResultadoOperacion param) {
			localResultadoOperacionTracker = param != null;

			this.localResultadoOperacion = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":respuesta", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "respuesta", xmlWriter);
				}

			}
			if (localFechaOperacionTracker) {
				namespace = "";
				writeStartElement(null, namespace, "fechaOperacion", xmlWriter);

				if (localFechaOperacion == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("fechaOperacion cannot be null!!");

				} else {

					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaOperacion));

				}

				xmlWriter.writeEndElement();
			}
			if (localResultadoOperacionTracker) {
				if (localResultadoOperacion == null) {
					throw new org.apache.axis2.databinding.ADBException("resultadoOperacion cannot be null!!");
				}
				localResultadoOperacion.serialize(new javax.xml.namespace.QName("", "resultadoOperacion"), xmlWriter);
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localFechaOperacionTracker) {
				elementList.add(new javax.xml.namespace.QName("", "fechaOperacion"));

				if (localFechaOperacion != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaOperacion));
				} else {
					throw new org.apache.axis2.databinding.ADBException("fechaOperacion cannot be null!!");
				}
			}
			if (localResultadoOperacionTracker) {
				elementList.add(new javax.xml.namespace.QName("", "resultadoOperacion"));

				if (localResultadoOperacion == null) {
					throw new org.apache.axis2.databinding.ADBException("resultadoOperacion cannot be null!!");
				}
				elementList.add(localResultadoOperacion);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static Respuesta parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				Respuesta object = new Respuesta();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"respuesta".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Respuesta) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "fechaOperacion").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "fechaOperacion" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setFechaOperacion(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "resultadoOperacion").equals(reader.getName())) {

						object.setResultadoOperacion(ResultadoOperacion.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class RespuestaConsulta extends Respuesta implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * respuestaConsulta Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for ResultadoOperacionConsulta
		 */

		protected ResultadoOperacionConsulta localResultadoOperacionConsulta;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localResultadoOperacionConsultaTracker = false;

		public boolean isResultadoOperacionConsultaSpecified() {
			return localResultadoOperacionConsultaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return ResultadoOperacionConsulta
		 */
		public ResultadoOperacionConsulta getResultadoOperacionConsulta() {
			return localResultadoOperacionConsulta;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param ResultadoOperacionConsulta
		 */
		public void setResultadoOperacionConsulta(ResultadoOperacionConsulta param) {
			localResultadoOperacionConsultaTracker = param != null;

			this.localResultadoOperacionConsulta = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			String namespacePrefix = registerPrefix(xmlWriter,
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":respuestaConsulta", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "respuestaConsulta",
						xmlWriter);
			}

			if (localFechaOperacionTracker) {
				namespace = "";
				writeStartElement(null, namespace, "fechaOperacion", xmlWriter);

				if (localFechaOperacion == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("fechaOperacion cannot be null!!");

				} else {

					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaOperacion));

				}

				xmlWriter.writeEndElement();
			}
			if (localResultadoOperacionTracker) {
				if (localResultadoOperacion == null) {
					throw new org.apache.axis2.databinding.ADBException("resultadoOperacion cannot be null!!");
				}
				localResultadoOperacion.serialize(new javax.xml.namespace.QName("", "resultadoOperacion"), xmlWriter);
			}
			if (localResultadoOperacionConsultaTracker) {
				if (localResultadoOperacionConsulta == null) {
					throw new org.apache.axis2.databinding.ADBException("resultadoOperacionConsulta cannot be null!!");
				}
				localResultadoOperacionConsulta
						.serialize(new javax.xml.namespace.QName("", "resultadoOperacionConsulta"), xmlWriter);
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
			attribList.add(new javax.xml.namespace.QName(
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "respuestaConsulta"));
			if (localFechaOperacionTracker) {
				elementList.add(new javax.xml.namespace.QName("", "fechaOperacion"));

				if (localFechaOperacion != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaOperacion));
				} else {
					throw new org.apache.axis2.databinding.ADBException("fechaOperacion cannot be null!!");
				}
			}
			if (localResultadoOperacionTracker) {
				elementList.add(new javax.xml.namespace.QName("", "resultadoOperacion"));

				if (localResultadoOperacion == null) {
					throw new org.apache.axis2.databinding.ADBException("resultadoOperacion cannot be null!!");
				}
				elementList.add(localResultadoOperacion);
			}
			if (localResultadoOperacionConsultaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "resultadoOperacionConsulta"));

				if (localResultadoOperacionConsulta == null) {
					throw new org.apache.axis2.databinding.ADBException("resultadoOperacionConsulta cannot be null!!");
				}
				elementList.add(localResultadoOperacionConsulta);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static RespuestaConsulta parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				RespuestaConsulta object = new RespuestaConsulta();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"respuestaConsulta".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (RespuestaConsulta) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "fechaOperacion").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "fechaOperacion" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setFechaOperacion(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "resultadoOperacion").equals(reader.getName())) {

						object.setResultadoOperacion(ResultadoOperacion.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("", "resultadoOperacionConsulta")
							.equals(reader.getName())) {

						object.setResultadoOperacionConsulta(ResultadoOperacionConsulta.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class ProcedimientoTramitacion implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "procedimientoTramitacion",
				"ns1");

		/**
		 * field for ProcedimientoTramitacion
		 */

		protected String localProcedimientoTramitacion;

		private static java.util.HashMap _table_ = new java.util.HashMap();

		// Constructor

		protected ProcedimientoTramitacion(String value, boolean isRegisterValue) {
			localProcedimientoTramitacion = value;
			if (isRegisterValue) {

				_table_.put(localProcedimientoTramitacion, this);

			}

		}

		public static final String _TRAMITACION_LIQUIDACION = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("TRAMITACION_LIQUIDACION");

		public static final String _SOLO_TRAMITACION = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("SOLO_TRAMITACION");

		public static final String _NO_ATENDER = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("NO_ATENDER");

		public static final ProcedimientoTramitacion TRAMITACION_LIQUIDACION = new ProcedimientoTramitacion(
				_TRAMITACION_LIQUIDACION, true);

		public static final ProcedimientoTramitacion SOLO_TRAMITACION = new ProcedimientoTramitacion(_SOLO_TRAMITACION,
				true);

		public static final ProcedimientoTramitacion NO_ATENDER = new ProcedimientoTramitacion(_NO_ATENDER, true);

		public String getValue() {
			return localProcedimientoTramitacion;
		}

		public boolean equals(Object obj) {
			return (obj == this);
		}

		public int hashCode() {
			return toString().hashCode();
		}

		public String toString() {

			return localProcedimientoTramitacion.toString();

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it

			String namespace = parentQName.getNamespaceURI();
			String _localName = parentQName.getLocalPart();

			writeStartElement(null, namespace, _localName, xmlWriter);

			// add the type details if this is used in a simple type
			if (serializeType) {
				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":procedimientoTramitacion", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							"procedimientoTramitacion", xmlWriter);
				}
			}

			if (localProcedimientoTramitacion == null) {

				throw new org.apache.axis2.databinding.ADBException("procedimientoTramitacion cannot be null !!");

			} else {

				xmlWriter.writeCharacters(localProcedimientoTramitacion);

			}

			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it
			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
					new Object[] { org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
							org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(localProcedimientoTramitacion) },
					null);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			public static ProcedimientoTramitacion fromValue(String value)
					throws IllegalArgumentException {
				ProcedimientoTramitacion enumeration = (ProcedimientoTramitacion)

				_table_.get(value);

				if ((enumeration == null) && !((value == null) || (value.equals("")))) {
					throw new IllegalArgumentException();
				}
				return enumeration;
			}

			public static ProcedimientoTramitacion fromString(String value, String namespaceURI)
					throws IllegalArgumentException {
				try {

					return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));

				} catch (Exception e) {
					throw new IllegalArgumentException();
				}
			}

			public static ProcedimientoTramitacion fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
					String content) {
				if (content.indexOf(":") > -1) {
					String prefix = content.substring(0, content.indexOf(":"));
					String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
					return Factory.fromString(content, namespaceUri);
				} else {
					return Factory.fromString(content, "");
				}
			}

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static ProcedimientoTramitacion parse(javax.xml.stream.XMLStreamReader reader)
					throws Exception {
				ProcedimientoTramitacion object = null;
				// initialize a hash map to keep values
				java.util.Map attributeMap = new java.util.HashMap();
				java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement() || reader.hasText()) {

							nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
									"nil");
							if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
								throw new org.apache.axis2.databinding.ADBException(
										"The element: " + "procedimientoTramitacion" + "  cannot be null");
							}

							String content = reader.getElementText();

							if (content.indexOf(":") > 0) {
								// this seems to be a Qname so find the namespace and send
								prefix = content.substring(0, content.indexOf(":"));
								namespaceuri = reader.getNamespaceURI(prefix);
								object = Factory.fromString(content, namespaceuri);
							} else {
								// this seems to be not a qname send and empty namespace incase of it is
								// check is done in fromString method
								object = Factory.fromString(content, "");
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetPolizasE implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "getPolizas", "ns1");

		/**
		 * field for GetPolizas
		 */

		protected GetPolizas localGetPolizas;

		/**
		 * Auto generated getter method
		 * 
		 * @return GetPolizas
		 */
		public GetPolizas getGetPolizas() {
			return localGetPolizas;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param GetPolizas
		 */
		public void setGetPolizas(GetPolizas param) {

			this.localGetPolizas = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it

			if (localGetPolizas == null) {
				throw new org.apache.axis2.databinding.ADBException("getPolizas cannot be null!");
			}
			localGetPolizas.serialize(MY_QNAME, xmlWriter);

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it
			return localGetPolizas.getPullParser(MY_QNAME);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static GetPolizasE parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				GetPolizasE object = new GetPolizasE();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement()) {

							if (reader.isStartElement() && new javax.xml.namespace.QName(
									"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/",
									"getPolizas").equals(reader.getName())) {

								object.setGetPolizas(GetPolizas.Factory.parse(reader));

							} // End of if for expected property start element

							else {
								// A start element we are not expecting indicates an invalid parameter was
								// passed
								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement " + reader.getName());
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class ResultadoOperacion implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * resultadoOperacion Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for Mensajes
		 */

		protected Mensajes_type0 localMensajes;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localMensajesTracker = false;

		public boolean isMensajesSpecified() {
			return localMensajesTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return Mensajes_type0
		 */
		public Mensajes_type0 getMensajes() {
			return localMensajes;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Mensajes
		 */
		public void setMensajes(Mensajes_type0 param) {
			localMensajesTracker = param != null;

			this.localMensajes = param;

		}

		/**
		 * field for Resultado
		 */

		protected TipoResultado localResultado;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localResultadoTracker = false;

		public boolean isResultadoSpecified() {
			return localResultadoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return TipoResultado
		 */
		public TipoResultado getResultado() {
			return localResultado;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Resultado
		 */
		public void setResultado(TipoResultado param) {
			localResultadoTracker = param != null;

			this.localResultado = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":resultadoOperacion", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "resultadoOperacion",
							xmlWriter);
				}

			}
			if (localMensajesTracker) {
				if (localMensajes == null) {
					throw new org.apache.axis2.databinding.ADBException("mensajes cannot be null!!");
				}
				localMensajes.serialize(new javax.xml.namespace.QName("", "mensajes"), xmlWriter);
			}
			if (localResultadoTracker) {
				if (localResultado == null) {
					throw new org.apache.axis2.databinding.ADBException("resultado cannot be null!!");
				}
				localResultado.serialize(new javax.xml.namespace.QName("", "resultado"), xmlWriter);
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localMensajesTracker) {
				elementList.add(new javax.xml.namespace.QName("", "mensajes"));

				if (localMensajes == null) {
					throw new org.apache.axis2.databinding.ADBException("mensajes cannot be null!!");
				}
				elementList.add(localMensajes);
			}
			if (localResultadoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "resultado"));

				if (localResultado == null) {
					throw new org.apache.axis2.databinding.ADBException("resultado cannot be null!!");
				}
				elementList.add(localResultado);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static ResultadoOperacion parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				ResultadoOperacion object = new ResultadoOperacion();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"resultadoOperacion".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (ResultadoOperacion) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "mensajes").equals(reader.getName())) {

						object.setMensajes(Mensajes_type0.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "resultado").equals(reader.getName())) {

						object.setResultado(TipoResultado.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetDetallePoliza implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * getDetallePoliza Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for Arg0
		 */

		protected PeticionDetalle localArg0;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localArg0Tracker = false;

		public boolean isArg0Specified() {
			return localArg0Tracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return PeticionDetalle
		 */
		public PeticionDetalle getArg0() {
			return localArg0;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Arg0
		 */
		public void setArg0(PeticionDetalle param) {
			localArg0Tracker = param != null;

			this.localArg0 = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":getDetallePoliza", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getDetallePoliza",
							xmlWriter);
				}

			}
			if (localArg0Tracker) {
				if (localArg0 == null) {
					throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
				}
				localArg0.serialize(new javax.xml.namespace.QName("", "arg0"), xmlWriter);
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localArg0Tracker) {
				elementList.add(new javax.xml.namespace.QName("", "arg0"));

				if (localArg0 == null) {
					throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
				}
				elementList.add(localArg0);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static GetDetallePoliza parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				GetDetallePoliza object = new GetDetallePoliza();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"getDetallePoliza".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetDetallePoliza) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("", "arg0").equals(reader.getName())) {

						object.setArg0(PeticionDetalle.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class TipoResultado implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "tipoResultado", "ns1");

		/**
		 * field for TipoResultado
		 */

		protected String localTipoResultado;

		private static java.util.HashMap _table_ = new java.util.HashMap();

		// Constructor

		protected TipoResultado(String value, boolean isRegisterValue) {
			localTipoResultado = value;
			if (isRegisterValue) {

				_table_.put(localTipoResultado, this);

			}

		}

		public static final String _SUCCESS = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("SUCCESS");

		public static final String _SUCCESS_WARN = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("SUCCESS_WARN");

		public static final String _ERROR = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("ERROR");

		public static final TipoResultado SUCCESS = new TipoResultado(_SUCCESS, true);

		public static final TipoResultado SUCCESS_WARN = new TipoResultado(_SUCCESS_WARN, true);

		public static final TipoResultado ERROR = new TipoResultado(_ERROR, true);

		public String getValue() {
			return localTipoResultado;
		}

		public boolean equals(Object obj) {
			return (obj == this);
		}

		public int hashCode() {
			return toString().hashCode();
		}

		public String toString() {

			return localTipoResultado.toString();

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it

			String namespace = parentQName.getNamespaceURI();
			String _localName = parentQName.getLocalPart();

			writeStartElement(null, namespace, _localName, xmlWriter);

			// add the type details if this is used in a simple type
			if (serializeType) {
				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":tipoResultado", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "tipoResultado",
							xmlWriter);
				}
			}

			if (localTipoResultado == null) {

				throw new org.apache.axis2.databinding.ADBException("tipoResultado cannot be null !!");

			} else {

				xmlWriter.writeCharacters(localTipoResultado);

			}

			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it
			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
					new Object[] { org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipoResultado) },
					null);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			public static TipoResultado fromValue(String value) throws IllegalArgumentException {
				TipoResultado enumeration = (TipoResultado)

				_table_.get(value);

				if ((enumeration == null) && !((value == null) || (value.equals("")))) {
					throw new IllegalArgumentException();
				}
				return enumeration;
			}

			public static TipoResultado fromString(String value, String namespaceURI)
					throws IllegalArgumentException {
				try {

					return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));

				} catch (Exception e) {
					throw new IllegalArgumentException();
				}
			}

			public static TipoResultado fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
					String content) {
				if (content.indexOf(":") > -1) {
					String prefix = content.substring(0, content.indexOf(":"));
					String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
					return Factory.fromString(content, namespaceUri);
				} else {
					return Factory.fromString(content, "");
				}
			}

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static TipoResultado parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				TipoResultado object = null;
				// initialize a hash map to keep values
				java.util.Map attributeMap = new java.util.HashMap();
				java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement() || reader.hasText()) {

							nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
									"nil");
							if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
								throw new org.apache.axis2.databinding.ADBException(
										"The element: " + "tipoResultado" + "  cannot be null");
							}

							String content = reader.getElementText();

							if (content.indexOf(":") > 0) {
								// this seems to be a Qname so find the namespace and send
								prefix = content.substring(0, content.indexOf(":"));
								namespaceuri = reader.getNamespaceURI(prefix);
								object = Factory.fromString(content, namespaceuri);
							} else {
								// this seems to be not a qname send and empty namespace incase of it is
								// check is done in fromString method
								object = Factory.fromString(content, "");
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Garantia implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name = garantia
		 * Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for CapitalCubierto
		 */

		protected java.math.BigDecimal localCapitalCubierto;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCapitalCubiertoTracker = false;

		public boolean isCapitalCubiertoSpecified() {
			return localCapitalCubiertoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.math.BigDecimal
		 */
		public java.math.BigDecimal getCapitalCubierto() {
			return localCapitalCubierto;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param CapitalCubierto
		 */
		public void setCapitalCubierto(java.math.BigDecimal param) {
			localCapitalCubiertoTracker = param != null;

			this.localCapitalCubierto = param;

		}

		/**
		 * field for CodigoConcepto
		 */

		protected String localCodigoConcepto;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCodigoConceptoTracker = false;

		public boolean isCodigoConceptoSpecified() {
			return localCodigoConceptoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getCodigoConcepto() {
			return localCodigoConcepto;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param CodigoConcepto
		 */
		public void setCodigoConcepto(String param) {
			localCodigoConceptoTracker = param != null;

			this.localCodigoConcepto = param;

		}

		/**
		 * field for CodigoGarantia
		 */

		protected String localCodigoGarantia;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCodigoGarantiaTracker = false;

		public boolean isCodigoGarantiaSpecified() {
			return localCodigoGarantiaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getCodigoGarantia() {
			return localCodigoGarantia;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param CodigoGarantia
		 */
		public void setCodigoGarantia(String param) {
			localCodigoGarantiaTracker = param != null;

			this.localCodigoGarantia = param;

		}

		/**
		 * field for Descripcion
		 */

		protected String localDescripcion;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localDescripcionTracker = false;

		public boolean isDescripcionSpecified() {
			return localDescripcionTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getDescripcion() {
			return localDescripcion;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Descripcion
		 */
		public void setDescripcion(String param) {
			localDescripcionTracker = param != null;

			this.localDescripcion = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":garantia", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "garantia", xmlWriter);
				}

			}
			if (localCapitalCubiertoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "capitalCubierto", xmlWriter);

				if (localCapitalCubierto == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("capitalCubierto cannot be null!!");

				} else {

					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCapitalCubierto));

				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoConceptoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoConcepto", xmlWriter);

				if (localCodigoConcepto == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("codigoConcepto cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localCodigoConcepto);

				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoGarantiaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoGarantia", xmlWriter);

				if (localCodigoGarantia == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("codigoGarantia cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localCodigoGarantia);

				}

				xmlWriter.writeEndElement();
			}
			if (localDescripcionTracker) {
				namespace = "";
				writeStartElement(null, namespace, "descripcion", xmlWriter);

				if (localDescripcion == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("descripcion cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localDescripcion);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localCapitalCubiertoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "capitalCubierto"));

				if (localCapitalCubierto != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCapitalCubierto));
				} else {
					throw new org.apache.axis2.databinding.ADBException("capitalCubierto cannot be null!!");
				}
			}
			if (localCodigoConceptoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoConcepto"));

				if (localCodigoConcepto != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoConcepto));
				} else {
					throw new org.apache.axis2.databinding.ADBException("codigoConcepto cannot be null!!");
				}
			}
			if (localCodigoGarantiaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoGarantia"));

				if (localCodigoGarantia != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoGarantia));
				} else {
					throw new org.apache.axis2.databinding.ADBException("codigoGarantia cannot be null!!");
				}
			}
			if (localDescripcionTracker) {
				elementList.add(new javax.xml.namespace.QName("", "descripcion"));

				if (localDescripcion != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescripcion));
				} else {
					throw new org.apache.axis2.databinding.ADBException("descripcion cannot be null!!");
				}
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static Garantia parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				Garantia object = new Garantia();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"garantia".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Garantia) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "capitalCubierto").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "capitalCubierto" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCapitalCubierto(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoConcepto").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoConcepto" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoConcepto(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoGarantia").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoGarantia" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoGarantia(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "descripcion").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "descripcion" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setDescripcion(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class PeticionConsulta extends Peticion implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * peticionConsulta Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for Interviniente
		 */

		protected IntervinienteSimple localInterviniente;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localIntervinienteTracker = false;

		public boolean isIntervinienteSpecified() {
			return localIntervinienteTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return IntervinienteSimple
		 */
		public IntervinienteSimple getInterviniente() {
			return localInterviniente;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Interviniente
		 */
		public void setInterviniente(IntervinienteSimple param) {
			localIntervinienteTracker = param != null;

			this.localInterviniente = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			String namespacePrefix = registerPrefix(xmlWriter,
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":peticionConsulta", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "peticionConsulta",
						xmlWriter);
			}

			if (localCodigoCompaniaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoCompania", xmlWriter);

				if (localCodigoCompania == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("codigoCompania cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localCodigoCompania);

				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoPaisTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoPais", xmlWriter);

				if (localCodigoPais == Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("codigoPais cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPais));
				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoRamoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoRamo", xmlWriter);

				if (localCodigoRamo == Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("codigoRamo cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoRamo));
				}

				xmlWriter.writeEndElement();
			}
			if (localFechaConsultaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "fechaConsulta", xmlWriter);

				if (localFechaConsulta == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("fechaConsulta cannot be null!!");

				} else {

					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaConsulta));

				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroPolizaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroPoliza", xmlWriter);

				if (localNumeroPoliza == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroPoliza cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroPoliza));
				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroSuplementoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroSuplemento", xmlWriter);

				if (localNumeroSuplemento == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroSuplemento cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroSuplemento));
				}

				xmlWriter.writeEndElement();
			}
			if (localIntervinienteTracker) {
				if (localInterviniente == null) {
					throw new org.apache.axis2.databinding.ADBException("interviniente cannot be null!!");
				}
				localInterviniente.serialize(new javax.xml.namespace.QName("", "interviniente"), xmlWriter);
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
			attribList.add(new javax.xml.namespace.QName(
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "peticionConsulta"));
			if (localCodigoCompaniaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoCompania"));

				if (localCodigoCompania != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoCompania));
				} else {
					throw new org.apache.axis2.databinding.ADBException("codigoCompania cannot be null!!");
				}
			}
			if (localCodigoPaisTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoPais"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPais));
			}
			if (localCodigoRamoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoRamo"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoRamo));
			}
			if (localFechaConsultaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "fechaConsulta"));

				if (localFechaConsulta != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaConsulta));
				} else {
					throw new org.apache.axis2.databinding.ADBException("fechaConsulta cannot be null!!");
				}
			}
			if (localNumeroPolizaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroPoliza"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroPoliza));
			}
			if (localNumeroSuplementoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroSuplemento"));

				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroSuplemento));
			}
			if (localIntervinienteTracker) {
				elementList.add(new javax.xml.namespace.QName("", "interviniente"));

				if (localInterviniente == null) {
					throw new org.apache.axis2.databinding.ADBException("interviniente cannot be null!!");
				}
				elementList.add(localInterviniente);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static PeticionConsulta parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				PeticionConsulta object = new PeticionConsulta();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"peticionConsulta".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (PeticionConsulta) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoCompania").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoCompania" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoCompania(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoPais").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoPais" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoPais(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setCodigoPais(Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoRamo").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoRamo" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoRamo(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setCodigoRamo(Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "fechaConsulta").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "fechaConsulta" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setFechaConsulta(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroPoliza").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroPoliza" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroPoliza(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroPoliza(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroSuplemento").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroSuplemento" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroSuplemento(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroSuplemento(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "interviniente").equals(reader.getName())) {

						object.setInterviniente(IntervinienteSimple.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class ResultadoOperacionConsulta extends ResultadoOperacion
			implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * resultadoOperacionConsulta Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for ListadoPolizas
		 */

		protected ListadoPolizas_type0 localListadoPolizas;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localListadoPolizasTracker = false;

		public boolean isListadoPolizasSpecified() {
			return localListadoPolizasTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return ListadoPolizas_type0
		 */
		public ListadoPolizas_type0 getListadoPolizas() {
			return localListadoPolizas;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param ListadoPolizas
		 */
		public void setListadoPolizas(ListadoPolizas_type0 param) {
			localListadoPolizasTracker = param != null;

			this.localListadoPolizas = param;

		}

		/**
		 * field for NumRegistros
		 */

		protected int localNumRegistros;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNumRegistrosTracker = false;

		public boolean isNumRegistrosSpecified() {
			return localNumRegistrosTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getNumRegistros() {
			return localNumRegistros;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param NumRegistros
		 */
		public void setNumRegistros(int param) {

			// setting primitive attribute tracker to true
			localNumRegistrosTracker = param != Integer.MIN_VALUE;

			this.localNumRegistros = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			String namespacePrefix = registerPrefix(xmlWriter,
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":resultadoOperacionConsulta", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "resultadoOperacionConsulta",
						xmlWriter);
			}

			if (localMensajesTracker) {
				if (localMensajes == null) {
					throw new org.apache.axis2.databinding.ADBException("mensajes cannot be null!!");
				}
				localMensajes.serialize(new javax.xml.namespace.QName("", "mensajes"), xmlWriter);
			}
			if (localResultadoTracker) {
				if (localResultado == null) {
					throw new org.apache.axis2.databinding.ADBException("resultado cannot be null!!");
				}
				localResultado.serialize(new javax.xml.namespace.QName("", "resultado"), xmlWriter);
			}
			if (localListadoPolizasTracker) {
				if (localListadoPolizas == null) {
					throw new org.apache.axis2.databinding.ADBException("listadoPolizas cannot be null!!");
				}
				localListadoPolizas.serialize(new javax.xml.namespace.QName("", "listadoPolizas"), xmlWriter);
			}
			if (localNumRegistrosTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numRegistros", xmlWriter);

				if (localNumRegistros == Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numRegistros cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumRegistros));
				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
			attribList.add(new javax.xml.namespace.QName(
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/",
					"resultadoOperacionConsulta"));
			if (localMensajesTracker) {
				elementList.add(new javax.xml.namespace.QName("", "mensajes"));

				if (localMensajes == null) {
					throw new org.apache.axis2.databinding.ADBException("mensajes cannot be null!!");
				}
				elementList.add(localMensajes);
			}
			if (localResultadoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "resultado"));

				if (localResultado == null) {
					throw new org.apache.axis2.databinding.ADBException("resultado cannot be null!!");
				}
				elementList.add(localResultado);
			}
			if (localListadoPolizasTracker) {
				elementList.add(new javax.xml.namespace.QName("", "listadoPolizas"));

				if (localListadoPolizas == null) {
					throw new org.apache.axis2.databinding.ADBException("listadoPolizas cannot be null!!");
				}
				elementList.add(localListadoPolizas);
			}
			if (localNumRegistrosTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numRegistros"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumRegistros));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static ResultadoOperacionConsulta parse(javax.xml.stream.XMLStreamReader reader)
					throws Exception {
				ResultadoOperacionConsulta object = new ResultadoOperacionConsulta();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"resultadoOperacionConsulta".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (ResultadoOperacionConsulta) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "mensajes").equals(reader.getName())) {

						object.setMensajes(Mensajes_type0.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "resultado").equals(reader.getName())) {

						object.setResultado(TipoResultado.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "listadoPolizas").equals(reader.getName())) {

						object.setListadoPolizas(ListadoPolizas_type0.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numRegistros").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numRegistros" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumRegistros(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumRegistros(Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetPolizasNoVigentesResponse implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * getPolizasNoVigentesResponse Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for _return
		 */

		protected RespuestaConsulta local_return;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean local_returnTracker = false;

		public boolean is_returnSpecified() {
			return local_returnTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return RespuestaConsulta
		 */
		public RespuestaConsulta get_return() {
			return local_return;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param _return
		 */
		public void set_return(RespuestaConsulta param) {
			local_returnTracker = param != null;

			this.local_return = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":getPolizasNoVigentesResponse", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							"getPolizasNoVigentesResponse", xmlWriter);
				}

			}
			if (local_returnTracker) {
				if (local_return == null) {
					throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
				}
				local_return.serialize(new javax.xml.namespace.QName("", "return"), xmlWriter);
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker) {
				elementList.add(new javax.xml.namespace.QName("", "return"));

				if (local_return == null) {
					throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
				}
				elementList.add(local_return);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static GetPolizasNoVigentesResponse parse(javax.xml.stream.XMLStreamReader reader)
					throws Exception {
				GetPolizasNoVigentesResponse object = new GetPolizasNoVigentesResponse();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"getPolizasNoVigentesResponse".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetPolizasNoVigentesResponse) ExtensionMapper.getTypeObject(nsUri, type,
										reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "return").equals(reader.getName())) {

						object.set_return(RespuestaConsulta.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class InfoContacto implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name = infoContacto
		 * Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for Email
		 */

		protected String localEmail;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localEmailTracker = false;

		public boolean isEmailSpecified() {
			return localEmailTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getEmail() {
			return localEmail;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Email
		 */
		public void setEmail(String param) {
			localEmailTracker = param != null;

			this.localEmail = param;

		}

		/**
		 * field for TelefonoFijo
		 */

		protected String localTelefonoFijo;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localTelefonoFijoTracker = false;

		public boolean isTelefonoFijoSpecified() {
			return localTelefonoFijoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getTelefonoFijo() {
			return localTelefonoFijo;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param TelefonoFijo
		 */
		public void setTelefonoFijo(String param) {
			localTelefonoFijoTracker = param != null;

			this.localTelefonoFijo = param;

		}

		/**
		 * field for TelefonoMovil
		 */

		protected String localTelefonoMovil;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localTelefonoMovilTracker = false;

		public boolean isTelefonoMovilSpecified() {
			return localTelefonoMovilTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getTelefonoMovil() {
			return localTelefonoMovil;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param TelefonoMovil
		 */
		public void setTelefonoMovil(String param) {
			localTelefonoMovilTracker = param != null;

			this.localTelefonoMovil = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":infoContacto", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "infoContacto",
							xmlWriter);
				}

			}
			if (localEmailTracker) {
				namespace = "";
				writeStartElement(null, namespace, "email", xmlWriter);

				if (localEmail == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("email cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localEmail);

				}

				xmlWriter.writeEndElement();
			}
			if (localTelefonoFijoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "telefonoFijo", xmlWriter);

				if (localTelefonoFijo == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("telefonoFijo cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localTelefonoFijo);

				}

				xmlWriter.writeEndElement();
			}
			if (localTelefonoMovilTracker) {
				namespace = "";
				writeStartElement(null, namespace, "telefonoMovil", xmlWriter);

				if (localTelefonoMovil == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("telefonoMovil cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localTelefonoMovil);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localEmailTracker) {
				elementList.add(new javax.xml.namespace.QName("", "email"));

				if (localEmail != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmail));
				} else {
					throw new org.apache.axis2.databinding.ADBException("email cannot be null!!");
				}
			}
			if (localTelefonoFijoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "telefonoFijo"));

				if (localTelefonoFijo != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefonoFijo));
				} else {
					throw new org.apache.axis2.databinding.ADBException("telefonoFijo cannot be null!!");
				}
			}
			if (localTelefonoMovilTracker) {
				elementList.add(new javax.xml.namespace.QName("", "telefonoMovil"));

				if (localTelefonoMovil != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefonoMovil));
				} else {
					throw new org.apache.axis2.databinding.ADBException("telefonoMovil cannot be null!!");
				}
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static InfoContacto parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				InfoContacto object = new InfoContacto();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"infoContacto".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (InfoContacto) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "email").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "email" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setEmail(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "telefonoFijo").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "telefonoFijo" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setTelefonoFijo(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "telefonoMovil").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "telefonoMovil" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setTelefonoMovil(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Intervinientes_type0 implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * intervinientes_type0 Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for Interviniente This was an Array!
		 */

		protected Interviniente[] localInterviniente;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localIntervinienteTracker = false;

		public boolean isIntervinienteSpecified() {
			return localIntervinienteTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return Interviniente[]
		 */
		public Interviniente[] getInterviniente() {
			return localInterviniente;
		}

		/**
		 * validate the array for Interviniente
		 */
		protected void validateInterviniente(Interviniente[] param) {

		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Interviniente
		 */
		public void setInterviniente(Interviniente[] param) {

			validateInterviniente(param);

			localIntervinienteTracker = param != null;

			this.localInterviniente = param;
		}

		/**
		 * Auto generated add method for the array for convenience
		 * 
		 * @param param Interviniente
		 */
		public void addInterviniente(Interviniente param) {
			if (localInterviniente == null) {
				localInterviniente = new Interviniente[] {};
			}

			// update the setting tracker
			localIntervinienteTracker = true;

			java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localInterviniente);
			list.add(param);
			this.localInterviniente = (Interviniente[]) list.toArray(new Interviniente[list.size()]);

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":intervinientes_type0", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "intervinientes_type0",
							xmlWriter);
				}

			}
			if (localIntervinienteTracker) {
				if (localInterviniente != null) {
					for (int i = 0; i < localInterviniente.length; i++) {
						if (localInterviniente[i] != null) {
							localInterviniente[i].serialize(new javax.xml.namespace.QName("", "interviniente"),
									xmlWriter);
						} else {

							// we don't have to do any thing since minOccures is zero

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("interviniente cannot be null!!");

				}
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localIntervinienteTracker) {
				if (localInterviniente != null) {
					for (int i = 0; i < localInterviniente.length; i++) {

						if (localInterviniente[i] != null) {
							elementList.add(new javax.xml.namespace.QName("", "interviniente"));
							elementList.add(localInterviniente[i]);
						} else {

							// nothing to do

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("interviniente cannot be null!!");

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static Intervinientes_type0 parse(javax.xml.stream.XMLStreamReader reader)
					throws Exception {
				Intervinientes_type0 object = new Intervinientes_type0();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"intervinientes_type0".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Intervinientes_type0) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					java.util.ArrayList list1 = new java.util.ArrayList();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "interviniente").equals(reader.getName())) {

						// Process the array and step past its final element's end.
						list1.add(Interviniente.Factory.parse(reader));

						// loop until we find a start element that is not part of this array
						boolean loopDone1 = false;
						while (!loopDone1) {
							// We should be at the end element, but make sure
							while (!reader.isEndElement())
								reader.next();
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()) {
								// two continuous end elements means we are exiting the xml structure
								loopDone1 = true;
							} else {
								if (new javax.xml.namespace.QName("", "interviniente").equals(reader.getName())) {
									list1.add(Interviniente.Factory.parse(reader));

								} else {
									loopDone1 = true;
								}
							}
						}
						// call the converter utility to convert and set the array

						object.setInterviniente((Interviniente[]) org.apache.axis2.databinding.utils.ConverterUtil
								.convertToArray(Interviniente.class, list1));

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Direccion implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name = direccion
		 * Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for CodPostal
		 */

		protected String localCodPostal;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCodPostalTracker = false;

		public boolean isCodPostalSpecified() {
			return localCodPostalTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getCodPostal() {
			return localCodPostal;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param CodPostal
		 */
		public void setCodPostal(String param) {
			localCodPostalTracker = param != null;

			this.localCodPostal = param;

		}

		/**
		 * field for Escalera
		 */

		protected String localEscalera;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localEscaleraTracker = false;

		public boolean isEscaleraSpecified() {
			return localEscaleraTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getEscalera() {
			return localEscalera;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Escalera
		 */
		public void setEscalera(String param) {
			localEscaleraTracker = param != null;

			this.localEscalera = param;

		}

		/**
		 * field for LineaDireccion
		 */

		protected String localLineaDireccion;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localLineaDireccionTracker = false;

		public boolean isLineaDireccionSpecified() {
			return localLineaDireccionTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getLineaDireccion() {
			return localLineaDireccion;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param LineaDireccion
		 */
		public void setLineaDireccion(String param) {
			localLineaDireccionTracker = param != null;

			this.localLineaDireccion = param;

		}

		/**
		 * field for LineaDireccion2
		 */

		protected String localLineaDireccion2;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localLineaDireccion2Tracker = false;

		public boolean isLineaDireccion2Specified() {
			return localLineaDireccion2Tracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getLineaDireccion2() {
			return localLineaDireccion2;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param LineaDireccion2
		 */
		public void setLineaDireccion2(String param) {
			localLineaDireccion2Tracker = param != null;

			this.localLineaDireccion2 = param;

		}

		/**
		 * field for Localidad
		 */

		protected String localLocalidad;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localLocalidadTracker = false;

		public boolean isLocalidadSpecified() {
			return localLocalidadTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getLocalidad() {
			return localLocalidad;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Localidad
		 */
		public void setLocalidad(String param) {
			localLocalidadTracker = param != null;

			this.localLocalidad = param;

		}

		/**
		 * field for Numero
		 */

		protected String localNumero;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNumeroTracker = false;

		public boolean isNumeroSpecified() {
			return localNumeroTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getNumero() {
			return localNumero;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Numero
		 */
		public void setNumero(String param) {
			localNumeroTracker = param != null;

			this.localNumero = param;

		}

		/**
		 * field for Pais
		 */

		protected String localPais;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localPaisTracker = false;

		public boolean isPaisSpecified() {
			return localPaisTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getPais() {
			return localPais;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Pais
		 */
		public void setPais(String param) {
			localPaisTracker = param != null;

			this.localPais = param;

		}

		/**
		 * field for Provincia
		 */

		protected String localProvincia;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localProvinciaTracker = false;

		public boolean isProvinciaSpecified() {
			return localProvinciaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getProvincia() {
			return localProvincia;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Provincia
		 */
		public void setProvincia(String param) {
			localProvinciaTracker = param != null;

			this.localProvincia = param;

		}

		/**
		 * field for Tipo
		 */

		protected String localTipo;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localTipoTracker = false;

		public boolean isTipoSpecified() {
			return localTipoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getTipo() {
			return localTipo;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Tipo
		 */
		public void setTipo(String param) {
			localTipoTracker = param != null;

			this.localTipo = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":direccion", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "direccion", xmlWriter);
				}

			}
			if (localCodPostalTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codPostal", xmlWriter);

				if (localCodPostal == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("codPostal cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localCodPostal);

				}

				xmlWriter.writeEndElement();
			}
			if (localEscaleraTracker) {
				namespace = "";
				writeStartElement(null, namespace, "escalera", xmlWriter);

				if (localEscalera == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("escalera cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localEscalera);

				}

				xmlWriter.writeEndElement();
			}
			if (localLineaDireccionTracker) {
				namespace = "";
				writeStartElement(null, namespace, "lineaDireccion", xmlWriter);

				if (localLineaDireccion == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("lineaDireccion cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localLineaDireccion);

				}

				xmlWriter.writeEndElement();
			}
			if (localLineaDireccion2Tracker) {
				namespace = "";
				writeStartElement(null, namespace, "lineaDireccion2", xmlWriter);

				if (localLineaDireccion2 == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("lineaDireccion2 cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localLineaDireccion2);

				}

				xmlWriter.writeEndElement();
			}
			if (localLocalidadTracker) {
				namespace = "";
				writeStartElement(null, namespace, "localidad", xmlWriter);

				if (localLocalidad == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("localidad cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localLocalidad);

				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numero", xmlWriter);

				if (localNumero == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("numero cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localNumero);

				}

				xmlWriter.writeEndElement();
			}
			if (localPaisTracker) {
				namespace = "";
				writeStartElement(null, namespace, "pais", xmlWriter);

				if (localPais == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("pais cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localPais);

				}

				xmlWriter.writeEndElement();
			}
			if (localProvinciaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "provincia", xmlWriter);

				if (localProvincia == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("provincia cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localProvincia);

				}

				xmlWriter.writeEndElement();
			}
			if (localTipoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "tipo", xmlWriter);

				if (localTipo == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("tipo cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localTipo);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localCodPostalTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codPostal"));

				if (localCodPostal != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodPostal));
				} else {
					throw new org.apache.axis2.databinding.ADBException("codPostal cannot be null!!");
				}
			}
			if (localEscaleraTracker) {
				elementList.add(new javax.xml.namespace.QName("", "escalera"));

				if (localEscalera != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEscalera));
				} else {
					throw new org.apache.axis2.databinding.ADBException("escalera cannot be null!!");
				}
			}
			if (localLineaDireccionTracker) {
				elementList.add(new javax.xml.namespace.QName("", "lineaDireccion"));

				if (localLineaDireccion != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLineaDireccion));
				} else {
					throw new org.apache.axis2.databinding.ADBException("lineaDireccion cannot be null!!");
				}
			}
			if (localLineaDireccion2Tracker) {
				elementList.add(new javax.xml.namespace.QName("", "lineaDireccion2"));

				if (localLineaDireccion2 != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLineaDireccion2));
				} else {
					throw new org.apache.axis2.databinding.ADBException("lineaDireccion2 cannot be null!!");
				}
			}
			if (localLocalidadTracker) {
				elementList.add(new javax.xml.namespace.QName("", "localidad"));

				if (localLocalidad != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocalidad));
				} else {
					throw new org.apache.axis2.databinding.ADBException("localidad cannot be null!!");
				}
			}
			if (localNumeroTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numero"));

				if (localNumero != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumero));
				} else {
					throw new org.apache.axis2.databinding.ADBException("numero cannot be null!!");
				}
			}
			if (localPaisTracker) {
				elementList.add(new javax.xml.namespace.QName("", "pais"));

				if (localPais != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPais));
				} else {
					throw new org.apache.axis2.databinding.ADBException("pais cannot be null!!");
				}
			}
			if (localProvinciaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "provincia"));

				if (localProvincia != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProvincia));
				} else {
					throw new org.apache.axis2.databinding.ADBException("provincia cannot be null!!");
				}
			}
			if (localTipoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "tipo"));

				if (localTipo != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipo));
				} else {
					throw new org.apache.axis2.databinding.ADBException("tipo cannot be null!!");
				}
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static Direccion parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				Direccion object = new Direccion();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"direccion".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Direccion) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codPostal").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codPostal" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodPostal(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "escalera").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "escalera" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setEscalera(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "lineaDireccion").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "lineaDireccion" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setLineaDireccion(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "lineaDireccion2").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "lineaDireccion2" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setLineaDireccion2(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "localidad").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "localidad" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setLocalidad(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numero").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numero" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumero(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("", "pais").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "pais" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setPais(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "provincia").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "provincia" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setProvincia(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("", "tipo").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "tipo" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setTipo(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Exclusiones_type0 implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * exclusiones_type0 Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for Exclusion This was an Array!
		 */

		protected Exclusion[] localExclusion;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localExclusionTracker = false;

		public boolean isExclusionSpecified() {
			return localExclusionTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return Exclusion[]
		 */
		public Exclusion[] getExclusion() {
			return localExclusion;
		}

		/**
		 * validate the array for Exclusion
		 */
		protected void validateExclusion(Exclusion[] param) {

		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Exclusion
		 */
		public void setExclusion(Exclusion[] param) {

			validateExclusion(param);

			localExclusionTracker = param != null;

			this.localExclusion = param;
		}

		/**
		 * Auto generated add method for the array for convenience
		 * 
		 * @param param Exclusion
		 */
		public void addExclusion(Exclusion param) {
			if (localExclusion == null) {
				localExclusion = new Exclusion[] {};
			}

			// update the setting tracker
			localExclusionTracker = true;

			java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localExclusion);
			list.add(param);
			this.localExclusion = (Exclusion[]) list.toArray(new Exclusion[list.size()]);

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":exclusiones_type0", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "exclusiones_type0",
							xmlWriter);
				}

			}
			if (localExclusionTracker) {
				if (localExclusion != null) {
					for (int i = 0; i < localExclusion.length; i++) {
						if (localExclusion[i] != null) {
							localExclusion[i].serialize(new javax.xml.namespace.QName("", "exclusion"), xmlWriter);
						} else {

							// we don't have to do any thing since minOccures is zero

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("exclusion cannot be null!!");

				}
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localExclusionTracker) {
				if (localExclusion != null) {
					for (int i = 0; i < localExclusion.length; i++) {

						if (localExclusion[i] != null) {
							elementList.add(new javax.xml.namespace.QName("", "exclusion"));
							elementList.add(localExclusion[i]);
						} else {

							// nothing to do

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("exclusion cannot be null!!");

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static Exclusiones_type0 parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				Exclusiones_type0 object = new Exclusiones_type0();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"exclusiones_type0".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Exclusiones_type0) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					java.util.ArrayList list1 = new java.util.ArrayList();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "exclusion").equals(reader.getName())) {

						// Process the array and step past its final element's end.
						list1.add(Exclusion.Factory.parse(reader));

						// loop until we find a start element that is not part of this array
						boolean loopDone1 = false;
						while (!loopDone1) {
							// We should be at the end element, but make sure
							while (!reader.isEndElement())
								reader.next();
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()) {
								// two continuous end elements means we are exiting the xml structure
								loopDone1 = true;
							} else {
								if (new javax.xml.namespace.QName("", "exclusion").equals(reader.getName())) {
									list1.add(Exclusion.Factory.parse(reader));

								} else {
									loopDone1 = true;
								}
							}
						}
						// call the converter utility to convert and set the array

						object.setExclusion((Exclusion[]) org.apache.axis2.databinding.utils.ConverterUtil
								.convertToArray(Exclusion.class, list1));

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Genero implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "genero", "ns1");

		/**
		 * field for Genero
		 */

		protected String localGenero;

		private static java.util.HashMap _table_ = new java.util.HashMap();

		// Constructor

		protected Genero(String value, boolean isRegisterValue) {
			localGenero = value;
			if (isRegisterValue) {

				_table_.put(localGenero, this);

			}

		}

		public static final String _HOMBRE = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("HOMBRE");

		public static final String _MUJER = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("MUJER");

		public static final String _ENTIDAD = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("ENTIDAD");

		public static final String _MACHO = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("MACHO");

		public static final String _HEMBRA = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("HEMBRA");

		public static final String _DESCONOCIDO = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("DESCONOCIDO");

		public static final Genero HOMBRE = new Genero(_HOMBRE, true);

		public static final Genero MUJER = new Genero(_MUJER, true);

		public static final Genero ENTIDAD = new Genero(_ENTIDAD, true);

		public static final Genero MACHO = new Genero(_MACHO, true);

		public static final Genero HEMBRA = new Genero(_HEMBRA, true);

		public static final Genero DESCONOCIDO = new Genero(_DESCONOCIDO, true);

		public String getValue() {
			return localGenero;
		}

		public boolean equals(Object obj) {
			return (obj == this);
		}

		public int hashCode() {
			return toString().hashCode();
		}

		public String toString() {

			return localGenero.toString();

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it

			String namespace = parentQName.getNamespaceURI();
			String _localName = parentQName.getLocalPart();

			writeStartElement(null, namespace, _localName, xmlWriter);

			// add the type details if this is used in a simple type
			if (serializeType) {
				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":genero", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "genero", xmlWriter);
				}
			}

			if (localGenero == null) {

				throw new org.apache.axis2.databinding.ADBException("genero cannot be null !!");

			} else {

				xmlWriter.writeCharacters(localGenero);

			}

			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it
			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
					new Object[] { org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGenero) },
					null);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			public static Genero fromValue(String value) throws IllegalArgumentException {
				Genero enumeration = (Genero)

				_table_.get(value);

				if ((enumeration == null) && !((value == null) || (value.equals("")))) {
					throw new IllegalArgumentException();
				}
				return enumeration;
			}

			public static Genero fromString(String value, String namespaceURI)
					throws IllegalArgumentException {
				try {

					return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));

				} catch (Exception e) {
					throw new IllegalArgumentException();
				}
			}

			public static Genero fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
					String content) {
				if (content.indexOf(":") > -1) {
					String prefix = content.substring(0, content.indexOf(":"));
					String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
					return Factory.fromString(content, namespaceUri);
				} else {
					return Factory.fromString(content, "");
				}
			}

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static Genero parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				Genero object = null;
				// initialize a hash map to keep values
				java.util.Map attributeMap = new java.util.HashMap();
				java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement() || reader.hasText()) {

							nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
									"nil");
							if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
								throw new org.apache.axis2.databinding.ADBException(
										"The element: " + "genero" + "  cannot be null");
							}

							String content = reader.getElementText();

							if (content.indexOf(":") > 0) {
								// this seems to be a Qname so find the namespace and send
								prefix = content.substring(0, content.indexOf(":"));
								namespaceuri = reader.getNamespaceURI(prefix);
								object = Factory.fromString(content, namespaceuri);
							} else {
								// this seems to be not a qname send and empty namespace incase of it is
								// check is done in fromString method
								object = Factory.fromString(content, "");
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Mensajes_type0 implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * mensajes_type0 Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for Mensaje This was an Array!
		 */

		protected Mensaje[] localMensaje;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localMensajeTracker = false;

		public boolean isMensajeSpecified() {
			return localMensajeTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return Mensaje[]
		 */
		public Mensaje[] getMensaje() {
			return localMensaje;
		}

		/**
		 * validate the array for Mensaje
		 */
		protected void validateMensaje(Mensaje[] param) {

		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Mensaje
		 */
		public void setMensaje(Mensaje[] param) {

			validateMensaje(param);

			localMensajeTracker = param != null;

			this.localMensaje = param;
		}

		/**
		 * Auto generated add method for the array for convenience
		 * 
		 * @param param Mensaje
		 */
		public void addMensaje(Mensaje param) {
			if (localMensaje == null) {
				localMensaje = new Mensaje[] {};
			}

			// update the setting tracker
			localMensajeTracker = true;

			java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localMensaje);
			list.add(param);
			this.localMensaje = (Mensaje[]) list.toArray(new Mensaje[list.size()]);

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":mensajes_type0", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "mensajes_type0",
							xmlWriter);
				}

			}
			if (localMensajeTracker) {
				if (localMensaje != null) {
					for (int i = 0; i < localMensaje.length; i++) {
						if (localMensaje[i] != null) {
							localMensaje[i].serialize(new javax.xml.namespace.QName("", "mensaje"), xmlWriter);
						} else {

							// we don't have to do any thing since minOccures is zero

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("mensaje cannot be null!!");

				}
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localMensajeTracker) {
				if (localMensaje != null) {
					for (int i = 0; i < localMensaje.length; i++) {

						if (localMensaje[i] != null) {
							elementList.add(new javax.xml.namespace.QName("", "mensaje"));
							elementList.add(localMensaje[i]);
						} else {

							// nothing to do

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("mensaje cannot be null!!");

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static Mensajes_type0 parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				Mensajes_type0 object = new Mensajes_type0();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"mensajes_type0".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Mensajes_type0) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					java.util.ArrayList list1 = new java.util.ArrayList();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "mensaje").equals(reader.getName())) {

						// Process the array and step past its final element's end.
						list1.add(Mensaje.Factory.parse(reader));

						// loop until we find a start element that is not part of this array
						boolean loopDone1 = false;
						while (!loopDone1) {
							// We should be at the end element, but make sure
							while (!reader.isEndElement())
								reader.next();
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()) {
								// two continuous end elements means we are exiting the xml structure
								loopDone1 = true;
							} else {
								if (new javax.xml.namespace.QName("", "mensaje").equals(reader.getName())) {
									list1.add(Mensaje.Factory.parse(reader));

								} else {
									loopDone1 = true;
								}
							}
						}
						// call the converter utility to convert and set the array

						object.setMensaje((Mensaje[]) org.apache.axis2.databinding.utils.ConverterUtil
								.convertToArray(Mensaje.class, list1));

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Exclusion implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name = exclusion
		 * Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for CodigoGarantia
		 */

		protected String localCodigoGarantia;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCodigoGarantiaTracker = false;

		public boolean isCodigoGarantiaSpecified() {
			return localCodigoGarantiaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getCodigoGarantia() {
			return localCodigoGarantia;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param CodigoGarantia
		 */
		public void setCodigoGarantia(String param) {
			localCodigoGarantiaTracker = param != null;

			this.localCodigoGarantia = param;

		}

		/**
		 * field for Descripcion
		 */

		protected String localDescripcion;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localDescripcionTracker = false;

		public boolean isDescripcionSpecified() {
			return localDescripcionTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getDescripcion() {
			return localDescripcion;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Descripcion
		 */
		public void setDescripcion(String param) {
			localDescripcionTracker = param != null;

			this.localDescripcion = param;

		}

		/**
		 * field for Garantia
		 */

		protected Garantia localGarantia;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localGarantiaTracker = false;

		public boolean isGarantiaSpecified() {
			return localGarantiaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return Garantia
		 */
		public Garantia getGarantia() {
			return localGarantia;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Garantia
		 */
		public void setGarantia(Garantia param) {
			localGarantiaTracker = param != null;

			this.localGarantia = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":exclusion", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "exclusion", xmlWriter);
				}

			}
			if (localCodigoGarantiaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoGarantia", xmlWriter);

				if (localCodigoGarantia == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("codigoGarantia cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localCodigoGarantia);

				}

				xmlWriter.writeEndElement();
			}
			if (localDescripcionTracker) {
				namespace = "";
				writeStartElement(null, namespace, "descripcion", xmlWriter);

				if (localDescripcion == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("descripcion cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localDescripcion);

				}

				xmlWriter.writeEndElement();
			}
			if (localGarantiaTracker) {
				if (localGarantia == null) {
					throw new org.apache.axis2.databinding.ADBException("garantia cannot be null!!");
				}
				localGarantia.serialize(new javax.xml.namespace.QName("", "garantia"), xmlWriter);
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localCodigoGarantiaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoGarantia"));

				if (localCodigoGarantia != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoGarantia));
				} else {
					throw new org.apache.axis2.databinding.ADBException("codigoGarantia cannot be null!!");
				}
			}
			if (localDescripcionTracker) {
				elementList.add(new javax.xml.namespace.QName("", "descripcion"));

				if (localDescripcion != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescripcion));
				} else {
					throw new org.apache.axis2.databinding.ADBException("descripcion cannot be null!!");
				}
			}
			if (localGarantiaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "garantia"));

				if (localGarantia == null) {
					throw new org.apache.axis2.databinding.ADBException("garantia cannot be null!!");
				}
				elementList.add(localGarantia);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static Exclusion parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				Exclusion object = new Exclusion();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"exclusion".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Exclusion) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoGarantia").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoGarantia" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoGarantia(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "descripcion").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "descripcion" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setDescripcion(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "garantia").equals(reader.getName())) {

						object.setGarantia(Garantia.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Peticion implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name = peticion
		 * Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for codigoCompania
		 */

		protected String localCodigoCompania;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCodigoCompaniaTracker = false;

		public boolean isCodigoCompaniaSpecified() {
			return localCodigoCompaniaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getCodigoCompania() {
			return localCodigoCompania;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param codigoCompania
		 */
		public void setCodigoCompania(String param) {
			localCodigoCompaniaTracker = param != null;

			this.localCodigoCompania = param;

		}

		/**
		 * field for codigoPais
		 */

		protected int localCodigoPais;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCodigoPaisTracker = false;

		public boolean isCodigoPaisSpecified() {
			return localCodigoPaisTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getCodigoPais() {
			return localCodigoPais;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param codigoPais
		 */
		public void setCodigoPais(int param) {

			// setting primitive attribute tracker to true
			localCodigoPaisTracker = param != Integer.MIN_VALUE;

			this.localCodigoPais = param;

		}

		/**
		 * field for codigoRamo
		 */

		protected int localCodigoRamo;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCodigoRamoTracker = false;

		public boolean isCodigoRamoSpecified() {
			return localCodigoRamoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getCodigoRamo() {
			return localCodigoRamo;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param codigoRamo
		 */
		public void setCodigoRamo(int param) {

			// setting primitive attribute tracker to true
			localCodigoRamoTracker = param != Integer.MIN_VALUE;

			this.localCodigoRamo = param;

		}

		/**
		 * field for FechaConsulta
		 */

		protected java.util.Calendar localFechaConsulta;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localFechaConsultaTracker = false;

		public boolean isFechaConsultaSpecified() {
			return localFechaConsultaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.util.Calendar
		 */
		public java.util.Calendar getFechaConsulta() {
			return localFechaConsulta;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param FechaConsulta
		 */
		public void setFechaConsulta(java.util.Calendar param) {
			localFechaConsultaTracker = param != null;

			this.localFechaConsulta = param;

		}

		/**
		 * field for NumeroPoliza
		 */

		protected long localNumeroPoliza;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNumeroPolizaTracker = false;

		public boolean isNumeroPolizaSpecified() {
			return localNumeroPolizaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return long
		 */
		public long getNumeroPoliza() {
			return localNumeroPoliza;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param NumeroPoliza
		 */
		public void setNumeroPoliza(long param) {

			// setting primitive attribute tracker to true
			localNumeroPolizaTracker = param != Long.MIN_VALUE;

			this.localNumeroPoliza = param;

		}

		/**
		 * field for NumeroSuplemento
		 */

		protected long localNumeroSuplemento;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNumeroSuplementoTracker = false;

		public boolean isNumeroSuplementoSpecified() {
			return localNumeroSuplementoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return long
		 */
		public long getNumeroSuplemento() {
			return localNumeroSuplemento;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param NumeroSuplemento
		 */
		public void setNumeroSuplemento(long param) {

			// setting primitive attribute tracker to true
			localNumeroSuplementoTracker = param != Long.MIN_VALUE;

			this.localNumeroSuplemento = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":peticion", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "peticion", xmlWriter);
				}

			}
			if (localCodigoCompaniaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoCompania", xmlWriter);

				if (localCodigoCompania == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("codigoCompania cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localCodigoCompania);

				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoPaisTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoPais", xmlWriter);

				if (localCodigoPais == Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("codigoPais cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPais));
				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoRamoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoRamo", xmlWriter);

				if (localCodigoRamo == Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("codigoRamo cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoRamo));
				}

				xmlWriter.writeEndElement();
			}
			if (localFechaConsultaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "fechaConsulta", xmlWriter);

				if (localFechaConsulta == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("fechaConsulta cannot be null!!");

				} else {

					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaConsulta));

				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroPolizaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroPoliza", xmlWriter);

				if (localNumeroPoliza == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroPoliza cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroPoliza));
				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroSuplementoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroSuplemento", xmlWriter);

				if (localNumeroSuplemento == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroSuplemento cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroSuplemento));
				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localCodigoCompaniaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoCompania"));

				if (localCodigoCompania != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoCompania));
				} else {
					throw new org.apache.axis2.databinding.ADBException("codigoCompania cannot be null!!");
				}
			}
			if (localCodigoPaisTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoPais"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPais));
			}
			if (localCodigoRamoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoRamo"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoRamo));
			}
			if (localFechaConsultaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "fechaConsulta"));

				if (localFechaConsulta != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaConsulta));
				} else {
					throw new org.apache.axis2.databinding.ADBException("fechaConsulta cannot be null!!");
				}
			}
			if (localNumeroPolizaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroPoliza"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroPoliza));
			}
			if (localNumeroSuplementoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroSuplemento"));

				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroSuplemento));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static Peticion parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				Peticion object = new Peticion();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"peticion".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Peticion) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoCompania").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoCompania" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoCompania(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoPais").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoPais" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoPais(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setCodigoPais(Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoRamo").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoRamo" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoRamo(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setCodigoRamo(Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "fechaConsulta").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "fechaConsulta" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setFechaConsulta(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroPoliza").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroPoliza" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroPoliza(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroPoliza(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroSuplemento").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroSuplemento" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroSuplemento(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroSuplemento(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class TipoInterviniente implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "tipoInterviniente", "ns1");

		/**
		 * field for TipoInterviniente
		 */

		protected String localTipoInterviniente;

		private static java.util.HashMap _table_ = new java.util.HashMap();

		// Constructor

		protected TipoInterviniente(String value, boolean isRegisterValue) {
			localTipoInterviniente = value;
			if (isRegisterValue) {

				_table_.put(localTipoInterviniente, this);

			}

		}

		public static final String _MUTUALISTA_TOMADOR = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("MUTUALISTA_TOMADOR");

		public static final String _ASEGURADO = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("ASEGURADO");

		public static final String _PAGADOR = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("PAGADOR");

		public static final String _BENEFICIARIO = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("BENEFICIARIO");

		public static final String _DESCONOCIDO = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("DESCONOCIDO");

		public static final TipoInterviniente MUTUALISTA_TOMADOR = new TipoInterviniente(_MUTUALISTA_TOMADOR, true);

		public static final TipoInterviniente ASEGURADO = new TipoInterviniente(_ASEGURADO, true);

		public static final TipoInterviniente PAGADOR = new TipoInterviniente(_PAGADOR, true);

		public static final TipoInterviniente BENEFICIARIO = new TipoInterviniente(_BENEFICIARIO, true);

		public static final TipoInterviniente DESCONOCIDO = new TipoInterviniente(_DESCONOCIDO, true);

		public String getValue() {
			return localTipoInterviniente;
		}

		public boolean equals(Object obj) {
			return (obj == this);
		}

		public int hashCode() {
			return toString().hashCode();
		}

		public String toString() {

			return localTipoInterviniente.toString();

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it

			String namespace = parentQName.getNamespaceURI();
			String _localName = parentQName.getLocalPart();

			writeStartElement(null, namespace, _localName, xmlWriter);

			// add the type details if this is used in a simple type
			if (serializeType) {
				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":tipoInterviniente", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "tipoInterviniente",
							xmlWriter);
				}
			}

			if (localTipoInterviniente == null) {

				throw new org.apache.axis2.databinding.ADBException("tipoInterviniente cannot be null !!");

			} else {

				xmlWriter.writeCharacters(localTipoInterviniente);

			}

			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it
			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
					new Object[] { org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipoInterviniente) },
					null);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			public static TipoInterviniente fromValue(String value)
					throws IllegalArgumentException {
				TipoInterviniente enumeration = (TipoInterviniente)

				_table_.get(value);

				if ((enumeration == null) && !((value == null) || (value.equals("")))) {
					throw new IllegalArgumentException();
				}
				return enumeration;
			}

			public static TipoInterviniente fromString(String value, String namespaceURI)
					throws IllegalArgumentException {
				try {

					return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));

				} catch (Exception e) {
					throw new IllegalArgumentException();
				}
			}

			public static TipoInterviniente fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
					String content) {
				if (content.indexOf(":") > -1) {
					String prefix = content.substring(0, content.indexOf(":"));
					String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
					return Factory.fromString(content, namespaceUri);
				} else {
					return Factory.fromString(content, "");
				}
			}

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static TipoInterviniente parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				TipoInterviniente object = null;
				// initialize a hash map to keep values
				java.util.Map attributeMap = new java.util.HashMap();
				java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement() || reader.hasText()) {

							nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
									"nil");
							if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
								throw new org.apache.axis2.databinding.ADBException(
										"The element: " + "tipoInterviniente" + "  cannot be null");
							}

							String content = reader.getElementText();

							if (content.indexOf(":") > 0) {
								// this seems to be a Qname so find the namespace and send
								prefix = content.substring(0, content.indexOf(":"));
								namespaceuri = reader.getNamespaceURI(prefix);
								object = Factory.fromString(content, namespaceuri);
							} else {
								// this seems to be not a qname send and empty namespace incase of it is
								// check is done in fromString method
								object = Factory.fromString(content, "");
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetPolizasNoVigentes implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * getPolizasNoVigentes Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for Arg0
		 */

		protected PeticionNoVigentes localArg0;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localArg0Tracker = false;

		public boolean isArg0Specified() {
			return localArg0Tracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return PeticionNoVigentes
		 */
		public PeticionNoVigentes getArg0() {
			return localArg0;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Arg0
		 */
		public void setArg0(PeticionNoVigentes param) {
			localArg0Tracker = param != null;

			this.localArg0 = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":getPolizasNoVigentes", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getPolizasNoVigentes",
							xmlWriter);
				}

			}
			if (localArg0Tracker) {
				if (localArg0 == null) {
					throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
				}
				localArg0.serialize(new javax.xml.namespace.QName("", "arg0"), xmlWriter);
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localArg0Tracker) {
				elementList.add(new javax.xml.namespace.QName("", "arg0"));

				if (localArg0 == null) {
					throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
				}
				elementList.add(localArg0);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static GetPolizasNoVigentes parse(javax.xml.stream.XMLStreamReader reader)
					throws Exception {
				GetPolizasNoVigentes object = new GetPolizasNoVigentes();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"getPolizasNoVigentes".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetPolizasNoVigentes) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("", "arg0").equals(reader.getName())) {

						object.setArg0(PeticionNoVigentes.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetPolizasResponseE implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "getPolizasResponse", "ns1");

		/**
		 * field for GetPolizasResponse
		 */

		protected GetPolizasResponse localGetPolizasResponse;

		/**
		 * Auto generated getter method
		 * 
		 * @return GetPolizasResponse
		 */
		public GetPolizasResponse getGetPolizasResponse() {
			return localGetPolizasResponse;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param GetPolizasResponse
		 */
		public void setGetPolizasResponse(GetPolizasResponse param) {

			this.localGetPolizasResponse = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it

			if (localGetPolizasResponse == null) {
				throw new org.apache.axis2.databinding.ADBException("getPolizasResponse cannot be null!");
			}
			localGetPolizasResponse.serialize(MY_QNAME, xmlWriter);

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it
			return localGetPolizasResponse.getPullParser(MY_QNAME);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static GetPolizasResponseE parse(javax.xml.stream.XMLStreamReader reader)
					throws Exception {
				GetPolizasResponseE object = new GetPolizasResponseE();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement()) {

							if (reader.isStartElement() && new javax.xml.namespace.QName(
									"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/",
									"getPolizasResponse").equals(reader.getName())) {

								object.setGetPolizasResponse(GetPolizasResponse.Factory.parse(reader));

							} // End of if for expected property start element

							else {
								// A start element we are not expecting indicates an invalid parameter was
								// passed
								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement " + reader.getName());
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Poliza extends PolizaSimple implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name = poliza
		 * Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for CodigoModalidad
		 */

		protected String localCodigoModalidad;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCodigoModalidadTracker = false;

		public boolean isCodigoModalidadSpecified() {
			return localCodigoModalidadTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getCodigoModalidad() {
			return localCodigoModalidad;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param CodigoModalidad
		 */
		public void setCodigoModalidad(String param) {
			localCodigoModalidadTracker = param != null;

			this.localCodigoModalidad = param;

		}

		/**
		 * field for CodigoOficinaAbridora
		 */

		protected int localCodigoOficinaAbridora;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCodigoOficinaAbridoraTracker = false;

		public boolean isCodigoOficinaAbridoraSpecified() {
			return localCodigoOficinaAbridoraTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getCodigoOficinaAbridora() {
			return localCodigoOficinaAbridora;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param CodigoOficinaAbridora
		 */
		public void setCodigoOficinaAbridora(int param) {

			// setting primitive attribute tracker to true
			localCodigoOficinaAbridoraTracker = param != Integer.MIN_VALUE;

			this.localCodigoOficinaAbridora = param;

		}

		/**
		 * field for CodigoOficinaGestora
		 */

		protected int localCodigoOficinaGestora;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCodigoOficinaGestoraTracker = false;

		public boolean isCodigoOficinaGestoraSpecified() {
			return localCodigoOficinaGestoraTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getCodigoOficinaGestora() {
			return localCodigoOficinaGestora;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param CodigoOficinaGestora
		 */
		public void setCodigoOficinaGestora(int param) {

			// setting primitive attribute tracker to true
			localCodigoOficinaGestoraTracker = param != Integer.MIN_VALUE;

			this.localCodigoOficinaGestora = param;

		}

		/**
		 * field for CodigoProfesion
		 */

		protected String localCodigoProfesion;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCodigoProfesionTracker = false;

		public boolean isCodigoProfesionSpecified() {
			return localCodigoProfesionTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getCodigoProfesion() {
			return localCodigoProfesion;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param CodigoProfesion
		 */
		public void setCodigoProfesion(String param) {
			localCodigoProfesionTracker = param != null;

			this.localCodigoProfesion = param;

		}

		/**
		 * field for DescripcionModalidad
		 */

		protected String localDescripcionModalidad;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localDescripcionModalidadTracker = false;

		public boolean isDescripcionModalidadSpecified() {
			return localDescripcionModalidadTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getDescripcionModalidad() {
			return localDescripcionModalidad;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param DescripcionModalidad
		 */
		public void setDescripcionModalidad(String param) {
			localDescripcionModalidadTracker = param != null;

			this.localDescripcionModalidad = param;

		}

		/**
		 * field for DescripcionOficinaAbridora
		 */

		protected String localDescripcionOficinaAbridora;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localDescripcionOficinaAbridoraTracker = false;

		public boolean isDescripcionOficinaAbridoraSpecified() {
			return localDescripcionOficinaAbridoraTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getDescripcionOficinaAbridora() {
			return localDescripcionOficinaAbridora;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param DescripcionOficinaAbridora
		 */
		public void setDescripcionOficinaAbridora(String param) {
			localDescripcionOficinaAbridoraTracker = param != null;

			this.localDescripcionOficinaAbridora = param;

		}

		/**
		 * field for DescripcionOficinaGestora
		 */

		protected String localDescripcionOficinaGestora;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localDescripcionOficinaGestoraTracker = false;

		public boolean isDescripcionOficinaGestoraSpecified() {
			return localDescripcionOficinaGestoraTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getDescripcionOficinaGestora() {
			return localDescripcionOficinaGestora;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param DescripcionOficinaGestora
		 */
		public void setDescripcionOficinaGestora(String param) {
			localDescripcionOficinaGestoraTracker = param != null;

			this.localDescripcionOficinaGestora = param;

		}

		/**
		 * field for DescripcionProfesion
		 */

		protected String localDescripcionProfesion;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localDescripcionProfesionTracker = false;

		public boolean isDescripcionProfesionSpecified() {
			return localDescripcionProfesionTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getDescripcionProfesion() {
			return localDescripcionProfesion;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param DescripcionProfesion
		 */
		public void setDescripcionProfesion(String param) {
			localDescripcionProfesionTracker = param != null;

			this.localDescripcionProfesion = param;

		}

		/**
		 * field for Exclusiones
		 */

		protected Exclusiones_type0 localExclusiones;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localExclusionesTracker = false;

		public boolean isExclusionesSpecified() {
			return localExclusionesTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return Exclusiones_type0
		 */
		public Exclusiones_type0 getExclusiones() {
			return localExclusiones;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Exclusiones
		 */
		public void setExclusiones(Exclusiones_type0 param) {
			localExclusionesTracker = param != null;

			this.localExclusiones = param;

		}

		/**
		 * field for FechaAntiguedad
		 */

		protected String localFechaAntiguedad;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localFechaAntiguedadTracker = false;

		public boolean isFechaAntiguedadSpecified() {
			return localFechaAntiguedadTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getFechaAntiguedad() {
			return localFechaAntiguedad;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param FechaAntiguedad
		 */
		public void setFechaAntiguedad(String param) {
			localFechaAntiguedadTracker = param != null;

			this.localFechaAntiguedad = param;

		}

		/**
		 * field for FechaBaja
		 */

		protected String localFechaBaja;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localFechaBajaTracker = false;

		public boolean isFechaBajaSpecified() {
			return localFechaBajaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getFechaBaja() {
			return localFechaBaja;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param FechaBaja
		 */
		public void setFechaBaja(String param) {
			localFechaBajaTracker = param != null;

			this.localFechaBaja = param;

		}

		/**
		 * field for FechaInactividad
		 */

		protected String localFechaInactividad;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localFechaInactividadTracker = false;

		public boolean isFechaInactividadSpecified() {
			return localFechaInactividadTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getFechaInactividad() {
			return localFechaInactividad;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param FechaInactividad
		 */
		public void setFechaInactividad(String param) {
			localFechaInactividadTracker = param != null;

			this.localFechaInactividad = param;

		}

		/**
		 * field for Garantias
		 */

		protected Garantias_type0 localGarantias;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localGarantiasTracker = false;

		public boolean isGarantiasSpecified() {
			return localGarantiasTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return Garantias_type0
		 */
		public Garantias_type0 getGarantias() {
			return localGarantias;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Garantias
		 */
		public void setGarantias(Garantias_type0 param) {
			localGarantiasTracker = param != null;

			this.localGarantias = param;

		}

		/**
		 * field for IndemnizacionDiaria
		 */

		protected java.math.BigDecimal localIndemnizacionDiaria;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localIndemnizacionDiariaTracker = false;

		public boolean isIndemnizacionDiariaSpecified() {
			return localIndemnizacionDiariaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.math.BigDecimal
		 */
		public java.math.BigDecimal getIndemnizacionDiaria() {
			return localIndemnizacionDiaria;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param IndemnizacionDiaria
		 */
		public void setIndemnizacionDiaria(java.math.BigDecimal param) {
			localIndemnizacionDiariaTracker = param != null;

			this.localIndemnizacionDiaria = param;

		}

		/**
		 * field for InfoCuentaBancaria
		 */

		protected InfoCuentaBancaria localInfoCuentaBancaria;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localInfoCuentaBancariaTracker = false;

		public boolean isInfoCuentaBancariaSpecified() {
			return localInfoCuentaBancariaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return InfoCuentaBancaria
		 */
		public InfoCuentaBancaria getInfoCuentaBancaria() {
			return localInfoCuentaBancaria;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param InfoCuentaBancaria
		 */
		public void setInfoCuentaBancaria(InfoCuentaBancaria param) {
			localInfoCuentaBancariaTracker = param != null;

			this.localInfoCuentaBancaria = param;

		}

		/**
		 * field for Intervinientes
		 */

		protected Intervinientes_type0 localIntervinientes;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localIntervinientesTracker = false;

		public boolean isIntervinientesSpecified() {
			return localIntervinientesTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return Intervinientes_type0
		 */
		public Intervinientes_type0 getIntervinientes() {
			return localIntervinientes;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Intervinientes
		 */
		public void setIntervinientes(Intervinientes_type0 param) {
			localIntervinientesTracker = param != null;

			this.localIntervinientes = param;

		}

		/**
		 * field for NombreProducto
		 */

		protected String localNombreProducto;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNombreProductoTracker = false;

		public boolean isNombreProductoSpecified() {
			return localNombreProductoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getNombreProducto() {
			return localNombreProducto;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param NombreProducto
		 */
		public void setNombreProducto(String param) {
			localNombreProductoTracker = param != null;

			this.localNombreProducto = param;

		}

		/**
		 * field for NumeroMutualista
		 */

		protected long localNumeroMutualista;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNumeroMutualistaTracker = false;

		public boolean isNumeroMutualistaSpecified() {
			return localNumeroMutualistaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return long
		 */
		public long getNumeroMutualista() {
			return localNumeroMutualista;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param NumeroMutualista
		 */
		public void setNumeroMutualista(long param) {

			// setting primitive attribute tracker to true
			localNumeroMutualistaTracker = param != Long.MIN_VALUE;

			this.localNumeroMutualista = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			String namespacePrefix = registerPrefix(xmlWriter,
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":poliza",
						xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "poliza", xmlWriter);
			}

			if (localCodigoCompaniaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoCompania", xmlWriter);

				if (localCodigoCompania == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("codigoCompania cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localCodigoCompania);

				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoPaisTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoPais", xmlWriter);

				if (localCodigoPais == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("codigoPais cannot be null!!");

				} else {

					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPais));

				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoRamoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoRamo", xmlWriter);

				if (localCodigoRamo == Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("codigoRamo cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoRamo));
				}

				xmlWriter.writeEndElement();
			}
			if (localDescripcionProductoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "descripcionProducto", xmlWriter);

				if (localDescripcionProducto == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("descripcionProducto cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localDescripcionProducto);

				}

				xmlWriter.writeEndElement();
			}
			if (localDescripcionRiesgoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "descripcionRiesgo", xmlWriter);

				if (localDescripcionRiesgo == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("descripcionRiesgo cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localDescripcionRiesgo);

				}

				xmlWriter.writeEndElement();
			}
			if (localDescripcionTomadorTracker) {
				namespace = "";
				writeStartElement(null, namespace, "descripcionTomador", xmlWriter);

				if (localDescripcionTomador == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("descripcionTomador cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localDescripcionTomador);

				}

				xmlWriter.writeEndElement();
			}
			if (localFechaEfectoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "fechaEfecto", xmlWriter);

				if (localFechaEfecto == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("fechaEfecto cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localFechaEfecto);

				}

				xmlWriter.writeEndElement();
			}
			if (localFechaVencimientoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "fechaVencimiento", xmlWriter);

				if (localFechaVencimiento == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("fechaVencimiento cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localFechaVencimiento);

				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroCertificadoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroCertificado", xmlWriter);

				if (localNumeroCertificado == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroCertificado cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroCertificado));
				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroPolizaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroPoliza", xmlWriter);

				if (localNumeroPoliza == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroPoliza cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroPoliza));
				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroSuplementoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroSuplemento", xmlWriter);

				if (localNumeroSuplemento == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroSuplemento cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroSuplemento));
				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoModalidadTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoModalidad", xmlWriter);

				if (localCodigoModalidad == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("codigoModalidad cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localCodigoModalidad);

				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoOficinaAbridoraTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoOficinaAbridora", xmlWriter);

				if (localCodigoOficinaAbridora == Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("codigoOficinaAbridora cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localCodigoOficinaAbridora));
				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoOficinaGestoraTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoOficinaGestora", xmlWriter);

				if (localCodigoOficinaGestora == Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("codigoOficinaGestora cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localCodigoOficinaGestora));
				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoProfesionTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoProfesion", xmlWriter);

				if (localCodigoProfesion == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("codigoProfesion cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localCodigoProfesion);

				}

				xmlWriter.writeEndElement();
			}
			if (localDescripcionModalidadTracker) {
				namespace = "";
				writeStartElement(null, namespace, "descripcionModalidad", xmlWriter);

				if (localDescripcionModalidad == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("descripcionModalidad cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localDescripcionModalidad);

				}

				xmlWriter.writeEndElement();
			}
			if (localDescripcionOficinaAbridoraTracker) {
				namespace = "";
				writeStartElement(null, namespace, "descripcionOficinaAbridora", xmlWriter);

				if (localDescripcionOficinaAbridora == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("descripcionOficinaAbridora cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localDescripcionOficinaAbridora);

				}

				xmlWriter.writeEndElement();
			}
			if (localDescripcionOficinaGestoraTracker) {
				namespace = "";
				writeStartElement(null, namespace, "descripcionOficinaGestora", xmlWriter);

				if (localDescripcionOficinaGestora == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("descripcionOficinaGestora cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localDescripcionOficinaGestora);

				}

				xmlWriter.writeEndElement();
			}
			if (localDescripcionProfesionTracker) {
				namespace = "";
				writeStartElement(null, namespace, "descripcionProfesion", xmlWriter);

				if (localDescripcionProfesion == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("descripcionProfesion cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localDescripcionProfesion);

				}

				xmlWriter.writeEndElement();
			}
			if (localExclusionesTracker) {
				if (localExclusiones == null) {
					throw new org.apache.axis2.databinding.ADBException("exclusiones cannot be null!!");
				}
				localExclusiones.serialize(new javax.xml.namespace.QName("", "exclusiones"), xmlWriter);
			}
			if (localFechaAntiguedadTracker) {
				namespace = "";
				writeStartElement(null, namespace, "fechaAntiguedad", xmlWriter);

				if (localFechaAntiguedad == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("fechaAntiguedad cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localFechaAntiguedad);

				}

				xmlWriter.writeEndElement();
			}
			if (localFechaBajaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "fechaBaja", xmlWriter);

				if (localFechaBaja == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("fechaBaja cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localFechaBaja);

				}

				xmlWriter.writeEndElement();
			}
			if (localFechaInactividadTracker) {
				namespace = "";
				writeStartElement(null, namespace, "fechaInactividad", xmlWriter);

				if (localFechaInactividad == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("fechaInactividad cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localFechaInactividad);

				}

				xmlWriter.writeEndElement();
			}
			if (localGarantiasTracker) {
				if (localGarantias == null) {
					throw new org.apache.axis2.databinding.ADBException("garantias cannot be null!!");
				}
				localGarantias.serialize(new javax.xml.namespace.QName("", "garantias"), xmlWriter);
			}
			if (localIndemnizacionDiariaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "indemnizacionDiaria", xmlWriter);

				if (localIndemnizacionDiaria == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("indemnizacionDiaria cannot be null!!");

				} else {

					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIndemnizacionDiaria));

				}

				xmlWriter.writeEndElement();
			}
			if (localInfoCuentaBancariaTracker) {
				if (localInfoCuentaBancaria == null) {
					throw new org.apache.axis2.databinding.ADBException("infoCuentaBancaria cannot be null!!");
				}
				localInfoCuentaBancaria.serialize(new javax.xml.namespace.QName("", "infoCuentaBancaria"), xmlWriter);
			}
			if (localIntervinientesTracker) {
				if (localIntervinientes == null) {
					throw new org.apache.axis2.databinding.ADBException("intervinientes cannot be null!!");
				}
				localIntervinientes.serialize(new javax.xml.namespace.QName("", "intervinientes"), xmlWriter);
			}
			if (localNombreProductoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "nombreProducto", xmlWriter);

				if (localNombreProducto == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("nombreProducto cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localNombreProducto);

				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroMutualistaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroMutualista", xmlWriter);

				if (localNumeroMutualista == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroMutualista cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroMutualista));
				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
			attribList.add(new javax.xml.namespace.QName(
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "poliza"));
			if (localCodigoCompaniaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoCompania"));

				if (localCodigoCompania != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoCompania));
				} else {
					throw new org.apache.axis2.databinding.ADBException("codigoCompania cannot be null!!");
				}
			}
			if (localCodigoPaisTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoPais"));

				if (localCodigoPais != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPais));
				} else {
					throw new org.apache.axis2.databinding.ADBException("codigoPais cannot be null!!");
				}
			}
			if (localCodigoRamoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoRamo"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoRamo));
			}
			if (localDescripcionProductoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "descripcionProducto"));

				if (localDescripcionProducto != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescripcionProducto));
				} else {
					throw new org.apache.axis2.databinding.ADBException("descripcionProducto cannot be null!!");
				}
			}
			if (localDescripcionRiesgoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "descripcionRiesgo"));

				if (localDescripcionRiesgo != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescripcionRiesgo));
				} else {
					throw new org.apache.axis2.databinding.ADBException("descripcionRiesgo cannot be null!!");
				}
			}
			if (localDescripcionTomadorTracker) {
				elementList.add(new javax.xml.namespace.QName("", "descripcionTomador"));

				if (localDescripcionTomador != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescripcionTomador));
				} else {
					throw new org.apache.axis2.databinding.ADBException("descripcionTomador cannot be null!!");
				}
			}
			if (localFechaEfectoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "fechaEfecto"));

				if (localFechaEfecto != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaEfecto));
				} else {
					throw new org.apache.axis2.databinding.ADBException("fechaEfecto cannot be null!!");
				}
			}
			if (localFechaVencimientoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "fechaVencimiento"));

				if (localFechaVencimiento != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaVencimiento));
				} else {
					throw new org.apache.axis2.databinding.ADBException("fechaVencimiento cannot be null!!");
				}
			}
			if (localNumeroCertificadoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroCertificado"));

				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroCertificado));
			}
			if (localNumeroPolizaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroPoliza"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroPoliza));
			}
			if (localNumeroSuplementoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroSuplemento"));

				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroSuplemento));
			}
			if (localCodigoModalidadTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoModalidad"));

				if (localCodigoModalidad != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoModalidad));
				} else {
					throw new org.apache.axis2.databinding.ADBException("codigoModalidad cannot be null!!");
				}
			}
			if (localCodigoOficinaAbridoraTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoOficinaAbridora"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoOficinaAbridora));
			}
			if (localCodigoOficinaGestoraTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoOficinaGestora"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoOficinaGestora));
			}
			if (localCodigoProfesionTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoProfesion"));

				if (localCodigoProfesion != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoProfesion));
				} else {
					throw new org.apache.axis2.databinding.ADBException("codigoProfesion cannot be null!!");
				}
			}
			if (localDescripcionModalidadTracker) {
				elementList.add(new javax.xml.namespace.QName("", "descripcionModalidad"));

				if (localDescripcionModalidad != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localDescripcionModalidad));
				} else {
					throw new org.apache.axis2.databinding.ADBException("descripcionModalidad cannot be null!!");
				}
			}
			if (localDescripcionOficinaAbridoraTracker) {
				elementList.add(new javax.xml.namespace.QName("", "descripcionOficinaAbridora"));

				if (localDescripcionOficinaAbridora != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localDescripcionOficinaAbridora));
				} else {
					throw new org.apache.axis2.databinding.ADBException("descripcionOficinaAbridora cannot be null!!");
				}
			}
			if (localDescripcionOficinaGestoraTracker) {
				elementList.add(new javax.xml.namespace.QName("", "descripcionOficinaGestora"));

				if (localDescripcionOficinaGestora != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localDescripcionOficinaGestora));
				} else {
					throw new org.apache.axis2.databinding.ADBException("descripcionOficinaGestora cannot be null!!");
				}
			}
			if (localDescripcionProfesionTracker) {
				elementList.add(new javax.xml.namespace.QName("", "descripcionProfesion"));

				if (localDescripcionProfesion != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localDescripcionProfesion));
				} else {
					throw new org.apache.axis2.databinding.ADBException("descripcionProfesion cannot be null!!");
				}
			}
			if (localExclusionesTracker) {
				elementList.add(new javax.xml.namespace.QName("", "exclusiones"));

				if (localExclusiones == null) {
					throw new org.apache.axis2.databinding.ADBException("exclusiones cannot be null!!");
				}
				elementList.add(localExclusiones);
			}
			if (localFechaAntiguedadTracker) {
				elementList.add(new javax.xml.namespace.QName("", "fechaAntiguedad"));

				if (localFechaAntiguedad != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaAntiguedad));
				} else {
					throw new org.apache.axis2.databinding.ADBException("fechaAntiguedad cannot be null!!");
				}
			}
			if (localFechaBajaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "fechaBaja"));

				if (localFechaBaja != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaBaja));
				} else {
					throw new org.apache.axis2.databinding.ADBException("fechaBaja cannot be null!!");
				}
			}
			if (localFechaInactividadTracker) {
				elementList.add(new javax.xml.namespace.QName("", "fechaInactividad"));

				if (localFechaInactividad != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaInactividad));
				} else {
					throw new org.apache.axis2.databinding.ADBException("fechaInactividad cannot be null!!");
				}
			}
			if (localGarantiasTracker) {
				elementList.add(new javax.xml.namespace.QName("", "garantias"));

				if (localGarantias == null) {
					throw new org.apache.axis2.databinding.ADBException("garantias cannot be null!!");
				}
				elementList.add(localGarantias);
			}
			if (localIndemnizacionDiariaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "indemnizacionDiaria"));

				if (localIndemnizacionDiaria != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIndemnizacionDiaria));
				} else {
					throw new org.apache.axis2.databinding.ADBException("indemnizacionDiaria cannot be null!!");
				}
			}
			if (localInfoCuentaBancariaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "infoCuentaBancaria"));

				if (localInfoCuentaBancaria == null) {
					throw new org.apache.axis2.databinding.ADBException("infoCuentaBancaria cannot be null!!");
				}
				elementList.add(localInfoCuentaBancaria);
			}
			if (localIntervinientesTracker) {
				elementList.add(new javax.xml.namespace.QName("", "intervinientes"));

				if (localIntervinientes == null) {
					throw new org.apache.axis2.databinding.ADBException("intervinientes cannot be null!!");
				}
				elementList.add(localIntervinientes);
			}
			if (localNombreProductoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "nombreProducto"));

				if (localNombreProducto != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNombreProducto));
				} else {
					throw new org.apache.axis2.databinding.ADBException("nombreProducto cannot be null!!");
				}
			}
			if (localNumeroMutualistaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroMutualista"));

				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroMutualista));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static Poliza parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				Poliza object = new Poliza();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"poliza".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Poliza) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoCompania").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoCompania" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoCompania(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoPais").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoPais" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoPais(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoRamo").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoRamo" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoRamo(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setCodigoRamo(Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "descripcionProducto").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "descripcionProducto" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setDescripcionProducto(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "descripcionRiesgo").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "descripcionRiesgo" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setDescripcionRiesgo(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "descripcionTomador").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "descripcionTomador" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setDescripcionTomador(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "fechaEfecto").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "fechaEfecto" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setFechaEfecto(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "fechaVencimiento").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "fechaVencimiento" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setFechaVencimiento(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroCertificado").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroCertificado" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroCertificado(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroCertificado(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroPoliza").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroPoliza" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroPoliza(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroPoliza(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroSuplemento").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroSuplemento" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroSuplemento(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroSuplemento(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoModalidad").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoModalidad" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoModalidad(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoOficinaAbridora").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoOficinaAbridora" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoOficinaAbridora(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setCodigoOficinaAbridora(Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoOficinaGestora").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoOficinaGestora" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoOficinaGestora(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setCodigoOficinaGestora(Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoProfesion").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoProfesion" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoProfesion(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "descripcionModalidad").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "descripcionModalidad" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setDescripcionModalidad(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("", "descripcionOficinaAbridora")
							.equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "descripcionOficinaAbridora" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setDescripcionOficinaAbridora(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("", "descripcionOficinaGestora")
							.equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "descripcionOficinaGestora" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setDescripcionOficinaGestora(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "descripcionProfesion").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "descripcionProfesion" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setDescripcionProfesion(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "exclusiones").equals(reader.getName())) {

						object.setExclusiones(Exclusiones_type0.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "fechaAntiguedad").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "fechaAntiguedad" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setFechaAntiguedad(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "fechaBaja").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "fechaBaja" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setFechaBaja(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "fechaInactividad").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "fechaInactividad" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setFechaInactividad(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "garantias").equals(reader.getName())) {

						object.setGarantias(Garantias_type0.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "indemnizacionDiaria").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "indemnizacionDiaria" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setIndemnizacionDiaria(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "infoCuentaBancaria").equals(reader.getName())) {

						object.setInfoCuentaBancaria(InfoCuentaBancaria.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "intervinientes").equals(reader.getName())) {

						object.setIntervinientes(Intervinientes_type0.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "nombreProducto").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "nombreProducto" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNombreProducto(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroMutualista").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroMutualista" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroMutualista(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroMutualista(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetDetallePolizaResponseE implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "getDetallePolizaResponse",
				"ns1");

		/**
		 * field for GetDetallePolizaResponse
		 */

		protected GetDetallePolizaResponse localGetDetallePolizaResponse;

		/**
		 * Auto generated getter method
		 * 
		 * @return GetDetallePolizaResponse
		 */
		public GetDetallePolizaResponse getGetDetallePolizaResponse() {
			return localGetDetallePolizaResponse;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param GetDetallePolizaResponse
		 */
		public void setGetDetallePolizaResponse(GetDetallePolizaResponse param) {

			this.localGetDetallePolizaResponse = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it

			if (localGetDetallePolizaResponse == null) {
				throw new org.apache.axis2.databinding.ADBException("getDetallePolizaResponse cannot be null!");
			}
			localGetDetallePolizaResponse.serialize(MY_QNAME, xmlWriter);

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it
			return localGetDetallePolizaResponse.getPullParser(MY_QNAME);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static GetDetallePolizaResponseE parse(javax.xml.stream.XMLStreamReader reader)
					throws Exception {
				GetDetallePolizaResponseE object = new GetDetallePolizaResponseE();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement()) {

							if (reader.isStartElement() && new javax.xml.namespace.QName(
									"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/",
									"getDetallePolizaResponse").equals(reader.getName())) {

								object.setGetDetallePolizaResponse(GetDetallePolizaResponse.Factory.parse(reader));

							} // End of if for expected property start element

							else {
								// A start element we are not expecting indicates an invalid parameter was
								// passed
								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement " + reader.getName());
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Interviniente extends IntervinienteSimple implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * interviniente Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for Direccion
		 */

		protected Direccion localDireccion;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localDireccionTracker = false;

		public boolean isDireccionSpecified() {
			return localDireccionTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return Direccion
		 */
		public Direccion getDireccion() {
			return localDireccion;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Direccion
		 */
		public void setDireccion(Direccion param) {
			localDireccionTracker = param != null;

			this.localDireccion = param;

		}

		/**
		 * field for EstadoCivil
		 */

		protected EstadoCivil localEstadoCivil;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localEstadoCivilTracker = false;

		public boolean isEstadoCivilSpecified() {
			return localEstadoCivilTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return EstadoCivil
		 */
		public EstadoCivil getEstadoCivil() {
			return localEstadoCivil;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param EstadoCivil
		 */
		public void setEstadoCivil(EstadoCivil param) {
			localEstadoCivilTracker = param != null;

			this.localEstadoCivil = param;

		}

		/**
		 * field for FechaNacimiento
		 */

		protected String localFechaNacimiento;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localFechaNacimientoTracker = false;

		public boolean isFechaNacimientoSpecified() {
			return localFechaNacimientoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getFechaNacimiento() {
			return localFechaNacimiento;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param FechaNacimiento
		 */
		public void setFechaNacimiento(String param) {
			localFechaNacimientoTracker = param != null;

			this.localFechaNacimiento = param;

		}

		/**
		 * field for Genero
		 */

		protected Genero localGenero;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localGeneroTracker = false;

		public boolean isGeneroSpecified() {
			return localGeneroTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return Genero
		 */
		public Genero getGenero() {
			return localGenero;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Genero
		 */
		public void setGenero(Genero param) {
			localGeneroTracker = param != null;

			this.localGenero = param;

		}

		/**
		 * field for InfoContacto
		 */

		protected InfoContacto localInfoContacto;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localInfoContactoTracker = false;

		public boolean isInfoContactoSpecified() {
			return localInfoContactoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return InfoContacto
		 */
		public InfoContacto getInfoContacto() {
			return localInfoContacto;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param InfoContacto
		 */
		public void setInfoContacto(InfoContacto param) {
			localInfoContactoTracker = param != null;

			this.localInfoContacto = param;

		}

		/**
		 * field for Tipo
		 */

		protected TipoInterviniente localTipo;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localTipoTracker = false;

		public boolean isTipoSpecified() {
			return localTipoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return TipoInterviniente
		 */
		public TipoInterviniente getTipo() {
			return localTipo;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Tipo
		 */
		public void setTipo(TipoInterviniente param) {
			localTipoTracker = param != null;

			this.localTipo = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			String namespacePrefix = registerPrefix(xmlWriter,
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":interviniente", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "interviniente", xmlWriter);
			}

			if (localApellidosTracker) {
				namespace = "";
				writeStartElement(null, namespace, "apellidos", xmlWriter);

				if (localApellidos == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("apellidos cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localApellidos);

				}

				xmlWriter.writeEndElement();
			}
			if (localNombreTracker) {
				namespace = "";
				writeStartElement(null, namespace, "nombre", xmlWriter);

				if (localNombre == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("nombre cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localNombre);

				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroCertificadoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroCertificado", xmlWriter);

				if (localNumeroCertificado == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroCertificado cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroCertificado));
				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroDocumentoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroDocumento", xmlWriter);

				if (localNumeroDocumento == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("numeroDocumento cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localNumeroDocumento);

				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroMutualistaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroMutualista", xmlWriter);

				if (localNumeroMutualista == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroMutualista cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroMutualista));
				}

				xmlWriter.writeEndElement();
			}
			if (localTipoDocumentoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "tipoDocumento", xmlWriter);

				if (localTipoDocumento == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("tipoDocumento cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localTipoDocumento);

				}

				xmlWriter.writeEndElement();
			}
			if (localDireccionTracker) {
				if (localDireccion == null) {
					throw new org.apache.axis2.databinding.ADBException("direccion cannot be null!!");
				}
				localDireccion.serialize(new javax.xml.namespace.QName("", "direccion"), xmlWriter);
			}
			if (localEstadoCivilTracker) {
				if (localEstadoCivil == null) {
					throw new org.apache.axis2.databinding.ADBException("estadoCivil cannot be null!!");
				}
				localEstadoCivil.serialize(new javax.xml.namespace.QName("", "estadoCivil"), xmlWriter);
			}
			if (localFechaNacimientoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "fechaNacimiento", xmlWriter);

				if (localFechaNacimiento == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("fechaNacimiento cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localFechaNacimiento);

				}

				xmlWriter.writeEndElement();
			}
			if (localGeneroTracker) {
				if (localGenero == null) {
					throw new org.apache.axis2.databinding.ADBException("genero cannot be null!!");
				}
				localGenero.serialize(new javax.xml.namespace.QName("", "genero"), xmlWriter);
			}
			if (localInfoContactoTracker) {
				if (localInfoContacto == null) {
					throw new org.apache.axis2.databinding.ADBException("infoContacto cannot be null!!");
				}
				localInfoContacto.serialize(new javax.xml.namespace.QName("", "infoContacto"), xmlWriter);
			}
			if (localTipoTracker) {
				if (localTipo == null) {
					throw new org.apache.axis2.databinding.ADBException("tipo cannot be null!!");
				}
				localTipo.serialize(new javax.xml.namespace.QName("", "tipo"), xmlWriter);
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
			attribList.add(new javax.xml.namespace.QName(
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "interviniente"));
			if (localApellidosTracker) {
				elementList.add(new javax.xml.namespace.QName("", "apellidos"));

				if (localApellidos != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApellidos));
				} else {
					throw new org.apache.axis2.databinding.ADBException("apellidos cannot be null!!");
				}
			}
			if (localNombreTracker) {
				elementList.add(new javax.xml.namespace.QName("", "nombre"));

				if (localNombre != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNombre));
				} else {
					throw new org.apache.axis2.databinding.ADBException("nombre cannot be null!!");
				}
			}
			if (localNumeroCertificadoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroCertificado"));

				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroCertificado));
			}
			if (localNumeroDocumentoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroDocumento"));

				if (localNumeroDocumento != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroDocumento));
				} else {
					throw new org.apache.axis2.databinding.ADBException("numeroDocumento cannot be null!!");
				}
			}
			if (localNumeroMutualistaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroMutualista"));

				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroMutualista));
			}
			if (localTipoDocumentoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "tipoDocumento"));

				if (localTipoDocumento != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipoDocumento));
				} else {
					throw new org.apache.axis2.databinding.ADBException("tipoDocumento cannot be null!!");
				}
			}
			if (localDireccionTracker) {
				elementList.add(new javax.xml.namespace.QName("", "direccion"));

				if (localDireccion == null) {
					throw new org.apache.axis2.databinding.ADBException("direccion cannot be null!!");
				}
				elementList.add(localDireccion);
			}
			if (localEstadoCivilTracker) {
				elementList.add(new javax.xml.namespace.QName("", "estadoCivil"));

				if (localEstadoCivil == null) {
					throw new org.apache.axis2.databinding.ADBException("estadoCivil cannot be null!!");
				}
				elementList.add(localEstadoCivil);
			}
			if (localFechaNacimientoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "fechaNacimiento"));

				if (localFechaNacimiento != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaNacimiento));
				} else {
					throw new org.apache.axis2.databinding.ADBException("fechaNacimiento cannot be null!!");
				}
			}
			if (localGeneroTracker) {
				elementList.add(new javax.xml.namespace.QName("", "genero"));

				if (localGenero == null) {
					throw new org.apache.axis2.databinding.ADBException("genero cannot be null!!");
				}
				elementList.add(localGenero);
			}
			if (localInfoContactoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "infoContacto"));

				if (localInfoContacto == null) {
					throw new org.apache.axis2.databinding.ADBException("infoContacto cannot be null!!");
				}
				elementList.add(localInfoContacto);
			}
			if (localTipoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "tipo"));

				if (localTipo == null) {
					throw new org.apache.axis2.databinding.ADBException("tipo cannot be null!!");
				}
				elementList.add(localTipo);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static Interviniente parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				Interviniente object = new Interviniente();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"interviniente".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Interviniente) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "apellidos").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "apellidos" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setApellidos(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "nombre").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "nombre" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNombre(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroCertificado").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroCertificado" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroCertificado(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroCertificado(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroDocumento").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroDocumento" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroDocumento(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroMutualista").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroMutualista" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroMutualista(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroMutualista(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "tipoDocumento").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "tipoDocumento" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setTipoDocumento(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "direccion").equals(reader.getName())) {

						object.setDireccion(Direccion.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "estadoCivil").equals(reader.getName())) {

						object.setEstadoCivil(EstadoCivil.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "fechaNacimiento").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "fechaNacimiento" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setFechaNacimiento(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "genero").equals(reader.getName())) {

						object.setGenero(Genero.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "infoContacto").equals(reader.getName())) {

						object.setInfoContacto(InfoContacto.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("", "tipo").equals(reader.getName())) {

						object.setTipo(TipoInterviniente.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetDetallePolizaResponse implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * getDetallePolizaResponse Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for _return
		 */

		protected RespuestaAuditada local_return;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean local_returnTracker = false;

		public boolean is_returnSpecified() {
			return local_returnTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return RespuestaAuditada
		 */
		public RespuestaAuditada get_return() {
			return local_return;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param _return
		 */
		public void set_return(RespuestaAuditada param) {
			local_returnTracker = param != null;

			this.local_return = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":getDetallePolizaResponse", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							"getDetallePolizaResponse", xmlWriter);
				}

			}
			if (local_returnTracker) {
				if (local_return == null) {
					throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
				}
				local_return.serialize(new javax.xml.namespace.QName("", "return"), xmlWriter);
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker) {
				elementList.add(new javax.xml.namespace.QName("", "return"));

				if (local_return == null) {
					throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
				}
				elementList.add(local_return);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static GetDetallePolizaResponse parse(javax.xml.stream.XMLStreamReader reader)
					throws Exception {
				GetDetallePolizaResponse object = new GetDetallePolizaResponse();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"getDetallePolizaResponse".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetDetallePolizaResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "return").equals(reader.getName())) {

						object.set_return(RespuestaAuditada.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class ExtensionMapper {

		public static Object getTypeObject(String namespaceURI, String typeName,
				javax.xml.stream.XMLStreamReader reader) throws Exception {

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "poliza".equals(typeName)) {

				return Poliza.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "garantia".equals(typeName)) {

				return Garantia.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "listadoPolizas_type0".equals(typeName)) {

				return ListadoPolizas_type0.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "exclusion".equals(typeName)) {

				return Exclusion.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "getDetallePolizaResponse".equals(typeName)) {

				return GetDetallePolizaResponse.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "infoContacto".equals(typeName)) {

				return InfoContacto.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "peticionDetalle".equals(typeName)) {

				return PeticionDetalle.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "getPolizasNoVigentesResponse".equals(typeName)) {

				return GetPolizasNoVigentesResponse.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "infoCuentaBancaria".equals(typeName)) {

				return InfoCuentaBancaria.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "resultadoOperacionDetalle".equals(typeName)) {

				return ResultadoOperacionDetalle.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "getDetallePoliza".equals(typeName)) {

				return GetDetallePoliza.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "genero".equals(typeName)) {

				return Genero.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "peticionNoVigentes".equals(typeName)) {

				return PeticionNoVigentes.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "resultadoOperacion".equals(typeName)) {

				return ResultadoOperacion.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "getPolizasResponse".equals(typeName)) {

				return GetPolizasResponse.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "peticion".equals(typeName)) {

				return Peticion.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "getPolizas".equals(typeName)) {

				return GetPolizas.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "garantias_type0".equals(typeName)) {

				return Garantias_type0.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "polizaSimple".equals(typeName)) {

				return PolizaSimple.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "estadoCivil".equals(typeName)) {

				return EstadoCivil.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "direccion".equals(typeName)) {

				return Direccion.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "interviniente".equals(typeName)) {

				return Interviniente.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "peticionConsulta".equals(typeName)) {

				return PeticionConsulta.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "respuestaConsulta".equals(typeName)) {

				return RespuestaConsulta.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "procedimientoTramitacion".equals(typeName)) {

				return ProcedimientoTramitacion.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "respuestaAuditada".equals(typeName)) {

				return RespuestaAuditada.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "mensajes_type0".equals(typeName)) {

				return Mensajes_type0.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "mensaje".equals(typeName)) {

				return Mensaje.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "tipoResultado".equals(typeName)) {

				return TipoResultado.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "respuesta".equals(typeName)) {

				return Respuesta.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "resultadoOperacionConsulta".equals(typeName)) {

				return ResultadoOperacionConsulta.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "intervinienteSimple".equals(typeName)) {

				return IntervinienteSimple.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "exclusiones_type0".equals(typeName)) {

				return Exclusiones_type0.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "intervinientes_type0".equals(typeName)) {

				return Intervinientes_type0.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "tipoInterviniente".equals(typeName)) {

				return TipoInterviniente.Factory.parse(reader);

			}

			if ("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/".equals(namespaceURI)
					&& "getPolizasNoVigentes".equals(typeName)) {

				return GetPolizasNoVigentes.Factory.parse(reader);

			}

			throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
		}

	}

	public static class ResultadoOperacionDetalle extends ResultadoOperacion
			implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * resultadoOperacionDetalle Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for DetallePoliza
		 */

		protected Poliza localDetallePoliza;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localDetallePolizaTracker = false;

		public boolean isDetallePolizaSpecified() {
			return localDetallePolizaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return Poliza
		 */
		public Poliza getDetallePoliza() {
			return localDetallePoliza;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param DetallePoliza
		 */
		public void setDetallePoliza(Poliza param) {
			localDetallePolizaTracker = param != null;

			this.localDetallePoliza = param;

		}

		/**
		 * field for ProcedimientoTramitacion
		 */

		protected ProcedimientoTramitacion localProcedimientoTramitacion;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localProcedimientoTramitacionTracker = false;

		public boolean isProcedimientoTramitacionSpecified() {
			return localProcedimientoTramitacionTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return ProcedimientoTramitacion
		 */
		public ProcedimientoTramitacion getProcedimientoTramitacion() {
			return localProcedimientoTramitacion;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param ProcedimientoTramitacion
		 */
		public void setProcedimientoTramitacion(ProcedimientoTramitacion param) {
			localProcedimientoTramitacionTracker = param != null;

			this.localProcedimientoTramitacion = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			String namespacePrefix = registerPrefix(xmlWriter,
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":resultadoOperacionDetalle", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "resultadoOperacionDetalle",
						xmlWriter);
			}

			if (localMensajesTracker) {
				if (localMensajes == null) {
					throw new org.apache.axis2.databinding.ADBException("mensajes cannot be null!!");
				}
				localMensajes.serialize(new javax.xml.namespace.QName("", "mensajes"), xmlWriter);
			}
			if (localResultadoTracker) {
				if (localResultado == null) {
					throw new org.apache.axis2.databinding.ADBException("resultado cannot be null!!");
				}
				localResultado.serialize(new javax.xml.namespace.QName("", "resultado"), xmlWriter);
			}
			if (localDetallePolizaTracker) {
				if (localDetallePoliza == null) {
					throw new org.apache.axis2.databinding.ADBException("detallePoliza cannot be null!!");
				}
				localDetallePoliza.serialize(new javax.xml.namespace.QName("", "detallePoliza"), xmlWriter);
			}
			if (localProcedimientoTramitacionTracker) {
				if (localProcedimientoTramitacion == null) {
					throw new org.apache.axis2.databinding.ADBException("procedimientoTramitacion cannot be null!!");
				}
				localProcedimientoTramitacion.serialize(new javax.xml.namespace.QName("", "procedimientoTramitacion"),
						xmlWriter);
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
			attribList.add(new javax.xml.namespace.QName(
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/",
					"resultadoOperacionDetalle"));
			if (localMensajesTracker) {
				elementList.add(new javax.xml.namespace.QName("", "mensajes"));

				if (localMensajes == null) {
					throw new org.apache.axis2.databinding.ADBException("mensajes cannot be null!!");
				}
				elementList.add(localMensajes);
			}
			if (localResultadoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "resultado"));

				if (localResultado == null) {
					throw new org.apache.axis2.databinding.ADBException("resultado cannot be null!!");
				}
				elementList.add(localResultado);
			}
			if (localDetallePolizaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "detallePoliza"));

				if (localDetallePoliza == null) {
					throw new org.apache.axis2.databinding.ADBException("detallePoliza cannot be null!!");
				}
				elementList.add(localDetallePoliza);
			}
			if (localProcedimientoTramitacionTracker) {
				elementList.add(new javax.xml.namespace.QName("", "procedimientoTramitacion"));

				if (localProcedimientoTramitacion == null) {
					throw new org.apache.axis2.databinding.ADBException("procedimientoTramitacion cannot be null!!");
				}
				elementList.add(localProcedimientoTramitacion);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static ResultadoOperacionDetalle parse(javax.xml.stream.XMLStreamReader reader)
					throws Exception {
				ResultadoOperacionDetalle object = new ResultadoOperacionDetalle();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"resultadoOperacionDetalle".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (ResultadoOperacionDetalle) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "mensajes").equals(reader.getName())) {

						object.setMensajes(Mensajes_type0.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "resultado").equals(reader.getName())) {

						object.setResultado(TipoResultado.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "detallePoliza").equals(reader.getName())) {

						object.setDetallePoliza(Poliza.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "procedimientoTramitacion").equals(reader.getName())) {

						object.setProcedimientoTramitacion(ProcedimientoTramitacion.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetPolizasResponse implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * getPolizasResponse Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for _return
		 */

		protected RespuestaConsulta local_return;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean local_returnTracker = false;

		public boolean is_returnSpecified() {
			return local_returnTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return RespuestaConsulta
		 */
		public RespuestaConsulta get_return() {
			return local_return;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param _return
		 */
		public void set_return(RespuestaConsulta param) {
			local_returnTracker = param != null;

			this.local_return = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":getPolizasResponse", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getPolizasResponse",
							xmlWriter);
				}

			}
			if (local_returnTracker) {
				if (local_return == null) {
					throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
				}
				local_return.serialize(new javax.xml.namespace.QName("", "return"), xmlWriter);
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (local_returnTracker) {
				elementList.add(new javax.xml.namespace.QName("", "return"));

				if (local_return == null) {
					throw new org.apache.axis2.databinding.ADBException("return cannot be null!!");
				}
				elementList.add(local_return);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static GetPolizasResponse parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				GetPolizasResponse object = new GetPolizasResponse();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"getPolizasResponse".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetPolizasResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "return").equals(reader.getName())) {

						object.set_return(RespuestaConsulta.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetDetallePolizaE implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "getDetallePoliza", "ns1");

		/**
		 * field for GetDetallePoliza
		 */

		protected GetDetallePoliza localGetDetallePoliza;

		/**
		 * Auto generated getter method
		 * 
		 * @return GetDetallePoliza
		 */
		public GetDetallePoliza getGetDetallePoliza() {
			return localGetDetallePoliza;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param GetDetallePoliza
		 */
		public void setGetDetallePoliza(GetDetallePoliza param) {

			this.localGetDetallePoliza = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it

			if (localGetDetallePoliza == null) {
				throw new org.apache.axis2.databinding.ADBException("getDetallePoliza cannot be null!");
			}
			localGetDetallePoliza.serialize(MY_QNAME, xmlWriter);

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it
			return localGetDetallePoliza.getPullParser(MY_QNAME);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static GetDetallePolizaE parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				GetDetallePolizaE object = new GetDetallePolizaE();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement()) {

							if (reader.isStartElement() && new javax.xml.namespace.QName(
									"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/",
									"getDetallePoliza").equals(reader.getName())) {

								object.setGetDetallePoliza(GetDetallePoliza.Factory.parse(reader));

							} // End of if for expected property start element

							else {
								// A start element we are not expecting indicates an invalid parameter was
								// passed
								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement " + reader.getName());
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetPolizasNoVigentesE implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "getPolizasNoVigentes", "ns1");

		/**
		 * field for GetPolizasNoVigentes
		 */

		protected GetPolizasNoVigentes localGetPolizasNoVigentes;

		/**
		 * Auto generated getter method
		 * 
		 * @return GetPolizasNoVigentes
		 */
		public GetPolizasNoVigentes getGetPolizasNoVigentes() {
			return localGetPolizasNoVigentes;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param GetPolizasNoVigentes
		 */
		public void setGetPolizasNoVigentes(GetPolizasNoVigentes param) {

			this.localGetPolizasNoVigentes = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it

			if (localGetPolizasNoVigentes == null) {
				throw new org.apache.axis2.databinding.ADBException("getPolizasNoVigentes cannot be null!");
			}
			localGetPolizasNoVigentes.serialize(MY_QNAME, xmlWriter);

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it
			return localGetPolizasNoVigentes.getPullParser(MY_QNAME);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static GetPolizasNoVigentesE parse(javax.xml.stream.XMLStreamReader reader)
					throws Exception {
				GetPolizasNoVigentesE object = new GetPolizasNoVigentesE();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement()) {

							if (reader.isStartElement() && new javax.xml.namespace.QName(
									"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/",
									"getPolizasNoVigentes").equals(reader.getName())) {

								object.setGetPolizasNoVigentes(GetPolizasNoVigentes.Factory.parse(reader));

							} // End of if for expected property start element

							else {
								// A start element we are not expecting indicates an invalid parameter was
								// passed
								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement " + reader.getName());
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class InfoCuentaBancaria implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * infoCuentaBancaria Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for Iban
		 */

		protected String localIban;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localIbanTracker = false;

		public boolean isIbanSpecified() {
			return localIbanTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getIban() {
			return localIban;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Iban
		 */
		public void setIban(String param) {
			localIbanTracker = param != null;

			this.localIban = param;

		}

		/**
		 * field for NumeroCuenta
		 */

		protected String localNumeroCuenta;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNumeroCuentaTracker = false;

		public boolean isNumeroCuentaSpecified() {
			return localNumeroCuentaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getNumeroCuenta() {
			return localNumeroCuenta;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param NumeroCuenta
		 */
		public void setNumeroCuenta(String param) {
			localNumeroCuentaTracker = param != null;

			this.localNumeroCuenta = param;

		}

		/**
		 * field for TitularCuenta
		 */

		protected String localTitularCuenta;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localTitularCuentaTracker = false;

		public boolean isTitularCuentaSpecified() {
			return localTitularCuentaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getTitularCuenta() {
			return localTitularCuenta;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param TitularCuenta
		 */
		public void setTitularCuenta(String param) {
			localTitularCuentaTracker = param != null;

			this.localTitularCuenta = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":infoCuentaBancaria", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "infoCuentaBancaria",
							xmlWriter);
				}

			}
			if (localIbanTracker) {
				namespace = "";
				writeStartElement(null, namespace, "iban", xmlWriter);

				if (localIban == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("iban cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localIban);

				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroCuentaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroCuenta", xmlWriter);

				if (localNumeroCuenta == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("numeroCuenta cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localNumeroCuenta);

				}

				xmlWriter.writeEndElement();
			}
			if (localTitularCuentaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "titularCuenta", xmlWriter);

				if (localTitularCuenta == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("titularCuenta cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localTitularCuenta);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localIbanTracker) {
				elementList.add(new javax.xml.namespace.QName("", "iban"));

				if (localIban != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIban));
				} else {
					throw new org.apache.axis2.databinding.ADBException("iban cannot be null!!");
				}
			}
			if (localNumeroCuentaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroCuenta"));

				if (localNumeroCuenta != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroCuenta));
				} else {
					throw new org.apache.axis2.databinding.ADBException("numeroCuenta cannot be null!!");
				}
			}
			if (localTitularCuentaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "titularCuenta"));

				if (localTitularCuenta != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTitularCuenta));
				} else {
					throw new org.apache.axis2.databinding.ADBException("titularCuenta cannot be null!!");
				}
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static InfoCuentaBancaria parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				InfoCuentaBancaria object = new InfoCuentaBancaria();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"infoCuentaBancaria".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (InfoCuentaBancaria) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("", "iban").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "iban" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setIban(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroCuenta").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroCuenta" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroCuenta(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "titularCuenta").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "titularCuenta" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setTitularCuenta(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Mensaje implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name = mensaje
		 * Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for CodigoMensaje
		 */

		protected String localCodigoMensaje;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCodigoMensajeTracker = false;

		public boolean isCodigoMensajeSpecified() {
			return localCodigoMensajeTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getCodigoMensaje() {
			return localCodigoMensaje;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param CodigoMensaje
		 */
		public void setCodigoMensaje(String param) {
			localCodigoMensajeTracker = param != null;

			this.localCodigoMensaje = param;

		}

		/**
		 * field for DescripcionMensaje
		 */

		protected String localDescripcionMensaje;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localDescripcionMensajeTracker = false;

		public boolean isDescripcionMensajeSpecified() {
			return localDescripcionMensajeTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getDescripcionMensaje() {
			return localDescripcionMensaje;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param DescripcionMensaje
		 */
		public void setDescripcionMensaje(String param) {
			localDescripcionMensajeTracker = param != null;

			this.localDescripcionMensaje = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":mensaje", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "mensaje", xmlWriter);
				}

			}
			if (localCodigoMensajeTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoMensaje", xmlWriter);

				if (localCodigoMensaje == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("codigoMensaje cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localCodigoMensaje);

				}

				xmlWriter.writeEndElement();
			}
			if (localDescripcionMensajeTracker) {
				namespace = "";
				writeStartElement(null, namespace, "descripcionMensaje", xmlWriter);

				if (localDescripcionMensaje == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("descripcionMensaje cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localDescripcionMensaje);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localCodigoMensajeTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoMensaje"));

				if (localCodigoMensaje != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoMensaje));
				} else {
					throw new org.apache.axis2.databinding.ADBException("codigoMensaje cannot be null!!");
				}
			}
			if (localDescripcionMensajeTracker) {
				elementList.add(new javax.xml.namespace.QName("", "descripcionMensaje"));

				if (localDescripcionMensaje != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescripcionMensaje));
				} else {
					throw new org.apache.axis2.databinding.ADBException("descripcionMensaje cannot be null!!");
				}
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static Mensaje parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				Mensaje object = new Mensaje();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"mensaje".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Mensaje) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoMensaje").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoMensaje" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoMensaje(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "descripcionMensaje").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "descripcionMensaje" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setDescripcionMensaje(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Garantias_type0 implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * garantias_type0 Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for Garantia This was an Array!
		 */

		protected Garantia[] localGarantia;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localGarantiaTracker = false;

		public boolean isGarantiaSpecified() {
			return localGarantiaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return Garantia[]
		 */
		public Garantia[] getGarantia() {
			return localGarantia;
		}

		/**
		 * validate the array for Garantia
		 */
		protected void validateGarantia(Garantia[] param) {

		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Garantia
		 */
		public void setGarantia(Garantia[] param) {

			validateGarantia(param);

			localGarantiaTracker = param != null;

			this.localGarantia = param;
		}

		/**
		 * Auto generated add method for the array for convenience
		 * 
		 * @param param Garantia
		 */
		public void addGarantia(Garantia param) {
			if (localGarantia == null) {
				localGarantia = new Garantia[] {};
			}

			// update the setting tracker
			localGarantiaTracker = true;

			java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localGarantia);
			list.add(param);
			this.localGarantia = (Garantia[]) list.toArray(new Garantia[list.size()]);

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":garantias_type0", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "garantias_type0",
							xmlWriter);
				}

			}
			if (localGarantiaTracker) {
				if (localGarantia != null) {
					for (int i = 0; i < localGarantia.length; i++) {
						if (localGarantia[i] != null) {
							localGarantia[i].serialize(new javax.xml.namespace.QName("", "garantia"), xmlWriter);
						} else {

							// we don't have to do any thing since minOccures is zero

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("garantia cannot be null!!");

				}
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localGarantiaTracker) {
				if (localGarantia != null) {
					for (int i = 0; i < localGarantia.length; i++) {

						if (localGarantia[i] != null) {
							elementList.add(new javax.xml.namespace.QName("", "garantia"));
							elementList.add(localGarantia[i]);
						} else {

							// nothing to do

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("garantia cannot be null!!");

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static Garantias_type0 parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				Garantias_type0 object = new Garantias_type0();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"garantias_type0".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (Garantias_type0) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					java.util.ArrayList list1 = new java.util.ArrayList();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "garantia").equals(reader.getName())) {

						// Process the array and step past its final element's end.
						list1.add(Garantia.Factory.parse(reader));

						// loop until we find a start element that is not part of this array
						boolean loopDone1 = false;
						while (!loopDone1) {
							// We should be at the end element, but make sure
							while (!reader.isEndElement())
								reader.next();
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()) {
								// two continuous end elements means we are exiting the xml structure
								loopDone1 = true;
							} else {
								if (new javax.xml.namespace.QName("", "garantia").equals(reader.getName())) {
									list1.add(Garantia.Factory.parse(reader));

								} else {
									loopDone1 = true;
								}
							}
						}
						// call the converter utility to convert and set the array

						object.setGarantia((Garantia[]) org.apache.axis2.databinding.utils.ConverterUtil
								.convertToArray(Garantia.class, list1));

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class RespuestaAuditada extends Respuesta implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * respuestaAuditada Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for IdOperacion
		 */

		protected long localIdOperacion;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localIdOperacionTracker = false;

		public boolean isIdOperacionSpecified() {
			return localIdOperacionTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return long
		 */
		public long getIdOperacion() {
			return localIdOperacion;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param IdOperacion
		 */
		public void setIdOperacion(long param) {

			// setting primitive attribute tracker to true
			localIdOperacionTracker = param != Long.MIN_VALUE;

			this.localIdOperacion = param;

		}

		/**
		 * field for ResultadoOperacionDetalle
		 */

		protected ResultadoOperacionDetalle localResultadoOperacionDetalle;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localResultadoOperacionDetalleTracker = false;

		public boolean isResultadoOperacionDetalleSpecified() {
			return localResultadoOperacionDetalleTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return ResultadoOperacionDetalle
		 */
		public ResultadoOperacionDetalle getResultadoOperacionDetalle() {
			return localResultadoOperacionDetalle;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param ResultadoOperacionDetalle
		 */
		public void setResultadoOperacionDetalle(ResultadoOperacionDetalle param) {
			localResultadoOperacionDetalleTracker = param != null;

			this.localResultadoOperacionDetalle = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			String namespacePrefix = registerPrefix(xmlWriter,
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":respuestaAuditada", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "respuestaAuditada",
						xmlWriter);
			}

			if (localFechaOperacionTracker) {
				namespace = "";
				writeStartElement(null, namespace, "fechaOperacion", xmlWriter);

				if (localFechaOperacion == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("fechaOperacion cannot be null!!");

				} else {

					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaOperacion));

				}

				xmlWriter.writeEndElement();
			}
			if (localResultadoOperacionTracker) {
				if (localResultadoOperacion == null) {
					throw new org.apache.axis2.databinding.ADBException("resultadoOperacion cannot be null!!");
				}
				localResultadoOperacion.serialize(new javax.xml.namespace.QName("", "resultadoOperacion"), xmlWriter);
			}
			if (localIdOperacionTracker) {
				namespace = "";
				writeStartElement(null, namespace, "idOperacion", xmlWriter);

				if (localIdOperacion == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("idOperacion cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdOperacion));
				}

				xmlWriter.writeEndElement();
			}
			if (localResultadoOperacionDetalleTracker) {
				if (localResultadoOperacionDetalle == null) {
					throw new org.apache.axis2.databinding.ADBException("resultadoOperacionDetalle cannot be null!!");
				}
				localResultadoOperacionDetalle.serialize(new javax.xml.namespace.QName("", "resultadoOperacionDetalle"),
						xmlWriter);
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
			attribList.add(new javax.xml.namespace.QName(
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "respuestaAuditada"));
			if (localFechaOperacionTracker) {
				elementList.add(new javax.xml.namespace.QName("", "fechaOperacion"));

				if (localFechaOperacion != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaOperacion));
				} else {
					throw new org.apache.axis2.databinding.ADBException("fechaOperacion cannot be null!!");
				}
			}
			if (localResultadoOperacionTracker) {
				elementList.add(new javax.xml.namespace.QName("", "resultadoOperacion"));

				if (localResultadoOperacion == null) {
					throw new org.apache.axis2.databinding.ADBException("resultadoOperacion cannot be null!!");
				}
				elementList.add(localResultadoOperacion);
			}
			if (localIdOperacionTracker) {
				elementList.add(new javax.xml.namespace.QName("", "idOperacion"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIdOperacion));
			}
			if (localResultadoOperacionDetalleTracker) {
				elementList.add(new javax.xml.namespace.QName("", "resultadoOperacionDetalle"));

				if (localResultadoOperacionDetalle == null) {
					throw new org.apache.axis2.databinding.ADBException("resultadoOperacionDetalle cannot be null!!");
				}
				elementList.add(localResultadoOperacionDetalle);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static RespuestaAuditada parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				RespuestaAuditada object = new RespuestaAuditada();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"respuestaAuditada".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (RespuestaAuditada) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "fechaOperacion").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "fechaOperacion" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setFechaOperacion(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "resultadoOperacion").equals(reader.getName())) {

						object.setResultadoOperacion(ResultadoOperacion.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "idOperacion").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "idOperacion" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setIdOperacion(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setIdOperacion(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("", "resultadoOperacionDetalle")
							.equals(reader.getName())) {

						object.setResultadoOperacionDetalle(ResultadoOperacionDetalle.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class ListadoPolizas_type0 implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * listadoPolizas_type0 Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for Poliza This was an Array!
		 */

		protected PolizaSimple[] localPoliza;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localPolizaTracker = false;

		public boolean isPolizaSpecified() {
			return localPolizaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return PolizaSimple[]
		 */
		public PolizaSimple[] getPoliza() {
			return localPoliza;
		}

		/**
		 * validate the array for Poliza
		 */
		protected void validatePoliza(PolizaSimple[] param) {

		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Poliza
		 */
		public void setPoliza(PolizaSimple[] param) {

			validatePoliza(param);

			localPolizaTracker = param != null;

			this.localPoliza = param;
		}

		/**
		 * Auto generated add method for the array for convenience
		 * 
		 * @param param PolizaSimple
		 */
		public void addPoliza(PolizaSimple param) {
			if (localPoliza == null) {
				localPoliza = new PolizaSimple[] {};
			}

			// update the setting tracker
			localPolizaTracker = true;

			java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localPoliza);
			list.add(param);
			this.localPoliza = (PolizaSimple[]) list.toArray(new PolizaSimple[list.size()]);

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":listadoPolizas_type0", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "listadoPolizas_type0",
							xmlWriter);
				}

			}
			if (localPolizaTracker) {
				if (localPoliza != null) {
					for (int i = 0; i < localPoliza.length; i++) {
						if (localPoliza[i] != null) {
							localPoliza[i].serialize(new javax.xml.namespace.QName("", "poliza"), xmlWriter);
						} else {

							// we don't have to do any thing since minOccures is zero

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("poliza cannot be null!!");

				}
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localPolizaTracker) {
				if (localPoliza != null) {
					for (int i = 0; i < localPoliza.length; i++) {

						if (localPoliza[i] != null) {
							elementList.add(new javax.xml.namespace.QName("", "poliza"));
							elementList.add(localPoliza[i]);
						} else {

							// nothing to do

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException("poliza cannot be null!!");

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static ListadoPolizas_type0 parse(javax.xml.stream.XMLStreamReader reader)
					throws Exception {
				ListadoPolizas_type0 object = new ListadoPolizas_type0();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"listadoPolizas_type0".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (ListadoPolizas_type0) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					java.util.ArrayList list1 = new java.util.ArrayList();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "poliza").equals(reader.getName())) {

						// Process the array and step past its final element's end.
						list1.add(PolizaSimple.Factory.parse(reader));

						// loop until we find a start element that is not part of this array
						boolean loopDone1 = false;
						while (!loopDone1) {
							// We should be at the end element, but make sure
							while (!reader.isEndElement())
								reader.next();
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement() && !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()) {
								// two continuous end elements means we are exiting the xml structure
								loopDone1 = true;
							} else {
								if (new javax.xml.namespace.QName("", "poliza").equals(reader.getName())) {
									list1.add(PolizaSimple.Factory.parse(reader));

								} else {
									loopDone1 = true;
								}
							}
						}
						// call the converter utility to convert and set the array

						object.setPoliza((PolizaSimple[]) org.apache.axis2.databinding.utils.ConverterUtil
								.convertToArray(PolizaSimple.class, list1));

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class IntervinienteSimple implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * intervinienteSimple Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for Apellidos
		 */

		protected String localApellidos;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localApellidosTracker = false;

		public boolean isApellidosSpecified() {
			return localApellidosTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getApellidos() {
			return localApellidos;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Apellidos
		 */
		public void setApellidos(String param) {
			localApellidosTracker = param != null;

			this.localApellidos = param;

		}

		/**
		 * field for Nombre
		 */

		protected String localNombre;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNombreTracker = false;

		public boolean isNombreSpecified() {
			return localNombreTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getNombre() {
			return localNombre;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Nombre
		 */
		public void setNombre(String param) {
			localNombreTracker = param != null;

			this.localNombre = param;

		}

		/**
		 * field for NumeroCertificado
		 */

		protected long localNumeroCertificado;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNumeroCertificadoTracker = false;

		public boolean isNumeroCertificadoSpecified() {
			return localNumeroCertificadoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return long
		 */
		public long getNumeroCertificado() {
			return localNumeroCertificado;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param NumeroCertificado
		 */
		public void setNumeroCertificado(long param) {

			// setting primitive attribute tracker to true
			localNumeroCertificadoTracker = param != Long.MIN_VALUE;

			this.localNumeroCertificado = param;

		}

		/**
		 * field for NumeroDocumento
		 */

		protected String localNumeroDocumento;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNumeroDocumentoTracker = false;

		public boolean isNumeroDocumentoSpecified() {
			return localNumeroDocumentoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getNumeroDocumento() {
			return localNumeroDocumento;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param NumeroDocumento
		 */
		public void setNumeroDocumento(String param) {
			localNumeroDocumentoTracker = param != null;

			this.localNumeroDocumento = param;

		}

		/**
		 * field for NumeroMutualista
		 */

		protected long localNumeroMutualista;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNumeroMutualistaTracker = false;

		public boolean isNumeroMutualistaSpecified() {
			return localNumeroMutualistaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return long
		 */
		public long getNumeroMutualista() {
			return localNumeroMutualista;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param NumeroMutualista
		 */
		public void setNumeroMutualista(long param) {

			// setting primitive attribute tracker to true
			localNumeroMutualistaTracker = param != Long.MIN_VALUE;

			this.localNumeroMutualista = param;

		}

		/**
		 * field for TipoDocumento
		 */

		protected String localTipoDocumento;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localTipoDocumentoTracker = false;

		public boolean isTipoDocumentoSpecified() {
			return localTipoDocumentoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getTipoDocumento() {
			return localTipoDocumento;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param TipoDocumento
		 */
		public void setTipoDocumento(String param) {
			localTipoDocumentoTracker = param != null;

			this.localTipoDocumento = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":intervinienteSimple", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "intervinienteSimple",
							xmlWriter);
				}

			}
			if (localApellidosTracker) {
				namespace = "";
				writeStartElement(null, namespace, "apellidos", xmlWriter);

				if (localApellidos == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("apellidos cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localApellidos);

				}

				xmlWriter.writeEndElement();
			}
			if (localNombreTracker) {
				namespace = "";
				writeStartElement(null, namespace, "nombre", xmlWriter);

				if (localNombre == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("nombre cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localNombre);

				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroCertificadoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroCertificado", xmlWriter);

				if (localNumeroCertificado == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroCertificado cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroCertificado));
				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroDocumentoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroDocumento", xmlWriter);

				if (localNumeroDocumento == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("numeroDocumento cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localNumeroDocumento);

				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroMutualistaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroMutualista", xmlWriter);

				if (localNumeroMutualista == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroMutualista cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroMutualista));
				}

				xmlWriter.writeEndElement();
			}
			if (localTipoDocumentoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "tipoDocumento", xmlWriter);

				if (localTipoDocumento == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("tipoDocumento cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localTipoDocumento);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localApellidosTracker) {
				elementList.add(new javax.xml.namespace.QName("", "apellidos"));

				if (localApellidos != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApellidos));
				} else {
					throw new org.apache.axis2.databinding.ADBException("apellidos cannot be null!!");
				}
			}
			if (localNombreTracker) {
				elementList.add(new javax.xml.namespace.QName("", "nombre"));

				if (localNombre != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNombre));
				} else {
					throw new org.apache.axis2.databinding.ADBException("nombre cannot be null!!");
				}
			}
			if (localNumeroCertificadoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroCertificado"));

				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroCertificado));
			}
			if (localNumeroDocumentoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroDocumento"));

				if (localNumeroDocumento != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroDocumento));
				} else {
					throw new org.apache.axis2.databinding.ADBException("numeroDocumento cannot be null!!");
				}
			}
			if (localNumeroMutualistaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroMutualista"));

				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroMutualista));
			}
			if (localTipoDocumentoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "tipoDocumento"));

				if (localTipoDocumento != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipoDocumento));
				} else {
					throw new org.apache.axis2.databinding.ADBException("tipoDocumento cannot be null!!");
				}
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static IntervinienteSimple parse(javax.xml.stream.XMLStreamReader reader)
					throws Exception {
				IntervinienteSimple object = new IntervinienteSimple();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"intervinienteSimple".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (IntervinienteSimple) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "apellidos").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "apellidos" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setApellidos(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "nombre").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "nombre" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNombre(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroCertificado").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroCertificado" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroCertificado(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroCertificado(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroDocumento").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroDocumento" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroDocumento(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroMutualista").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroMutualista" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroMutualista(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroMutualista(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "tipoDocumento").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "tipoDocumento" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setTipoDocumento(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetPolizas implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name = getPolizas
		 * Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for Arg0
		 */

		protected PeticionConsulta localArg0;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localArg0Tracker = false;

		public boolean isArg0Specified() {
			return localArg0Tracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return PeticionConsulta
		 */
		public PeticionConsulta getArg0() {
			return localArg0;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param Arg0
		 */
		public void setArg0(PeticionConsulta param) {
			localArg0Tracker = param != null;

			this.localArg0 = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":getPolizas", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "getPolizas", xmlWriter);
				}

			}
			if (localArg0Tracker) {
				if (localArg0 == null) {
					throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
				}
				localArg0.serialize(new javax.xml.namespace.QName("", "arg0"), xmlWriter);
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localArg0Tracker) {
				elementList.add(new javax.xml.namespace.QName("", "arg0"));

				if (localArg0 == null) {
					throw new org.apache.axis2.databinding.ADBException("arg0 cannot be null!!");
				}
				elementList.add(localArg0);
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static GetPolizas parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				GetPolizas object = new GetPolizas();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"getPolizas".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (GetPolizas) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement() && new javax.xml.namespace.QName("", "arg0").equals(reader.getName())) {

						object.setArg0(PeticionConsulta.Factory.parse(reader));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class EstadoCivil implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "estadoCivil", "ns1");

		/**
		 * field for EstadoCivil
		 */

		protected String localEstadoCivil;

		private static java.util.HashMap _table_ = new java.util.HashMap();

		// Constructor

		protected EstadoCivil(String value, boolean isRegisterValue) {
			localEstadoCivil = value;
			if (isRegisterValue) {

				_table_.put(localEstadoCivil, this);

			}

		}

		public static final String _SOLTERO = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("SOLTERO");

		public static final String _CASADO = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("CASADO");

		public static final String _DIVORCIADO = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("DIVORCIADO");

		public static final String _SEPARADO = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("SEPARADO");

		public static final String _PAREJA_DE_HECHO = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("PAREJA_DE_HECHO");

		public static final String _PERSONA_JURIDICA = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("PERSONA_JURIDICA");

		public static final String _VIUDO = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("VIUDO");

		public static final String _DESCONOCIDO = org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString("DESCONOCIDO");

		public static final EstadoCivil SOLTERO = new EstadoCivil(_SOLTERO, true);

		public static final EstadoCivil CASADO = new EstadoCivil(_CASADO, true);

		public static final EstadoCivil DIVORCIADO = new EstadoCivil(_DIVORCIADO, true);

		public static final EstadoCivil SEPARADO = new EstadoCivil(_SEPARADO, true);

		public static final EstadoCivil PAREJA_DE_HECHO = new EstadoCivil(_PAREJA_DE_HECHO, true);

		public static final EstadoCivil PERSONA_JURIDICA = new EstadoCivil(_PERSONA_JURIDICA, true);

		public static final EstadoCivil VIUDO = new EstadoCivil(_VIUDO, true);

		public static final EstadoCivil DESCONOCIDO = new EstadoCivil(_DESCONOCIDO, true);

		public String getValue() {
			return localEstadoCivil;
		}

		public boolean equals(Object obj) {
			return (obj == this);
		}

		public int hashCode() {
			return toString().hashCode();
		}

		public String toString() {

			return localEstadoCivil.toString();

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it

			String namespace = parentQName.getNamespaceURI();
			String _localName = parentQName.getLocalPart();

			writeStartElement(null, namespace, _localName, xmlWriter);

			// add the type details if this is used in a simple type
			if (serializeType) {
				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":estadoCivil", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "estadoCivil",
							xmlWriter);
				}
			}

			if (localEstadoCivil == null) {

				throw new org.apache.axis2.databinding.ADBException("estadoCivil cannot be null !!");

			} else {

				xmlWriter.writeCharacters(localEstadoCivil);

			}

			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it
			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
					new Object[] { org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstadoCivil) },
					null);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			public static EstadoCivil fromValue(String value) throws IllegalArgumentException {
				EstadoCivil enumeration = (EstadoCivil)

				_table_.get(value);

				if ((enumeration == null) && !((value == null) || (value.equals("")))) {
					throw new IllegalArgumentException();
				}
				return enumeration;
			}

			public static EstadoCivil fromString(String value, String namespaceURI)
					throws IllegalArgumentException {
				try {

					return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));

				} catch (Exception e) {
					throw new IllegalArgumentException();
				}
			}

			public static EstadoCivil fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
					String content) {
				if (content.indexOf(":") > -1) {
					String prefix = content.substring(0, content.indexOf(":"));
					String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
					return Factory.fromString(content, namespaceUri);
				} else {
					return Factory.fromString(content, "");
				}
			}

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static EstadoCivil parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				EstadoCivil object = null;
				// initialize a hash map to keep values
				java.util.Map attributeMap = new java.util.HashMap();
				java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement() || reader.hasText()) {

							nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
									"nil");
							if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
								throw new org.apache.axis2.databinding.ADBException(
										"The element: " + "estadoCivil" + "  cannot be null");
							}

							String content = reader.getElementText();

							if (content.indexOf(":") > 0) {
								// this seems to be a Qname so find the namespace and send
								prefix = content.substring(0, content.indexOf(":"));
								namespaceuri = reader.getNamespaceURI(prefix);
								object = Factory.fromString(content, namespaceuri);
							} else {
								// this seems to be not a qname send and empty namespace incase of it is
								// check is done in fromString method
								object = Factory.fromString(content, "");
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class PolizaSimple implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name = polizaSimple
		 * Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for codigoCompania
		 */

		protected String localCodigoCompania;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCodigoCompaniaTracker = false;

		public boolean isCodigoCompaniaSpecified() {
			return localCodigoCompaniaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getCodigoCompania() {
			return localCodigoCompania;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param codigoCompania
		 */
		public void setCodigoCompania(String param) {
			localCodigoCompaniaTracker = param != null;

			this.localCodigoCompania = param;

		}

		/**
		 * field for codigoPais
		 */

		protected java.math.BigDecimal localCodigoPais;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCodigoPaisTracker = false;

		public boolean isCodigoPaisSpecified() {
			return localCodigoPaisTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.math.BigDecimal
		 */
		public java.math.BigDecimal getCodigoPais() {
			return localCodigoPais;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param codigoPais
		 */
		public void setCodigoPais(java.math.BigDecimal param) {
			localCodigoPaisTracker = param != null;

			this.localCodigoPais = param;

		}

		/**
		 * field for codigoRamo
		 */

		protected int localCodigoRamo;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localCodigoRamoTracker = false;

		public boolean isCodigoRamoSpecified() {
			return localCodigoRamoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getCodigoRamo() {
			return localCodigoRamo;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param codigoRamo
		 */
		public void setCodigoRamo(int param) {

			// setting primitive attribute tracker to true
			localCodigoRamoTracker = param != Integer.MIN_VALUE;

			this.localCodigoRamo = param;

		}

		/**
		 * field for DescripcionProducto
		 */

		protected String localDescripcionProducto;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localDescripcionProductoTracker = false;

		public boolean isDescripcionProductoSpecified() {
			return localDescripcionProductoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getDescripcionProducto() {
			return localDescripcionProducto;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param DescripcionProducto
		 */
		public void setDescripcionProducto(String param) {
			localDescripcionProductoTracker = param != null;

			this.localDescripcionProducto = param;

		}

		/**
		 * field for descripcionRiesgo
		 */

		protected String localDescripcionRiesgo;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localDescripcionRiesgoTracker = false;

		public boolean isDescripcionRiesgoSpecified() {
			return localDescripcionRiesgoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getDescripcionRiesgo() {
			return localDescripcionRiesgo;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param descripcionRiesgo
		 */
		public void setDescripcionRiesgo(String param) {
			localDescripcionRiesgoTracker = param != null;

			this.localDescripcionRiesgo = param;

		}

		/**
		 * field for DescripcionTomador
		 */

		protected String localDescripcionTomador;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localDescripcionTomadorTracker = false;

		public boolean isDescripcionTomadorSpecified() {
			return localDescripcionTomadorTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getDescripcionTomador() {
			return localDescripcionTomador;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param DescripcionTomador
		 */
		public void setDescripcionTomador(String param) {
			localDescripcionTomadorTracker = param != null;

			this.localDescripcionTomador = param;

		}

		/**
		 * field for FechaEfecto
		 */

		protected String localFechaEfecto;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localFechaEfectoTracker = false;

		public boolean isFechaEfectoSpecified() {
			return localFechaEfectoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getFechaEfecto() {
			return localFechaEfecto;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param FechaEfecto
		 */
		public void setFechaEfecto(String param) {
			localFechaEfectoTracker = param != null;

			this.localFechaEfecto = param;

		}

		/**
		 * field for FechaVencimiento
		 */

		protected String localFechaVencimiento;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localFechaVencimientoTracker = false;

		public boolean isFechaVencimientoSpecified() {
			return localFechaVencimientoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getFechaVencimiento() {
			return localFechaVencimiento;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param FechaVencimiento
		 */
		public void setFechaVencimiento(String param) {
			localFechaVencimientoTracker = param != null;

			this.localFechaVencimiento = param;

		}

		/**
		 * field for NumeroCertificado
		 */

		protected long localNumeroCertificado;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNumeroCertificadoTracker = false;

		public boolean isNumeroCertificadoSpecified() {
			return localNumeroCertificadoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return long
		 */
		public long getNumeroCertificado() {
			return localNumeroCertificado;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param NumeroCertificado
		 */
		public void setNumeroCertificado(long param) {

			// setting primitive attribute tracker to true
			localNumeroCertificadoTracker = param != Long.MIN_VALUE;

			this.localNumeroCertificado = param;

		}

		/**
		 * field for NumeroPoliza
		 */

		protected long localNumeroPoliza;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNumeroPolizaTracker = false;

		public boolean isNumeroPolizaSpecified() {
			return localNumeroPolizaTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return long
		 */
		public long getNumeroPoliza() {
			return localNumeroPoliza;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param NumeroPoliza
		 */
		public void setNumeroPoliza(long param) {

			// setting primitive attribute tracker to true
			localNumeroPolizaTracker = param != Long.MIN_VALUE;

			this.localNumeroPoliza = param;

		}

		/**
		 * field for NumeroSuplemento
		 */

		protected long localNumeroSuplemento;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNumeroSuplementoTracker = false;

		public boolean isNumeroSuplementoSpecified() {
			return localNumeroSuplementoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return long
		 */
		public long getNumeroSuplemento() {
			return localNumeroSuplemento;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param NumeroSuplemento
		 */
		public void setNumeroSuplemento(long param) {

			// setting primitive attribute tracker to true
			localNumeroSuplementoTracker = param != Long.MIN_VALUE;

			this.localNumeroSuplemento = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			if (serializeType) {

				String namespacePrefix = registerPrefix(xmlWriter,
						"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
				if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
							namespacePrefix + ":polizaSimple", xmlWriter);
				} else {
					writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "polizaSimple",
							xmlWriter);
				}

			}
			if (localCodigoCompaniaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoCompania", xmlWriter);

				if (localCodigoCompania == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("codigoCompania cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localCodigoCompania);

				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoPaisTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoPais", xmlWriter);

				if (localCodigoPais == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("codigoPais cannot be null!!");

				} else {

					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPais));

				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoRamoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoRamo", xmlWriter);

				if (localCodigoRamo == Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("codigoRamo cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoRamo));
				}

				xmlWriter.writeEndElement();
			}
			if (localDescripcionProductoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "descripcionProducto", xmlWriter);

				if (localDescripcionProducto == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("descripcionProducto cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localDescripcionProducto);

				}

				xmlWriter.writeEndElement();
			}
			if (localDescripcionRiesgoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "descripcionRiesgo", xmlWriter);

				if (localDescripcionRiesgo == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("descripcionRiesgo cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localDescripcionRiesgo);

				}

				xmlWriter.writeEndElement();
			}
			if (localDescripcionTomadorTracker) {
				namespace = "";
				writeStartElement(null, namespace, "descripcionTomador", xmlWriter);

				if (localDescripcionTomador == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("descripcionTomador cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localDescripcionTomador);

				}

				xmlWriter.writeEndElement();
			}
			if (localFechaEfectoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "fechaEfecto", xmlWriter);

				if (localFechaEfecto == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("fechaEfecto cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localFechaEfecto);

				}

				xmlWriter.writeEndElement();
			}
			if (localFechaVencimientoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "fechaVencimiento", xmlWriter);

				if (localFechaVencimiento == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("fechaVencimiento cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localFechaVencimiento);

				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroCertificadoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroCertificado", xmlWriter);

				if (localNumeroCertificado == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroCertificado cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroCertificado));
				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroPolizaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroPoliza", xmlWriter);

				if (localNumeroPoliza == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroPoliza cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroPoliza));
				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroSuplementoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroSuplemento", xmlWriter);

				if (localNumeroSuplemento == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroSuplemento cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroSuplemento));
				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localCodigoCompaniaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoCompania"));

				if (localCodigoCompania != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoCompania));
				} else {
					throw new org.apache.axis2.databinding.ADBException("codigoCompania cannot be null!!");
				}
			}
			if (localCodigoPaisTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoPais"));

				if (localCodigoPais != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPais));
				} else {
					throw new org.apache.axis2.databinding.ADBException("codigoPais cannot be null!!");
				}
			}
			if (localCodigoRamoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoRamo"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoRamo));
			}
			if (localDescripcionProductoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "descripcionProducto"));

				if (localDescripcionProducto != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescripcionProducto));
				} else {
					throw new org.apache.axis2.databinding.ADBException("descripcionProducto cannot be null!!");
				}
			}
			if (localDescripcionRiesgoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "descripcionRiesgo"));

				if (localDescripcionRiesgo != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescripcionRiesgo));
				} else {
					throw new org.apache.axis2.databinding.ADBException("descripcionRiesgo cannot be null!!");
				}
			}
			if (localDescripcionTomadorTracker) {
				elementList.add(new javax.xml.namespace.QName("", "descripcionTomador"));

				if (localDescripcionTomador != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescripcionTomador));
				} else {
					throw new org.apache.axis2.databinding.ADBException("descripcionTomador cannot be null!!");
				}
			}
			if (localFechaEfectoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "fechaEfecto"));

				if (localFechaEfecto != null) {
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaEfecto));
				} else {
					throw new org.apache.axis2.databinding.ADBException("fechaEfecto cannot be null!!");
				}
			}
			if (localFechaVencimientoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "fechaVencimiento"));

				if (localFechaVencimiento != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaVencimiento));
				} else {
					throw new org.apache.axis2.databinding.ADBException("fechaVencimiento cannot be null!!");
				}
			}
			if (localNumeroCertificadoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroCertificado"));

				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroCertificado));
			}
			if (localNumeroPolizaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroPoliza"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroPoliza));
			}
			if (localNumeroSuplementoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroSuplemento"));

				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroSuplemento));
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static PolizaSimple parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				PolizaSimple object = new PolizaSimple();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"polizaSimple".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (PolizaSimple) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoCompania").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoCompania" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoCompania(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoPais").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoPais" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoPais(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoRamo").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoRamo" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoRamo(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setCodigoRamo(Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "descripcionProducto").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "descripcionProducto" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setDescripcionProducto(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "descripcionRiesgo").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "descripcionRiesgo" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setDescripcionRiesgo(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "descripcionTomador").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "descripcionTomador" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setDescripcionTomador(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "fechaEfecto").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "fechaEfecto" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setFechaEfecto(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "fechaVencimiento").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "fechaVencimiento" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setFechaVencimiento(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroCertificado").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroCertificado" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroCertificado(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroCertificado(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroPoliza").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroPoliza" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroPoliza(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroPoliza(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroSuplemento").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroSuplemento" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroSuplemento(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroSuplemento(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class GetPolizasNoVigentesResponseE implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "getPolizasNoVigentesResponse",
				"ns1");

		/**
		 * field for GetPolizasNoVigentesResponse
		 */

		protected GetPolizasNoVigentesResponse localGetPolizasNoVigentesResponse;

		/**
		 * Auto generated getter method
		 * 
		 * @return GetPolizasNoVigentesResponse
		 */
		public GetPolizasNoVigentesResponse getGetPolizasNoVigentesResponse() {
			return localGetPolizasNoVigentesResponse;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param GetPolizasNoVigentesResponse
		 */
		public void setGetPolizasNoVigentesResponse(GetPolizasNoVigentesResponse param) {

			this.localGetPolizasNoVigentesResponse = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					MY_QNAME);
			return factory.createOMElement(dataSource, MY_QNAME);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it

			if (localGetPolizasNoVigentesResponse == null) {
				throw new org.apache.axis2.databinding.ADBException("getPolizasNoVigentesResponse cannot be null!");
			}
			localGetPolizasNoVigentesResponse.serialize(MY_QNAME, xmlWriter);

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with it
			return localGetPolizasNoVigentesResponse.getPullParser(MY_QNAME);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static GetPolizasNoVigentesResponseE parse(javax.xml.stream.XMLStreamReader reader)
					throws Exception {
				GetPolizasNoVigentesResponseE object = new GetPolizasNoVigentesResponseE();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement()) {

							if (reader.isStartElement() && new javax.xml.namespace.QName(
									"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/",
									"getPolizasNoVigentesResponse").equals(reader.getName())) {

								object.setGetPolizasNoVigentesResponse(
										GetPolizasNoVigentesResponse.Factory.parse(reader));

							} // End of if for expected property start element

							else {
								// A start element we are not expecting indicates an invalid parameter was
								// passed
								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement " + reader.getName());
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class PeticionDetalle extends Peticion implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * peticionDetalle Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for NumeroCertificado
		 */

		protected String localNumeroCertificado;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNumeroCertificadoTracker = false;

		public boolean isNumeroCertificadoSpecified() {
			return localNumeroCertificadoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getNumeroCertificado() {
			return localNumeroCertificado;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param NumeroCertificado
		 */
		public void setNumeroCertificado(String param) {
			localNumeroCertificadoTracker = param != null;

			this.localNumeroCertificado = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			String namespacePrefix = registerPrefix(xmlWriter,
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":peticionDetalle", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "peticionDetalle",
						xmlWriter);
			}

			if (localCodigoCompaniaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoCompania", xmlWriter);

				if (localCodigoCompania == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("codigoCompania cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localCodigoCompania);

				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoPaisTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoPais", xmlWriter);

				if (localCodigoPais == Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("codigoPais cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPais));
				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoRamoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoRamo", xmlWriter);

				if (localCodigoRamo == Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("codigoRamo cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoRamo));
				}

				xmlWriter.writeEndElement();
			}
			if (localFechaConsultaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "fechaConsulta", xmlWriter);

				if (localFechaConsulta == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("fechaConsulta cannot be null!!");

				} else {

					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaConsulta));

				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroPolizaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroPoliza", xmlWriter);

				if (localNumeroPoliza == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroPoliza cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroPoliza));
				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroSuplementoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroSuplemento", xmlWriter);

				if (localNumeroSuplemento == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroSuplemento cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroSuplemento));
				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroCertificadoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroCertificado", xmlWriter);

				if (localNumeroCertificado == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("numeroCertificado cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localNumeroCertificado);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
			attribList.add(new javax.xml.namespace.QName(
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "peticionDetalle"));
			if (localCodigoCompaniaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoCompania"));

				if (localCodigoCompania != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoCompania));
				} else {
					throw new org.apache.axis2.databinding.ADBException("codigoCompania cannot be null!!");
				}
			}
			if (localCodigoPaisTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoPais"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPais));
			}
			if (localCodigoRamoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoRamo"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoRamo));
			}
			if (localFechaConsultaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "fechaConsulta"));

				if (localFechaConsulta != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaConsulta));
				} else {
					throw new org.apache.axis2.databinding.ADBException("fechaConsulta cannot be null!!");
				}
			}
			if (localNumeroPolizaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroPoliza"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroPoliza));
			}
			if (localNumeroSuplementoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroSuplemento"));

				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroSuplemento));
			}
			if (localNumeroCertificadoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroCertificado"));

				if (localNumeroCertificado != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroCertificado));
				} else {
					throw new org.apache.axis2.databinding.ADBException("numeroCertificado cannot be null!!");
				}
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static PeticionDetalle parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				PeticionDetalle object = new PeticionDetalle();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"peticionDetalle".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (PeticionDetalle) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoCompania").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoCompania" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoCompania(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoPais").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoPais" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoPais(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setCodigoPais(Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoRamo").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoRamo" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoRamo(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setCodigoRamo(Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "fechaConsulta").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "fechaConsulta" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setFechaConsulta(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroPoliza").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroPoliza" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroPoliza(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroPoliza(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroSuplemento").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroSuplemento" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroSuplemento(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroSuplemento(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroCertificado").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroCertificado" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroCertificado(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class PeticionNoVigentes extends Peticion implements org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * peticionNoVigentes Namespace URI =
		 * http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/
		 * Namespace Prefix = ns1
		 */

		/**
		 * field for NumeroDocumento
		 */

		protected String localNumeroDocumento;

		/*
		 * This tracker boolean wil be used to detect whether the user called the set
		 * method for this attribute. It will be used to determine whether to include
		 * this field in the serialized XML
		 */
		protected boolean localNumeroDocumentoTracker = false;

		public boolean isNumeroDocumentoSpecified() {
			return localNumeroDocumentoTracker;
		}

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public String getNumeroDocumento() {
			return localNumeroDocumento;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param NumeroDocumento
		 */
		public void setNumeroDocumento(String param) {
			localNumeroDocumentoTracker = param != null;

			this.localNumeroDocumento = param;

		}

		/**
		 *
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
					parentQName);
			return factory.createOMElement(dataSource, parentQName);

		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
			serialize(parentQName, xmlWriter, false);
		}

		public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
				boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

			String prefix = null;
			String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();
			writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

			String namespacePrefix = registerPrefix(xmlWriter,
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/");
			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":peticionNoVigentes", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "peticionNoVigentes",
						xmlWriter);
			}

			if (localCodigoCompaniaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoCompania", xmlWriter);

				if (localCodigoCompania == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("codigoCompania cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localCodigoCompania);

				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoPaisTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoPais", xmlWriter);

				if (localCodigoPais == Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("codigoPais cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPais));
				}

				xmlWriter.writeEndElement();
			}
			if (localCodigoRamoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "codigoRamo", xmlWriter);

				if (localCodigoRamo == Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("codigoRamo cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoRamo));
				}

				xmlWriter.writeEndElement();
			}
			if (localFechaConsultaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "fechaConsulta", xmlWriter);

				if (localFechaConsulta == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("fechaConsulta cannot be null!!");

				} else {

					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaConsulta));

				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroPolizaTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroPoliza", xmlWriter);

				if (localNumeroPoliza == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroPoliza cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroPoliza));
				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroSuplementoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroSuplemento", xmlWriter);

				if (localNumeroSuplemento == Long.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("numeroSuplemento cannot be null!!");

				} else {
					xmlWriter.writeCharacters(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroSuplemento));
				}

				xmlWriter.writeEndElement();
			}
			if (localNumeroDocumentoTracker) {
				namespace = "";
				writeStartElement(null, namespace, "numeroDocumento", xmlWriter);

				if (localNumeroDocumento == null) {
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("numeroDocumento cannot be null!!");

				} else {

					xmlWriter.writeCharacters(localNumeroDocumento);

				}

				xmlWriter.writeEndElement();
			}
			xmlWriter.writeEndElement();

		}

		private static String generatePrefix(String namespace) {
			if (namespace.equals("http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
		}

		/**
		 * Utility method to write an element start tag.
		 */
		private void writeStartElement(String prefix, String namespace, String localPart,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, localPart);
			} else {
				if (namespace.length() == 0) {
					prefix = "";
				} else if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, localPart, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(String prefix, String namespace, String attName,
				String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(String namespace, String attName, String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(String namespace, String attName,
				javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			String attributeNamespace = qname.getNamespaceURI();
			String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {
			String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(
							prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}

			} else {
				xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not possible to
				// write any
				// namespace data after writing the charactor data
				StringBuffer stringToWrite = new StringBuffer();
				String namespaceURI = null;
				String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite.append(prefix).append(":").append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						} else {
							stringToWrite.append(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
				throws javax.xml.stream.XMLStreamException {
			String prefix = xmlWriter.getPrefix(namespace);
			if (prefix == null) {
				prefix = generatePrefix(namespace);
				javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
				while (true) {
					String uri = nsContext.getNamespaceURI(prefix);
					if (uri == null || uri.length() == 0) {
						break;
					}
					prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
				}
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 *
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
			attribList.add(new javax.xml.namespace.QName(
					"http://webservices.consultapolizasws.saludenfermedad.amaseguros.com/", "peticionNoVigentes"));
			if (localCodigoCompaniaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoCompania"));

				if (localCodigoCompania != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoCompania));
				} else {
					throw new org.apache.axis2.databinding.ADBException("codigoCompania cannot be null!!");
				}
			}
			if (localCodigoPaisTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoPais"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPais));
			}
			if (localCodigoRamoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "codigoRamo"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoRamo));
			}
			if (localFechaConsultaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "fechaConsulta"));

				if (localFechaConsulta != null) {
					elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFechaConsulta));
				} else {
					throw new org.apache.axis2.databinding.ADBException("fechaConsulta cannot be null!!");
				}
			}
			if (localNumeroPolizaTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroPoliza"));

				elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroPoliza));
			}
			if (localNumeroSuplementoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroSuplemento"));

				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroSuplemento));
			}
			if (localNumeroDocumentoTracker) {
				elementList.add(new javax.xml.namespace.QName("", "numeroDocumento"));

				if (localNumeroDocumento != null) {
					elementList.add(
							org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumeroDocumento));
				} else {
					throw new org.apache.axis2.databinding.ADBException("numeroDocumento cannot be null!!");
				}
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(),
					attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object is an
			 * element, the current or next start element starts this object and any
			 * intervening reader events are ignorable If this object is not an element, it
			 * is a complex type and the reader is at the event just after the outer start
			 * element Postcondition: If this object is an element, the reader is positioned
			 * at its end element If this object is a complex type, the reader is positioned
			 * at the end element of its outer element
			 */
			public static PeticionNoVigentes parse(javax.xml.stream.XMLStreamReader reader) throws Exception {
				PeticionNoVigentes object = new PeticionNoVigentes();

				int event;
				String nillableValue = null;
				String prefix = "";
				String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
						String fullTypeName = reader
								.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
						if (fullTypeName != null) {
							String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

							if (!"peticionNoVigentes".equals(type)) {
								// find namespace for the prefix
								String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
								return (PeticionNoVigentes) ExtensionMapper.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoCompania").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoCompania" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoCompania(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoPais").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoPais" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoPais(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setCodigoPais(Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "codigoRamo").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "codigoRamo" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setCodigoRamo(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setCodigoRamo(Integer.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "fechaConsulta").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "fechaConsulta" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setFechaConsulta(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroPoliza").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroPoliza" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroPoliza(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroPoliza(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroSuplemento").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroSuplemento" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroSuplemento(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

						reader.next();

					} // End of if for expected property start element

					else {

						object.setNumeroSuplemento(Long.MIN_VALUE);

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName("", "numeroDocumento").equals(reader.getName())) {

						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new org.apache.axis2.databinding.ADBException(
									"The element: " + "numeroDocumento" + "  cannot be null");
						}

						String content = reader.getElementText();

						object.setNumeroDocumento(
								org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement " + reader.getName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	private org.apache.axiom.om.OMElement toOM(
			GetDetallePolizaE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					GetDetallePolizaE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			GetDetallePolizaResponseE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					GetDetallePolizaResponseE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			GetPolizasE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					GetPolizasE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			GetPolizasResponseE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					GetPolizasResponseE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			GetPolizasNoVigentesE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					GetPolizasNoVigentesE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			GetPolizasNoVigentesResponseE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					GetPolizasNoVigentesResponseE.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			GetDetallePolizaE param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(
					GetDetallePolizaE.MY_QNAME,
					factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			GetPolizasE param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(
					GetPolizasE.MY_QNAME,
					factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			GetPolizasNoVigentesE param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(
					GetPolizasNoVigentesE.MY_QNAME,
					factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private Object fromOM(org.apache.axiom.om.OMElement param, Class type,
			java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

		try {

			if (GetDetallePolizaE.class
					.equals(type)) {

				return GetDetallePolizaE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (GetDetallePolizaResponseE.class
					.equals(type)) {

				return GetDetallePolizaResponseE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (GetPolizasE.class
					.equals(type)) {

				return GetPolizasE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (GetPolizasResponseE.class
					.equals(type)) {

				return GetPolizasResponseE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (GetPolizasNoVigentesE.class
					.equals(type)) {

				return GetPolizasNoVigentesE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (GetPolizasNoVigentesResponseE.class
					.equals(type)) {

				return GetPolizasNoVigentesResponseE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

}
