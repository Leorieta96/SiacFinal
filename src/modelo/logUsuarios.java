/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Alumnos
 */
public class logUsuarios {

    private Long id;
    private Long cuit;
    private Timestamp fecha;
    private String accion;
    private long idAccion;

    public logUsuarios(Long cuit, Timestamp fecha, String accion, long idAccion) {
        this.cuit = cuit;
        this.fecha = fecha;
        this.accion = accion;
        this.idAccion = idAccion;
    }

    public logUsuarios(Long id, Long cuit, Timestamp fecha, String accion, long idAccion) {
        this.id = id;
        this.cuit = cuit;
        this.fecha = fecha;
        this.accion = accion;
        this.idAccion = idAccion;
    }

    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public Long getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(Long idAccion) {
        this.idAccion = idAccion;
    }
}
