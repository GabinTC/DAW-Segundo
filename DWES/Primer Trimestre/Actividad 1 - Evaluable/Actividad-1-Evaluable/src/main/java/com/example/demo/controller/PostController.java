package com.example.demo.controller;

import com.example.demo.clases.Post;
import com.example.demo.clases.Usuario;
import com.example.demo.dao.DAOFactory;
import com.example.demo.dao.DAOPost.DAOPost;
import com.example.demo.dao.DAOPost.DAOPostRAM;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class PostController {

    @GetMapping("/index")
    public String index(Model model, String filtrarPostTexto, String filtrarPostUsuario, LocalDate filtrarPostFecha, String ordenFecha) {

        List<Post> postsFiltrados = DAOFactory.getInstance().getDAOPost().filtrarPosts(filtrarPostTexto, filtrarPostUsuario, filtrarPostFecha, ordenFecha);

        model.addAttribute("posts", postsFiltrados);

        return "index";
    }

    @GetMapping("/nuevo_post")
    public String nuevoPost(Model model) {

        return "nuevo_post";
    }
    @PostMapping("/guardar_post")
    public String guardarPost(Model model, String texto){

        Usuario usuario = DAOFactory.getInstance().getDaoUsuario().findByNombre("Fernando Torres");

        Post post = new Post(texto);
        DAOFactory.getInstance().getDAOPost().guardarPost(post, usuario);

        return "redirect:/index";
    }
}
