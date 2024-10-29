package SQL_compile;

import java.sql.*;
import java.util.Scanner;

public class Main_SQL {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int op;
            Resources.cleanScreen();
            do {
                Resources.mainMenu();
                op = sc.nextInt();
                switch (op){
                    case 1:
                        Resources.cleanScreen();
                        Functions.addCustomer();
                        Resources.separators();
                        break;
                    case 2:
                        Resources.cleanScreen();
                        Functions.showCustomer();
                        break;
                    case 3:
                        Resources.cleanScreen();
                        Functions.updateCustomer();
                        break;
                    case 4:
                        Resources.cleanScreen();
                        Functions.deleteCustomer();
                        break;
                    case 5:
                        Resources.outMenu();
                        break;
                }
            } while (op != 5);
        }
    }


    class Functions{
        static MySQLConnection dbConnection = new MySQLConnection();
        static Connection connection = dbConnection.getConnection();

        public static void showCustomer(){
            Scanner sc = new Scanner(System.in);
            int opShow;
            do {
                if (connection != null){
                    String sql = "SELECT id, nombre, p_apellido, s_apellido, telefono, email FROM ESTUDIANTES";
                    try(PreparedStatement stmt = connection.prepareStatement(sql)){
                        ResultSet rs = stmt.executeQuery();
                        Resources.showMenu();
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
                        System.out.printf("| %-5s | %-14s | %-28s | %20s | %20s | %20s |%n", "ID", "NOMBRE","PRIMER APELLIDO", "SEGUNDO APELLIDO", "TELEFONO", "EMAIL");
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
                        while (rs.next()){
                            System.out.printf("| %-5s | %-14s | %-28s | %20s | %20s | %20s |%n", rs.getString("id"), rs.getString("nombre"), rs.getString("p_apellido"),rs.getString("s_apellido"), rs.getString("telefono"),rs.getString("email"));
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------");
                        }
                    } catch (SQLException e){
                        System.out.println("ERROR AL CONECTAR CON LA BASE DE DATOS" + e.getMessage());
                    }
                }
                Resources.continueShow(); opShow = sc.nextInt();
                if (opShow != 1){
                    System.out.println("INCORRECTO, ELIJA LA OPCIÓN 1 PARA VOLVER");
                }
            } while (opShow != 1);
        }

        public static void addCustomer(){
            int numberPhone; String name,lastName1,lastName2, email;
            Scanner sc = new Scanner(System.in);
            Scanner ssc = new Scanner(System.in);
            Resources.addMenu();
            System.out.print("| NOMBRE: "); name = ssc.nextLine();
            System.out.println("--------------------------");
            System.out.print("| PRIMER APELLIDO: "); lastName1 = ssc.nextLine();
            System.out.println("--------------------------");
            System.out.print("| SEGUNDO APELLIDO: "); lastName2 = ssc.nextLine();
            System.out.println("--------------------------");
            System.out.print("| TELEFONO: "); numberPhone = sc.nextInt();
            System.out.println("--------------------------");
            System.out.print("| EMAIL: "); email = ssc.nextLine();
            System.out.println("--------------------------");


            if (connection != null){
                String sql = "INSERT INTO estudiantes(nombre,p_apellido,s_apellido, telefono, email) VALUES (?, ?, ?, ?, ?)";
                try(PreparedStatement stmt = connection.prepareStatement(sql)){
                    stmt.setString(1, name);
                    stmt.setString(2,lastName1);
                    stmt.setString(3,lastName2);
                    stmt.setString(4, String.valueOf(numberPhone));
                    stmt.setString(5, email);
                    stmt.executeUpdate();
                } catch (SQLException e){
                    System.out.println("ERROR AL CONECTAR CON LA BASE DE DATOS" + e.getMessage());
                }
            }
        }

        public static void updateCustomer(){
            Scanner sc = new Scanner(System.in);
            Scanner ssc = new Scanner(System.in);
            int idCustomer, newNumberPhone; String newName,newLastName1,newLastName2, newEmail;

            Resources.updateMenu();
            if (connection != null){
                String sql = "SELECT id, nombre, p_apellido, s_apellido, telefono, email FROM ESTUDIANTES";
                try(PreparedStatement stmt = connection.prepareStatement(sql)){
                    ResultSet rs = stmt.executeQuery();
                    Resources.showMenu();
                    System.out.println("----------------------------------------------------------------------");
                    System.out.printf("| %-5s | %-14s | %-28s | %10s | %20s| %20s|%n", "ID", "NOMBRE","P_APELLIDO","S_APELLIDO", "TELEFONO","EMAIL");
                    System.out.println("----------------------------------------------------------------------");
                    while (rs.next()){
                        System.out.printf("| %-5s | %-14s | %-28s | %10s| %20s |%n", rs.getString("id"), rs.getString("nombre"),rs.getString("p_apellido"),rs.getString("s_apellido") , rs.getString("telefono"),rs.getString("email"));
                        System.out.println("----------------------------------------------------------------------");
                    }
                } catch (SQLException e){
                    System.out.println("ERROR AL CONECTAR CON LA BASE DE DATOS" + e.getMessage());
                }
            }
            //-------------------------------------------------------------------------------
            if (connection != null){
                String sql = "UPDATE estudiantes SET nombre = ?,p_apellido = ?, s_apellido = ? , telefono = ?, email = ? WHERE id = ?";
                try(PreparedStatement stmt = connection.prepareStatement(sql)){
                    Resources.selectCustomer(); idCustomer = sc.nextInt();
                    System.out.println("---------------------------------------");
                    System.out.print("| INGRESE NUEVO NOMBRE: "); newName = ssc.nextLine();
                    System.out.println("---------------------------------------");
                    System.out.print("| INGRESE NUEVO PRIMER APELLIDO: "); newLastName1 = ssc.nextLine();
                    System.out.println("---------------------------------------");
                    System.out.print("| INGRESE NUEVO SEGUNDO APELLIDO: "); newLastName2 = ssc.nextLine();
                    System.out.println("---------------------------------------");
                    System.out.print("| INGRESE NUEVO TELÉFONO: "); newNumberPhone = sc.nextInt();
                    System.out.println("---------------------------------------");
                    System.out.print("| INGRESE NUEVO EMAIL: "); newEmail = ssc.nextLine();
                    System.out.println("---------------------------------------");


                    stmt.setString(1, newName);
                    stmt.setString(2, newLastName1);
                    stmt.setString(3, newLastName2);
                    stmt.setString(4, String.valueOf(newNumberPhone));
                    stmt.setString(5, newEmail);
                    stmt.setString(6, String.valueOf(idCustomer));

                    int updateRows = stmt.executeUpdate();

                    if (updateRows > 0){
                        System.out.println("| ¡LOS DATOS FUERON ACTUALIZADOS CORRECTAMENTE! |");
                    } else {
                        System.out.println("| ¡NO SE ENCONTRÓ UN CLIENTE CON ESE ID! |");
                    }

                } catch (SQLException e){
                    System.out.println(e.getMessage());
                }
            }
        }

        public static void deleteCustomer(){
            Scanner sc = new Scanner(System.in);
            Scanner ssc = new Scanner(System.in);

            Resources.deleteMenu();
            if (connection != null){
                String sql = "SELECT id, nombre, p_apellido, s_apellido, telefono, email FROM ESTUDIANTES";
                try(PreparedStatement stmt = connection.prepareStatement(sql)){
                    ResultSet rs = stmt.executeQuery();
                    System.out.println("----------------------------------------------------------------------");
                    System.out.printf("| %-5s | %-14s | %-28s | %10s | %20s| %20s|%n", "ID", "NOMBRE", "PRIMER APELLIDO", "SEGUNDO APELLIDO", "TELEFONO","EMAIL");
                    System.out.println("----------------------------------------------------------------------");
                    while (rs.next()){
                        System.out.printf("| %-5s | %-14s | %-28s | %10s | %20s| %20s| %20s|%n", rs.getString("id"), rs.getString("nombre"),rs.getString("p_apellido"),rs.getString("s_apellido"), rs.getString("telefono"),rs.getString("email"));
                        System.out.println("----------------------------------------------------------------------");
                    }
                } catch (SQLException e){
                    System.out.println("ERROR AL CONECTAR CON LA BASE DE DATOS" + e.getMessage());
                }
            }

            if (connection != null){
                String sql = "DELETE FROM Estudiante WHERE id = ?";
                try (PreparedStatement stmt = connection.prepareStatement(sql)){
                    Resources.selectCustomer(); int idCustomer = sc.nextInt();
                    stmt.setInt(1, idCustomer);
                    int deleteRows = stmt.executeUpdate();
                    if (deleteRows > 0){
                        System.out.println("Estudiante Eliminado");
                    } else {
                        System.out.println("Estudiante no encontrado");
                    }
                } catch (SQLException e){
                    System.out.println(e.getMessage());
                }
            }
        }

    }

    class Resources{

        public static void separators(){
            System.out.println(" ");
            System.out.println("===================================");
            System.out.println("===================================");
            System.out.println(" ");
        }

        public static void cleanScreen(){
            for (int i = 0 ; i < 30 ; i++){
                System.out.println(" ");
            }
        }

        public static void mainMenu(){
            System.out.println("--------------------------");
            System.out.println("|          MENÚ          |");
            System.out.println("--------------------------");
            System.out.println("|  Seleccione ( 1 - 3 )  |");
            System.out.println("--------------------------");
            System.out.println("| 1 | AÑADIR ESTUDIANTE     |");
            System.out.println("--------------------------");
            System.out.println("| 2 | MOSTRAR ESTUDIANTE   |");
            System.out.println("--------------------------");
            System.out.println("| 3 | ACTUALIZAR         |");
            System.out.println("--------------------------");
            System.out.println("| 4 | BORRAR             |");
            System.out.println("--------------------------");
            System.out.println("| 5 | SALIR DEL MENÚ     |");
            System.out.println("--------------------------");
            System.out.print("| -> ");
        }

        public static void addMenu(){
            System.out.println("--------------------------");
            System.out.println("|          MENÚ          |");
            System.out.println("--------------------------");
            System.out.println("|     AÑADIR ESTUDIANTE     |");
            System.out.println("--------------------------");
        }

        public static void showMenu(){
            System.out.println("--------------------------");
            System.out.println("|          MENÚ          |");
            System.out.println("--------------------------");
            System.out.println("|    MOSTRAR ESTUDIANTE    |");
            System.out.println("--------------------------");
            System.out.println(" ");
        }


        public static void outMenu(){
            System.out.println("--------------------------");
            System.out.println("|  SALIENDO DEL MENÚ...   |");
            System.out.println("--------------------------");
        }

        public static void updateMenu(){
            System.out.println("--------------------------");
            System.out.println("|          MENÚ          |");
            System.out.println("--------------------------");
            System.out.println("|   ACTUALIZAR ESTUDIANTE   |");
            System.out.println("--------------------------");
        }


        public static void deleteMenu() {
            System.out.println("--------------------------");
            System.out.println("|          MENÚ          |");
            System.out.println("--------------------------");
            System.out.println("|    ELIMINAR ESTUDIANTE    |");
            System.out.println("--------------------------");
        }

        public static void continueShow(){
            System.out.println("--------------------------");
            System.out.println("| 1 | VOLVER AL MENÚ     |");
            System.out.println("--------------------------");
            System.out.print("| -> ");
        }

        public static void selectCustomer(){
            System.out.println("--------------------");
            System.out.println("| SELECCIONE UN ID |");
            System.out.println("--------------------");
            System.out.print("| -> ");
        }
    }

