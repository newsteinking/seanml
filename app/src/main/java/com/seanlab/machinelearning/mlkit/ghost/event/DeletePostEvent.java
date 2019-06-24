package com.seanlab.machinelearning.mlkit.ghost.event;

import com.seanlab.machinelearning.mlkit.ghost.model.entity.Post;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.Post;

public class DeletePostEvent {

    public final Post post;

    public DeletePostEvent(Post post) {
        this.post = post;
    }

}
