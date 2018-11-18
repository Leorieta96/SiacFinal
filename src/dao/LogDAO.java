/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.logUsuarios;

/**
 *
 * @author Alumnos
 */
public interface LogDAO extends DAO<logUsuarios, Long> {

    public List<logUsuarios> obtenerXfecha(java.sql.Date fechaInicio, java.sql.Date fechaFin, Long id) throws DAOException;
}
