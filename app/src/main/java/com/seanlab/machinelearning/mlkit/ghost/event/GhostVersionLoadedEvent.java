package com.seanlab.machinelearning.mlkit.ghost.event;

import androidx.annotation.NonNull;

public class GhostVersionLoadedEvent {

    public final String version;

    public GhostVersionLoadedEvent(@NonNull String version) {
        this.version = version;
    }

}
