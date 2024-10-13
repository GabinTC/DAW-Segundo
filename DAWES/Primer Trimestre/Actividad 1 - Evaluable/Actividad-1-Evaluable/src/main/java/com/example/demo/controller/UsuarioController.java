package com.example.demo.controller;

import com.example.demo.clases.Usuario;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.repository.UsuarioRepositoryRAM;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    UsuarioRepository usuarioRepository = new UsuarioRepositoryRAM();

    @GetMapping("/registro")
    public String registro(Model model) {

        return "registro";
    }
    @PostMapping("/registro")
    public String guardarUsuario(Model model, String nombre, String email, String password){

        this.usuarioRepository.guardarUsuario(new Usuario(nombre, email, password));

        return "redirect:/index?nombre=" + nombre;
    }

    @GetMapping("/usuarios")
    public String usuarios(Model model) {

        model.addAttribute("usuarios", this.usuarioRepository.getUsuarios());

        return "usuarios";
    }
}
