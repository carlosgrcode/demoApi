package com.example.springApi.service;

import com.example.springApi.api.model.Post;
import com.example.springApi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>();

    public List<Post> getPosts(){
        return posts;
    }

    public void addPost(Post post){
        posts.add(post);
    }

    public PostService(){
        Post post = new Post(1,1,"Prueba","Contenido");
        posts.add(post);
    }
}
