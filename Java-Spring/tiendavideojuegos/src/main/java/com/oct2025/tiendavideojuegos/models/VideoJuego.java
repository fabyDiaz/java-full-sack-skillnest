package com.oct2025.tiendavideojuegos.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class VideoJuego {
    private String nombre;
    private String descripcion; 
    private String portada; 
    private LocalDate fecha_lanzamiento; 
    private Double raiting;
    private ArrayList<String> genero;
    private ArrayList<String> plataformas;
   
    public VideoJuego(String nombre, String descripcion, String portada, LocalDate fecha_lanzamiento, Double raiting,
            ArrayList<String> genero, ArrayList<String> plataformas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.portada = portada;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.raiting = raiting;
        this.genero = genero;
        this.plataformas = plataformas;
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

    public ArrayList<String> getGenero() {
        return genero;
    }

    public void setGenero(ArrayList<String> genero) {
        this.genero = genero;
    }

    public ArrayList<String> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(ArrayList<String> plataformas) {
        this.plataformas = plataformas;
    }

    @Override
    public String toString() {
        return "VideoJuego [nombre=" + nombre + ", descripcion=" + descripcion + ", portada=" + portada
                + ", fecha_lanzamiento=" + fecha_lanzamiento + ", raiting=" + raiting + ", genero=" + genero
                + ", plataformas=" + plataformas + "]";
    }

       
}
