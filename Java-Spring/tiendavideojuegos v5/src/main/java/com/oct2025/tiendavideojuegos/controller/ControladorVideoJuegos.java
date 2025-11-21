package com.oct2025.tiendavideojuegos.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import com.oct2025.tiendavideojuegos.Interfaces.ManejoDeFechas;
import com.oct2025.tiendavideojuegos.models.Usuario;
import com.oct2025.tiendavideojuegos.models.VideoJuego;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class ControladorVideoJuegos implements ManejoDeFechas{

    private ArrayList<VideoJuego> videoJuegos;


    public ControladorVideoJuegos(){
        videoJuegos = new ArrayList<>();
        
        VideoJuego v1 = new VideoJuego(1L,
        "Silent Hill 2",
        "Having received a letter from his deceased wife, James heads to where they shared so many memories, "
        + "in the hope of seeing her one more time: Silent Hill.",
        "",
        formatearFecha("2024-10-08"),
        4.8);

        VideoJuego v2 = new VideoJuego( 2L,
        "Outlast",
        "Outlast follows the story of investigative journalist Miles Upshur, that got the lead on the inhuman "
        + "experiments, performed on the asylum patients.",
        "",
        formatearFecha("2013-09-03"),
        4.5);

        VideoJuego v3 = new VideoJuego(3L,
            "Resident Evil",
                "The story follows the survivors of a zombie virus outbreak in the fictional Raccoon City.", "",
                formatearFecha("2019-01-25"), 4.3);

        videoJuegos.add(v1);
        videoJuegos.add(v2);
        videoJuegos.add(v3);        
    }

    
    @GetMapping("/getAll")
    public String getVideojuegos(Model modelo, HttpSession session) {

        Usuario usuario = (Usuario) session.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/";
        }
        modelo.addAttribute("videojuegos", this.videoJuegos);
        return "videojuegos.jsp";
    }

    private VideoJuego buscar(Long id) {
        VideoJuego v = null;
        for (VideoJuego videojuego : this.videoJuegos) {
            if (videojuego.getId() == id)
                v = videojuego;
        }
        return v;
    }

    @GetMapping("/form/add")
    public String formAgregar(HttpSession session) {
        Usuario usuario = (Usuario) session.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/";
        }
        return "agregar.jsp";
    }

    @PostMapping("/add")
    public String guardar(@RequestParam String nombre,
            @RequestParam String descripcion,
            @RequestParam String portada,
            @RequestParam String fecha_lanzamiento,
            @RequestParam String rating, HttpSession session) {

        Usuario usuario = (Usuario) session.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/";
        }
        long nuevoId = this.videoJuegos.size() + 1;
        VideoJuego juego = new VideoJuego(nuevoId,
                nombre,
                descripcion,
                portada,
                LocalDate.parse(fecha_lanzamiento, formatter2),
                Double.parseDouble(rating));
        this.videoJuegos.add(juego);
        return "redirect:/getAll";
    }

    @GetMapping("/detail/{id}")
    public String detalle(@PathVariable("id") Long id, Model modelo, HttpSession session) {

        Usuario usuario = (Usuario) session.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/";
        }
        VideoJuego juego = buscar(id);
        modelo.addAttribute("videojuego", juego);
        return "detalle.jsp";
    }

}
