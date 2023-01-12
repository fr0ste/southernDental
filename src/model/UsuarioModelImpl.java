/**
 * Autor: Joel && Elio
 * Fecha de creación: 01/12/2022
 * Fecha de modificación: 01/12/2022
 * Descripción: Clase implementadora del modelo para usuarios.
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

public class UsuarioModelImpl {
    
    private Conexion conexion;
    private Connection connection;
    private Statement stm;
    
    /**
     * 
     * @param usuario
     * @return una lista de usuarios con su nombre, e-mail, rol 
     *         contenida en la base de datos
     */
    public List<Usuario> buscarUsuarioConRol(Usuario usuario) {
        try {
            ArrayList<Usuario> listaUsuario = new ArrayList<>();
            ResultSet rs;
            conexion = new Conexion();//se establece la conexión
            connection = conexion.getConnection();//se obtiene la 
                                                  //conexión de la base de datos 
            String query = "with usuarios_registrados as "
                    + "(select * from usuarios left join "
                    + "roles_tipos_usuario on "
                    + "usuarios.f_id_rol = roles_tipos_usuario.id_rol)\n" 
                    + "select * from usuarios_registrados where "
                    + "usuarios_registrados.nombre_usuario="
                    + usuario.getNombreUsuario()+" and pass_usuario=" +usuario.getPassUsuario()+" and nombre_rol="+usuario.getRol()+";";
            
            stm = connection.createStatement();
           
            rs = stm.executeQuery(query);
            
            while (rs.next()) {
                Usuario usuario1 = new Usuario();
                listaUsuario.add(usuario1);
            }
            
            System.out.println("1");
            stm.close();
            connection.close();
            return listaUsuario;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    /**
     * 
     * @return una lista de usuario con su rol correspondiente 
     */
    public List<Usuario> obtenerUsuarios(){
        try {
            ArrayList<Usuario> listaUsuario = new ArrayList<>();
            ResultSet rs;
            conexion = new Conexion();//se establece la conexión
            connection = conexion.getConnection();//se obtiene la conexión 
                                                  //de la base de datos 
            String query = "select usuarios.id_usuario,nombre_usuario,"
                    + "email_usuario,nombre_rol from "
                    + "usuarios inner join roles_tipos_usuario "
                    + "right join roles_usuarios "
                    + "on usuarios.id_usuario = roles_usuarios.id_usuario and "
                    + "roles_tipos_usuario.id_rol=roles_usuarios.id_rol;";
            
            
            stm = connection.createStatement();
            
            rs = stm.executeQuery(query);
            
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt(
                        "usuarios.id_usuario"));
                usuario.setNombreUsuario(rs.getString(
                        "nombre_usuario"));
                usuario.setEmail(rs.getString("email_usuario"));
                usuario.setRol(rs.getString("nombre_rol"));
                        
                listaUsuario.add(usuario);
            }
            
            stm.close();
            connection.close();
            return listaUsuario;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    /**
     * 
     * @param usuario se inserta a la base de datos
     */
    public void insertarUsuario(Usuario usuario){
        try {
            
            int idRolAux;
            int idUsuarioAux;
            ResultSet rs;
            conexion = new Conexion();//se establece la conexión
            connection = conexion.getConnection();
            
            
            String query = "insert into usuarios(nombre_usuario,"
                    + "pass_usuario,email_usuario) values('"+
                    usuario.getNombreUsuario()+"','"+usuario.getPassUsuario()+
                    "','"+usuario.getEmail()+"');";
            stm = connection.createStatement();
           stm.execute(query);
            stm.close();
            
            query = "select id_usuario from usuarios where nombre_usuario='"+
                    usuario.getNombreUsuario()+"';";
            stm = connection.createStatement();
            rs = stm.executeQuery(query);
            rs.next();
            idUsuarioAux = rs.getInt("id_usuario");
            stm.close();
            
            query = "select id_rol from roles_tipos_usuario where nombre_rol='"+
                    usuario.getRol()+"';";
            stm = connection.createStatement();
            rs = stm.executeQuery(query);
            rs.next();
            idRolAux = rs.getInt("id_rol");
            stm.close();
            
            query = "insert into roles_usuarios(id_usuario,id_rol) values("+
                    idUsuarioAux+","+idRolAux+");";
            stm = connection.createStatement();
           stm.execute(query);
           stm.close();
            
            connection.close();
            
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } catch (ClassNotFoundException ex) {
            
        }
    }
    
    /**
     * 
     * @param usuario se elimina de la base de datos
     */
    public void eliminarUsuario(Usuario usuario){
        
         try {
            conexion = new Conexion();//se establece la conexión
            connection = conexion.getConnection();
            //eliminamos primero el rol
            String query = "delete from roles_usuarios where id_usuario="+
                    usuario.getIdUsuario()+";";
            stm = connection.createStatement();
            stm.execute(query);
            
            //eliminamos al usuario
            query ="delete from usuarios where id_usuario="+
                    usuario.getIdUsuario()+";";
            stm.execute(query);
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } catch (ClassNotFoundException ex) {
            
        }
        
    }
    
    
    /**
     * 
     * @param usuario se actualiza de la base de datos
     */
    public void actualizarUsuario(Usuario usuario){
        
        
        try {
            conexion = new Conexion();//se establece la conexión
            connection = conexion.getConnection();
            String query = "UPDATE usuarios SET nombre_usuario='"+
                    usuario.getNombreUsuario()+"', email_usuario='"+
                    usuario.getEmail()+"' WHERE id_usuario="+
                    usuario.getIdUsuario()+";";              
            stm = connection.createStatement();         
            stm.execute(query);         
            stm.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } catch (ClassNotFoundException ex) {
            
        }
        
    }
    
}
