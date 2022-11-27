/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Usuario;
import model.UsuarioModel;

/**
 *
 * @author froste
 */
public class UsuarioServiceImpl {
    
    private UsuarioModel model;
    
    public boolean validarUsuario(Usuario usuario){
        model = new UsuarioModel();
        return !model.buscarUsuarioConRol(usuario).isEmpty();
    }
    
}
