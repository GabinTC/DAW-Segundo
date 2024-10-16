package com.example.demo.dao.DAOPost;

import com.example.demo.clases.Post;
import com.example.demo.clases.Usuario;

import java.time.LocalDate;
import java.util.List;

public interface DAOPost {
    List<Post> getPosts();
    void guardarPost(Post post, Usuario usuario);
    List<Post> filtrarPosts(String filtrarPostTexto, String filtrarPostUsuario, LocalDate filtrarPostFecha, String ordenFecha);
}
