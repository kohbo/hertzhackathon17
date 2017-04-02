package com.hertz.jalapeno.beacon;

public class FeatureView extends ARActivity {
    private final String TAG = "ARView";

    @Override
    String getAssetPath() {
        return "FeatureView/index.html";
    }

    @Override
    void addPoiToAR(double lat, double lon, double alt) {

    }
}
