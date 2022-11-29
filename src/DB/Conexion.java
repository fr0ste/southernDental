package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {

    private String user;
    private String constraseña;
    private String url;
    private String puerto;
    private String ip;
    private String driver;
    private String db;
    private Connection connection;
    
    public Conexion() {
        this.user = "root";
        this.constraseña = "root";
        this.url = "jdbc:mysql://";
        this.ip = "localhost:";
        this.puerto = "3306";
        this.driver = "com.mysql.cj.jdbc.Driver";
        this.db = "/southern_dental";
    }

    public Connection getConnection() throws ClassNotFoundException {
        try {

            Class.forName(driver);
            connection = DriverManager.getConnection(url+ip+puerto+db, user, constraseña);
            return connection;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;

    }

}
