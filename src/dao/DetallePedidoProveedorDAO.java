package dao;

import java.util.List;
import modelo.DetallePedidoProveedor;
import modelo.DetallePedidoProveedor.Id;

public interface DetallePedidoProveedorDAO extends DAO<DetallePedidoProveedor, Id>{

    public List<DetallePedidoProveedor> obtenerxPedido(Long idPedidoProveedor) throws DAOException;
    
}
