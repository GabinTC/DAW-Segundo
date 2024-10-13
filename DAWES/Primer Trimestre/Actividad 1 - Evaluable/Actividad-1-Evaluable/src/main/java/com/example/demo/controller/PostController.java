package com.example.demo.controller;

import com.example.demo.clases.Post;
import com.example.demo.clases.Usuario;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.PostRepositoryRAM;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;

@Controller
public class PostController {

    PostRepository postRepository = new PostRepositoryRAM();

    @GetMapping("/index")
    public String index(@RequestParam(required = false) String nombre,
                        @RequestParam(required = false) String texto,
                        Model model){

        ArrayList<Post> posts = (ArrayList<Post>) this.postRepository.getPosts();
        model.addAttribute("posts", posts);

        model.addAttribute("nombre", nombre);
        model.addAttribute("texto", texto);

        return "index";
    }
    @GetMapping("/nuevo_post")
    public String nuevoPost(Model model) {

        return "nuevo_post";
    }
    @PostMapping("/guardar_post")
    public String guardarPost(Model model, String texto){

        LocalDate fechaPublicacion = LocalDate.now();

        this.postRepository.guardarPost(new Post(texto, fechaPublicacion));

        return "redirect:/index?texto=" + texto;
    }

    @GetMapping("/posts")
    public String posts(Model model) {

        model.addAttribute("usuarios", this.postRepository.getPosts());

        return "posts";
    }

}
