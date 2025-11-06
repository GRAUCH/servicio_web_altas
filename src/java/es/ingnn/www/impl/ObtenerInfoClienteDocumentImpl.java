package es.ingnn.www.impl;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import es.ingnn.www.ObtenerInfoClienteDocument;

public class ObtenerInfoClienteDocumentImpl extends XmlComplexContentImpl implements ObtenerInfoClienteDocument {
    
	private static final long serialVersionUID = -4760984756303875857L;
	private static final QName OBTENERINFOCLIENTE$0 = new QName("https://www.ingnn.es", "ObtenerInfoCliente");

    public ObtenerInfoClienteDocumentImpl(SchemaType sType) {
        super(sType);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ObtenerInfoCliente getObtenerInfoCliente() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            ObtenerInfoCliente target = null;
            target = (ObtenerInfoCliente)this.get_store().find_element_user(OBTENERINFOCLIENTE$0, 0);
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
    public void setObtenerInfoCliente(ObtenerInfoCliente obtenerInfoCliente) {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            ObtenerInfoCliente target = null;
            target = (ObtenerInfoCliente)this.get_store().find_element_user(OBTENERINFOCLIENTE$0, 0);
            if (target == null) {
                target = (ObtenerInfoCliente)this.get_store().add_element_user(OBTENERINFOCLIENTE$0);
            }
            target.set((XmlObject)obtenerInfoCliente);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ObtenerInfoCliente addNewObtenerInfoCliente() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            ObtenerInfoCliente target = null;
            target = (ObtenerInfoCliente)this.get_store().add_element_user(OBTENERINFOCLIENTE$0);
            return target;
        }
    }

    public static class ObtenerInfoClienteImpl
    extends XmlComplexContentImpl
    implements ObtenerInfoCliente {
        private static final QName TOKEN$0 = new QName("https://www.ingnn.es", "token");
        private static final QName DNI$2 = new QName("https://www.ingnn.es", "dni");
        private static final QName POLIZA$4 = new QName("https://www.ingnn.es", "poliza");
        private static final QName PRODUCTO$6 = new QName("https://www.ingnn.es", "producto");

        public ObtenerInfoClienteImpl(SchemaType sType) {
            super(sType);
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public String getToken() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                SimpleValue target = null;
                target = (SimpleValue)this.get_store().find_element_user(TOKEN$0, 0);
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
        public XmlString xgetToken() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                XmlString target = null;
                target = (XmlString)this.get_store().find_element_user(TOKEN$0, 0);
                return target;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public boolean isSetToken() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                return this.get_store().count_elements(TOKEN$0) != 0;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void setToken(String token) {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                SimpleValue target = null;
                target = (SimpleValue)this.get_store().find_element_user(TOKEN$0, 0);
                if (target == null) {
                    target = (SimpleValue)this.get_store().add_element_user(TOKEN$0);
                }
                target.setStringValue(token);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void xsetToken(XmlString token) {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                XmlString target = null;
                target = (XmlString)this.get_store().find_element_user(TOKEN$0, 0);
                if (target == null) {
                    target = (XmlString)this.get_store().add_element_user(TOKEN$0);
                }
                target.set((XmlObject)token);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void unsetToken() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                this.get_store().remove_element(TOKEN$0, 0);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public String getDni() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                SimpleValue target = null;
                target = (SimpleValue)this.get_store().find_element_user(DNI$2, 0);
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
        public XmlString xgetDni() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                XmlString target = null;
                target = (XmlString)this.get_store().find_element_user(DNI$2, 0);
                return target;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public boolean isSetDni() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                return this.get_store().count_elements(DNI$2) != 0;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void setDni(String dni) {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                SimpleValue target = null;
                target = (SimpleValue)this.get_store().find_element_user(DNI$2, 0);
                if (target == null) {
                    target = (SimpleValue)this.get_store().add_element_user(DNI$2);
                }
                target.setStringValue(dni);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void xsetDni(XmlString dni) {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                XmlString target = null;
                target = (XmlString)this.get_store().find_element_user(DNI$2, 0);
                if (target == null) {
                    target = (XmlString)this.get_store().add_element_user(DNI$2);
                }
                target.set((XmlObject)dni);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void unsetDni() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                this.get_store().remove_element(DNI$2, 0);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public String getPoliza() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                SimpleValue target = null;
                target = (SimpleValue)this.get_store().find_element_user(POLIZA$4, 0);
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
        public XmlString xgetPoliza() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                XmlString target = null;
                target = (XmlString)this.get_store().find_element_user(POLIZA$4, 0);
                return target;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public boolean isSetPoliza() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                return this.get_store().count_elements(POLIZA$4) != 0;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void setPoliza(String poliza) {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                SimpleValue target = null;
                target = (SimpleValue)this.get_store().find_element_user(POLIZA$4, 0);
                if (target == null) {
                    target = (SimpleValue)this.get_store().add_element_user(POLIZA$4);
                }
                target.setStringValue(poliza);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void xsetPoliza(XmlString poliza) {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                XmlString target = null;
                target = (XmlString)this.get_store().find_element_user(POLIZA$4, 0);
                if (target == null) {
                    target = (XmlString)this.get_store().add_element_user(POLIZA$4);
                }
                target.set((XmlObject)poliza);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void unsetPoliza() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                this.get_store().remove_element(POLIZA$4, 0);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public String getProducto() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                SimpleValue target = null;
                target = (SimpleValue)this.get_store().find_element_user(PRODUCTO$6, 0);
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
        public XmlString xgetProducto() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                XmlString target = null;
                target = (XmlString)this.get_store().find_element_user(PRODUCTO$6, 0);
                return target;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public boolean isSetProducto() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                return this.get_store().count_elements(PRODUCTO$6) != 0;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void setProducto(String producto) {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                SimpleValue target = null;
                target = (SimpleValue)this.get_store().find_element_user(PRODUCTO$6, 0);
                if (target == null) {
                    target = (SimpleValue)this.get_store().add_element_user(PRODUCTO$6);
                }
                target.setStringValue(producto);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void xsetProducto(XmlString producto) {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                XmlString target = null;
                target = (XmlString)this.get_store().find_element_user(PRODUCTO$6, 0);
                if (target == null) {
                    target = (XmlString)this.get_store().add_element_user(PRODUCTO$6);
                }
                target.set((XmlObject)producto);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void unsetProducto() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                this.get_store().remove_element(PRODUCTO$6, 0);
            }
        }
    }

}

