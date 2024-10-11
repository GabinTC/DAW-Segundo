package com.example.demo.repository.Posts;

import com.example.demo.clases.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryRAM implements PostRepository{

    private ArrayList<Post> posts;

    @Override
    public List<Post> getPosts() {
        return this.posts;
    }

    @Override
    public void guardarPost(Post post) {
        this.posts.add(post);
    }
}
