package com.example.demo.controller;

import com.example.demo.clases.Post;
import com.example.demo.repository.Posts.PostRepository;
import com.example.demo.repository.Posts.PostRepositoryRAM;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    PostRepository postRepository;

    public PostController(){
        this.postRepository = new PostRepositoryRAM();
    }

    @GetMapping("/index")
    public String index(Model model) {

        return "index";
    }
}
