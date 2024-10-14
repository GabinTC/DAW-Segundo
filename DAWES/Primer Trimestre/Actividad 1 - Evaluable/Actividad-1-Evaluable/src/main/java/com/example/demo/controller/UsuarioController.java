package com.example.demo.controller;

import com.example.demo.clases.Usuario;
import com.example.demo.dao.DAOFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @GetMapping("/registro")
    public String registro(Model model) {

        return "registro";
    }
    @PostMapping("/registro")
    public String guardarUsuario(Model model, String nombre, String email, String password){

        Usuario usuario = new Usuario(nombre, email, password);

        DAOFactory.getInstance().getDaoUsuario().guardarUsuario(usuario);

        model.addAttribute("usuario", usuario);

        return "redirect:/index";
    }

    @GetMapping("/usuarios")
    public String usuarios(Model model) {

        model.addAttribute("usuarios", DAOFactory.getInstance().getDaoUsuario().getUsuarios());

        return "usuarios";
    }
}
