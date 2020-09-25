
package co.poc.bmind.jackson.classes;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "aplicacion"
})
@JsonRootName("aplicaciones")
public class Aplicaciones {

    @JsonProperty("aplicacion")
    private List<Aplicacion> aplicacion = null;

    @JsonProperty("aplicacion")
    public List<Aplicacion> getAplicacion() {
        if (aplicacion == null) {
        	aplicacion = new ArrayList<Aplicacion>();
        }
    	return aplicacion;
    }

    @JsonProperty("aplicacion")
    public void setAplicacion(List<Aplicacion> aplicacion) {
        this.aplicacion = aplicacion;
    }

}
