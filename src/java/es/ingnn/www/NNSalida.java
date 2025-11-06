package es.ingnn.www;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;

import javax.xml.stream.XMLStreamReader;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface NNSalida extends XmlObject {
    public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader((ClassLoader)NNSalida.class.getClassLoader(), (String)"schemaorg_apache_xmlbeans.system.s735E385985A7C9D087476A7107BF45B8").resolveHandle("nnsalida8d82type");

    public boolean getExisteError();

    public XmlBoolean xgetExisteError();

    public void setExisteError(boolean var1);

    public void xsetExisteError(XmlBoolean var1);

    public String getMsgError();

    public XmlString xgetMsgError();

    public boolean isSetMsgError();

    public void setMsgError(String var1);

    public void xsetMsgError(XmlString var1);

    public void unsetMsgError();

    public String getValor();

    public XmlString xgetValor();

    public boolean isSetValor();

    public void setValor(String var1);

    public void xsetValor(XmlString var1);

    public void unsetValor();

    public Datos getDatos();

    public boolean isSetDatos();

    public void setDatos(Datos var1);

    public Datos addNewDatos();

    public void unsetDatos();

    public static final class Factory {
        public static NNSalida newInstance() {
            return (NNSalida)XmlBeans.getContextTypeLoader().newInstance(type, null);
        }

        public static NNSalida newInstance(XmlOptions options) {
            return (NNSalida)XmlBeans.getContextTypeLoader().newInstance(type, options);
        }

        public static NNSalida parse(String xmlAsString) throws XmlException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(xmlAsString, type, null);
        }

        public static NNSalida parse(String xmlAsString, XmlOptions options) throws XmlException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(xmlAsString, type, options);
        }

        public static NNSalida parse(File file) throws XmlException, IOException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(file, type, null);
        }

        public static NNSalida parse(File file, XmlOptions options) throws XmlException, IOException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(file, type, options);
        }

        public static NNSalida parse(URL u) throws XmlException, IOException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(u, type, null);
        }

        public static NNSalida parse(URL u, XmlOptions options) throws XmlException, IOException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(u, type, options);
        }

        public static NNSalida parse(InputStream is) throws XmlException, IOException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(is, type, null);
        }

        public static NNSalida parse(InputStream is, XmlOptions options) throws XmlException, IOException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(is, type, options);
        }

        public static NNSalida parse(Reader r) throws XmlException, IOException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(r, type, null);
        }

        public static NNSalida parse(Reader r, XmlOptions options) throws XmlException, IOException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(r, type, options);
        }

        public static NNSalida parse(XMLStreamReader sr) throws XmlException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(sr, type, null);
        }

        public static NNSalida parse(XMLStreamReader sr, XmlOptions options) throws XmlException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(sr, type, options);
        }

        public static NNSalida parse(Node node) throws XmlException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(node, type, null);
        }

        public static NNSalida parse(Node node, XmlOptions options) throws XmlException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(node, type, options);
        }

        public static NNSalida parse(XMLInputStream xis) throws XmlException, XMLStreamException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(xis, type, null);
        }

        public static NNSalida parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
            return (NNSalida)XmlBeans.getContextTypeLoader().parse(xis, type, options);
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

    public static interface Datos
    extends XmlObject {
        public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader((ClassLoader)Datos.class.getClassLoader(), (String)"schemaorg_apache_xmlbeans.system.s735E385985A7C9D087476A7107BF45B8").resolveHandle("datosfc5belemtype");

        public SchemaDocument.Schema getSchema();

        public void setSchema(SchemaDocument.Schema var1);

        public SchemaDocument.Schema addNewSchema();

        public static final class Factory {
            public static Datos newInstance() {
                return (Datos)XmlBeans.getContextTypeLoader().newInstance(type, null);
            }

            public static Datos newInstance(XmlOptions options) {
                return (Datos)XmlBeans.getContextTypeLoader().newInstance(type, options);
            }

            private Factory() {
            }
        }

    }

}

