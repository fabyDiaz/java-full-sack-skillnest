package cl.fabioladiaz.estudiantes_cursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.fabioladiaz.estudiantes_cursos.model.Estudiante;
import cl.fabioladiaz.estudiantes_cursos.repository.RepositorioEstudiante;

@Service
public class ServicioEstudiante {

    @Autowired
    RepositorioEstudiante repositorioEstudiante;

    public List<Estudiante> obtenerTodosLosEstudiantes(){
        return repositorioEstudiante.findAll();
    }

    public Estudiante obtenerEstudiantePorId(Long id){
        return repositorioEstudiante.findById(id).orElse(null);
    }

    public Estudiante agregarEstudiante(Estudiante estudiante){
        return repositorioEstudiante.save(estudiante);
    }

    
}
