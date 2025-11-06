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

public interface ObtenerTokenResponseDocument extends XmlObject {
    public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader((ClassLoader)ObtenerTokenResponseDocument.class.getClassLoader(), (String)"schemaorg_apache_xmlbeans.system.s735E385985A7C9D087476A7107BF45B8").resolveHandle("obtenertokenresponse1864doctype");

    public ObtenerTokenResponse getObtenerTokenResponse();

    public void setObtenerTokenResponse(ObtenerTokenResponse var1);

    public ObtenerTokenResponse addNewObtenerTokenResponse();

    public static final class Factory {
        public static ObtenerTokenResponseDocument newInstance() {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().newInstance(type, null);
        }

        public static ObtenerTokenResponseDocument newInstance(XmlOptions options) {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().newInstance(type, options);
        }

        public static ObtenerTokenResponseDocument parse(String xmlAsString) throws XmlException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, type, null);
        }

        public static ObtenerTokenResponseDocument parse(String xmlAsString, XmlOptions options) throws XmlException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, type, options);
        }

        public static ObtenerTokenResponseDocument parse(File file) throws XmlException, IOException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(file, type, null);
        }

        public static ObtenerTokenResponseDocument parse(File file, XmlOptions options) throws XmlException, IOException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(file, type, options);
        }

        public static ObtenerTokenResponseDocument parse(URL u) throws XmlException, IOException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(u, type, null);
        }

        public static ObtenerTokenResponseDocument parse(URL u, XmlOptions options) throws XmlException, IOException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(u, type, options);
        }

        public static ObtenerTokenResponseDocument parse(InputStream is) throws XmlException, IOException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(is, type, null);
        }

        public static ObtenerTokenResponseDocument parse(InputStream is, XmlOptions options) throws XmlException, IOException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(is, type, options);
        }

        public static ObtenerTokenResponseDocument parse(Reader r) throws XmlException, IOException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(r, type, null);
        }

        public static ObtenerTokenResponseDocument parse(Reader r, XmlOptions options) throws XmlException, IOException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(r, type, options);
        }

        public static ObtenerTokenResponseDocument parse(XMLStreamReader sr) throws XmlException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(sr, type, null);
        }

        public static ObtenerTokenResponseDocument parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(sr, type, options);
        }

        public static ObtenerTokenResponseDocument parse(Node node) throws XmlException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(node, type, null);
        }

        public static ObtenerTokenResponseDocument parse(Node node, XmlOptions options) throws XmlException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(node, type, options);
        }

        public static ObtenerTokenResponseDocument parse(XMLInputStream xis) throws XmlException, XMLStreamException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(xis, type, null);
        }

        public static ObtenerTokenResponseDocument parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
            return (ObtenerTokenResponseDocument)XmlBeans.getContextTypeLoader().parse(xis, type, options);
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

    public static interface ObtenerTokenResponse
    extends XmlObject {
        public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader((ClassLoader)ObtenerTokenResponse.class.getClassLoader(), (String)"schemaorg_apache_xmlbeans.system.s735E385985A7C9D087476A7107BF45B8").resolveHandle("obtenertokenresponse85a3elemtype");

        public NNSalida getObtenerTokenResult();

        public boolean isSetObtenerTokenResult();

        public void setObtenerTokenResult(NNSalida var1);

        public NNSalida addNewObtenerTokenResult();

        public void unsetObtenerTokenResult();

        public static final class Factory {
            public static ObtenerTokenResponse newInstance() {
                return (ObtenerTokenResponse)XmlBeans.getContextTypeLoader().newInstance(type, null);
            }

            public static ObtenerTokenResponse newInstance(XmlOptions options) {
                return (ObtenerTokenResponse)XmlBeans.getContextTypeLoader().newInstance(type, options);
            }

            private Factory() {
            }
        }

    }

}

