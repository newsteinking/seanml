package com.seanlab.machinelearning.mlkit.ghost.event;

import androidx.annotation.Nullable;

import com.seanlab.machinelearning.mlkit.ghost.network.ApiFailure;
import com.seanlab.machinelearning.mlkit.ghost.network.ApiFailure;

public class DataRefreshedEvent {

    public final ApiFailure apiFailure;

    public DataRefreshedEvent(@Nullable ApiFailure apiFailure) {
        this.apiFailure = apiFailure;
    }

}
