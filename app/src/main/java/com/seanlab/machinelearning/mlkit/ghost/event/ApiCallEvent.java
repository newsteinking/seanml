package com.seanlab.machinelearning.mlkit.ghost.event;

public interface ApiCallEvent {

    /**
     * Indicate to the receiver that a network call will fail (network errors, site down) and
     * therefore should NOT be attempted
     */
    void loadCachedData();

}
