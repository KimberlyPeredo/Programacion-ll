package Proyecto.PedidoDAO;

import Proyecto.BaseDatos.BaseDatos;
import Proyecto.Cliente.Cliente;
import Proyecto.Empleado.Empleado;
import Proyecto.Pedido.Pedido;

import java.security.PublicKey;
import java.sql.Connection;

public class PedidoDAO {
    public void guardarPedido(Pedido pedido, Cliente cliente, Empleado empleado){
        String queryCliente="INSERT INTO cliente(nombre, contacto)VALUES (?,?)";
        String queryPedido="INSERT INTO pedidos( clientes_id, empleado_id, sabor_id, tamano_id, promocion_id, total) VALUES (?,?,?,?,?,?)";
        try (Connection conn= BaseDatosconn.getConnection()){

        }
    }
}
