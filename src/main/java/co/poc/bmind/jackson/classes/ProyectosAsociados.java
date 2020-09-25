
package co.poc.bmind.jackson.classes;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nombre"
})
public class ProyectosAsociados {

    @JsonProperty("nombre")
    private List<String> nombre = null;

    @JsonProperty("nombre")
    public List<String> getNombre() {
        if (nombre == null) {
        	nombre = new ArrayList<String>();
        }
    	return nombre;
    }

    @JsonProperty("nombre")
    public void setNombre(List<String> nombre) {
        this.nombre = nombre;
    }

}
