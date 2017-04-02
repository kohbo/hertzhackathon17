package com.example.mudshark426.eaglevision;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.hardware.SensorManager;
import android.location.LocationListener;
import android.widget.Toast;


import com.example.mudshark426.eaglevision.R;
import com.wikitude.architect.ArchitectView;
import com.wikitude.common.camera.CameraSettings;

public class GuideActivity extends ARActivity {
    @Override
    String getAssetPath() {
        return "PoiAtLocation/index.html";
    }

    @Override
    void addPoiToAR(double lat, double lon, double alt) {

    }
}
