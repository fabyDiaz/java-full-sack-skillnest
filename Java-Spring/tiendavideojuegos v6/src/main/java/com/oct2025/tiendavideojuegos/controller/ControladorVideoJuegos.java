package com.oct2025.tiendavideojuegos.controller;
import com.oct2025.tiendavideojuegos.Interfaces.ManejoDeFechas;
import com.oct2025.tiendavideojuegos.Service.ServicioResena;
import com.oct2025.tiendavideojuegos.Service.ServicioVideojuego;
import com.oct2025.tiendavideojuegos.models.Resena;
import com.oct2025.tiendavideojuegos.models.Usuario;
import com.oct2025.tiendavideojuegos.models.VideoJuego;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



@Controller
public class ControladorVideoJuegos implements ManejoDeFechas{

    @Autowired
    private ServicioVideojuego servicioVideojuego;

    @Autowired
    private ServicioResena servicioResena;

       
    @GetMapping("/getAll")
    public String getVideojuegos(Model modelo, HttpSession session) {

        Usuario usuario = (Usuario) session.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/";
        }
        modelo.addAttribute("videojuegos", servicioVideojuego.obtenerTodosLosVideoJuegos());
        return "videojuegos.jsp";
    }

    @GetMapping("/form/add")
    public String formAgregar(HttpSession session, Model modelo) {
        Usuario usuario = (Usuario) session.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/";
        }
        modelo.addAttribute("videojuego", new VideoJuego());
        return "agregar.jsp";
    }

    @PostMapping("/add")
    public String guardar(@Valid @ModelAttribute("videojuego") VideoJuego videoJuego, BindingResult validaciones, HttpSession session) {

        Usuario usuario = (Usuario) session.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/";
        }
        if(validaciones.hasErrors()){
            return "agregar.jsp";
        }
        this.servicioVideojuego.crear(videoJuego);
        return "redirect:/getAll";
    }

    @GetMapping("/detail/{id}")
    public String detalle(@PathVariable("id") Long id, Model modelo, HttpSession session) {

        Usuario usuario = (Usuario) session.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/";
        }
        VideoJuego juego = this.servicioVideojuego.obtenerPorId(id);
        modelo.addAttribute("videojuego", juego);
        modelo.addAttribute("resena", new Resena());
        return "detalle.jsp";
    }

    @GetMapping("/form/edit/{id}")
    public String formEditar(HttpSession session, Model modelo, @PathVariable("id") Long id){
        Usuario usuario = (Usuario) session.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/";
        }
        modelo.addAttribute("videojuego", this.servicioVideojuego.obtenerPorId(id));
        return "editar.jsp";
    }

    @PutMapping("/editar")
    public String editar(@Valid @ModelAttribute("videojuego") VideoJuego videoJuego, BindingResult validaciones, HttpSession session) {

        Usuario usuario = (Usuario) session.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/";
        }
        if(validaciones.hasErrors()){
            return "editar.jsp";
        }
        this.servicioVideojuego.actualizar(videoJuego);
        return "redirect:/getAll";
    }

    @DeleteMapping("/delete/{id}")
    public String eliminar(@PathVariable("id") Long id, HttpSession session){
        Usuario usuario = (Usuario) session.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/";
        }
        this.servicioVideojuego.eliminar(id);
        return "redirect:/getAll";
    }

    @PostMapping("/comment")
    public String comentar(@Valid @ModelAttribute("resena") Resena resena, BindingResult validaciones, HttpSession session){
        Usuario usuario = (Usuario) session.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/";
        }
        if(validaciones.hasErrors()){
            return "editar.jsp";
        }
        this.servicioResena.crear(resena);
        return "redirect:/detail/"+ resena.getVideoJuego().getId();
    }

}
