package Proyecto.Main;

import Proyecto.Cliente.Cliente;
import Proyecto.Empleado.Empleado;
import Proyecto.Helado.Helado;
import Proyecto.HistorialPedidos.HistorialPedidos;
import Proyecto.Pedido.Pedido;
import Proyecto.Promocion.Promocion;
import Proyecto.Tamaño.Tamaño;
import com.sun.source.tree.CompilationUnitTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HistorialPedidos historialPedidos= new HistorialPedidos();
        //La creacion del cliente
        System.out.println("Ingrese su nombre: ");
        String nombreCliente= sc.nextLine();
        System.out.println("Ingrese su numero de contacto: ");
        String numeroContacto= sc.nextLine();
        Cliente cliente=new Cliente(nombreCliente, numeroContacto);

        //la creacion de empleado
        System.out.println("Ingrese el nombre del empleado: ");
        String nombreEmpleado= sc.nextLine();
        System.out.println("Ingrse el ID del empleado: ");
        String idEmpleado=sc.nextLine();
        Empleado empleado=new Empleado( nombreEmpleado,idEmpleado);

        Pedido pedido=new Pedido();

        Helado[] sabores= {
                new Helado("Vainilla", 2.5),
                new Helado("Chocolate", 3.0),
                new Helado("Fresa", 2.8),
                new Helado("Mango", 3.2),
                new Helado("Limon", 2.7)
        };
        Tamaño[] tamaños= {
                new Tamaño("Pequeño", 2.1),
                new Tamaño("Mediano", 2.3),
                new Tamaño("Grande", 2.5)
        };
        Promocion[] promocions={
                new Promocion("Descuento del 10%", 0.10),
                new Promocion("Descuento del 20%", 0.20),
        };
        while (true){
            System.out.println("/n MENU DE HELADOS");
            System.out.println("1. Mostrar sabores");
            System.out.println("2. Seleccionar  sabor");
            System.out.println("3. Seleccionar Tamaño");
            System.out.println("4. Aplicar promocion");
            System.out.println("5. Ver precio total");
            System.out.println("6. Finalizar pedido y agregar al historial");
            System.out.println("7. Ver historial de pedidos");
            System.out.println("8. Salir");
            System.out.println("Seleccioe una opcion: ");

            int opcion=sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("SABORES DISPONIBLES: ");
                    for (int i = 0; i < sabores.length; i++) {
                        System.out.println((i + 1) + "." + sabores[i].getNombre() + "- $" + sabores[i].getPrecio());
                    }
                    break;
                case 2:
                    System.out.println("Seleccione un sabor (1-5):");
                    int saborSeleccionado = sc.nextInt() - 1;
                    if (saborSeleccionado >= 0 && saborSeleccionado < sabores.length) {
                        pedido.seleccionarHelado(sabores[saborSeleccionado]);
                        System.out.println("Ha seleccionado el sabor: " + sabores[saborSeleccionado].getNombre());
                    } else {
                        System.out.println("Sabor no valido. inteletelo de nuevo.");
                    }
                    break;
                case 3:
                    System.out.println("Seleccione un tamaño(1: Pequeño, 2: Mediano, 3: Grande): ");
                    int tamañoSeleccionado = sc.nextInt() - 1;
                    if (tamañoSeleccionado >= 0 && tamañoSeleccionado < tamaños.length) {
                        pedido.seleccionarTamaño(tamaños[tamañoSeleccionado]);
                        System.out.println("Ha seleccionado el tamaño: " + tamaños[tamañoSeleccionado].getDescripcion());
                    } else {
                        System.out.println("Tamaño no valido. Inténtelo de nuevo.");
                    }
                    break;
                case 4:
                    System.out.println("PROMOCIONES DISPONIBLES: ");
                    for (int i = 0; i < promocions.length; i++) {
                        System.out.println((i + 1) + "." + promocions[i].getDescripcion());
                    }
                    System.out.println("Seleccione una promocion (1-2): ");
                    int promocionSeleccionada = sc.nextInt() - 1;
                    if (promocionSeleccionada >= 0 && promocionSeleccionada < promocions.length) {
                        pedido.aplicarPromocion(promocions[promocionSeleccionada]);
                        System.out.println("Promocion aplicada: " + promocions[promocionSeleccionada].getDescripcion());
                    } else {
                        System.out.println("Promocion no válida.");
                    }
                    break;
                case 5:
                    pedido.mostrarPrecioTotal();
                    break;
                case 6:
                    historialPedidos.agregarPedido(pedido);
                    pedido = new Pedido();
                    System.out.println("Pedido finalizado y añadido al historial");
                    break;
                case 7:
                    historialPedidos.mostrarHistorial();
                    break;
                case 8:
                    System.out.println(" Gracias por visitarnos. ¡Que tenga un hermoso dia!!!");
                    return;
                default:
                    System.out.println("Opcion no valida. intentelo de nuevo.");
                    break;
            }
            System.out.println();
        }
    }
}
