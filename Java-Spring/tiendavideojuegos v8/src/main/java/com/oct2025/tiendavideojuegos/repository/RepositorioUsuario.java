package com.oct2025.tiendavideojuegos.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.oct2025.tiendavideojuegos.models.Usuario;

public interface RepositorioUsuario extends CrudRepository<Usuario, Long>{

    Optional<Usuario> findByEmail(String email);

}
