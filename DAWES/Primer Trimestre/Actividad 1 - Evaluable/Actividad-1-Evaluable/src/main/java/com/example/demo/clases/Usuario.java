package com.example.demo.clases;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nombre, email, password;
    private List<Post> posts;

    public Usuario(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.posts = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post){
        this.posts.add(post);
    }
}
