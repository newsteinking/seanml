package com.seanlab.machinelearning.mlkit.ghost.event;

import com.seanlab.machinelearning.mlkit.ghost.model.entity.User;

public class UserLoadedEvent {

    public final User user;

    public UserLoadedEvent(User user) {
        this.user = user;
    }

}
