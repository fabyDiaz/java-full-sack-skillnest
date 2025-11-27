package cl.fabioladiaz.estudiantes_cursos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import cl.fabioladiaz.estudiantes_cursos.model.Estudiante;
import cl.fabioladiaz.estudiantes_cursos.service.ServicioEstudiante;
import jakarta.validation.Valid;

@Controller
public class ControladorEstudiantes {

    @Autowired
    private ServicioEstudiante servicioEstudiante;

    @GetMapping("/estudiantes/formulario/agregar")
    public String formularioAgregarEstudiante(Model modelo){
        modelo.addAttribute("estudiante", new Estudiante());
        return "agregarEstudiante.jsp";
    }

    @PostMapping("/estudiantes/procesa/agregar")
    public String procesarAgregarEstudiante(@Valid @ModelAttribute("estudiante") Estudiante estudiante,
            BindingResult validaciones, Model modelo){
        if (validaciones.hasErrors()) {
            // Agregar el objeto al modelo en caso de error
            modelo.addAttribute("estudiante", estudiante);
            return "agregarEstudiante.jsp";
        }
        this.servicioEstudiante.agregarEstudiante(estudiante);
        return "redirect:/cursos";
    }
}
