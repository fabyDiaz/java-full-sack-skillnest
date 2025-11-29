package com.oct2025.tiendavideojuegos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oct2025.tiendavideojuegos.models.Resena;
import com.oct2025.tiendavideojuegos.repository.RespositorioResena;

@Service
public class ServicioResena {

    @Autowired
    private RespositorioResena respositorioResena;

    public Resena crear( Resena resena){
        return this.respositorioResena.save(resena);
    }

    
}
