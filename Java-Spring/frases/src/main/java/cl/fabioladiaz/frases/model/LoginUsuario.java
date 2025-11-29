package cl.fabioladiaz.frases.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginUsuario {

    @NotBlank(message = "Por favor, proporciona tu correo.")
    @Email (message = "POr favor, Ingresa un correo válido")
    private String correo;

    @NotBlank(message = "Por favor, proporciona una contraseña.")
    @Size(min = 8, message = "Debe contener al menor 8 caracteres")
    private String password;

    public LoginUsuario() {
    }

    public LoginUsuario(String correo,String password) {
        this.correo = correo;
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginUsuario [correo=" + correo + ", password=" + password + "]";
    }

    

}
