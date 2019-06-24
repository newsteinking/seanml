package com.seanlab.machinelearning.mlkit.ghost.event;

import androidx.annotation.NonNull;

import com.seanlab.machinelearning.mlkit.ghost.network.ApiFailure;
import com.seanlab.machinelearning.mlkit.ghost.network.ApiFailure;

public class ApiErrorEvent {

    public final ApiFailure apiFailure;

    public ApiErrorEvent(@NonNull ApiFailure apiFailure) {
        this.apiFailure = apiFailure;
    }

}
