package com.fabiola.validar_registro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class controladorUsuario {

    @GetMapping("/registro")
    public String formularioRegistro(){

        return "registro.jsp";
    }

    @PostMapping("/procesa/registro")
    public String procesaRegistro(@RequestParam("nombre") String nombre,
                                @RequestParam("apellido") String apellido,
                                @RequestParam("edad") Integer edad,
                                @RequestParam("correo") String correo,
                                @RequestParam("contrasenia") String contrasenia,
                                @RequestParam("confirmacionContrasenia") String confirmacion,
                                HttpSession sesion, 
                                RedirectAttributes flash){
            boolean hayError=false;
            if(nombre.length() <= 3){
                flash.addFlashAttribute("errorNombre","El nombre debe tener una longitud mínima de 3 caracteres" );
                hayError=true;
            }
            if(apellido.length() <=3){
                flash.addFlashAttribute("errorApellido", "El apellido debe tener 3 o más caracteres");
                hayError=true;
            }
            if(correo == null || correo.length() <= 3 || !correo.contains("@")){
                flash.addFlashAttribute("errorCorreo", "Correo no válido");
                hayError=true;
            }
            if(edad == null || edad <= 0){
                flash.addFlashAttribute("errorEdad", "Debe ingresar una edad válida");
                hayError=true;
            }
            if(contrasenia == null || contrasenia.isEmpty()){
                flash.addFlashAttribute("errorContrasenia", "La contraseña debe contener al menos un caracter");
                hayError=true;
            }
            if(!confirmacion.equals(contrasenia)){
                flash.addFlashAttribute("errorConfirmacion", "Las contraseñas no coinciden");
                hayError=true;
            }

            if(hayError){
                return "redirect:/registro";
            }

            sesion.setAttribute("nombre", nombre);
            sesion.setAttribute("apellido", apellido);
            sesion.setAttribute("edad", edad);
            sesion.setAttribute("correo", correo);
            sesion.setAttribute("contrasenia", contrasenia);

        return "redirect:/dashboard";

    }

    @GetMapping("/dashboard")  
    public String despliegaDashboard(){
        return "dashboard.jsp";
    }

    @PostMapping("/logout")
    public String procesaLogout(HttpSession sesion){
        sesion.invalidate();
        return "registro.jsp";
    }






}
