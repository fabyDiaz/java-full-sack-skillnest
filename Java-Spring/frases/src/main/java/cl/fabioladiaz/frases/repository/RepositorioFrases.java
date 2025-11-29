package cl.fabioladiaz.frases.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.fabioladiaz.frases.model.Frase;

@Repository
public interface RepositorioFrases extends CrudRepository<Frase, Long> {

}
