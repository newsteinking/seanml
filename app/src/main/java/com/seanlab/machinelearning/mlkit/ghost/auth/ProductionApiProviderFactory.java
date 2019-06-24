package com.seanlab.machinelearning.mlkit.ghost.auth;

import com.seanlab.machinelearning.mlkit.ghost.network.ApiProvider;
import com.seanlab.machinelearning.mlkit.ghost.network.ApiProviderFactory;
import com.seanlab.machinelearning.mlkit.ghost.network.ApiProvider;
import com.seanlab.machinelearning.mlkit.ghost.network.ApiProviderFactory;

import okhttp3.OkHttpClient;

class ProductionApiProviderFactory implements ApiProviderFactory {

    private final OkHttpClient mHttpClient;

    public ProductionApiProviderFactory(OkHttpClient httpClient) {
        mHttpClient = httpClient;
    }

    @Override
    public ApiProvider create(String blogUrl) {
        return new ProductionApiProvider(mHttpClient, blogUrl);
    }

}
