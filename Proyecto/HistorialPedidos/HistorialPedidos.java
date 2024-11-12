package Proyecto.HistorialPedidos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Proyecto.Pedido.Pedido;
import Proyecto.Cliente.Cliente;
import Proyecto.Sabor.Sabor;
import Proyecto.Tamano.Tamano;
import Proyecto.Empleado.Empleado;
import Proyecto.Promocion.Promocion;



public class HistorialPedidos {
    private Connection connection;

    public HistorialPedidos(Connection connection) {
        this.connection = connection;
    }

    // Método para agregar un pedido al historial en la base de datos
    public void agregarPedido(Pedido pedido) throws SQLException {
        String query = "INSERT INTO pedidos (cliente_id, empleado_id, sabor_id, tamano_id, promocion_id, total) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, pedido.getCliente().getId());
            stmt.setInt(2, pedido.getEmpleado().getId());
            stmt.setInt(3, pedido.getSabor().getId());
            stmt.setInt(4, pedido.getTamano().getId());
            stmt.setInt(5, pedido.getPromocion().getId());
            stmt.setDouble(6, pedido.calcularPrecioTotal());
            stmt.executeUpdate();
        }
    }
    public List<Pedido> obtenerHistorialCliente(int clienteId) throws SQLException {
        List<Pedido> historial = new ArrayList<>();
        String query = "SELECT * FROM pedidos WHERE cliente_id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, clienteId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente(rs.getInt(" cliente_id"), "", ""); // Carga básica del cliente
                Empleado empleado = new Empleado(rs.getInt("empleado_id"), "");  // Carga básica del empleado
                Sabor sabor = new Sabor(rs.getInt("sabor_id"), "", rs.getDouble("sabor_precio")); // Carga básica del sabor
                Tamano tamano = new Tamano(rs.getInt("tamano_id"), "", rs.getDouble("tamano_precio")); // Carga básica del tamaño
                Promocion promocion = new Promocion(rs.getInt("promocion_id"), "", rs.getDouble("descuento")); // Carga básica de la promoción

                Pedido pedido = new Pedido(cliente, empleado, sabor, tamano, promocion);
                historial.add(pedido);
            }
        }
        return historial;
    }
    public List<Pedido> obtenerTodosLosPedidos() throws SQLException {
        List<Pedido> historial = new ArrayList<>();
        String query = "SELECT * FROM pedidos";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Cliente cliente = new Cliente(rs.getInt("cliente_id"), "", "");
                Empleado empleado = new Empleado(rs.getInt("empleado_id"), "");
                Sabor sabor = new Sabor(rs.getInt("sabor_id"), "", rs.getDouble("sabor_precio"));
                Tamano tamano = new Tamano(rs.getInt("tamano_id"), "", rs.getDouble("tamano_precio"));
                Promocion promocion = new Promocion(rs.getInt("promocion_id"), "", rs.getDouble("descuento"));

                Pedido pedido = new Pedido(cliente, empleado, sabor, tamano, promocion);
                historial.add(pedido);
            }
        }
        return historial;
    }
}
