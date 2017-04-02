package com.example.mudshark426.eaglevision;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.hertz.jalapeno.beacon.R;

public class HertzLaCarte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hertz_la_carte);

        ImageButton booster = (ImageButton) findViewById(R.id.boosterSeat);

        booster.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(HertzLaCarte.this).create(); //Read Update

                alertDialog.setTitle("Booster Seat");

                alertDialog.setMessage("Avoid airline baggage charges and have our seats waiting for " +
                        "you. Hertz can provide you with a belt-positioning high back booster seat " +
                        "to be used in the back seat for children who have outgrown a convertible " +
                        "car seat. The belt-positioning booster seat must be used in seating " +
                        "positions equipped with lap and shoulder belts. Children weighing 40-80 " +
                        "pounds or 18kg-36kgs should use these seats.");

                alertDialog.show();  //<-- See This!

            }

        });

    }
}


