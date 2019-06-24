package com.seanlab.machinelearning.mlkit.ghost.event;

import com.seanlab.machinelearning.mlkit.ghost.model.entity.Post;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.Post;

public class PostReplacedEvent {

    public final Post newPost;

    public PostReplacedEvent(Post newPost) {
        this.newPost = newPost;
    }

}
