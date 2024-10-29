package Compile_MySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main_MySQL {
    public static void main(String[] args) {
        MySQLConnection conexionDB= new MySQLConnection();
        Connection conexion= conexionDB.getConnection();
        int opcion;
        Scanner sc= new Scanner(System.in);
        String nombre,email, telefono;
        do {
            System.out.println("*** Menu ***");
            System.out.println("1. Agregar cliente");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if (conexion != null) {
                        sc.nextLine();
                        System.out.println("DATOS DE CLIENTE");
                        System.out.println("Nombre: ");
                        nombre = sc.nextLine();
                        System.out.println("Correo: ");
                        email = sc.nextLine();
                        System.out.println("Telefono: ");
                        telefono = sc.nextLine();
                        String sql = "INSERT INTO clientes8nombre,email,telefono) VALUES(? ? ?)";
                        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
                            stmt.setString(1, nombre);
                            stmt.setString(2, email);
                            stmt.setString(3, telefono);
                            stmt.executeUpdate();
                        } catch (SQLException e) {
                            System.out.println(e);
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo");
                case 2:
                    if (conexion!=null){
                        String sql="SELECT nombre, email, telefono FROM clientes";
                        try (PreparedStatement stmt=conexion.prepareStatement(sql);
                            ResultSet rs=stmt.executeQuery()) {
                            System.out.println("*** LISTA DE CLIENTES: ***");
                            while (rs.next()){
                                System.out.println(rs.getString("nombre"));
                                System.out.println(rs.getString("email"));
                                System.out.println(rs.getString("telefono"));
                                System.out.println("----------------------");

                            }
                        }catch (SQLException e){
                            System.out.println(e);
                        }
                }
            }
        }while (opcion !=0);

    }
}
