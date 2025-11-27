package cl.fabioladiaz.estudiantes_cursos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.fabioladiaz.estudiantes_cursos.model.Estudiante;

@Repository
public interface RepositorioEstudiante extends CrudRepository<Estudiante, Long>{
     List<Estudiante> findAll();

}
