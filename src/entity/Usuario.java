/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author froste
 */
public class Usuario {
    
    private String nombreUsuario;
    private String passUsuario;
    private String email;
    private String rol;

    public Usuario() {
    }
    
    
    
    public Usuario(String nombreUsuario, String passUsuario, String email, String rol) {
        this.nombreUsuario = nombreUsuario;
        this.passUsuario = passUsuario;
        this.email = email;
        this.rol = rol;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassUsuario() {
        return passUsuario;
    }

    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + ", passUsuario=" + passUsuario + ", email=" + email + ", rol=" + rol + '}';
    }
    
    
}