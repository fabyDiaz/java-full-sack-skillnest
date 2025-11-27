package com.oct2025.tiendavideojuegos.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="resenas")
public class Resena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Este campo es obligatorio")
    @Size(min=1,max=400, message = "Debe contener menos de 400 caracteres")
    private String mensaje; 

    @ManyToOne
    @JoinColumn(name="id_videojuego")
    private VideoJuego videoJuego;
    
    public Resena() {
    }
    
    public Resena(Long id, String mensaje, VideoJuego videoJuego) {
        this.id = id;
        this.mensaje = mensaje;
        this.videoJuego = videoJuego;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public VideoJuego getVideoJuego() {
        return videoJuego;
    }

    public void setVideoJuego(VideoJuego videoJuego) {
        this.videoJuego = videoJuego;
    }

    @Override
    public String toString() {
        return "Resena [id=" + id + ", mensaje=" + mensaje + ", videoJuego=" + videoJuego + "]";
    }
    
}
