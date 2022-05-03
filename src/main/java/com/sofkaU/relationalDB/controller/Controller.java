package com.sofkaU.relationalDB.controller;

import com.sofkaU.relationalDB.entities.Comment;
import com.sofkaU.relationalDB.entities.Post;
import com.sofkaU.relationalDB.service.CommentService;
import com.sofkaU.relationalDB.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class Controller {

    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @GetMapping("get/posts")
    public List<Post> getAllPosts(){
        return postService.findAllPosts();
    }

    @PostMapping("create/post")
    public Post createPost(@RequestBody Post post){
        return postService.createPost(post);
    }

    @PostMapping("create/comment")
    public Post createComment(@RequestBody Comment comment){
        return commentService.createComment(comment);
    }

    @DeleteMapping("delete/post")
    public void deletePost(@RequestBody Post post){
        postService.deletePost(post);
    }

    @DeleteMapping("delete/comment")
    public void deleteComment(@RequestBody Comment comment){
        commentService.deleteComment(comment);
    }

}
