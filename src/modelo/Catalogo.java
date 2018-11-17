package modelo;

import java.sql.Date;
import java.sql.Timestamp;

public class Catalogo {

    private Long idCatalogo;
    private Timestamp fecha;
    private Long cuit;
    private Long idLog;

    public Catalogo(Timestamp fecha, Long cuit, Long idLog) {
        this.fecha = fecha;
        this.cuit = cuit;
        this.idLog = idLog;
    }

    public Catalogo(Long idCatalogo, Timestamp fecha, Long cuit, Long idLog) {
        this.idCatalogo = idCatalogo;
        this.fecha = fecha;
        this.cuit = cuit;
        this.idLog = idLog;
    }

    public Long getIdLog() {
        return idLog;
    }

    public void setIdLog(Long idLog) {
        this.idLog = idLog;
    }

    public Long getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(Long idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Catalogo{" + "idCatalogo=" + idCatalogo + ", cuit=" + cuit + '}';
    }
}
