package es.ingnn.www.impl;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import es.ingnn.www.ObtenerTokenDocument;

public class ObtenerTokenDocumentImpl extends XmlComplexContentImpl implements ObtenerTokenDocument {
    
	private static final long serialVersionUID = -2461321305217111422L;
	private static final QName OBTENERTOKEN$0 = new QName("https://www.ingnn.es", "ObtenerToken");

    public ObtenerTokenDocumentImpl(SchemaType sType) {
        super(sType);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ObtenerToken getObtenerToken() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            ObtenerToken target = null;
            target = (ObtenerToken)this.get_store().find_element_user(OBTENERTOKEN$0, 0);
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
    public void setObtenerToken(ObtenerToken obtenerToken) {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            ObtenerToken target = null;
            target = (ObtenerToken)this.get_store().find_element_user(OBTENERTOKEN$0, 0);
            if (target == null) {
                target = (ObtenerToken)this.get_store().add_element_user(OBTENERTOKEN$0);
            }
            target.set((XmlObject)obtenerToken);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ObtenerToken addNewObtenerToken() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            ObtenerToken target = null;
            target = (ObtenerToken)this.get_store().add_element_user(OBTENERTOKEN$0);
            return target;
        }
    }

    public static class ObtenerTokenImpl
    extends XmlComplexContentImpl
    implements ObtenerToken {
        private static final QName USER$0 = new QName("https://www.ingnn.es", "user");
        private static final QName PASSWORD$2 = new QName("https://www.ingnn.es", "password");
        private static final QName DNI$4 = new QName("https://www.ingnn.es", "dni");
        private static final QName POLIZA$6 = new QName("https://www.ingnn.es", "poliza");

        public ObtenerTokenImpl(SchemaType sType) {
            super(sType);
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public String getUser() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                SimpleValue target = null;
                target = (SimpleValue)this.get_store().find_element_user(USER$0, 0);
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
        public XmlString xgetUser() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                XmlString target = null;
                target = (XmlString)this.get_store().find_element_user(USER$0, 0);
                return target;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public boolean isSetUser() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                return this.get_store().count_elements(USER$0) != 0;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void setUser(String user) {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                SimpleValue target = null;
                target = (SimpleValue)this.get_store().find_element_user(USER$0, 0);
                if (target == null) {
                    target = (SimpleValue)this.get_store().add_element_user(USER$0);
                }
                target.setStringValue(user);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void xsetUser(XmlString user) {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                XmlString target = null;
                target = (XmlString)this.get_store().find_element_user(USER$0, 0);
                if (target == null) {
                    target = (XmlString)this.get_store().add_element_user(USER$0);
                }
                target.set((XmlObject)user);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void unsetUser() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                this.get_store().remove_element(USER$0, 0);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public String getPassword() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                SimpleValue target = null;
                target = (SimpleValue)this.get_store().find_element_user(PASSWORD$2, 0);
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
        public XmlString xgetPassword() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                XmlString target = null;
                target = (XmlString)this.get_store().find_element_user(PASSWORD$2, 0);
                return target;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public boolean isSetPassword() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                return this.get_store().count_elements(PASSWORD$2) != 0;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void setPassword(String password) {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                SimpleValue target = null;
                target = (SimpleValue)this.get_store().find_element_user(PASSWORD$2, 0);
                if (target == null) {
                    target = (SimpleValue)this.get_store().add_element_user(PASSWORD$2);
                }
                target.setStringValue(password);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void xsetPassword(XmlString password) {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                XmlString target = null;
                target = (XmlString)this.get_store().find_element_user(PASSWORD$2, 0);
                if (target == null) {
                    target = (XmlString)this.get_store().add_element_user(PASSWORD$2);
                }
                target.set((XmlObject)password);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void unsetPassword() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                this.get_store().remove_element(PASSWORD$2, 0);
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
                target = (SimpleValue)this.get_store().find_element_user(DNI$4, 0);
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
                target = (XmlString)this.get_store().find_element_user(DNI$4, 0);
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
                return this.get_store().count_elements(DNI$4) != 0;
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
                target = (SimpleValue)this.get_store().find_element_user(DNI$4, 0);
                if (target == null) {
                    target = (SimpleValue)this.get_store().add_element_user(DNI$4);
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
                target = (XmlString)this.get_store().find_element_user(DNI$4, 0);
                if (target == null) {
                    target = (XmlString)this.get_store().add_element_user(DNI$4);
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
                this.get_store().remove_element(DNI$4, 0);
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
                target = (SimpleValue)this.get_store().find_element_user(POLIZA$6, 0);
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
                target = (XmlString)this.get_store().find_element_user(POLIZA$6, 0);
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
                return this.get_store().count_elements(POLIZA$6) != 0;
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
                target = (SimpleValue)this.get_store().find_element_user(POLIZA$6, 0);
                if (target == null) {
                    target = (SimpleValue)this.get_store().add_element_user(POLIZA$6);
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
                target = (XmlString)this.get_store().find_element_user(POLIZA$6, 0);
                if (target == null) {
                    target = (XmlString)this.get_store().add_element_user(POLIZA$6);
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
                this.get_store().remove_element(POLIZA$6, 0);
            }
        }
    }

}

