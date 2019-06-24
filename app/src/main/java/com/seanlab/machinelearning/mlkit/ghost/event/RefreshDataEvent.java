package com.seanlab.machinelearning.mlkit.ghost.event;

public class RefreshDataEvent {

    public final boolean loadCachedData;

    public RefreshDataEvent(boolean loadCachedData) {
        this.loadCachedData = loadCachedData;
    }

}
