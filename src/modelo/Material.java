package modelo;

public class Material {
    private Long idMaterial;
    private String nombre;
    private String descripcion;
    private int stockMaterial;
    private Long precioUnitario;
    private String rubro;
    private long idLog;

    public Material(Long idMaterial, String nombre, String descripcion, int stockMaterial, long precioUnitario, String rubro, long idLog) {
        this.idMaterial = idMaterial;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stockMaterial = stockMaterial;
        this.precioUnitario = precioUnitario;
        this.rubro = rubro;
        this.idLog = idLog;
    }

    public Long getidMaterial() {
        return idMaterial;
    }

    public void setidMaterial(Long idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStockMaterial() {
        return stockMaterial;
    }

    public void setStockMaterial(int stockMaterial) {
        this.stockMaterial = stockMaterial;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Long precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public Long getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Long idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getIdLog() {
        return idLog;
    }

    public void setIdLog(long idLog) {
        this.idLog = idLog;
    }
  
    @Override
    public String toString() {
        return "Material{" + "idMaterial=" + idMaterial + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + '}';
    }
}
