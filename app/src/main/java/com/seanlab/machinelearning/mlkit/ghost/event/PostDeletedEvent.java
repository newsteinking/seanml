package com.seanlab.machinelearning.mlkit.ghost.event;

public class PostDeletedEvent {

    public final String postId;

    public PostDeletedEvent(String postId) {
        this.postId = postId;
    }
}
