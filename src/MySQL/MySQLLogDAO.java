/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL;

import dao.DAOException;
import dao.LogDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Catalogo;
import modelo.logUsuarios;

/**
 *
 * @author Alumnos
 */
public class MySQLLogDAO implements LogDAO{
    final String INSERT = "INSERT INTO catalogo (fecha, cuit) VALUES ( ?, ?)";
    final String UPDATE = "UPDATE catalogo SET fecha = ?";
    final String DELETE = "DELETE FROM catalogo WHERE idCatalogo = ?";
    final String GETALL = "SELECT *  FROM `catalogo`";
    final String GETONE = "SELECT *  FROM `catalogo` WHERE `idCatalogo` = ?";

    private Long IdGenerated = null;
    private Connection conn;

    public MySQLLogDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertar(logUsuarios a) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        try {
            stat = conn.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            stat.setLong(1, a.getCuit());
            stat.setDate(2, a.getFecha());
            stat.setString(3, a.getAccion());
            stat.setLong(4, a.getIdAccion());
            if (stat.executeUpdate() == 0) {
                System.out.println("Puede q no se haya guardado");
            }
            rs = stat.getGeneratedKeys();
            if (rs.next()) {
                a.setId(rs.getLong(1));
                IdGenerated = rs.getLong(1);
            } else {
                throw new DAOException("Puede que no se haya generado");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error en SQL", ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL", e);
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ex) {
                    throw new DAOException("Error en SQL", ex);
                }
            }
        }
    }

    @Override
    public void eliminar(logUsuarios a) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(logUsuarios a) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<logUsuarios> obtenerTodos() throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<logUsuarios> list = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            while (rs.next()) {
                list.add(convertir(rs));
            }
        } catch (SQLException e) {
            throw new DAOException("Error SQL");
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new DAOException("Error en SQL", e);
                }
            }
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    throw new DAOException("Error SQL", e);
                }
            }
        }
        return list;
    }

    private logUsuarios convertir(ResultSet rs) throws SQLException {
        Long id = (long) rs.getInt("id");
        logUsuarios log = new logUsuarios(id ,rs.getLong("cuit"), rs.getDate("fecha"), rs.getString("accion"), rs.getLong("idAccion"));
        return log;
    }
    
    @Override
    public logUsuarios obtener(Long id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
