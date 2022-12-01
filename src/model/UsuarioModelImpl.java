/*

Autor: Joel && Elio
Fecha de creación: 01/12/2022
Fecha de modificación: 01/12/2022
Descripción: clase implementadora del modelo para usuarios.

*/
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
public class UsuarioModelImpl {
    
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
            
            System.out.println("1");
            stm = connection.createStatement();
            System.out.println("1");
            rs = stm.executeQuery(query);
            System.out.println("1");
            while (rs.next()) {
                Usuario usuario1 = new Usuario();
                listaUsuario.add(usuario1);
            }
            
            System.out.println("1");
            stm.close();
            connection.close();
            return listaUsuario;
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //devuelve una lista de usuario con su rol correspondiente
    public List<Usuario> obtenerUsuarios(){
        try {
            ArrayList<Usuario> listaUsuario = new ArrayList<>();
            ResultSet rs;
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            String query = "select usuarios.id_usuario,nombre_usuario,email_usuario,nombre_rol from usuarios inner join roles_tipos_usuario right join roles_usuarios on usuarios.id_usuario = roles_usuarios.id_usuario and roles_tipos_usuario.id_rol=roles_usuarios.id_rol;";
            
            System.out.println("1");
            stm = connection.createStatement();
            System.out.println("1");
            rs = stm.executeQuery(query);
            System.out.println("1");
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("usuarios.id_usuario"));
                usuario.setNombreUsuario(rs.getString("nombre_usuario"));
                usuario.setEmail(rs.getString("email_usuario"));
                usuario.setRol(rs.getString("nombre_rol"));
                        
                listaUsuario.add(usuario);
            }
            
            System.out.println("1");
            stm.close();
            connection.close();
            return listaUsuario;
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    public void insertarUsuario(Usuario usuario){
        try {
            
            int idRolAux;
            int idUsuarioAux;
            ResultSet rs;
            conexion = new Conexion();//se establece la conexion
            connection = conexion.getConnection();//se obtiene la conexion de la base de datos 
            
            
            String query = "insert into usuarios(nombre_usuario,pass_usuario,email_usuario) values('"+usuario.getNombreUsuario()+"','"+usuario.getPassUsuario()+"','"+usuario.getEmail()+"');";
            stm = connection.createStatement();
           stm.execute(query);
            stm.close();
            
            query = "select id_usuario from usuarios where nombre_usuario='"+usuario.getNombreUsuario()+"';";
            stm = connection.createStatement();
            rs = stm.executeQuery(query);
            rs.next();
            idUsuarioAux = rs.getInt("id_usuario");
            stm.close();
            
            query = "select id_rol from roles_tipos_usuario where nombre_rol='"+usuario.getRol()+"';";
            stm = connection.createStatement();
            rs = stm.executeQuery(query);
            rs.next();
            idRolAux = rs.getInt("id_rol");
            stm.close();
            
            query = "insert into roles_usuarios(id_usuario,id_rol) values("+idUsuarioAux+","+idRolAux+");";
            stm = connection.createStatement();
           stm.execute(query);
           stm.close();
            
            connection.close();
            
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioModelImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    
    }
    
    public static void main(String[] args) {
        UsuarioModelImpl us = new UsuarioModelImpl();
        
        us.insertarUsuario(new Usuario("fred", "fred123", "fred@gmail.com", "alumno"));
    }
    
}
