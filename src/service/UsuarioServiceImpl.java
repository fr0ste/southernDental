
package service;

import entity.Usuario;
import model.UsuarioModel;

public class UsuarioServiceImpl {

    private UsuarioModel model;

    public boolean validarUsuario(Usuario usuario) {
        model = new UsuarioModel();
        return !model.buscarUsuarioConRol(usuario).isEmpty();
    }

}
