package model;

import DB.Conexion;
import entity.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author froste
 */
public class UsuarioModel {
    
    private Conexion conexion;
    private Connection connection;
    private Statement stm;
    
    
    //devuelve una lista de usuario con su rol correspondiente
    public List<Usuario> buscarUsuarioConRol(Usuario usuario) {
        try {
            ArrayList<Usuario> listaUsuario = new ArrayList<>();
            ResultSet rs;
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "with consulta as (select nombre_usuario,email_usuario,nombre_rol,pass_usuario from usuarios inner join roles_tipos_usuario right join roles_usuarios on usuarios.id_usuario = roles_usuarios.id_usuario and roles_tipos_usuario.id_rol=roles_usuarios.id_rol) "
                    + "select * from consulta where nombre_usuario='"+usuario.getNombreUsuario()+"' and nombre_rol='"+usuario.getRol()+"' and pass_usuario='"+usuario.getPassUsuario()+"';";
            
            stm = connection.createStatement();
            rs = stm.executeQuery(query);
            while (rs.next()) {
                Usuario usuario1 = new Usuario();
                listaUsuario.add(usuario1);
            }
            
            
            stm.close();
            connection.close();
            return listaUsuario;
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
   
}
