package com.oct2025.tiendavideojuegos.repository;
import com.oct2025.tiendavideojuegos.models.VideoJuego;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepsoitorioVideojuego extends CrudRepository<VideoJuego, Long> {


}
