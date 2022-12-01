/*

Autor: Joel && Elio
Fecha de creación: 01/12/2022
Fecha de modificación: 01/12/2022
Descripción: clase controladora para los usuarios.

*/
package controller;

import entity.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.UsuarioModelImpl;
import service.UsuarioServiceImpl;

public class UsuarioController {

    private UsuarioServiceImpl service;

    //Devuelve true si el usuario con su correspondiente rol existe
    public boolean validarUsuario(Usuario usuario) {
        service = new UsuarioServiceImpl();
        return service.validarUsuario(usuario);
    }
    
    public void mostrarRegistros(DefaultTableModel modeloTabla) {
        service = new UsuarioServiceImpl();
        List<Usuario> listaUsuario = service.obtenerUsuarios();
        modeloTabla.setRowCount(0);
        for (Usuario usuario : listaUsuario) {
            Object[] fila = new Object[4];
            fila[0] = String.valueOf(usuario.getIdUsuario());
            fila[1] = usuario.getNombreUsuario();
            fila[2] = usuario.getEmail();
            fila[3] = usuario.getRol();
            modeloTabla.addRow(fila);
        }
    }
    
    public void insertarUsuario(Usuario usuario){
        
        service = new UsuarioServiceImpl();
        service.insertarUsuario(usuario);
        
    }
    
     public void eliminarUsuario(Usuario usuario){
          service = new UsuarioServiceImpl();
        service.eliminarUsuario(usuario);
      }
      
       public void actualizarUsuario(Usuario usuario){
           service = new UsuarioServiceImpl();
        service.actualizarUsuario(usuario);
       }
    
}
