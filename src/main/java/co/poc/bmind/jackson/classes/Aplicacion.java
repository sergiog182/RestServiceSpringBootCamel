
package co.poc.bmind.jackson.classes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "informacionGeneral",
    "liderFuncional",
    "liderTecnico",
    "proyectosAsociados"
})
@JsonRootName("aplicacion")
public class Aplicacion {

    @JsonProperty("informacionGeneral")
    private InformacionGeneral informacionGeneral;
    @JsonProperty("liderFuncional")
    private LiderFuncional liderFuncional;
    @JsonProperty("liderTecnico")
    private LiderTecnico liderTecnico;
    @JsonProperty("proyectosAsociados")
    private ProyectosAsociados proyectosAsociados;

    @JsonProperty("informacionGeneral")
    public InformacionGeneral getInformacionGeneral() {
        return informacionGeneral;
    }

    @JsonProperty("informacionGeneral")
    public void setInformacionGeneral(InformacionGeneral informacionGeneral) {
        this.informacionGeneral = informacionGeneral;
    }

    @JsonProperty("liderFuncional")
    public LiderFuncional getLiderFuncional() {
        return liderFuncional;
    }

    @JsonProperty("liderFuncional")
    public void setLiderFuncional(LiderFuncional liderFuncional) {
        this.liderFuncional = liderFuncional;
    }

    @JsonProperty("liderTecnico")
    public LiderTecnico getLiderTecnico() {
        return liderTecnico;
    }

    @JsonProperty("liderTecnico")
    public void setLiderTecnico(LiderTecnico liderTecnico) {
        this.liderTecnico = liderTecnico;
    }

    @JsonProperty("proyectosAsociados")
    public ProyectosAsociados getProyectosAsociados() {
        return proyectosAsociados;
    }

    @JsonProperty("proyectosAsociados")
    public void setProyectosAsociados(ProyectosAsociados proyectosAsociados) {
        this.proyectosAsociados = proyectosAsociados;
    }
}
