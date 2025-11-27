package cl.fabioladiaz.estudiantes_cursos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.fabioladiaz.estudiantes_cursos.model.Curso;

@Repository
public interface RepositorioCurso extends CrudRepository<Curso, Long>{
     List<Curso> findAll();
}
