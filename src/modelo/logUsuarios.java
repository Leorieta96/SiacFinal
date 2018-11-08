/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Alumnos
 */
public class logUsuarios {
    private Long id;
    private Long cuit;
    private Date fecha;
    private String accion;
    private Long idAccion;

    public logUsuarios(Long cuit, Date fecha, String accion, Long idAccion) {
        this.cuit = cuit;
        this.fecha = fecha;
        this.accion = accion;
        this.idAccion = idAccion;
    }

    public logUsuarios(Long id, Long cuit, Date fecha, String accion, Long idAccion) {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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
