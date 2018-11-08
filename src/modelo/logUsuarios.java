/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alumnos
 */
public class logUsuarios {
    
    private Long id;
    private Long fecha;
    private String accion;
    private Long idAccion;

    public logUsuarios(Long id, Long fecha, String accion, Long idAccion) {
        this.id = id;
        this.fecha = fecha;
        this.accion = accion;
        this.idAccion = idAccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFecha() {
        return fecha;
    }

    public void setFecha(Long fecha) {
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
