package cl.fabydiaz.servicio_de_informacion.controladores;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ControladorInformacion {

    @GetMapping("/saludo")
    public String getMensajeBienvenida() {
        return "Bienvenido a mi aplicación!";
    }
    
    @GetMapping("/acerca")
    public String getInfromacion() {
        return "En esta sección se supone que hay información sobre la aplicación.";
    }

    @GetMapping("/contacto")
    public String getContacto() {
        return "Sección que muestra detalles se contacto.";
    }

}
