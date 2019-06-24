package com.seanlab.machinelearning.mlkit.ghost.event;

import com.seanlab.machinelearning.mlkit.ghost.model.entity.Post;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.Post;

public class PostSavedEvent {

    public final Post post;

    public PostSavedEvent(Post post) {
        this.post = post;
    }

}
