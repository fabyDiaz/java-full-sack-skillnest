package cl.fabioladiaz.estudiantes_cursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.fabioladiaz.estudiantes_cursos.model.Curso;
import cl.fabioladiaz.estudiantes_cursos.model.Estudiante;
import cl.fabioladiaz.estudiantes_cursos.service.ServicioCurso;
import cl.fabioladiaz.estudiantes_cursos.service.ServicioEstudiante;
import jakarta.validation.Valid;

@Controller
public class ControladorCursos {

    @Autowired
    private ServicioCurso servicioCurso;

    @Autowired
    private ServicioEstudiante servicioEstudiante;

    @GetMapping("/cursos")
    public String obtenerTodosLosCursos(Model modelo){
        modelo.addAttribute("listaCursos", servicioCurso.obtenerTodasLosCursos());
        return "cursos.jsp";
    }

    @GetMapping("/cursos/formulario/agregar")
    public String formularioAgregarCurso(Model modelo){
        modelo.addAttribute("curso", new Curso());
        return "agregarCurso.jsp";
    }

    @PostMapping("/cursos/procesa/agregar")
    public String procesarAgregarCurso(@Valid @ModelAttribute("curso") Curso curso,
            BindingResult validaciones, Model modelo){
        if (validaciones.hasErrors()) {
            // Agregar el objeto al modelo en caso de error
            modelo.addAttribute("curso", curso);
            return "agregarCurso.jsp";
        }
        this.servicioCurso.agregarCurso(curso);
        return "redirect:/cursos";
    }

    @GetMapping("/formulario/cursos/estudiantes/{idCurso}")
    public String formularioCursoEstudiante(Model model, @PathVariable("idCurso") Long idCurso){
        List<Estudiante> estudiantes = this.servicioEstudiante.obtenerTodosLosEstudiantes();
        model.addAttribute("estudiantes", estudiantes);
        model.addAttribute("idCurso", idCurso);
        model.addAttribute("curso", servicioCurso.obtenerCursoPorId(idCurso));
        return "agregarEstudianteCurso.jsp";
    }

    @PostMapping("/procesa/agregar/estudiante/curso/{idCurso}")
    public String procesaAgregarEstudianteACurso(
            @PathVariable("idCurso") Long idCurso,
            @RequestParam("idEstudiante") Long idEstudiante){
        
        Curso cursoActual = this.servicioCurso.obtenerCursoPorId(idCurso);
        Estudiante estudianteActual = this.servicioEstudiante.obtenerEstudiantePorId(idEstudiante);
        
        // Agregar el estudiante al curso
        cursoActual.getEstudiantes().add(estudianteActual);
        
        // Actualizar en base de datos
        this.servicioCurso.actualizarCurso(cursoActual);

        return "redirect:/cursos";
    }
}