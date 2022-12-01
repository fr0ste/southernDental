package controller;

import entity.Usuario;
import service.UsuarioServiceImpl;

public class UsuarioController {

    private UsuarioServiceImpl service;

    //Devuelve true si el usuario con su correspondiente rol existe
    public boolean validarUsuario(Usuario usuario) {
        service = new UsuarioServiceImpl();
        return service.validarUsuario(usuario);
    }

}
