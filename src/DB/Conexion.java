/*

Autor: Joel && Elio
Fecha de creación: 01/12/2022
Fecha de modificación: 01/12/2022
Descripción: clase que gestiona la conexion a la base de datos.

*/
package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


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
