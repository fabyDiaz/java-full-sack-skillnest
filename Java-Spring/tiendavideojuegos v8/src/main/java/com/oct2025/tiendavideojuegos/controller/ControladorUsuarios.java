package com.oct2025.tiendavideojuegos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.oct2025.tiendavideojuegos.Service.ServicioUsuario;
import com.oct2025.tiendavideojuegos.models.LoginUsuario;
import com.oct2025.tiendavideojuegos.models.Usuario;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class ControladorUsuarios {

    @Autowired
    ServicioUsuario servicioUsuario;

    @GetMapping("/")
    public String inicio(HttpSession session, Model modelo) {
        session.invalidate();
        modelo.addAttribute("usuario", new Usuario());
        modelo.addAttribute("UsuarioLogin", new LoginUsuario())
        return "login.jsp";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("loginUsuario") LoginUsuario loginUsuario,
    BindingResult validaciones,        
    HttpSession session,
    Model modelo) {

        Usuario usuario = servicioUsuario.obtenerUsuarioPorEmail(loginUsuario);
        if (usuario == null) {
            validaciones = this.servicioUsuario.validarLogin(validaciones, loginUsuario);
            if(validaciones.hasErrors()){
                modelo.addAttribute("loginUsuario", new LoginUsuario())
                 return "login.jsp";
            }
        }
        usuario.setPassword("");
        usuario.setComprados(null);
        session.setAttribute("usuario", usuario);
        return "redirect:/getAll";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("usuario") Usuario usuarioRegistro,
    BindingResult validaciones,
    HttpSession session,
    Model modelo) {

        Usuario usuario = servicioUsuario.obtenerUsuarioPorEmail(usuarioRegistro.getEmail());
        if (usuario == null) {
            this.servicioUsuario.validarRegistro(validaciones, usuario);
            if(validaciones.hasErrors()){
                modelo.addAttribute("loginUsuario", new Usuario());
                return "login.jsp";
            }
            usuario = this.servicioUsuario.crearUsuario(usuarioRegistro);
        }
        usuario.setPassword("");
        session.setAttribute("usuario", usuario);
        return "redirect:/getAll";
    }

}