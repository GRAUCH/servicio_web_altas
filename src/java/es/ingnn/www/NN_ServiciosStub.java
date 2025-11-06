package es.ingnn.www;

import org.apache.axiom.om.*;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPFactory;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.FaultMapKey;
import org.apache.axis2.client.OperationClient;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.client.Stub;
import org.apache.axis2.client.async.AxisCallback;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.description.AxisOperation;
import org.apache.axis2.description.AxisService;
import org.apache.axis2.description.OutInAxisOperation;
import org.apache.axis2.engine.MessageReceiver;
import org.apache.axis2.util.CallbackReceiver;
import org.apache.axis2.util.Utils;
import org.apache.axis2.xmlbeans.XmlBeansXMLReader;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NN_ServiciosStub extends Stub {
    protected AxisOperation[] _operations;
    private HashMap faultExceptionNameMap = new HashMap();
    private HashMap faultExceptionClassNameMap = new HashMap();
    private HashMap faultMessageMap = new HashMap();
    private static int counter = 0;
    private QName[] opNameArray = null;

    private static synchronized String getUniqueSuffix() {
        if (counter > 99999) {
            counter = 0;
        }
        return Long.toString(System.currentTimeMillis()) + "_" + ++counter;
    }

    private void populateAxisService() throws AxisFault {
        this._service = new AxisService("NN_Servicios" + NN_ServiciosStub.getUniqueSuffix());
        this.addAnonymousOperations();
        this._operations = new AxisOperation[2];
        OutInAxisOperation __operation = new OutInAxisOperation();
        __operation.setName(new QName("https://www.ingnn.es", "obtenerToken"));
        this._service.addOperation((AxisOperation) __operation);
        this._operations[0] = __operation;
        __operation = new OutInAxisOperation();
        __operation.setName(new QName("https://www.ingnn.es", "obtenerInfoCliente"));
        this._service.addOperation((AxisOperation) __operation);
        this._operations[1] = __operation;
    }

    private void populateFaults() {
    }

    public NN_ServiciosStub(ConfigurationContext configurationContext, String targetEndpoint) throws AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    public NN_ServiciosStub(ConfigurationContext configurationContext, String targetEndpoint, boolean useSeparateListener) throws AxisFault {
        this.populateAxisService();
        this.populateFaults();
        this._serviceClient = new ServiceClient(configurationContext, this._service);
        this._serviceClient.getOptions().setTo(new EndpointReference(targetEndpoint));
        this._serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        this._serviceClient.getOptions().setTimeOutInMilliSeconds(30000);
//        this._serviceClient.getOptions().setUserName("wstestusernet");
//        this._serviceClient.getOptions().setPassword("test!token$2014");
//        this._serviceClient.getOptions().setProperty(HTTPConstants.CHUNKED, false);
        this._serviceClient.getOptions().setSoapVersionURI("http://www.w3.org/2003/05/soap-envelope");
    }

    public NN_ServiciosStub(ConfigurationContext configurationContext) throws AxisFault {
        this(configurationContext, "https://externalwebservices.nnseguros.es/INGNN_SW_CS_IntegracionSiniestros/NN_Servicios.asmx");
//        this(configurationContext, "https://externalwebservicesnnt.nne.es/INGNN_SW_CS_IntegracionSiniestros/NN_Servicios.asmx");
    }

    public NN_ServiciosStub() throws AxisFault {
        this("https://externalwebservices.nnseguros.es/INGNN_SW_CS_IntegracionSiniestros/NN_Servicios.asmx");
//        this("https://externalwebservicesnnt.nne.es/INGNN_SW_CS_IntegracionSiniestros/NN_Servicios.asmx");
    }

    public NN_ServiciosStub(String targetEndpoint) throws AxisFault {
        this(null, targetEndpoint);
    }

    public ObtenerTokenResponseDocument obtenerToken(ObtenerTokenDocument obtenerToken0) throws RemoteException {
        ObtenerTokenResponseDocument obtenerTokenResponseDocument;
        MessageContext _messageContext = null;
        try {
            OperationClient _operationClient = this._serviceClient.createClient(this._operations[0].getName());
            _operationClient.getOptions().setAction("https://www.ingnn.es/ObtenerToken");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);
            this.addPropertyToOperationClient(_operationClient, "whttp:queryParameterSeparator", (Object) "&");
            _messageContext = new MessageContext();
            SOAPEnvelope env = null;
            env = this.toEnvelope(NN_ServiciosStub.getFactory((String) _operationClient.getOptions().getSoapVersionURI()), obtenerToken0, this.optimizeContent(new QName("https://www.ingnn.es", "obtenerToken")), new QName("https://www.ingnn.es", "obtenerToken"));
            this._serviceClient.addHeadersToEnvelope(env);
            _messageContext.setEnvelope(env);
            _operationClient.addMessageContext(_messageContext);
            _operationClient.execute(true);
            MessageContext _returnMessageContext = _operationClient.getMessageContext("In");
            SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
            XmlObject object = this.fromOM(_returnEnv.getBody().getFirstElement(), ObtenerTokenResponseDocument.class, this.getEnvelopeNamespaces(_returnEnv));
            obtenerTokenResponseDocument = (ObtenerTokenResponseDocument) object;
        } catch (AxisFault f) {
            try {
                OMElement faultElt = f.getDetail();
                if (faultElt != null) {
                    if (this.faultExceptionNameMap.containsKey((Object) new FaultMapKey(faultElt.getQName(), "ObtenerToken"))) {
                        try {
                            String exceptionClassName = (String) this.faultExceptionClassNameMap.get((Object) new FaultMapKey(faultElt.getQName(), "ObtenerToken"));
                            Class<?> exceptionClass = Class.forName(exceptionClassName);
                            Constructor<?> constructor = exceptionClass.getConstructor(String.class);
                            Exception ex = (Exception) constructor.newInstance(f.getMessage());
                            String messageClassName = (String) this.faultMessageMap.get((Object) new FaultMapKey(faultElt.getQName(), "ObtenerToken"));
                            Class<?> messageClass = Class.forName(messageClassName);
                            XmlObject messageObject = this.fromOM(faultElt, messageClass, null);
                            Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
                            m.invoke(ex, new Object[]{messageObject});
                            throw new RemoteException(ex.getMessage(), ex);
                        } catch (ClassCastException e) {
                            throw f;
                        } catch (ClassNotFoundException e) {
                            throw f;
                        } catch (NoSuchMethodException e) {
                            throw f;
                        } catch (InvocationTargetException e) {
                            throw f;
                        } catch (IllegalAccessException e) {
                            throw f;
                        } catch (InstantiationException e) {
                            throw f;
                        }
                    }
                    throw f;
                }
                throw f;
            } catch (Exception e) {
                if (_messageContext.getTransportOut() != null) {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }

                throw AxisFault.makeFault((Throwable) e);

            }
        }
        if (_messageContext.getTransportOut() != null) {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
        return obtenerTokenResponseDocument;
    }

    public void startobtenerToken(ObtenerTokenDocument obtenerToken0, final NN_ServiciosCallbackHandler callback) throws RemoteException {
        OperationClient _operationClient = this._serviceClient.createClient(this._operations[0].getName());
        _operationClient.getOptions().setAction("https://www.ingnn.es/ObtenerToken");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);
        this.addPropertyToOperationClient(_operationClient, "whttp:queryParameterSeparator", (Object) "&");
        SOAPEnvelope env = null;
        final MessageContext _messageContext = new MessageContext();
        env = this.toEnvelope(NN_ServiciosStub.getFactory((String) _operationClient.getOptions().getSoapVersionURI()), obtenerToken0, this.optimizeContent(new QName("https://www.ingnn.es", "obtenerToken")), new QName("https://www.ingnn.es", "obtenerToken"));
        this._serviceClient.addHeadersToEnvelope(env);
        _messageContext.setEnvelope(env);
        _operationClient.addMessageContext(_messageContext);
        _operationClient.setCallback(new AxisCallback() {

            public void onMessage(MessageContext resultContext) {
                try {
                    SOAPEnvelope resultEnv = resultContext.getEnvelope();
                    XmlObject object = NN_ServiciosStub.this.fromOM(resultEnv.getBody().getFirstElement(), ObtenerTokenResponseDocument.class, NN_ServiciosStub.this.getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultobtenerToken((ObtenerTokenResponseDocument) object);
                } catch (AxisFault e) {
                    callback.receiveErrorobtenerToken((Exception) ((Object) e));
                }
            }

            public void onError(Exception error) {
                if (error instanceof AxisFault) {
                    AxisFault f = (AxisFault) ((Object) error);
                    OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (NN_ServiciosStub.this.faultExceptionNameMap.containsKey((Object) new FaultMapKey(faultElt.getQName(), "ObtenerToken"))) {
                            try {
                                String exceptionClassName = (String) NN_ServiciosStub.this.faultExceptionClassNameMap.get((Object) new FaultMapKey(faultElt.getQName(), "ObtenerToken"));
                                Class<?> exceptionClass = Class.forName(exceptionClassName);
                                Constructor<?> constructor = exceptionClass.getConstructor(String.class);
                                Exception ex = (Exception) constructor.newInstance(f.getMessage());
                                String messageClassName = (String) NN_ServiciosStub.this.faultMessageMap.get((Object) new FaultMapKey(faultElt.getQName(), "ObtenerToken"));
                                Class<?> messageClass = Class.forName(messageClassName);
                                XmlObject messageObject = NN_ServiciosStub.this.fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
                                m.invoke(ex, new Object[]{messageObject});
                                callback.receiveErrorobtenerToken(new RemoteException(ex.getMessage(), ex));
                            } catch (ClassCastException e) {
                                callback.receiveErrorobtenerToken((Exception) ((Object) f));
                            } catch (ClassNotFoundException e) {
                                callback.receiveErrorobtenerToken((Exception) ((Object) f));
                            } catch (NoSuchMethodException e) {
                                callback.receiveErrorobtenerToken((Exception) ((Object) f));
                            } catch (InvocationTargetException e) {
                                callback.receiveErrorobtenerToken((Exception) ((Object) f));
                            } catch (IllegalAccessException e) {
                                callback.receiveErrorobtenerToken((Exception) ((Object) f));
                            } catch (InstantiationException e) {
                                callback.receiveErrorobtenerToken((Exception) ((Object) f));
                            } catch (AxisFault e) {
                                callback.receiveErrorobtenerToken((Exception) ((Object) f));
                            }
                        } else {
                            callback.receiveErrorobtenerToken((Exception) ((Object) f));
                        }
                    } else {
                        callback.receiveErrorobtenerToken((Exception) ((Object) f));
                    }
                } else {
                    callback.receiveErrorobtenerToken(error);
                }
            }

            public void onFault(MessageContext faultContext) {
                AxisFault fault = Utils.getInboundFaultFromMessageContext((MessageContext) faultContext);
                this.onError((Exception) ((Object) fault));
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (AxisFault axisFault) {
                    callback.receiveErrorobtenerToken((Exception) ((Object) axisFault));
                }
            }
        });
        CallbackReceiver _callbackReceiver = null;
        if (this._operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new CallbackReceiver();
            this._operations[0].setMessageReceiver((MessageReceiver) _callbackReceiver);
        }
        _operationClient.execute(false);
    }

    public ObtenerInfoClienteResponseDocument obtenerInfoCliente(ObtenerInfoClienteDocument obtenerInfoCliente2) throws RemoteException {
        ObtenerInfoClienteResponseDocument obtenerInfoClienteResponseDocument;
        MessageContext _messageContext = null;
        try {
            OperationClient _operationClient = this._serviceClient.createClient(this._operations[1].getName());
            _operationClient.getOptions().setAction("https://www.ingnn.es/ObtenerInfoCliente");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);
            this.addPropertyToOperationClient(_operationClient, "whttp:queryParameterSeparator", (Object) "&");
            _messageContext = new MessageContext();
            SOAPEnvelope env = null;
            env = this.toEnvelope(NN_ServiciosStub.getFactory((String) _operationClient.getOptions().getSoapVersionURI()), obtenerInfoCliente2, this.optimizeContent(new QName("https://www.ingnn.es", "obtenerInfoCliente")), new QName("https://www.ingnn.es", "obtenerInfoCliente"));
            this._serviceClient.addHeadersToEnvelope(env);
            _messageContext.setEnvelope(env);
            _operationClient.addMessageContext(_messageContext);
            _operationClient.execute(true);
            MessageContext _returnMessageContext = _operationClient.getMessageContext("In");
            SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
            XmlObject object = this.fromOM(_returnEnv.getBody().getFirstElement(), ObtenerInfoClienteResponseDocument.class, this.getEnvelopeNamespaces(_returnEnv));
            obtenerInfoClienteResponseDocument = (ObtenerInfoClienteResponseDocument) object;
        } catch (AxisFault f) {
            try {
                OMElement faultElt = f.getDetail();
                if (faultElt != null) {
                    if (this.faultExceptionNameMap.containsKey((Object) new FaultMapKey(faultElt.getQName(), "ObtenerInfoCliente"))) {
                        try {
                            String exceptionClassName = (String) this.faultExceptionClassNameMap.get((Object) new FaultMapKey(faultElt.getQName(), "ObtenerInfoCliente"));
                            Class<?> exceptionClass = Class.forName(exceptionClassName);
                            Constructor<?> constructor = exceptionClass.getConstructor(String.class);
                            Exception ex = (Exception) constructor.newInstance(f.getMessage());
                            String messageClassName = (String) this.faultMessageMap.get((Object) new FaultMapKey(faultElt.getQName(), "ObtenerInfoCliente"));
                            Class<?> messageClass = Class.forName(messageClassName);
                            XmlObject messageObject = this.fromOM(faultElt, messageClass, null);
                            Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
                            m.invoke(ex, new Object[]{messageObject});
                            throw new RemoteException(ex.getMessage(), ex);
                        } catch (ClassCastException e) {
                            throw f;
                        } catch (ClassNotFoundException e) {
                            throw f;
                        } catch (NoSuchMethodException e) {
                            throw f;
                        } catch (InvocationTargetException e) {
                            throw f;
                        } catch (IllegalAccessException e) {
                            throw f;
                        } catch (InstantiationException e) {
                            throw f;
                        }
                    }
                    throw f;
                }
                throw f;
            } catch (Exception e) {
                throw AxisFault.makeFault((Throwable) e);
            }
        }
        if (_messageContext.getTransportOut() != null) {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
        }
        return obtenerInfoClienteResponseDocument;
    }

    public void startobtenerInfoCliente(ObtenerInfoClienteDocument obtenerInfoCliente2, final NN_ServiciosCallbackHandler callback) throws RemoteException {
        OperationClient _operationClient = this._serviceClient.createClient(this._operations[1].getName());
        _operationClient.getOptions().setAction("https://www.ingnn.es/ObtenerInfoCliente");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);
        this.addPropertyToOperationClient(_operationClient, "whttp:queryParameterSeparator", (Object) "&");
        SOAPEnvelope env = null;
        final MessageContext _messageContext = new MessageContext();
        env = this.toEnvelope(NN_ServiciosStub.getFactory((String) _operationClient.getOptions().getSoapVersionURI()), obtenerInfoCliente2, this.optimizeContent(new QName("https://www.ingnn.es", "obtenerInfoCliente")), new QName("https://www.ingnn.es", "obtenerInfoCliente"));
        this._serviceClient.addHeadersToEnvelope(env);
        _messageContext.setEnvelope(env);
        _operationClient.addMessageContext(_messageContext);
        _operationClient.setCallback(new AxisCallback() {

            public void onMessage(MessageContext resultContext) {
                try {
                    SOAPEnvelope resultEnv = resultContext.getEnvelope();
                    XmlObject object = NN_ServiciosStub.this.fromOM(resultEnv.getBody().getFirstElement(), ObtenerInfoClienteResponseDocument.class, NN_ServiciosStub.this.getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultobtenerInfoCliente((ObtenerInfoClienteResponseDocument) object);
                } catch (AxisFault e) {
                    callback.receiveErrorobtenerInfoCliente((Exception) ((Object) e));
                }
            }

            public void onError(Exception error) {
                if (error instanceof AxisFault) {
                    AxisFault f = (AxisFault) ((Object) error);
                    OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (NN_ServiciosStub.this.faultExceptionNameMap.containsKey((Object) new FaultMapKey(faultElt.getQName(), "ObtenerInfoCliente"))) {
                            try {
                                String exceptionClassName = (String) NN_ServiciosStub.this.faultExceptionClassNameMap.get((Object) new FaultMapKey(faultElt.getQName(), "ObtenerInfoCliente"));
                                Class<?> exceptionClass = Class.forName(exceptionClassName);
                                Constructor<?> constructor = exceptionClass.getConstructor(String.class);
                                Exception ex = (Exception) constructor.newInstance(f.getMessage());
                                String messageClassName = (String) NN_ServiciosStub.this.faultMessageMap.get((Object) new FaultMapKey(faultElt.getQName(), "ObtenerInfoCliente"));
                                Class<?> messageClass = Class.forName(messageClassName);
                                XmlObject messageObject = NN_ServiciosStub.this.fromOM(faultElt, messageClass, null);
                                Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
                                m.invoke(ex, new Object[]{messageObject});
                                callback.receiveErrorobtenerInfoCliente(new RemoteException(ex.getMessage(), ex));
                            } catch (ClassCastException e) {
                                callback.receiveErrorobtenerInfoCliente((Exception) ((Object) f));
                            } catch (ClassNotFoundException e) {
                                callback.receiveErrorobtenerInfoCliente((Exception) ((Object) f));
                            } catch (NoSuchMethodException e) {
                                callback.receiveErrorobtenerInfoCliente((Exception) ((Object) f));
                            } catch (InvocationTargetException e) {
                                callback.receiveErrorobtenerInfoCliente((Exception) ((Object) f));
                            } catch (IllegalAccessException e) {
                                callback.receiveErrorobtenerInfoCliente((Exception) ((Object) f));
                            } catch (InstantiationException e) {
                                callback.receiveErrorobtenerInfoCliente((Exception) ((Object) f));
                            } catch (AxisFault e) {
                                callback.receiveErrorobtenerInfoCliente((Exception) ((Object) f));
                            }
                        } else {
                            callback.receiveErrorobtenerInfoCliente((Exception) ((Object) f));
                        }
                    } else {
                        callback.receiveErrorobtenerInfoCliente((Exception) ((Object) f));
                    }
                } else {
                    callback.receiveErrorobtenerInfoCliente(error);
                }
            }

            public void onFault(MessageContext faultContext) {
                AxisFault fault = Utils.getInboundFaultFromMessageContext((MessageContext) faultContext);
                this.onError((Exception) ((Object) fault));
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (AxisFault axisFault) {
                    callback.receiveErrorobtenerInfoCliente((Exception) ((Object) axisFault));
                }
            }
        });
        CallbackReceiver _callbackReceiver = null;
        if (this._operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new CallbackReceiver();
            this._operations[1].setMessageReceiver((MessageReceiver) _callbackReceiver);
        }
        _operationClient.execute(false);
    }

    private Map getEnvelopeNamespaces(SOAPEnvelope env) {
        HashMap<String, String> returnMap = new HashMap<String, String>();
        Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            OMNamespace ns = (OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }
        return returnMap;
    }

    private boolean optimizeContent(QName opName) {
        if (this.opNameArray == null) {
            return false;
        }
        for (int i = 0; i < this.opNameArray.length; ++i) {
            if (!opName.equals(this.opNameArray[i])) continue;
            return true;
        }
        return false;
    }

    private OMElement toOM(ObtenerTokenDocument param, boolean optimizeContent) throws AxisFault {
        return this.toOM(param);
    }

    private OMElement toOM(ObtenerTokenDocument param) throws AxisFault {
        XmlOptions xmlOptions = new XmlOptions();
        xmlOptions.setSaveNoXmlDecl();
        xmlOptions.setSaveAggressiveNamespaces();
        xmlOptions.setSaveNamespacesFirst();
        OMXMLParserWrapper builder = OMXMLBuilderFactory.createOMBuilder((Source) new SAXSource((XMLReader) new XmlBeansXMLReader((XmlObject) param, xmlOptions), new InputSource()));
        try {
            return builder.getDocumentElement(true);
        } catch (Exception e) {
            throw AxisFault.makeFault((Throwable) e);
        }
    }

    private OMElement toOM(ObtenerTokenResponseDocument param, boolean optimizeContent) throws AxisFault {
        return this.toOM(param);
    }

    private OMElement toOM(ObtenerTokenResponseDocument param) throws AxisFault {
        XmlOptions xmlOptions = new XmlOptions();
        xmlOptions.setSaveNoXmlDecl();
        xmlOptions.setSaveAggressiveNamespaces();
        xmlOptions.setSaveNamespacesFirst();
        OMXMLParserWrapper builder = OMXMLBuilderFactory.createOMBuilder((Source) new SAXSource((XMLReader) new XmlBeansXMLReader((XmlObject) param, xmlOptions), new InputSource()));
        try {
            return builder.getDocumentElement(true);
        } catch (Exception e) {
            throw AxisFault.makeFault((Throwable) e);
        }
    }

    private OMElement toOM(ObtenerInfoClienteDocument param, boolean optimizeContent) throws AxisFault {
        return this.toOM(param);
    }

    private OMElement toOM(ObtenerInfoClienteDocument param) throws AxisFault {
        XmlOptions xmlOptions = new XmlOptions();
        xmlOptions.setSaveNoXmlDecl();
        xmlOptions.setSaveAggressiveNamespaces();
        xmlOptions.setSaveNamespacesFirst();
        OMXMLParserWrapper builder = OMXMLBuilderFactory.createOMBuilder((Source) new SAXSource((XMLReader) new XmlBeansXMLReader((XmlObject) param, xmlOptions), new InputSource()));
        try {
            return builder.getDocumentElement(true);
        } catch (Exception e) {
            throw AxisFault.makeFault((Throwable) e);
        }
    }

    private OMElement toOM(ObtenerInfoClienteResponseDocument param, boolean optimizeContent) throws AxisFault {
        return this.toOM(param);
    }

    private OMElement toOM(ObtenerInfoClienteResponseDocument param) throws AxisFault {
        XmlOptions xmlOptions = new XmlOptions();
        xmlOptions.setSaveNoXmlDecl();
        xmlOptions.setSaveAggressiveNamespaces();
        xmlOptions.setSaveNamespacesFirst();
        OMXMLParserWrapper builder = OMXMLBuilderFactory.createOMBuilder((Source) new SAXSource((XMLReader) new XmlBeansXMLReader((XmlObject) param, xmlOptions), new InputSource()));
        try {
            return builder.getDocumentElement(true);
        } catch (Exception e) {
            throw AxisFault.makeFault((Throwable) e);
        }
    }

    private SOAPEnvelope toEnvelope(SOAPFactory factory, ObtenerTokenDocument param, boolean optimizeContent, QName methodQName) throws AxisFault {
        SOAPEnvelope envelope = factory.getDefaultEnvelope();
        if (param != null) {
            envelope.getBody().addChild((OMNode) this.toOM(param, optimizeContent));
        }
        return envelope;
    }

    private SOAPEnvelope toEnvelope(SOAPFactory factory, ObtenerInfoClienteDocument param, boolean optimizeContent, QName methodQName) throws AxisFault {
        SOAPEnvelope envelope = factory.getDefaultEnvelope();
        if (param != null) {
            envelope.getBody().addChild((OMNode) this.toOM(param, optimizeContent));
        }
        return envelope;
    }

    private SOAPEnvelope toEnvelope(SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    public XmlObject fromOM(OMElement param, Class type, Map extraNamespaces) throws AxisFault {
        try {
            if (ObtenerTokenDocument.class.equals((Object) type)) {
                if (extraNamespaces != null) {
                    return ObtenerTokenDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching(), new XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
                }
                return ObtenerTokenDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (ObtenerTokenResponseDocument.class.equals((Object) type)) {
                if (extraNamespaces != null) {
                    return ObtenerTokenResponseDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching(), new XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
                }
                return ObtenerTokenResponseDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (ObtenerInfoClienteDocument.class.equals((Object) type)) {
                if (extraNamespaces != null) {
                    return ObtenerInfoClienteDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching(), new XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
                }
                return ObtenerInfoClienteDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (ObtenerInfoClienteResponseDocument.class.equals((Object) type)) {
                if (extraNamespaces != null) {
                    return ObtenerInfoClienteResponseDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching(), new XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
                }
                return ObtenerInfoClienteResponseDocument.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (Exception e) {
            throw AxisFault.makeFault((Throwable) e);
        }
        return null;
    }

}

