package SQL_compile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    private static final  String URL="jdbc:mysql://localhost:3306/colegio";
    private static final String USER= "root";
    private static final String PASSWORD= "";
    private Connection connection;
    public MySQLConnection(){
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
