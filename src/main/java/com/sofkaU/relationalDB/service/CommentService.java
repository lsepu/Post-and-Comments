package com.sofkaU.relationalDB.service;

import com.sofkaU.relationalDB.entities.Comment;
import com.sofkaU.relationalDB.entities.Post;
import com.sofkaU.relationalDB.repository.CommentRepository;
import com.sofkaU.relationalDB.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService implements ICommentService{

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Post createComment(Comment comment) {
        Post post = postRepository.findById(comment.getFK_post_id()).get();
        post.addComment(comment);
        commentRepository.save(comment);
        return postRepository.save(post);
    }

    @Override
    public void deleteComment(Comment comment) {
        commentRepository.deleteById(comment.getId());
    }
}
