package MySQL;

import dao.DAOException;
import dao.PedidoClienteDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.PedidoCliente;

public class MySQLPedidoClienteDAO implements PedidoClienteDAO {

    final String INSERT = "INSERT INTO PedidoCliente ( estadoPedidoC, totalPedidoC, fechaEmision, fechaRecibido, dni, idLog) VALUES ( ?, ?, ?, ?, ?, ?)";
    final String UPDATE = "UPDATE `pedidocliente` SET `estadoPedidoC` = ?, `totalPedidoC` = ?, `fechaEmision` = ?, `fechaRecibido` = ? `idLog` = ? WHERE `pedidocliente`.`idPedidoCliente` = ?";
    final String DELETE = "DELETE FROM PedidoCliente WHERE idPedidoCliente = ? ";
    final String GETALL = "SELECT idPedidoCliente, estadoPedidoC, totalPedidoC, fechaEmision, fechaRecibido,dni";
    final String GETONE = "SELECT * FROM `pedidocliente` WHERE `idPedidoCliente` = ?";

    private Connection conn;

    public MySQLPedidoClienteDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertar(PedidoCliente a) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        try {
            stat = conn.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            stat.setString(1, a.getEstadoPedidoC());
            stat.setDouble(2, a.getTotalPedidoC());
            stat.setTimestamp(3, a.getFechaEmision());
            stat.setTimestamp(4, a.getFechaRecibido());
            stat.setLong(5, a.getdni());
            stat.setLong(6, a.getIdLog());
            if (stat.executeUpdate() == 0) {
                System.out.println("Puede q no se haya guardado");
            }
            rs = stat.getGeneratedKeys();
            if (rs.next()) {
                a.setIdPedidoCliente(rs.getLong(1));
            } else {
                throw new DAOException("Puede que no se haya generado");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error en SQL", ex);
        } finally {
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
    public void eliminar(PedidoCliente a) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setLong(1, a.getIdPedidoCliente());

            if (stat.executeUpdate() == 0) {
                System.out.println("Puede que no se haya guardado");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error delete", ex);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ex) {
                    throw new DAOException("Error delete", ex);

                }
            }
        }

    }

    @Override
    public void modificar(PedidoCliente a) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
            stat.setString(1, a.getEstadoPedidoC());
            stat.setDouble(2, a.getTotalPedidoC());
            stat.setTimestamp(3, a.getFechaEmision());
            stat.setTimestamp(4, a.getFechaRecibido());
            stat.setLong(5, a.getIdPedidoCliente());
            stat.setLong(6, a.getIdLog());
            if (stat.executeUpdate() == 0) {
                throw new DAOException("Puede q no se haya guardado");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error en SQL", ex);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ex) {
                    throw new DAOException("Error en sql", ex);
                }
            }
        }
    }

    private PedidoCliente convertir(ResultSet rs) throws SQLException {
        PedidoCliente pedido = new PedidoCliente(null, rs.getString("estadoPedidoC"), rs.getDouble("totalPedidoC"), rs.getTimestamp("fechaEmision"), rs.getTimestamp("fechaRecibido"), rs.getLong("dni"), rs.getLong("idLog"));// falta el DNIIIIIII
        pedido.setIdPedidoCliente(rs.getLong("idPedidoCliente"));
        return pedido;

    }

    @Override
    public List<PedidoCliente> obtenerTodos() throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<PedidoCliente> pedido = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GETALL);

            rs = stat.executeQuery();
            if (rs.next()) {
                pedido.add(convertir(rs));
            } else {
                throw new DAOException("No se ha encntrado ese registro");
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
        return pedido;
    }

    @Override
    public PedidoCliente obtener(Long id) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        PedidoCliente p = null;
        try {
            stat = conn.prepareStatement(GETONE);
            stat.setLong(1, id);
            rs = stat.executeQuery();
            if (rs.next()) {
                p = convertir(rs);
            } else {
                p = null;
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
        return p;

    }
}
