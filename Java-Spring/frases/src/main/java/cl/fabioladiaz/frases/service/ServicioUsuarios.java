package cl.fabioladiaz.frases.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import cl.fabioladiaz.frases.model.LoginUsuario;
import cl.fabioladiaz.frases.model.Usuario;
import cl.fabioladiaz.frases.repository.RepositorioUsuarios;

@Service
public class ServicioUsuarios {

    @Autowired
    private RepositorioUsuarios repositorioUsuarios;

    //CRUD

    //CREATE
    public Usuario crearUsuario(Usuario usuario){
        String hashPassword = BCrypt.hashpw(usuario.getPassword(), BCrypt.gensalt());
        usuario.setPassword(hashPassword);
        return this.repositorioUsuarios.save(usuario);
    }

    //READ
    public Usuario obtenerPorId(Long id){
        return this.repositorioUsuarios.findById(id).orElse(null);
    }

    public Usuario obtenerPorCorreo(String correo){
        return this.repositorioUsuarios.findByCorreo(correo).orElse(null);
    }
    //UPDATE
    //DELETE

    //Validacion de coincidencia en Passwords
    public BindingResult validarPasswords(BindingResult validaciones, Usuario usuario){
        //Validé que el usuario no exista 
        Usuario usuarioExistente = this.obtenerPorCorreo(usuario.getCorreo());
        if(usuarioExistente != null){
        validaciones.rejectValue("correo", "UsuarioNoExiste", 
                                "Este usuario ya está registrado.");
        }
        if(!usuario.getPassword().equals(usuario.getConfirmarPassword())){
            validaciones.rejectValue("confirmarPassword", "passwordNoCoincide", "Las contraseñas no coinciden");
        }
        return validaciones;
    }

    public BindingResult validarCorreoYPassword(BindingResult validaciones, LoginUsuario loginUsuario){
        Usuario usuarioDB = this.obtenerPorCorreo(loginUsuario.getCorreo());
        if(usuarioDB == null){
            validaciones.rejectValue("correo", "CorreoNoRegistrado", "El correo ingresado no corresponse a ningun usuario registrado");
        }else{
             if(!BCrypt.checkpw(loginUsuario.getPassword(), usuarioDB.getPassword())){
                validaciones.rejectValue("password", "passwordIncorrecta", 
                                "Credenciales incorrectas.");
            } 
        }
        return validaciones;
    }


}
