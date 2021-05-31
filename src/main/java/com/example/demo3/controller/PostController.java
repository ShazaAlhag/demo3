package com.example.demo3.controller;

import com.example.demo3.entity.Post;
import com.example.demo3.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/savePost")
    public String savePost(@ModelAttribute("post") Post post, Model model){
        model.addAttribute("posts",postService.getAllPost());
        return "post";

    }
    @GetMapping("/")
    public String posts(Model model){
        model.addAttribute("posts", postService.getAllPost());
        return "AllPosts";

    }
}
