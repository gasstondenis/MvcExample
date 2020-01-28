package modelo;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String url= "jdbc:mysql://localhost:3306/escuela";
    private static final String username = "root";
    private static final String password = "gaston";
    private static Connection conexion = null;
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(url, username, password);
        }catch (ClassNotFoundException e){

        } catch (SQLException e){

        }
        return conexion;
    }
}
