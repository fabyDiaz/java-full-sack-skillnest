package com.oct2025.tiendavideojuegos.models;

import java.time.LocalDate;

public class VideoJuego {
    private Long id;
    private String nombre;
    private String descripcion; 
    private String portada; 
    private LocalDate fecha_lanzamiento; 
    private Double raiting;
   

    public VideoJuego(Long id, String nombre, String descripcion, String portada, LocalDate fecha_lanzamiento, Double raiting) {
        this.id  = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.portada = portada;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.raiting = raiting;
    }

    public VideoJuego() {
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public LocalDate getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(LocalDate fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public Double getRaiting() {
        return raiting;
    }

    public void setRaiting(Double raiting) {
        this.raiting = raiting;
    }

    @Override
    public String toString() {
        return "VideoJuego [nombre=" + nombre + ", descripcion=" + descripcion + ", portada=" + portada
                + ", fecha_lanzamiento=" + fecha_lanzamiento + ", raiting=" + raiting + "]";
    }

    public Long getId() {
        return id;
    }

       
}
