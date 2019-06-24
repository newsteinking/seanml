package com.seanlab.machinelearning.mlkit.ghost.model;

import io.realm.annotations.RealmModule;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.BlogMetadata;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.BlogMetadata;

// set of classes included in the schema for blog metadata Realm

@RealmModule(classes = {
        BlogMetadata.class
})
public class BlogMetadataModule {}
