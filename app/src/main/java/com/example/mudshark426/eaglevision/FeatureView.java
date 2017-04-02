package com.example.mudshark426.eaglevision;

import android.os.Bundle;

public class FeatureView extends ARActivity {
    private final String TAG = "ARView";

    @Override
    String getAssetPath() {
        return "FeatureView/index.html";
    }

    @Override
    void addPoiToAR(double lat, double lon, double alt) {

    }

    @Override
    protected void onStart() {
        super.onStart();
//        getActionBar().hide();
    }

    @Override
    protected void onStop() {
        super.onStop();
//        getActionBar().show();
    }
}
