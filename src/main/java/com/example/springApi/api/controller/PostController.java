package com.example.springApi.api.controller;

import com.example.springApi.api.model.Post;
import com.example.springApi.api.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService){
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getPosts(){
        return postService.getPosts();
    }


    @PostMapping
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }

}
