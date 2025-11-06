package es.ingnn.www;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;

import javax.xml.stream.XMLStreamReader;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface ObtenerInfoClienteResponseDocument extends XmlObject {
    public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader((ClassLoader)ObtenerInfoClienteResponseDocument.class.getClassLoader(), (String)"schemaorg_apache_xmlbeans.system.s735E385985A7C9D087476A7107BF45B8").resolveHandle("obtenerinfoclienteresponsefb51doctype");

    public ObtenerInfoClienteResponse getObtenerInfoClienteResponse();

    public void setObtenerInfoClienteResponse(ObtenerInfoClienteResponse var1);

    public ObtenerInfoClienteResponse addNewObtenerInfoClienteResponse();

    public static final class Factory {
        public static ObtenerInfoClienteResponseDocument newInstance() {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().newInstance(type, null);
        }

        public static ObtenerInfoClienteResponseDocument newInstance(XmlOptions options) {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().newInstance(type, options);
        }

        public static ObtenerInfoClienteResponseDocument parse(String xmlAsString) throws XmlException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, type, null);
        }

        public static ObtenerInfoClienteResponseDocument parse(String xmlAsString, XmlOptions options) throws XmlException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, type, options);
        }

        public static ObtenerInfoClienteResponseDocument parse(File file) throws XmlException, IOException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(file, type, null);
        }

        public static ObtenerInfoClienteResponseDocument parse(File file, XmlOptions options) throws XmlException, IOException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(file, type, options);
        }

        public static ObtenerInfoClienteResponseDocument parse(URL u) throws XmlException, IOException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(u, type, null);
        }

        public static ObtenerInfoClienteResponseDocument parse(URL u, XmlOptions options) throws XmlException, IOException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(u, type, options);
        }

        public static ObtenerInfoClienteResponseDocument parse(InputStream is) throws XmlException, IOException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(is, type, null);
        }

        public static ObtenerInfoClienteResponseDocument parse(InputStream is, XmlOptions options) throws XmlException, IOException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(is, type, options);
        }

        public static ObtenerInfoClienteResponseDocument parse(Reader r) throws XmlException, IOException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(r, type, null);
        }

        public static ObtenerInfoClienteResponseDocument parse(Reader r, XmlOptions options) throws XmlException, IOException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(r, type, options);
        }

        public static ObtenerInfoClienteResponseDocument parse(XMLStreamReader sr) throws XmlException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(sr, type, null);
        }

        public static ObtenerInfoClienteResponseDocument parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(sr, type, options);
        }

        public static ObtenerInfoClienteResponseDocument parse(Node node) throws XmlException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(node, type, null);
        }

        public static ObtenerInfoClienteResponseDocument parse(Node node, XmlOptions options) throws XmlException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(node, type, options);
        }

        public static ObtenerInfoClienteResponseDocument parse(XMLInputStream xis) throws XmlException, XMLStreamException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(xis, type, null);
        }

        public static ObtenerInfoClienteResponseDocument parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
            return (ObtenerInfoClienteResponseDocument)XmlBeans.getContextTypeLoader().parse(xis, type, options);
        }

        public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
            return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, type, null);
        }

        public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
            return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, type, options);
        }

        private Factory() {
        }
    }

    public static interface ObtenerInfoClienteResponse
    extends XmlObject {
        public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader((ClassLoader)ObtenerInfoClienteResponse.class.getClassLoader(), (String)"schemaorg_apache_xmlbeans.system.s735E385985A7C9D087476A7107BF45B8").resolveHandle("obtenerinfoclienteresponse1a43elemtype");

        public NNSalida getObtenerInfoClienteResult();

        public boolean isSetObtenerInfoClienteResult();

        public void setObtenerInfoClienteResult(NNSalida var1);

        public NNSalida addNewObtenerInfoClienteResult();

        public void unsetObtenerInfoClienteResult();

        public static final class Factory {
            public static ObtenerInfoClienteResponse newInstance() {
                return (ObtenerInfoClienteResponse)XmlBeans.getContextTypeLoader().newInstance(type, null);
            }

            public static ObtenerInfoClienteResponse newInstance(XmlOptions options) {
                return (ObtenerInfoClienteResponse)XmlBeans.getContextTypeLoader().newInstance(type, options);
            }

            private Factory() {
            }
        }

    }

}

