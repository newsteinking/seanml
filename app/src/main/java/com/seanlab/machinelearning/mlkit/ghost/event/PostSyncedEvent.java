package com.seanlab.machinelearning.mlkit.ghost.event;

import com.seanlab.machinelearning.mlkit.ghost.model.entity.Post;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.Post;

public class PostSyncedEvent {

    public final Post post;

    public PostSyncedEvent(Post post) {
        this.post = post;
    }

}
