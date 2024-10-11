package com.example.demo.controller;

import com.example.demo.clases.Usuario;
import com.example.demo.repository.Usuarios.UsuarioRepository;
import com.example.demo.repository.Usuarios.UsuarioRepositoryRAM;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    UsuarioRepository usuarioRepository;

    public UsuarioController() {
        this.usuarioRepository = new UsuarioRepositoryRAM();
    }

    @GetMapping("/registrarse")
    public String nuevoUsuario(Model model){

        model.addAttribute("usuario", new Usuario());

        return "registrarse";
    }


    @PostMapping("/guardar_usuario")
    public String guardarUsuario(Usuario usuario, Model model) {

        this.usuarioRepository.guardarUsuario(usuario);

        return "guardar_usuario";
    }
}
