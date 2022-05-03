package com.sofkaU.relationalDB.service;

import com.sofkaU.relationalDB.entities.Comment;
import com.sofkaU.relationalDB.entities.Post;

public interface ICommentService {

    Post createComment(Comment comment);

    void deleteComment(Comment comment);
}
