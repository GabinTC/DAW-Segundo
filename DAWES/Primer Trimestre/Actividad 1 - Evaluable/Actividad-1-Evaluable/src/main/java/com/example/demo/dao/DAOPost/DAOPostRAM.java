package com.example.demo.dao.DAOPost;

import com.example.demo.clases.Post;

import java.util.ArrayList;
import java.util.List;

public class DAOPostRAM implements DAOPost {

    List<Post> posts = new ArrayList<>();

    @Override
    public List<Post> getPosts() {
        return this.posts;
    }

    @Override
    public void guardarPost(Post post) {
        this.posts.add(post);
    }
}
