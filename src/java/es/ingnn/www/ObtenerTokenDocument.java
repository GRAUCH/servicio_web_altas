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
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface ObtenerTokenDocument extends XmlObject {
    public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader((ClassLoader)ObtenerTokenDocument.class.getClassLoader(), (String)"schemaorg_apache_xmlbeans.system.s735E385985A7C9D087476A7107BF45B8").resolveHandle("obtenertokencf25doctype");

    public ObtenerToken getObtenerToken();

    public void setObtenerToken(ObtenerToken var1);

    public ObtenerToken addNewObtenerToken();

    public static final class Factory {
        public static ObtenerTokenDocument newInstance() {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().newInstance(type, null);
        }

        public static ObtenerTokenDocument newInstance(XmlOptions options) {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().newInstance(type, options);
        }

        public static ObtenerTokenDocument parse(String xmlAsString) throws XmlException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, type, null);
        }

        public static ObtenerTokenDocument parse(String xmlAsString, XmlOptions options) throws XmlException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, type, options);
        }

        public static ObtenerTokenDocument parse(File file) throws XmlException, IOException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(file, type, null);
        }

        public static ObtenerTokenDocument parse(File file, XmlOptions options) throws XmlException, IOException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(file, type, options);
        }

        public static ObtenerTokenDocument parse(URL u) throws XmlException, IOException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(u, type, null);
        }

        public static ObtenerTokenDocument parse(URL u, XmlOptions options) throws XmlException, IOException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(u, type, options);
        }

        public static ObtenerTokenDocument parse(InputStream is) throws XmlException, IOException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(is, type, null);
        }

        public static ObtenerTokenDocument parse(InputStream is, XmlOptions options) throws XmlException, IOException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(is, type, options);
        }

        public static ObtenerTokenDocument parse(Reader r) throws XmlException, IOException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(r, type, null);
        }

        public static ObtenerTokenDocument parse(Reader r, XmlOptions options) throws XmlException, IOException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(r, type, options);
        }

        public static ObtenerTokenDocument parse(XMLStreamReader sr) throws XmlException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(sr, type, null);
        }

        public static ObtenerTokenDocument parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(sr, type, options);
        }

        public static ObtenerTokenDocument parse(Node node) throws XmlException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(node, type, null);
        }

        public static ObtenerTokenDocument parse(Node node, XmlOptions options) throws XmlException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(node, type, options);
        }

        public static ObtenerTokenDocument parse(XMLInputStream xis) throws XmlException, XMLStreamException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(xis, type, null);
        }

        public static ObtenerTokenDocument parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
            return (ObtenerTokenDocument)XmlBeans.getContextTypeLoader().parse(xis, type, options);
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

    public static interface ObtenerToken
    extends XmlObject {
        public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader((ClassLoader)ObtenerToken.class.getClassLoader(), (String)"schemaorg_apache_xmlbeans.system.s735E385985A7C9D087476A7107BF45B8").resolveHandle("obtenertoken4983elemtype");

        public String getUser();

        public XmlString xgetUser();

        public boolean isSetUser();

        public void setUser(String var1);

        public void xsetUser(XmlString var1);

        public void unsetUser();

        public String getPassword();

        public XmlString xgetPassword();

        public boolean isSetPassword();

        public void setPassword(String var1);

        public void xsetPassword(XmlString var1);

        public void unsetPassword();

        public String getDni();

        public XmlString xgetDni();

        public boolean isSetDni();

        public void setDni(String var1);

        public void xsetDni(XmlString var1);

        public void unsetDni();

        public String getPoliza();

        public XmlString xgetPoliza();

        public boolean isSetPoliza();

        public void setPoliza(String var1);

        public void xsetPoliza(XmlString var1);

        public void unsetPoliza();

        public static final class Factory {
            public static ObtenerToken newInstance() {
                return (ObtenerToken)XmlBeans.getContextTypeLoader().newInstance(type, null);
            }

            public static ObtenerToken newInstance(XmlOptions options) {
                return (ObtenerToken)XmlBeans.getContextTypeLoader().newInstance(type, options);
            }

            private Factory() {
            }
        }

    }

}

