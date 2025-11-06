package es.ingnn.www;

public abstract class NN_ServiciosCallbackHandler {
    protected Object clientData;

    public NN_ServiciosCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    public NN_ServiciosCallbackHandler() {
        this.clientData = null;
    }

    public Object getClientData() {
        return this.clientData;
    }

    public void receiveResultobtenerToken(ObtenerTokenResponseDocument result) {
    }

    public void receiveErrorobtenerToken(Exception e) {
    }

    public void receiveResultobtenerInfoCliente(ObtenerInfoClienteResponseDocument result) {
    }

    public void receiveErrorobtenerInfoCliente(Exception e) {
    }
}

