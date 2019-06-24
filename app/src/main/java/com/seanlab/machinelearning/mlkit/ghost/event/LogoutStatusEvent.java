package com.seanlab.machinelearning.mlkit.ghost.event;

public class LogoutStatusEvent {

    public final boolean succeeded;
    public final boolean hasPendingActions;

    public LogoutStatusEvent(boolean succeeded, boolean hasPendingActions) {
        this.succeeded = succeeded;
        this.hasPendingActions = hasPendingActions;
    }

}
