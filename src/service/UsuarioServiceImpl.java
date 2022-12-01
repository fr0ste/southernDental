/*

Autor: Joel && Elio
Fecha de creación: 01/12/2022
Fecha de modificación: 01/12/2022
Descripción: clase implementadora del servicio para usuarios.

*/
package service;

import entity.Usuario;
import java.util.List;
import model.UsuarioModelImpl;

public class UsuarioServiceImpl {

    private UsuarioModelImpl model;

    public boolean validarUsuario(Usuario usuario) {
        model = new UsuarioModelImpl();
        return !model.buscarUsuarioConRol(usuario).isEmpty();
    }
    
    public List<Usuario> obtenerUsuarios(){
         model = new UsuarioModelImpl();
         return model.obtenerUsuarios();
        
    }
    
     public void insertarUsuario(Usuario usuario){
         model = new UsuarioModelImpl();
         model.insertarUsuario(usuario);
     }
}
