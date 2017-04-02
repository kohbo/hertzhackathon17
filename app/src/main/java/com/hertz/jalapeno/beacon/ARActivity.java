package com.hertz.jalapeno.beacon;

import android.*;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.wikitude.architect.ArchitectStartupConfiguration;
import com.wikitude.architect.ArchitectView;

import java.io.IOException;

public abstract class ARActivity extends AppCompatActivity implements ArchitectView.ArchitectWorldLoadedListener{
    private final String TAG = "ARActivity";
    private final int GEO_PERM_ID = 1234;
    private final int CAMERA_PERM_ID = 8008;

    private LocationManager locationManager;
    private ArchitectView architectView;

    protected boolean isLoading = false;

    private String ARkey() {
        String key = "pPRPYEu94bqvCrDihHUq42Dob1CNySsICF9gGbnEmxah3jGTy7l1UctEkyj0CFS7KgrHKSYq9iihedyj7dEjKVObozE01QQlbOh1bPklkN5huNylkNS2Ec0NGzYP8fmWJXkfSytsE628OMIJe6sr+XAS6pRbtVaDn2OloyWD1wFTYWx0ZWRfX40YS1TiJtIPOmVv7e1qa1MeNyARYukrmEifZjIkY9GDggJ+jocqxrZjnnwIyrKVbFEF+Eg97XLbT0e4VT45V/NEjRJTQAsCq1YvpCk2N/Z1znmVZM/VHwF7uBU6/RgFkRq7cUGnMImPlQ5fACMzCYlpxQm/XTywLPDrzDTVzkKw+dBSnTeWB1ZAdfeFC/YttlLxOfwQqZmEyYS64DNHzYvsw6GyMwCFPa6RZ8fObcn+a3bk5JcBtqSLJPgjJ0MxiZiWRg2fSOiyR42/uhy/MpvD1+BYpUkGR/cryK5KKSzffMBlLHGwevKlhO2L5//+M+qG57AavXNIPjhSFe9qhy1WURl6Nj274xUL0C3hGQ4zd/7GMl59CxboiJuZt3equpreeWxCHtBym61Hsz9dxr1hQtoXd7xq40KN/zHMSk7/hVMeFXg5Co3cn7YmA7G6P5YoedzeTqb8RiSEEkuj9p0gScPXZGT/XWbj6yiIr2GAeYmEODf4tdo=";
        return key;
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        architectView.onPostCreate();
        architectView.registerWorldLoadedListener(this);

        try {
            architectView.load(getAssetPath());
        } catch (IOException e) {
            Log.d(TAG, "Unable to load html file.");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        architectView.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
        architectView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        architectView.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        //Check for permissions
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.CAMERA}, CAMERA_PERM_ID);
        }

        // Get Geo Perms
        if (!checkGPSPermission()) {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, GEO_PERM_ID);
        }

        //get LocationManager
        locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        Log.d(TAG, "Registering for location updates.");
        locationManager.requestLocationUpdates(locationManager.GPS_PROVIDER, 1000, 5, new LocationProvider());


        //init AR view
        this.architectView = (ArchitectView) this.findViewById(R.id.architectView);
        final ArchitectStartupConfiguration config = new ArchitectStartupConfiguration();
        config.setLicenseKey(ARkey());
        this.architectView.onCreate(config);
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

    private class LocationProvider implements LocationListener {

        @Override
        public void onLocationChanged(Location location) {
            Log.d(TAG, "Location Update Received - " + location);
//            architectView.setLocation(location.getLatitude(), location.getLongitude(), location.getAltitude());
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {
            Log.d(TAG, provider + " Status - " + status);
        }

        @Override
        public void onProviderEnabled(String provider) {
            Log.d(TAG, provider + " - Enabled");
        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    }

    @Override
    public void worldWasLoaded(String s) {
        Log.d(TAG, "World was loaded.");
        architectView.setLocation(26.419498, -81.810104, 20.0);
    }

    @Override
    public void worldLoadFailed(int i, String s, String s1) {
        Log.d(TAG, "World load failed.");
    }

    protected void injectData() {
        if (!isLoading) {
            final Thread t = new Thread(new Runnable() {

                @Override
                public void run() {

                    isLoading = true;

                    final int WAIT_FOR_LOCATION_STEP_MS = 2000;

                    while (!isFinishing()) {

                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                Toast.makeText(ARActivity.this, R.string.location_fetching, Toast.LENGTH_SHORT).show();
                            }
                        });

                        try {
                            Thread.sleep(WAIT_FOR_LOCATION_STEP_MS);
                        } catch (InterruptedException e) {
                            break;
                        }
                    }

                    if (!isFinishing()) {
                        // TODO: you may replace this dummy implementation and instead load POI information e.g. from your database
                        Location poiData = new Location("");
                        poiData.setLatitude(26.419474);
                        poiData.setLongitude(-81.810043);
                        poiData.setAltitude(100);
                        callJavaScript("World.loadPoisFromJsonData", new String[] { poiData.toString() });
                    }

                    isLoading = false;
                }
            });
            t.start();
        }
    }

    /**
     * call JacaScript in architectView
     * @param methodName
     * @param arguments
     */
    private void callJavaScript(final String methodName, final String[] arguments) {
        final StringBuilder argumentsString = new StringBuilder("");
        for (int i= 0; i<arguments.length; i++) {
            argumentsString.append(arguments[i]);
            if (i<arguments.length-1) {
                argumentsString.append(", ");
            }
        }

        if (this.architectView!=null) {
            final String js = ( methodName + "( " + argumentsString.toString() + " );" );
            this.architectView.callJavascript(js);
        }
    }


    abstract String getAssetPath();

    abstract void addPoiToAR(double lat, double lon, double alt);
}
