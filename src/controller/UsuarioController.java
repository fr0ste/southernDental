package controller;

import entity.Usuario;
import service.UsuarioServiceImpl;

/**
 *
 * @author froste
 */
public class UsuarioController {
    
    private UsuarioServiceImpl service;
    
    
    //devuelve true si el usuario con su correspondiente rol existe
    public boolean validarUsuario(Usuario usuario){
        service = new UsuarioServiceImpl();
        return service.validarUsuario(usuario);
    }
    
}
