package entidades;

// Clase base Usuario
public class Usuario {
    private String nombreUsuario;
    private String contraseña;
    private String correoElectronico;

    // Constructor, getters y setters


    public Usuario() {
    }


    public Usuario(String nombreUsuario, String contraseña, String correoElectronico) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.correoElectronico = correoElectronico;
    }


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}


