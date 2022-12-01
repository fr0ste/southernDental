package controller;

import entity.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;
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
    
}
