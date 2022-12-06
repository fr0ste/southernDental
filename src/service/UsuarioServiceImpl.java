/**
 *Autor: Joel && Elio
 * Fecha de creación: 01/12/2022
 * Fecha de modificación: 01/12/2022
 * Descripción: Clase implementadora del servicio para usuarios.
 */
package service;

import entity.Usuario;
import java.util.List;
import model.UsuarioModelImpl;

public class UsuarioServiceImpl {

    /**
     * variables
     */
    private UsuarioModelImpl model;

    /**
     *
     * @param usuario
     * @return returna verdadero si el usuario es valido y falso si no lo es
     */
    public boolean validarUsuario(Usuario usuario) {
        model = new UsuarioModelImpl();
        return !model.buscarUsuarioConRol(usuario).isEmpty();
    }

    /**
     *
     * @return regresa una lista de usuarios de la base de datos
     */
    public List<Usuario> obtenerUsuarios() {
        model = new UsuarioModelImpl();
        return model.obtenerUsuarios();

    }

    /**
     *
     * @param usuario se inserta un usuario en la base de datos.
     */
    public void insertarUsuario(Usuario usuario) {
        model = new UsuarioModelImpl();
        model.insertarUsuario(usuario);
    }

    /**
     *
     * @param usuario elimina un usuario de la base de datos
     */
    public void eliminarUsuario(Usuario usuario) {
        model = new UsuarioModelImpl();
        model.eliminarUsuario(usuario);
    }

    /**
     *
     * @param usuario pide una actualización de un usuario a la base de datos
     */
    public void actualizarUsuario(Usuario usuario) {
        model = new UsuarioModelImpl();
        model.actualizarUsuario(usuario);
    }

}
