package modelo;

import java.sql.Date;

public class PedidoProveedor {
    private Long idPedidoProveedor;
    private Date fechaEmision;
    private boolean estado;
    private Long cuit;
    private long idLog;

    public PedidoProveedor(Long idPedidoProveedor, Date fechaEmision, boolean estado, Long cuit, long idLog) {
        this.idPedidoProveedor = idPedidoProveedor;
        this.fechaEmision = fechaEmision;
        this.estado = estado;
        this.cuit = cuit;
        this.idLog = idLog;
    }

    public Long getIdPedidoProveedor() {
        return idPedidoProveedor;
    }

    public void setIdPedidoProveedor(Long idPedidoProveedor) {
        this.idPedidoProveedor = idPedidoProveedor;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    public long getIdLog() {
        return idLog;
    }

    public void setIdLog(long idLog) {
        this.idLog = idLog;
    }

    @Override
    public String toString() {
        return "PedidoProveedor{" + "idPedidoProveedor=" + idPedidoProveedor + ", estado=" + estado + ", cuit=" + cuit + '}';
    }
}
