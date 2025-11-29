package cl.fabioladiaz.frases.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.fabioladiaz.frases.model.Frase;
import cl.fabioladiaz.frases.repository.RepositorioFrases;

@Service
public class ServicioFrases {

    @Autowired
    private RepositorioFrases repositorioFrases;

    //Crear
    public Frase crearFrase(Frase frase){
        return repositorioFrases.save(frase);
    }

    //READ
    public Frase buscarFrasePorId(Long id){
        return repositorioFrases.findById(id).orElse(null);
    }

    public List<Frase> obtenerTodasLasFrases(){
        return (List)this.repositorioFrases.findAll();
    }

    //Update
    public Frase actualizarFrase(Frase frase){
        return repositorioFrases.save(frase);
    }

    //Delete
    public void eliminarFrase(Long id){
        repositorioFrases.deleteById(id);
    }

}
