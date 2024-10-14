package com.example.demo.controller;

import com.example.demo.clases.Post;
import com.example.demo.clases.Usuario;
import com.example.demo.dao.DAOFactory;
import com.example.demo.dao.DAOPost.DAOPost;
import com.example.demo.dao.DAOPost.DAOPostRAM;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping("/index")
    public String index(@RequestBody(required = false) Usuario usuario, Model model){

        ArrayList<Post> posts = (ArrayList<Post>) DAOFactory.getInstance().getDAOPost().getPosts();
        model.addAttribute("posts", posts);

        return "index";
    }
    @GetMapping("/nuevo_post")
    public String nuevoPost(Model model) {

        return "nuevo_post";
    }
    @PostMapping("/guardar_post")
    public String guardarPost(Model model, String texto){

        Post post = new Post(texto, LocalDate.now());

        DAOFactory.getInstance().getDAOPost().guardarPost(post);

        model.addAttribute("post", post);

        return "redirect:/index";
    }

    @GetMapping("/posts")
    public String posts(Model model) {

        model.addAttribute("usuarios", DAOFactory.getInstance().getDAOPost().getPosts());

        return "posts";
    }

}
