package Proyecto.BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDatos {
    private static final  String URL="jdbc:mysql://localhost:3306/heladeriaDB";
    private static final String USER= "root";
    private static final String PASSWORD= "";
    private Connection connection;
    public BaseDatos(){
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa a la base de datos");
        }catch (SQLException e){
            System.out.println("Error al conectar a la ase de datos: "+e.getMessage());
        }

    }
}
