package com.oct2025.tiendavideojuegos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oct2025.tiendavideojuegos.models.VideoJuego;
import com.oct2025.tiendavideojuegos.repository.RepsoitorioVideojuego;

@Service
public class ServicioVideojuego {

    @Autowired
    private  RepsoitorioVideojuego repositorioVideojuego;

    public List<VideoJuego> obtenerTodosLosVideoJuegos(){
        return (List<VideoJuego>) this.repositorioVideojuego.findAll();
    }

    public VideoJuego obtenerPorId(Long id){
        return repositorioVideojuego.findById(id).orElse(null);
    }

    public VideoJuego crear(VideoJuego videojueugo){
        return repositorioVideojuego.save(videojueugo);
    }

    public VideoJuego actualizar(VideoJuego videoJuego){
        return repositorioVideojuego.save(videoJuego);
    }

    public void eliminar(Long id){
        repositorioVideojuego.deleteById(id);
    }

}
