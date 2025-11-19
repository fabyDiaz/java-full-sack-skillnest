package com.oct2025.tiendavideojuegos.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oct2025.tiendavideojuegos.Interfaces.ManejoDeFechas;
import com.oct2025.tiendavideojuegos.models.VideoJuego;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ControladorVideoJuegos implements ManejoDeFechas{

    private ArrayList<VideoJuego> videoJuegos;


    public ControladorVideoJuegos(){
        videoJuegos = new ArrayList<>();
        
        VideoJuego v1 = new VideoJuego(
        "Silent Hill 2",
        "Having received a letter from his deceased wife, James heads to where they shared so many memories, "
        + "in the hope of seeing her one more time: Silent Hill.",
        "",
        formatearFecha("2024-10-08"),
        4.8,
        new ArrayList<>(Arrays.asList("Adventure", "Action")),
        new ArrayList<>(Arrays.asList("PC", "PlayStation")));

        VideoJuego v2 = new VideoJuego(
        "Outlast",
        "Outlast follows the story of investigative journalist Miles Upshur, that got the lead on the inhuman "
        + "experiments, performed on the asylum patients.",
        "",
        formatearFecha("2013-09-03"),
        4.5,
        new ArrayList<>(Arrays.asList("Indie", "Action")),
        new ArrayList<>(Arrays.asList("PC", "PlayStation", "Xbox", "Nintendo")));

        VideoJuego v3 = new VideoJuego(
            "Resident Evil",
                "The story follows the survivors of a zombie virus outbreak in the fictional Raccoon City.", "",
                formatearFecha("2019-01-25"), 4.3, new ArrayList(Arrays.asList("Shooter", "Action", "Adventure")),
                new ArrayList(Arrays.asList("PC", "PlayStation", "Xbox", "Nintendo")));

        videoJuegos.add(v1);
        videoJuegos.add(v2);
        videoJuegos.add(v3);        
    }

    
    @RequestMapping(value ="/saludo", method = RequestMethod.GET)
    public String inicio(){
        return "Hola Mundo";
    }

    @GetMapping("/getAll")
    public String getVideoJuegos(){
        String str = "";
        for(VideoJuego v: this.videoJuegos){
            str+= v.toString();
        }
        return str;
    }

    //Parámetros de consulta -> QueryString
    //localhost:8080/get/nombre?nombre=Outlast
    @GetMapping("/get/nombre")
    public String getVideoJuegoXnombreV1(@RequestParam("nombre") String nombre){
        String str = buscar(nombre).toString();
        return str;
    }

    //VAriables de ruta -> Path Variable
    //localhost:8080/get/nombre/Outlast
      @GetMapping("/get/nombre/{nombre}")
    public String getVideoJuegoXnombreV2(@PathVariable("nombre") String nombre){
        String str = buscar(nombre).toString();
        return str;
    }

    private VideoJuego buscar(String nombre){
        VideoJuego v = null;
        for(VideoJuego videojuego : this.videoJuegos){
            if(videojuego.getNombre().equalsIgnoreCase(nombre)) v = videojuego;
        }
        return v;
    }

}
