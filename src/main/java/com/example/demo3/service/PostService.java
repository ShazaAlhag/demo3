package com.example.demo3.service;

import com.example.demo3.entity.Post;
import com.example.demo3.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    public void savePost(Post post){
        postRepository.save(post);}
    public List<Post> getAllPost(){
        return postRepository.findAll();
    }



}
