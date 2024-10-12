package com.example.demo.controller;

import com.example.demo.clases.Usuario;
import com.example.demo.repository.Usuarios.UsuarioRepository;
import com.example.demo.repository.Usuarios.UsuarioRepositoryRAM;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashSet;
import java.util.List;

@Controller
public class UsuarioController {

    UsuarioRepository usuarioRepository;

    public UsuarioController() {
        this.usuarioRepository = new UsuarioRepositoryRAM();
    }

    @GetMapping("/registrarse")
    public String nuevoUsuario(Model model){

        return "registrarse";
    }


    @PostMapping("/guardar_usuario")
    public String guardarUsuario(String nombre, String email, String password, Model model) {

        Usuario usuarioGuardado = new Usuario(nombre, email, password);
        this.usuarioRepository.guardarUsuario(usuarioGuardado);



        return "redirect:/index";
    }







    @GetMapping("/usuarios")
    public String usuarios(Model model){

        List<Usuario> usuarios = this.usuarioRepository.getUsuarios();
        model.addAttribute("usuarios", usuarios);

        return "para_pruebas/usuarios";
    }
}
