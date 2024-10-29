import Controlador.UsuarioControlador;
import database.ConexionDB;
import modelo.UsuarioDAO;
import vista.UsuarioVista;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main_Controlador_Modelo_Vista {
    public static void main(String[] args) {
        try{
            Connection conexion = ConexionDB.getConnection();
            UsuarioDAO usuarioDAO = new UsuarioDAO(conexion);
            UsuarioVista usuarioVista = new UsuarioVista();
            UsuarioControlador usuarioControlador = new UsuarioControlador(usuarioDAO, usuarioVista);

            Scanner scanner = new Scanner(System.in);
            int opcion;

            do{
                System.out.println("\n=== Menu de gestion de Usuarios ===");
                System.out.println("1.  Mostrarusuarios");
                System.out.println("2.  Agregar usuarios");
                System.out.println("0.  Salir");
                System.out.println("Selecciona una opcion:  ");
                opcion = scanner.nextInt();
                switch (opcion){
                    case 1:
                        usuarioControlador.listarUsuarios();
                        break;
                    case 2:
                        usuarioControlador.agragarUsuario();
                        break;
                    case 0:
                        System.out.println("Saliendo deñ sistema...");
                        break;
                    default:
                        System.out.println("Opcion no valida. Intente de nuevo");
                        break;
                }
            }while (opcion !=0);
            ConexionDB.cerrarConexion();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
