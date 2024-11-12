package Proyecto.Main;

import Proyecto.Pedido.Pedido;
import Proyecto.Promocion.Promocion;
import Proyecto.Tamano.Tamano;
import Proyecto.Cliente.Cliente;
import Proyecto.Sabor.Sabor;
import Proyecto.Empleado.Empleado;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;
import Proyecto.DatabaseConnection.DatabaseConnection;
import Proyecto.HistorialPedidos.HistorialPedidos;
public class Main {

    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();

        if (connection == null) {
            System.out.println("No se pudo establecer la conexión a la base de datos. Saliendo del programa.");
            return;
        }

        HistorialPedidos historialPedidos = new HistorialPedidos(connection);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú de Heladería ---");
            System.out.println("1. Registrar nuevo pedido");
            System.out.println("2. Ver historial de pedidos de un cliente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarNuevoPedido(scanner, historialPedidos);
                    break;
                case 2:
                    System.out.print("Ingrese el ID del cliente: ");
                    int clienteId = scanner.nextInt();
                    verHistorialCliente(clienteId, historialPedidos);
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema.");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }

    private static void registrarNuevoPedido(Scanner scanner, HistorialPedidos historialPedidos) {
        try {
            System.out.print("Ingrese el nombre del cliente: ");
            String nombreCliente = scanner.nextLine();
            System.out.print("Ingrese el contacto del cliente: ");
            String contactoCliente = scanner.nextLine();

            // Asignamos un ID de cliente de manera manual o automática
            // Si tienes una lógica para asignar un ID incremental o único, implementalo aquí.
            int clienteId = (int) (Math.random() * 1000);  // Ejemplo de ID aleatorio

            Cliente cliente = new Cliente(clienteId, nombreCliente, contactoCliente);  // Ahora se crea el cliente correctamente.

            Empleado empleado = new Empleado(1, "Empleado Predeterminado");

            // Selección de sabor
            System.out.println("Sabores disponibles:");
            System.out.println("1. Vainilla - $2.5");
            System.out.println("2. Chocolate - $3.0");
            System.out.println("3. Fresa - $2.8");
            System.out.println("4. Mango - $3.2");
            System.out.println("5. Limón - $2.7");
            System.out.print("Seleccione un sabor (1-5): ");
            int saborSeleccionado = scanner.nextInt();
            double precioSabor;
            switch (saborSeleccionado) {
                case 1: precioSabor = 2.5; break;
                case 2: precioSabor = 3.0; break;
                case 3: precioSabor = 2.8; break;
                case 4: precioSabor = 3.2; break;
                case 5: precioSabor = 2.7; break;
                default: precioSabor = 0;
            };
            Sabor sabor = new Sabor(saborSeleccionado, "", precioSabor);

            // Selección de tamaño
            System.out.println("Tamaños disponibles:");
            System.out.println("1. Pequeño - $1.0");
            System.out.println("2. Mediano - $1.5");
            System.out.println("3. Grande - $2.0");
            System.out.print("Seleccione un tamaño (1-3): ");
            int tamanoSeleccionado = scanner.nextInt();
            double precioTamano;
            switch (tamanoSeleccionado) {
                case 1: precioTamano = 1.0;
                break;
                case 2: precioTamano = 1.5;
                break;
                case 3: precioTamano = 2.0;
                break;
                default: precioTamano = 0;
            };
            Tamano tamano = new Tamano(tamanoSeleccionado, "", precioTamano);

            Promocion promocion = new Promocion(1, "Sin promoción", 0.0);
            Pedido pedido = new Pedido(cliente, empleado, sabor, tamano, promocion);
            historialPedidos.agregarPedido(pedido);


            System.out.println("Pedido registrado exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al registrar el pedido: " + e.getMessage());
        }
    }


    private static void verHistorialCliente(int clienteId, HistorialPedidos historialPedidos) {
        try {
            List<Pedido> historial = historialPedidos.obtenerHistorialCliente(clienteId);
            if (historial.isEmpty()) {
                System.out.println("No se encontraron pedidos para este cliente.");
            } else {
                System.out.println("Historial de pedidos:");
                for (Pedido pedido : historial) {
                    System.out.println("- Sabor: " + pedido.getSabor().getNombre() +
                            ", Tamaño: " + pedido.getTamano().getDescripcion() +
                            ", Total: $" + pedido.calcularPrecioTotal());
                }
            }
        } catch (Exception e) {
            System.out.println("Error al obtener el historial de pedidos: " + e.getMessage());
        }
    }
}
