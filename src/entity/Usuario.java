/**
 * Autor: Joel && Elio
 * Fecha de creación: 01/12/2022
 * Fecha de modificación: 01/12/2022
 * Descripción: Clase de usuarios.
 */
package entity;

public class Usuario {

    private int idUsuario;
    private String nombreUsuario;
    private String passUsuario;
    private String email;
    private String rol;
    
    /**
     * constructor vacio
     */
    public Usuario() {
    }
    
    /**
     * 
     * @param nombreUsuario
     * @param passUsuario
     * @param email
     * @param rol 
     */
    public Usuario(String nombreUsuario, String passUsuario,
            String email, String rol) {
        this.nombreUsuario = nombreUsuario;
        this.passUsuario = passUsuario;
        this.email = email;
        this.rol = rol;
    }
    
    /**
     * 
     * @return el id del usuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }
    
    /**
     * 
     * @param idUsuario establece el id del usuario
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    /**
     * 
     * @return el nombre del usuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    /**
     * 
     * @param nombreUsuario establece el nombre del usuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * 
     * @return la contraseña
     */
    public String getPassUsuario() {
        return passUsuario;
    }
    
    /**
     * 
     * @param passUsuario establece la contraseña del usuario
     */
    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }
    
    /**
     * 
     * @return el e-mail del usuario
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * 
     * @param email establece el e-mail del usuario
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * 
     * @return obtiene el rol del usuario
     */
    public String getRol() {
        return rol;
    }
    
    /**
     * 
     * @param rol establece el rol del usuario
     */
    public void setRol(String rol) {
        this.rol = rol;
    }
    
    /**
     * 
     * @return los datos del usuario
     */
    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario=" +
                nombreUsuario + ", passUsuario=" + passUsuario + ", email=" + 
                email + ", rol=" + rol + '}';
    }

}
