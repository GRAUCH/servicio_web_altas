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

public interface ObtenerInfoClienteDocument extends XmlObject {
    public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader((ClassLoader)ObtenerInfoClienteDocument.class.getClassLoader(), (String)"schemaorg_apache_xmlbeans.system.s735E385985A7C9D087476A7107BF45B8").resolveHandle("obtenerinfoclienteef12doctype");

    public ObtenerInfoCliente getObtenerInfoCliente();

    public void setObtenerInfoCliente(ObtenerInfoCliente var1);

    public ObtenerInfoCliente addNewObtenerInfoCliente();

    public static final class Factory {
        public static ObtenerInfoClienteDocument newInstance() {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().newInstance(type, null);
        }

        public static ObtenerInfoClienteDocument newInstance(XmlOptions options) {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().newInstance(type, options);
        }

        public static ObtenerInfoClienteDocument parse(String xmlAsString) throws XmlException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, type, null);
        }

        public static ObtenerInfoClienteDocument parse(String xmlAsString, XmlOptions options) throws XmlException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(xmlAsString, type, options);
        }

        public static ObtenerInfoClienteDocument parse(File file) throws XmlException, IOException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(file, type, null);
        }

        public static ObtenerInfoClienteDocument parse(File file, XmlOptions options) throws XmlException, IOException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(file, type, options);
        }

        public static ObtenerInfoClienteDocument parse(URL u) throws XmlException, IOException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(u, type, null);
        }

        public static ObtenerInfoClienteDocument parse(URL u, XmlOptions options) throws XmlException, IOException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(u, type, options);
        }

        public static ObtenerInfoClienteDocument parse(InputStream is) throws XmlException, IOException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(is, type, null);
        }

        public static ObtenerInfoClienteDocument parse(InputStream is, XmlOptions options) throws XmlException, IOException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(is, type, options);
        }

        public static ObtenerInfoClienteDocument parse(Reader r) throws XmlException, IOException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(r, type, null);
        }

        public static ObtenerInfoClienteDocument parse(Reader r, XmlOptions options) throws XmlException, IOException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(r, type, options);
        }

        public static ObtenerInfoClienteDocument parse(XMLStreamReader sr) throws XmlException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(sr, type, null);
        }

        public static ObtenerInfoClienteDocument parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(sr, type, options);
        }

        public static ObtenerInfoClienteDocument parse(Node node) throws XmlException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(node, type, null);
        }

        public static ObtenerInfoClienteDocument parse(Node node, XmlOptions options) throws XmlException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(node, type, options);
        }

        public static ObtenerInfoClienteDocument parse(XMLInputStream xis) throws XmlException, XMLStreamException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(xis, type, null);
        }

        public static ObtenerInfoClienteDocument parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
            return (ObtenerInfoClienteDocument)XmlBeans.getContextTypeLoader().parse(xis, type, options);
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

    public static interface ObtenerInfoCliente
    extends XmlObject {
        public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader((ClassLoader)ObtenerInfoCliente.class.getClassLoader(), (String)"schemaorg_apache_xmlbeans.system.s735E385985A7C9D087476A7107BF45B8").resolveHandle("obtenerinfoclientecde3elemtype");

        public String getToken();

        public XmlString xgetToken();

        public boolean isSetToken();

        public void setToken(String var1);

        public void xsetToken(XmlString var1);

        public void unsetToken();

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

        public String getProducto();

        public XmlString xgetProducto();

        public boolean isSetProducto();

        public void setProducto(String var1);

        public void xsetProducto(XmlString var1);

        public void unsetProducto();

        public static final class Factory {
            public static ObtenerInfoCliente newInstance() {
                return (ObtenerInfoCliente)XmlBeans.getContextTypeLoader().newInstance(type, null);
            }

            public static ObtenerInfoCliente newInstance(XmlOptions options) {
                return (ObtenerInfoCliente)XmlBeans.getContextTypeLoader().newInstance(type, options);
            }

            private Factory() {
            }
        }

    }

}

