package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexiondb {
    static String URL = "jdbc:mysql://crud2.c16eemkuyw4f.us-east-1.rds.amazonaws.com:3306/registro";
    static String USER = "admin";
    static String PASSWORD = "asumipenafiel27";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver de la base de datos: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return connection;
    }
}

