package modelo;

import java.sql.Date;
import java.sql.Timestamp;

public class PedidoCliente {
    private Long idPedidoCliente;
    private String estadoPedidoC;
    private Double totalPedidoC;
    private Timestamp fechaEmision;
    private Timestamp fechaRecibido;
    private Long dni;
    private Long idLog;

    public PedidoCliente(Long idPedidoCliente, String estadoPedidoC, 
            Double totalPedidoC, Timestamp fechaEmision, Timestamp fechaRecibido,
            Long dni, Long idLog) {
        this.idPedidoCliente = idPedidoCliente;
        this.estadoPedidoC = estadoPedidoC;
        this.totalPedidoC = totalPedidoC;
        this.fechaEmision = fechaEmision;
        this.fechaRecibido = fechaRecibido;
        this.dni = dni;
        this.idLog = idLog;
    }

    public Long getIdPedidoCliente() {
        return idPedidoCliente;
    }

    public void setIdPedidoCliente(Long idPedidoCliente) {
        this.idPedidoCliente = idPedidoCliente;
    }

    public String getEstadoPedidoC() {
        return estadoPedidoC;
    }

    public void setEstadoPedidoC(String estadoPedidoC) {
        this.estadoPedidoC = estadoPedidoC;
    }

    public Double getTotalPedidoC() {
        return totalPedidoC;
    }

    public void setTotalPedidoC(Double totalPedidoC) {
        this.totalPedidoC = totalPedidoC;
    }

    public Timestamp getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Timestamp fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Timestamp getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(Timestamp fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public Long getdni() {
        return dni;
    }

    public void setdni(Long dni) {
        this.dni = dni;
    }

    public Long getIdLog() {
        return idLog;
    }

    public void setIdLog(Long idLog) {
        this.idLog = idLog;
    }

    @Override
    public String toString() {
        return "PedidoCliente{" + "idPedidoCliente=" + idPedidoCliente + ", estadoPedidoC=" + estadoPedidoC + ", totalPedidoC=" + totalPedidoC + ", dni=" + dni + '}';
    }
}
