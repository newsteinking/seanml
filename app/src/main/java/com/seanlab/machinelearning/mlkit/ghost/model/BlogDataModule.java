package com.seanlab.machinelearning.mlkit.ghost.model;

import io.realm.annotations.RealmModule;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.AuthToken;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.ConfigurationParam;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.ETag;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.PendingAction;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.Post;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.Role;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.Setting;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.Tag;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.User;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.AuthToken;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.ConfigurationParam;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.ETag;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.PendingAction;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.Post;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.Role;
import com.seanlab.machinelearning.mlkit.ghost.model.entity.Tag;

// set of classes included in the schema for blog data Realms

@RealmModule(classes = {
        AuthToken.class,
        ConfigurationParam.class,
        ETag.class,
        PendingAction.class,
        Post.class,
        Role.class,
        Setting.class,
        Tag.class,
        User.class
})
public class BlogDataModule {}
