
package co.poc.bmind.jackson.classes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "nombre",
    "tipo",
    "descripcion",
    "version",
    "fabricante",
    "reemplazaraA",
    "reemplazadaPor",
    "estado",
    "activa",
    "fechaActivacion",
    "fechaDesactivacion",
    "areaPropietaria",
    "procesoPropietario",
    "arquitectura",
    "tipoInfraestructura",
    "proveedorServicioCloud",
    "tipoAutenticacion",
    "precio",
    "precioUSD",
    "precioEUR"
})
public class InformacionGeneral {

    @JsonProperty("id")
    private String id;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("tipo")
    private String tipo;
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("version")
    private String version;
    @JsonProperty("fabricante")
    private String fabricante;
    @JsonProperty("reemplazaraA")
    private String reemplazaraA;
    @JsonProperty("reemplazadaPor")
    private String reemplazadaPor;
    @JsonProperty("estado")
    private String estado;
    @JsonProperty("activa")
    private String activa;
    @JsonProperty("fechaActivacion")
    private String fechaActivacion;
    @JsonProperty("fechaDesactivacion")
    private String fechaDesactivacion;
    @JsonProperty("areaPropietaria")
    private String areaPropietaria;
    @JsonProperty("procesoPropietario")
    private String procesoPropietario;
    @JsonProperty("arquitectura")
    private String arquitectura;
    @JsonProperty("tipoInfraestructura")
    private String tipoInfraestructura;
    @JsonProperty("proveedorServicioCloud")
    private String proveedorServicioCloud;
    @JsonProperty("tipoAutenticacion")
    private String tipoAutenticacion;
    @JsonProperty("precio")
    private String precio;
    @JsonProperty("precioUSD")
    private String precioUSD;
    @JsonProperty("precioEUR")
    private String precioEUR;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("nombre")
    public String getNombre() {
        return nombre;
    }

    @JsonProperty("nombre")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @JsonProperty("tipo")
    public String getTipo() {
        return tipo;
    }

    @JsonProperty("tipo")
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @JsonProperty("descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    @JsonProperty("descripcion")
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("fabricante")
    public String getFabricante() {
        return fabricante;
    }

    @JsonProperty("fabricante")
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @JsonProperty("reemplazaraA")
    public String getReemplazaraA() {
        return reemplazaraA;
    }

    @JsonProperty("reemplazaraA")
    public void setReemplazaraA(String reemplazaraA) {
        this.reemplazaraA = reemplazaraA;
    }

    @JsonProperty("reemplazadaPor")
    public String getReemplazadaPor() {
        return reemplazadaPor;
    }

    @JsonProperty("reemplazadaPor")
    public void setReemplazadaPor(String reemplazadaPor) {
        this.reemplazadaPor = reemplazadaPor;
    }

    @JsonProperty("estado")
    public String getEstado() {
        return estado;
    }

    @JsonProperty("estado")
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @JsonProperty("activa")
    public String getActiva() {
        return activa;
    }

    @JsonProperty("activa")
    public void setActiva(String activa) {
        this.activa = activa;
    }

    @JsonProperty("fechaActivacion")
    public String getFechaActivacion() {
        return fechaActivacion;
    }

    @JsonProperty("fechaActivacion")
    public void setFechaActivacion(String fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }

    @JsonProperty("fechaDesactivacion")
    public String getFechaDesactivacion() {
        return fechaDesactivacion;
    }

    @JsonProperty("fechaDesactivacion")
    public void setFechaDesactivacion(String fechaDesactivacion) {
        this.fechaDesactivacion = fechaDesactivacion;
    }

    @JsonProperty("areaPropietaria")
    public String getAreaPropietaria() {
        return areaPropietaria;
    }

    @JsonProperty("areaPropietaria")
    public void setAreaPropietaria(String areaPropietaria) {
        this.areaPropietaria = areaPropietaria;
    }

    @JsonProperty("procesoPropietario")
    public String getProcesoPropietario() {
        return procesoPropietario;
    }

    @JsonProperty("procesoPropietario")
    public void setProcesoPropietario(String procesoPropietario) {
        this.procesoPropietario = procesoPropietario;
    }

    @JsonProperty("arquitectura")
    public String getArquitectura() {
        return arquitectura;
    }

    @JsonProperty("arquitectura")
    public void setArquitectura(String arquitectura) {
        this.arquitectura = arquitectura;
    }

    @JsonProperty("tipoInfraestructura")
    public String getTipoInfraestructura() {
        return tipoInfraestructura;
    }

    @JsonProperty("tipoInfraestructura")
    public void setTipoInfraestructura(String tipoInfraestructura) {
        this.tipoInfraestructura = tipoInfraestructura;
    }

    @JsonProperty("proveedorServicioCloud")
    public String getProveedorServicioCloud() {
        return proveedorServicioCloud;
    }

    @JsonProperty("proveedorServicioCloud")
    public void setProveedorServicioCloud(String proveedorServicioCloud) {
        this.proveedorServicioCloud = proveedorServicioCloud;
    }

    @JsonProperty("tipoAutenticacion")
    public String getTipoAutenticacion() {
        return tipoAutenticacion;
    }

    @JsonProperty("tipoAutenticacion")
    public void setTipoAutenticacion(String tipoAutenticacion) {
        this.tipoAutenticacion = tipoAutenticacion;
    }

    @JsonProperty("precio")
    public String getPrecio() {
        return precio;
    }

    @JsonProperty("precio")
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @JsonProperty("precioUSD")
    public String getPrecioUSD() {
        return precioUSD;
    }

    @JsonProperty("precioUSD")
    public void setPrecioUSD(String precioUSD) {
        this.precioUSD = precioUSD;
    }

    @JsonProperty("precioEUR")
    public String getPrecioEUR() {
        return precioEUR;
    }

    @JsonProperty("precioEUR")
    public void setPrecioEUR(String precioEUR) {
        this.precioEUR = precioEUR;
    }

	@Override
	public String toString() {
		return "InformacionGeneral [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", descripcion=" + descripcion
				+ ", version=" + version + ", fabricante=" + fabricante + ", reemplazaraA=" + reemplazaraA
				+ ", reemplazadaPor=" + reemplazadaPor + ", estado=" + estado + ", activa=" + activa
				+ ", fechaActivacion=" + fechaActivacion + ", fechaDesactivacion=" + fechaDesactivacion
				+ ", areaPropietaria=" + areaPropietaria + ", procesoPropietario=" + procesoPropietario
				+ ", arquitectura=" + arquitectura + ", tipoInfraestructura=" + tipoInfraestructura
				+ ", proveedorServicioCloud=" + proveedorServicioCloud + ", tipoAutenticacion=" + tipoAutenticacion
				+ ", precio=" + precio + ", precioUSD=" + precioUSD + ", precioEUR=" + precioEUR + "]";
	}
    
    

}
