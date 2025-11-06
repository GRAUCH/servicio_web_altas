package es.ingnn.www.impl;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

import es.ingnn.www.NNSalida;
import es.ingnn.www.ObtenerTokenResponseDocument;

public class ObtenerTokenResponseDocumentImpl extends XmlComplexContentImpl implements ObtenerTokenResponseDocument {
    
	private static final long serialVersionUID = 4060951936997709135L;
	private static final QName OBTENERTOKENRESPONSE$0 = new QName("https://www.ingnn.es", "ObtenerTokenResponse");

    public ObtenerTokenResponseDocumentImpl(SchemaType sType) {
        super(sType);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ObtenerTokenResponse getObtenerTokenResponse() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            ObtenerTokenResponse target = null;
            target = (ObtenerTokenResponse)this.get_store().find_element_user(OBTENERTOKENRESPONSE$0, 0);
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
    public void setObtenerTokenResponse(ObtenerTokenResponse obtenerTokenResponse) {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            ObtenerTokenResponse target = null;
            target = (ObtenerTokenResponse)this.get_store().find_element_user(OBTENERTOKENRESPONSE$0, 0);
            if (target == null) {
                target = (ObtenerTokenResponse)this.get_store().add_element_user(OBTENERTOKENRESPONSE$0);
            }
            target.set((XmlObject)obtenerTokenResponse);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ObtenerTokenResponse addNewObtenerTokenResponse() {
        Object object = this.monitor();
        synchronized (object) {
            this.check_orphaned();
            ObtenerTokenResponse target = null;
            target = (ObtenerTokenResponse)this.get_store().add_element_user(OBTENERTOKENRESPONSE$0);
            return target;
        }
    }

    public static class ObtenerTokenResponseImpl
    extends XmlComplexContentImpl
    implements ObtenerTokenResponse {
        private static final QName OBTENERTOKENRESULT$0 = new QName("https://www.ingnn.es", "ObtenerTokenResult");

        public ObtenerTokenResponseImpl(SchemaType sType) {
            super(sType);
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public NNSalida getObtenerTokenResult() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                NNSalida target = null;
                target = (NNSalida)this.get_store().find_element_user(OBTENERTOKENRESULT$0, 0);
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
        public boolean isSetObtenerTokenResult() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                return this.get_store().count_elements(OBTENERTOKENRESULT$0) != 0;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void setObtenerTokenResult(NNSalida obtenerTokenResult) {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                NNSalida target = null;
                target = (NNSalida)this.get_store().find_element_user(OBTENERTOKENRESULT$0, 0);
                if (target == null) {
                    target = (NNSalida)this.get_store().add_element_user(OBTENERTOKENRESULT$0);
                }
                target.set((XmlObject)obtenerTokenResult);
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public NNSalida addNewObtenerTokenResult() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                NNSalida target = null;
                target = (NNSalida)this.get_store().add_element_user(OBTENERTOKENRESULT$0);
                return target;
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void unsetObtenerTokenResult() {
            Object object = this.monitor();
            synchronized (object) {
                this.check_orphaned();
                this.get_store().remove_element(OBTENERTOKENRESULT$0, 0);
            }
        }
    }

}

