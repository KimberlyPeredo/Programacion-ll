package Proyecto.PedidoDAO;
import Proyecto.Pedido.Pedido;
import Proyecto.DatabaseConnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PedidoDAO {
    public void guardarPedido(Pedido pedido) {
        String queryCliente = "INSERT INTO clientes (nombre, contacto) VALUES (?, ?)";
        String queryPedido = "INSERT INTO pedidos (cliente_id, empleado_id, sabor_id, tamano_id, promocion_id, total) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection()) {
            if (conn != null) {
                // Insertar cliente
                try (PreparedStatement stmtCliente = conn.prepareStatement(queryCliente, PreparedStatement.RETURN_GENERATED_KEYS)) {
                    stmtCliente.setString(1, pedido.getCliente().getNombre());
                    stmtCliente.setString(2, pedido.getCliente().getContacto());
                    stmtCliente.executeUpdate();

                    ResultSet rsCliente = stmtCliente.getGeneratedKeys();
                    int clienteId = rsCliente.next() ? rsCliente.getInt(1) : -1;

                    // Insertar pedido
                    try (PreparedStatement stmtPedido = conn.prepareStatement(queryPedido)) {
                        stmtPedido.setInt(1, clienteId);
                        stmtPedido.setInt(2, pedido.getEmpleado().getId());
                        stmtPedido.setInt(3, pedido.getSabor().getId());
                        stmtPedido.setInt(4, pedido.getTamano().getId());
                        stmtPedido.setInt(5, pedido.getPromocion().getId());
                        stmtPedido.setDouble(6, pedido.calcularPrecioTotal());
                        stmtPedido.executeUpdate();
                    }
                }
                System.out.println("Pedido guardado exitosamente.");
            }
        } catch (SQLException e) {
            System.out.println("Error en guardarPedido:");
            e.printStackTrace();
        }
    }
}

