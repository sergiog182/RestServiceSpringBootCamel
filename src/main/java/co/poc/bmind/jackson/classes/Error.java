
package co.poc.bmind.jackson.classes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "codigo",
    "mensaje"
})
@JsonRootName("error")
public class Error {

    @JsonProperty("codigo")
    private String codigo;
    @JsonProperty("mensaje")
    private String mensaje;

    @JsonProperty("codigo")
    public String getCodigo() {
        return codigo;
    }

    @JsonProperty("codigo")
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @JsonProperty("mensaje")
    public String getMensaje() {
        return mensaje;
    }

    @JsonProperty("mensaje")
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
