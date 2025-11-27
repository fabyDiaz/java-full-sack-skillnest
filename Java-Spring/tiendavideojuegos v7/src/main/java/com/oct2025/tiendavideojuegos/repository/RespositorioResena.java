package com.oct2025.tiendavideojuegos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oct2025.tiendavideojuegos.models.Resena;

@Repository
public interface RespositorioResena extends CrudRepository<Resena, Long> {

}
