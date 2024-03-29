package com.seanlab.machinelearning.mlkit.md.java.settings;

import android.content.Context;
import android.content.SharedPreferences;

public class AppStorage {
    private Context context;
    private SharedPreferences pref;
    private String PURCHASED_REMOVE_ADS = "remove_ads";
    private String SUBSCRIBED_REMOVE_ADS = "suscribe_ads";

    public AppStorage(Context context) {
        pref = context.getSharedPreferences("app_storage", Context.MODE_PRIVATE);
        this.context = context;
    }

    public boolean purchasedRemoveAds() {
        return pref.getBoolean(PURCHASED_REMOVE_ADS, false);
    }

    public void setPurchasedRemoveAds(boolean flag) {
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean(PURCHASED_REMOVE_ADS, flag);
        editor.apply();
    }

    public boolean subsribedRemoveAds() {
        return pref.getBoolean(SUBSCRIBED_REMOVE_ADS, false);
    }

    public void setsusribedRemoveAds(boolean flag) {
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean(SUBSCRIBED_REMOVE_ADS, flag);
        editor.apply();
    }

}
