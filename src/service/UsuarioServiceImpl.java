
package service;

import entity.Usuario;
import java.util.List;
import model.UsuarioModelImpl;

/**
 *
 * @author froste
 */
public class UsuarioServiceImpl {
    
    private UsuarioModelImpl model;
    
    public boolean validarUsuario(Usuario usuario){
        model = new UsuarioModelImpl();
        return !model.buscarUsuarioConRol(usuario).isEmpty();
    }
    
    public List<Usuario> obtenerUsuarios(){
        model = new UsuarioModelImpl();
        return model.obtenerUsuarios();
        
    }
    
}
