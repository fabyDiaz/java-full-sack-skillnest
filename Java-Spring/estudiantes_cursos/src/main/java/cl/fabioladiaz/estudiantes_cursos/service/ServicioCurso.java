package cl.fabioladiaz.estudiantes_cursos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.fabioladiaz.estudiantes_cursos.model.Curso;
import cl.fabioladiaz.estudiantes_cursos.repository.RepositorioCurso;

@Service
public class ServicioCurso {

    @Autowired
    RepositorioCurso repositorioCurso;

    public List<Curso> obtenerTodasLosCursos(){
        return repositorioCurso.findAll();
    }

    public Curso obtenerCursoPorId(Long id){
        return repositorioCurso.findById(id).orElse(null);
    }

    public Curso agregarCurso(Curso curso){
        return repositorioCurso.save(curso);
    }

    public Curso actualizarCurso(Curso curso){
        return repositorioCurso.save(curso);
    }

    
}
