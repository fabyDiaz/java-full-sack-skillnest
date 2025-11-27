package com.oct2025.tiendavideojuegos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

}
