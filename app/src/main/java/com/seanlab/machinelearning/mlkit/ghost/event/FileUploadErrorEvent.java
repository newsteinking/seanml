package com.seanlab.machinelearning.mlkit.ghost.event;

import com.seanlab.machinelearning.mlkit.ghost.network.ApiFailure;
import com.seanlab.machinelearning.mlkit.ghost.network.ApiFailure;

@SuppressWarnings({"WeakerAccess", "unused"})
public class FileUploadErrorEvent {

    public final ApiFailure apiFailure;

    public FileUploadErrorEvent(ApiFailure apiFailure) {
        this.apiFailure = apiFailure;
    }

}
