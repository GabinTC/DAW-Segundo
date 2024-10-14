package com.example.demo.dao.DAOPost;

import com.example.demo.clases.Post;

import java.util.List;

public interface DAOPost {
    List<Post> getPosts();
    void guardarPost(Post post);
}
