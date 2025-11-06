package es.ingnn.www.impl;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import es.ingnn.www.NNSalida;
import es.ingnn.www.ObtenerInfoClienteResponseDocument;

public class ObtenerInfoClienteResponseDocumentImpl extends XmlComplexContentImpl implements ObtenerInfoClienteResponseDocument {
    
	private static final long serialVersionUID = -9176430313979236319L;
	private static final QName OBTENERINFOCLIENTERESPONSE$0 = new QName("https://www.ingnn.es", "ObtenerInfoClienteResponse");

    public ObtenerInfoClienteResponseDocumentImpl(SchemaType sType) {
        super(sType);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ObtenerInfoClienteResponse getObtenerInfoClienteResponse() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            ObtenerInfoClienteResponse target = null;
            target = (ObtenerInfoClienteResponse)this.get_store().find_element_user(OBTENERINFOCLIENTERESPONSE$0, 0);
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
    public void setObtenerInfoClienteResponse(ObtenerInfoClienteResponse obtenerInfoClienteResponse) {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            ObtenerInfoClienteResponse target = null;
            target = (ObtenerInfoClienteResponse)this.get_store().find_element_user(OBTENERINFOCLIENTERESPONSE$0, 0);
            if (target == null) {
                target = (ObtenerInfoClienteResponse)this.get_store().add_element_user(OBTENERINFOCLIENTERESPONSE$0);
            }
            target.set((XmlObject)obtenerInfoClienteResponse);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ObtenerInfoClienteResponse addNewObtenerInfoClienteResponse() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            ObtenerInfoClienteResponse target = null;
            target = (ObtenerInfoClienteResponse)this.get_store().add_element_user(OBTENERINFOCLIENTERESPONSE$0);
            return target;
        }
    }

    public static class ObtenerInfoClienteResponseImpl
    extends XmlComplexContentImpl
    implements ObtenerInfoClienteResponse {
        private static final QName OBTENERINFOCLIENTERESULT$0 = new QName("https://www.ingnn.es", "ObtenerInfoClienteResult");

        public ObtenerInfoClienteResponseImpl(SchemaType sType) {
            super(sType);
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public NNSalida getObtenerInfoClienteResult() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                NNSalida target = null;
                target = (NNSalida)this.get_store().find_element_user(OBTENERINFOCLIENTERESULT$0, 0);
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
        public boolean isSetObtenerInfoClienteResult() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                return this.get_store().count_elements(OBTENERINFOCLIENTERESULT$0) != 0;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void setObtenerInfoClienteResult(NNSalida obtenerInfoClienteResult) {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                NNSalida target = null;
                target = (NNSalida)this.get_store().find_element_user(OBTENERINFOCLIENTERESULT$0, 0);
                if (target == null) {
                    target = (NNSalida)this.get_store().add_element_user(OBTENERINFOCLIENTERESULT$0);
                }
                target.set((XmlObject)obtenerInfoClienteResult);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public NNSalida addNewObtenerInfoClienteResult() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                NNSalida target = null;
                target = (NNSalida)this.get_store().add_element_user(OBTENERINFOCLIENTERESULT$0);
                return target;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void unsetObtenerInfoClienteResult() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                this.get_store().remove_element(OBTENERINFOCLIENTERESULT$0, 0);
            }
        }
    }

}

