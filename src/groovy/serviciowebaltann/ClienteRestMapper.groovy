package serviciowebaltann

import com.velogica.client.nn_senior.model.ThirdPartiesPoliciesListResponse
import com.velogica.client.nn_senior.model.ThirdPartiesPolicyItemResponse

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import serviciowebaltann.BeneficiarioPolizaMapper
import serviciowebaltann.ClienteMapper
import serviciowebaltann.GarantiaPolizaMapper
import serviciowebaltann.PolizaMapper
import serviciowebaltasnn.Siniestro

class ClienteRestMapper implements Serializable{


    private static final long serialVersionUID = -5265079553173330320L
    private static Log log = LogFactory.getLog("logNN." + ClienteRestMapper.class.getName())

    ClienteMapper cliente
    List<PolizaMapper> polizas = new ArrayList<>()
    List<GarantiaPolizaMapper> garantiasPolizas = new ArrayList<>()
    List<BeneficiarioPolizaMapper> beneficiariosPoliza = new ArrayList<>()
    List<Siniestro> siniestros = new ArrayList<>()


    private ThirdPartiesPoliciesListResponse thirdPartiesPoliciesListResponse = null
    private ThirdPartiesPolicyItemResponse thirdPartiesPolicyItemResponse = null
    private boolean existeError
    private boolean tokenError

    ClienteMapper getCliente() {
        return cliente
    }

    void setCliente(ClienteMapper cliente) {
        this.cliente = cliente
    }

    void setPolizas (List<PolizaMapper> polizas) {
        log.info("setPolizas - entramos con " + this.polizas.size())
        log.info("sumamos :" + polizas.size())
        this.polizas.addAll(polizas);
        log.info("setPolizas - salimos con " + this.polizas.size())
    } 

    void setGarantiasPolizas (List<GarantiaPolizaMapper> garantiasPolizas){
        this.garantiasPolizas.addAll(garantiasPolizas);
    }

    void setBeneficiariosPoliza (List<BeneficiarioPolizaMapper> beneficiariosPoliza){
        this.beneficiariosPoliza.addAll(beneficiariosPoliza);
    }

    List<PolizaMapper> getPolizas() {
        return this.polizas;
    } 

    List<GarantiaPolizaMapper> getGarantiasPolizas() {
        return this.garantiasPolizas
    }

    List<BeneficiarioPolizaMapper> getBeneficiariosPoliza(){
        return this.beneficiariosPoliza;
    }



    ThirdPartiesPoliciesListResponse getThirdPartiesPoliciesListResponse() {
        return thirdPartiesPoliciesListResponse
    }

    void setThirdPartiesPoliciesListResponse(ThirdPartiesPoliciesListResponse thirdPartiesPoliciesListResponse) {
        this.thirdPartiesPoliciesListResponse = thirdPartiesPoliciesListResponse
    }

    ThirdPartiesPolicyItemResponse getThirdPartiesPolicyItemResponse() {
        return thirdPartiesPolicyItemResponse
    }

    void setThirdPartiesPolicyItemResponse(ThirdPartiesPolicyItemResponse thirdPartiesPolicyItemResponse) {
        this.thirdPartiesPolicyItemResponse = thirdPartiesPolicyItemResponse
    }

    boolean getExisteError() {
        return existeError
    }

    void setExisteError(boolean existeError) {
        this.existeError = existeError
    }

    boolean getTokenError() {
        return tokenError
    }

    void setTokenError(boolean tokenError) {
        this.tokenError = tokenError
    }

    boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        ClienteRestMapper that = (ClienteRestMapper) o

        if (existeError != that.existeError) return false
        if (tokenError != that.tokenError) return false
        if (beneficiariosPoliza != that.beneficiariosPoliza) return false
        if (cliente != that.cliente) return false
        if (garantiasPolizas != that.garantiasPolizas) return false
        if (polizas != that.polizas) return false
        if (siniestros != that.siniestros) return false
        if (thirdPartiesPoliciesListResponse != that.thirdPartiesPoliciesListResponse) return false
        if (thirdPartiesPolicyItemResponse != that.thirdPartiesPolicyItemResponse) return false

        return true
    }

    int hashCode() {
        int result
        result = (cliente != null ? cliente.hashCode() : 0)
        result = 31 * result + (polizas != null ? polizas.hashCode() : 0)
        result = 31 * result + (garantiasPolizas != null ? garantiasPolizas.hashCode() : 0)
        result = 31 * result + (beneficiariosPoliza != null ? beneficiariosPoliza.hashCode() : 0)
        result = 31 * result + (siniestros != null ? siniestros.hashCode() : 0)
        result = 31 * result + (thirdPartiesPoliciesListResponse != null ? thirdPartiesPoliciesListResponse.hashCode() : 0)
        result = 31 * result + (thirdPartiesPolicyItemResponse != null ? thirdPartiesPolicyItemResponse.hashCode() : 0)
        result = 31 * result + (existeError ? 1 : 0)
        result = 31 * result + (tokenError ? 1 : 0)
        return result
    }


    @Override
    public String toString() {
        return "ClienteRestMapper{" +
                "cliente=" + cliente +
                ", polizas=" + polizas +
                ", garantiasPolizas=" + garantiasPolizas +
                ", beneficiariosPoliza=" + beneficiariosPoliza +
                ", siniestros=" + siniestros +
                ", thirdPartiesPoliciesListResponse=" + thirdPartiesPoliciesListResponse +
                ", thirdPartiesPolicyItemResponse=" + thirdPartiesPolicyItemResponse +
                ", existeError=" + existeError +
                ", tokenError=" + tokenError +
                '}';
    }
}
