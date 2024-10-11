package com.example.demo.repository.Posts;

import com.example.demo.clases.Post;

import java.util.List;

public interface PostRepository {

    List<Post> getPosts();
    void guardarPost(Post post);
}
