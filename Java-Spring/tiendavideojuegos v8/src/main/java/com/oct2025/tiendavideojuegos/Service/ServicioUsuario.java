package com.oct2025.tiendavideojuegos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.oct2025.tiendavideojuegos.models.Usuario;
import com.oct2025.tiendavideojuegos.repository.RepositorioUsuario;

@Service
public class ServicioUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public Usuario obetenerUsuarioPorId(Long id){
        return this.repositorioUsuario.findById(id).orElse(null);
    }

    public Usuario obtenerUsuarioPorEmail(String email){
        return this.repositorioUsuario.findByEmail(email).orElse(null);
    }

    public Usuario crearUsuario(Usuario usuario){
        return this.repositorioUsuario.save(usuario);
    }

    public Usuario actualizarUsuario(Usuario usuario){
        return this.repositorioUsuario.save(usuario);
    }

    public void eliminarUsuario(Long id){
        this.repositorioUsuario.deleteById(id);
    }

    public BindingResult validarRegistro(BindingResult validaciones, Usuario usuario){
        if(!usuario.getPassword().equals(usuario.getConfirmarPassword())){
            validaciones.rejectValue("confirmarPassword","passwordNoCoincide", "Las contraseñas deben de ser iguales.");
        }
        return validaciones;
    }

    public BindingResult validarLogin(BindingResult validaciones, Usuario usuario){
        Usuario usuarioDB = this.obtenerUsuarioPorEmail();
        if(!usuario.getPassword().equals(usuario.getConfirmarPassword())){
            validaciones.rejectValue("confirmarPassword","passwordNoCoincide", "Las contraseñas deben de ser iguales.");
        }
        return validaciones;
    }

}
