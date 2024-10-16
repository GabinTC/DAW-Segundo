package com.example.PruebaSpring1.clases;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String alias, password;
    private List<Post> posts;

    public Usuario(String password, String alias) {
        this.password = password;
        this.alias = alias;
        this.posts = new ArrayList<>();
    }

    public String getAlias() {
        return alias;
    }

    public String getPassword() {
        return password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(Post postNuevo){
        posts.add(postNuevo);
    }
}
