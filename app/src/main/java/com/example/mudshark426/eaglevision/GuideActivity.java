package com.example.mudshark426.eaglevision;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.hardware.SensorManager;
import android.location.LocationListener;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
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
    private ImageButton car_one;
    private ImageButton car_two;
    private ImageButton car_three;
    private ImageButton car_four;
    private ImageButton car_five;
    private ImageButton car_six;
    private ImageButton car_seven;

    private ImageButton car_eight;
    private ImageButton car_nine;

    /*public void onCreate(Bundle savedInstanceState) {

        car_one = (ImageButton) findViewById(R.id.car_one);
        car_two = (ImageButton) findViewById(R.id.car_two);
        car_three = (ImageButton) findViewById(R.id.car_three);
        car_four = (ImageButton) findViewById(R.id.car_four);
        car_five= (ImageButton) findViewById(R.id.car_five);
        car_six = (ImageButton) findViewById(R.id.car_six);
        car_seven = (ImageButton) findViewById(R.id.car_seven);
        car_eight = (ImageButton) findViewById(R.id.car_eight);
        car_nine = (ImageButton) findViewById(R.id.car_nine);
        car_one.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(getParent()).create(); //Read Update

                alertDialog.setTitle("Never Lost Navigation");

                alertDialog.setMessage("Hertz offers you a route-guidance system, providing turn-by" +
                        "-turn directions. A 4-inch LCD video screen, with computer activated voice " +
                        "instruction is dash mounted.");

                alertDialog.show();  //<-- See This!

            }

        });
        car_two.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(getParent()).create(); //Read Update

                alertDialog.setTitle("Never Lost Navigation");

                alertDialog.setMessage("Hertz offers you a route-guidance system, providing turn-by" +
                        "-turn directions. A 4-inch LCD video screen, with computer activated voice " +
                        "instruction is dash mounted.");

                alertDialog.show();  //<-- See This!

            }

        });
        car_three.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(getParent()).create(); //Read Update

                alertDialog.setTitle("Never Lost Navigation");

                alertDialog.setMessage("Hertz offers you a route-guidance system, providing turn-by" +
                        "-turn directions. A 4-inch LCD video screen, with computer activated voice " +
                        "instruction is dash mounted.");

                alertDialog.show();  //<-- See This!

            }

        });
        car_four.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(getParent()).create(); //Read Update

                alertDialog.setTitle("Never Lost Navigation");

                alertDialog.setMessage("Hertz offers you a route-guidance system, providing turn-by" +
                        "-turn directions. A 4-inch LCD video screen, with computer activated voice " +
                        "instruction is dash mounted.");

                alertDialog.show();  //<-- See This!

            }

        });
        car_five.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(getParent()
                ).create(); //Read Update

                alertDialog.setTitle("Never Lost Navigation");

                alertDialog.setMessage("Hertz offers you a route-guidance system, providing turn-by" +
                        "-turn directions. A 4-inch LCD video screen, with computer activated voice " +
                        "instruction is dash mounted.");

                alertDialog.show();  //<-- See This!

            }

        });
        car_six.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(getParent()).create(); //Read Update

                alertDialog.setTitle("Never Lost Navigation");

                alertDialog.setMessage("Hertz offers you a route-guidance system, providing turn-by" +
                        "-turn directions. A 4-inch LCD video screen, with computer activated voice " +
                        "instruction is dash mounted.");

                alertDialog.show();  //<-- See This!

            }

        });
        car_seven.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(getParent()).create(); //Read Update

                alertDialog.setTitle("Never Lost Navigation");

                alertDialog.setMessage("Hertz offers you a route-guidance system, providing turn-by" +
                        "-turn directions. A 4-inch LCD video screen, with computer activated voice " +
                        "instruction is dash mounted.");

                alertDialog.show();  //<-- See This!

            }

        });
        car_eight.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(getParent()).create(); //Read Update

                alertDialog.setTitle("Never Lost Navigation");

                alertDialog.setMessage("Hertz offers you a route-guidance system, providing turn-by" +
                        "-turn directions. A 4-inch LCD video screen, with computer activated voice " +
                        "instruction is dash mounted.");

                alertDialog.show();  //<-- See This!

            }

        });
        car_nine.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(getParent()).create(); //Read Update

                alertDialog.setTitle("Never Lost Navigation");

                alertDialog.setMessage("Hertz offers you a route-guidance system, providing turn-by" +
                        "-turn directions. A 4-inch LCD video screen, with computer activated voice " +
                        "instruction is dash mounted.");

                alertDialog.show();  //<-- See This!

            }

        });

    }*/
}
