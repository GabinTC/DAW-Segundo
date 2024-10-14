package com.example.demo.repository;

import com.example.demo.clases.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryRAM implements PostRepository{

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
