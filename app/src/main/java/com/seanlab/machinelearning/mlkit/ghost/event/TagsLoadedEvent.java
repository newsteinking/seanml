package com.seanlab.machinelearning.mlkit.ghost.event;

import java.util.List;

import com.seanlab.machinelearning.mlkit.ghost.model.entity.Tag;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.Tag;

public class TagsLoadedEvent {

    public final List<Tag> tags;

    public TagsLoadedEvent(List<Tag> tags) {
        this.tags = tags;
    }

}
