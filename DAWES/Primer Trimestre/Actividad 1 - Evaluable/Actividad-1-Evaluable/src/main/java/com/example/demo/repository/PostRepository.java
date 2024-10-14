package com.example.demo.repository;

import com.example.demo.clases.Post;
import com.example.demo.clases.Usuario;

import java.util.List;

public interface PostRepository {
    List<Post> getPosts();
    void guardarPost(Post post);
}
