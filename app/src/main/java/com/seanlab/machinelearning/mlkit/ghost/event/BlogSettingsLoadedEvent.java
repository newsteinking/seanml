package com.seanlab.machinelearning.mlkit.ghost.event;

import java.util.List;

import com.seanlab.machinelearning.mlkit.ghost.model.entity.Setting;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.Setting;

public class BlogSettingsLoadedEvent {

    public final List<Setting> settings;

    public BlogSettingsLoadedEvent(List<Setting> settings) {
        this.settings = settings;
    }

}
