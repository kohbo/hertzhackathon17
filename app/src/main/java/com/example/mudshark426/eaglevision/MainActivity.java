package com.example.mudshark426.eaglevision;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.mudshark426.eaglevision.R;

public class MainActivity extends AppCompatActivity {

    private final int GEO_PERM_ID = 1234;
    private final int CAMERA_PERM_ID = 8008;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Check for permissions
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.CAMERA}, CAMERA_PERM_ID);
        }

        // Get Geo Perms
        if (!checkGPSPermission()) {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, GEO_PERM_ID);
        }
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

    private boolean checkGPSPermission() {
        //Check for GeoPermissions
        return ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case CAMERA_PERM_ID: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "Camera permissions required.", Toast.LENGTH_LONG);
                }
                return;
            }
            case GEO_PERM_ID: {
                if (grantResults.length > 0
                        && grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "Location permissions required.", Toast.LENGTH_LONG);
                }
                return;
            }
        }
    }

    public void launchGuide(View view){
        Intent intent = new Intent(this, GuideActivity.class);
        startActivity(intent);
    }

    public void launchAR(View view){
        Intent intent = new Intent(this, FeatureView.class);
        intent.putExtra("name","seat_warmer");
        startActivity(intent);
    }

    public void launchALC(View view){
        Intent intent = new Intent(this, HertzLaCarte.class);
        startActivity(intent);
    }
}
