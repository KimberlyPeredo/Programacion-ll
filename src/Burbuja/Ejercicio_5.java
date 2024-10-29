package Burbuja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLData;
import java.sql.SQLException;

public class Ejercicio_5 {
    private static final  String URL="jdbc:mysql://localhost:3306/Peredo";
    private static final String USER= "root";
    private static final String PASSWORD= "";
    private Connection connection;
    public Ejercicio_5(){
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa a la base de datos");
        }catch (SQLException e){
            System.out.println("Error al conectar a la ase de datos: "+e.getMessage());
        }

    }
    public Connection getConnection(){
        return this.connection;
    }

}
