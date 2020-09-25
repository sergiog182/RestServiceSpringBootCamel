package co.poc.bmind.jackson.classes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "aplicacion"
})
public class AplicacionRoot {
	@JsonProperty("aplicacion")
    private Aplicacion aplicacion = null;

	/**
	 * @return the aplicacion
	 */
	public Aplicacion getAplicacion() {
		return aplicacion;
	}

	/**
	 * @param aplicacion the aplicacion to set
	 */
	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}
	
	
}
