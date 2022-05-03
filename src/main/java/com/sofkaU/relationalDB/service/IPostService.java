package com.sofkaU.relationalDB.service;

import com.sofkaU.relationalDB.entities.Post;

import java.util.List;

public interface IPostService {

    Post createPost(Post post);

    void deletePost(Post post);

    List<Post> findAllPosts();

}
