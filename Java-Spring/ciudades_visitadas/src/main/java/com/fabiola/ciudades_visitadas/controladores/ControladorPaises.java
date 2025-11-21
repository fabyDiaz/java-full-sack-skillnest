package com.fabiola.ciudades_visitadas.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;

@Controller
public class ControladorPaises {

    private static HashMap<String, String> listaPaises = new HashMap<String, String>();

    public ControladorPaises() {
        listaPaises.put("México", "Ciudad de México");
        listaPaises.put("Paraguay", "Asunción");
        listaPaises.put("Perú", "Lima");
        listaPaises.put("Costa Rica", "San Jose");
        listaPaises.put("Chile", "Santiago");
    }

    @GetMapping("/paises")
    public String obtenerTodosLosPaises(Model model){
        model.addAttribute("listaPaises", listaPaises);
        return "paises.jsp";
    }

    @GetMapping("/paises/{pais}")
    public String obtenerCapital(Model model, @PathVariable("pais") String pais){
        if(listaPaises.containsKey(pais)){
            model.addAttribute("pais", pais);
            model.addAttribute("capital", listaPaises.get(pais));
        }else{
            model.addAttribute("mensaje", "País no encontrado");
        }
        return "capitales.jsp";
    }

}
