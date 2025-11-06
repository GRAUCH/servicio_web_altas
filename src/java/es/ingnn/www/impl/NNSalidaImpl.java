package es.ingnn.www.impl;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument;

import es.ingnn.www.NNSalida;

public class NNSalidaImpl extends XmlComplexContentImpl implements NNSalida {
    
	private static final long serialVersionUID = -4333863696868580636L;
	
	private static final QName EXISTEERROR$0 = new QName("https://www.ingnn.es", "ExisteError");
    private static final QName MSGERROR$2 = new QName("https://www.ingnn.es", "MsgError");
    private static final QName VALOR$4 = new QName("https://www.ingnn.es", "Valor");
    private static final QName DATOS$6 = new QName("https://www.ingnn.es", "Datos");

    public NNSalidaImpl(SchemaType sType) {
        super(sType);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean getExisteError() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)this.get_store().find_element_user(EXISTEERROR$0, 0);
            if (target == null) {
                return false;
            }
            return target.getBooleanValue();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public XmlBoolean xgetExisteError() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)this.get_store().find_element_user(EXISTEERROR$0, 0);
            return target;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void setExisteError(boolean existeError) {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)this.get_store().find_element_user(EXISTEERROR$0, 0);
            if (target == null) {
                target = (SimpleValue)this.get_store().add_element_user(EXISTEERROR$0);
            }
            target.setBooleanValue(existeError);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void xsetExisteError(XmlBoolean existeError) {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            XmlBoolean target = null;
            target = (XmlBoolean)this.get_store().find_element_user(EXISTEERROR$0, 0);
            if (target == null) {
                target = (XmlBoolean)this.get_store().add_element_user(EXISTEERROR$0);
            }
            target.set((XmlObject)existeError);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public String getMsgError() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)this.get_store().find_element_user(MSGERROR$2, 0);
            if (target == null) {
                return null;
            }
            return target.getStringValue();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public XmlString xgetMsgError() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            XmlString target = null;
            target = (XmlString)this.get_store().find_element_user(MSGERROR$2, 0);
            return target;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean isSetMsgError() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            return this.get_store().count_elements(MSGERROR$2) != 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void setMsgError(String msgError) {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)this.get_store().find_element_user(MSGERROR$2, 0);
            if (target == null) {
                target = (SimpleValue)this.get_store().add_element_user(MSGERROR$2);
            }
            target.setStringValue(msgError);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void xsetMsgError(XmlString msgError) {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            XmlString target = null;
            target = (XmlString)this.get_store().find_element_user(MSGERROR$2, 0);
            if (target == null) {
                target = (XmlString)this.get_store().add_element_user(MSGERROR$2);
            }
            target.set((XmlObject)msgError);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void unsetMsgError() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            this.get_store().remove_element(MSGERROR$2, 0);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public String getValor() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)this.get_store().find_element_user(VALOR$4, 0);
            if (target == null) {
                return null;
            }
            return target.getStringValue();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public XmlString xgetValor() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            XmlString target = null;
            target = (XmlString)this.get_store().find_element_user(VALOR$4, 0);
            return target;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean isSetValor() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            return this.get_store().count_elements(VALOR$4) != 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void setValor(String valor) {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            SimpleValue target = null;
            target = (SimpleValue)this.get_store().find_element_user(VALOR$4, 0);
            if (target == null) {
                target = (SimpleValue)this.get_store().add_element_user(VALOR$4);
            }
            target.setStringValue(valor);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void xsetValor(XmlString valor) {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            XmlString target = null;
            target = (XmlString)this.get_store().find_element_user(VALOR$4, 0);
            if (target == null) {
                target = (XmlString)this.get_store().add_element_user(VALOR$4);
            }
            target.set((XmlObject)valor);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void unsetValor() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            this.get_store().remove_element(VALOR$4, 0);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Datos getDatos() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            Datos target = null;
            target = (Datos)this.get_store().find_element_user(DATOS$6, 0);
            if (target == null) {
                return null;
            }
            return target;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean isSetDatos() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            return this.get_store().count_elements(DATOS$6) != 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void setDatos(Datos datos) {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            Datos target = null;
            target = (Datos)this.get_store().find_element_user(DATOS$6, 0);
            if (target == null) {
                target = (Datos)this.get_store().add_element_user(DATOS$6);
            }
            target.set((XmlObject)datos);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Datos addNewDatos() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            Datos target = null;
            target = (Datos)this.get_store().add_element_user(DATOS$6);
            return target;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void unsetDatos() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            this.get_store().remove_element(DATOS$6, 0);
        }
    }

    public static class DatosImpl
    extends XmlComplexContentImpl
    implements Datos {
        private static final QName SCHEMA$0 = new QName("http://www.w3.org/2001/XMLSchema", "schema");

        public DatosImpl(SchemaType sType) {
            super(sType);
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public SchemaDocument.Schema getSchema() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                SchemaDocument.Schema target = null;
                target = (SchemaDocument.Schema)this.get_store().find_element_user(SCHEMA$0, 0);
                if (target == null) {
                    return null;
                }
                return target;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void setSchema(SchemaDocument.Schema schema) {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                SchemaDocument.Schema target = null;
                target = (SchemaDocument.Schema)this.get_store().find_element_user(SCHEMA$0, 0);
                if (target == null) {
                    target = (SchemaDocument.Schema)this.get_store().add_element_user(SCHEMA$0);
                }
                target.set((XmlObject)schema);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public SchemaDocument.Schema addNewSchema() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                SchemaDocument.Schema target = null;
                target = (SchemaDocument.Schema)this.get_store().add_element_user(SCHEMA$0);
                return target;
            }
        }
    }

}

