package com.fabiola.contador_de_visitas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;
@Controller
public class ControladorVisitas {

    @GetMapping("/visitas")
    public String visitas(HttpSession sesion, Model modelo){
        // Verificar si es la primera visita
        if(sesion.getAttribute("numDeVisitas") == null){
            // Primera vez: inicializar en 1
            sesion.setAttribute("numDeVisitas", 1);
        } else {
            // Ya existe: incrementar en 1
            Integer contadorActual = (Integer) sesion.getAttribute("numDeVisitas");
            sesion.setAttribute("numDeVisitas", contadorActual + 1);
        }
        
        modelo.addAttribute("numDeVisitas", sesion.getAttribute("numDeVisitas"));
        
        return "visitas.jsp";
    }
       
    @GetMapping("/visitas/agregar")
    public String agregaVisitaManualmente(HttpSession sesion){
        // Obtener el contador actual de la sesión
        if(sesion.getAttribute("numDeVisitas") != null){
            Integer contadorActual = (Integer) sesion.getAttribute("numDeVisitas");
            sesion.setAttribute("numDeVisitas", contadorActual);
        } else {
            // Por si acaso alguien accede primero a esta ruta
            sesion.setAttribute("numDeVisitas", 1);
        }
        // Redirigir a la página principal
        return "redirect:/visitas";
    }
}
