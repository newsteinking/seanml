package com.seanlab.machinelearning.mlkit.ghost.event;

import com.seanlab.machinelearning.mlkit.ghost.model.entity.Post;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.Post;

public class SavePostEvent {

    public final Post post;
    public final boolean isAutoSave;    // was this post saved automatically or explicitly?

    public SavePostEvent(Post post, boolean isAutoSave) {
        this.post = post;
        this.isAutoSave = isAutoSave;
    }

}
