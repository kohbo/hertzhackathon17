package com.example.mudshark426.eaglevision;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.mudshark426.eaglevision.R;

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

        ImageButton travTab = (ImageButton) findViewById(R.id.travelTablet);

        travTab.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(HertzLaCarte.this).create(); //Read Update

                alertDialog.setTitle("Travel Tablet");

                alertDialog.setMessage("Hertz offers a TravelTab® for rental in selected locations. " +
                        "TravelTab® allows you to navigate in your preferred language. Take " +
                        "advantage of TravelTab®’s many features such as international calling, " +
                        "portable Wi-Fi Hotspot, exciting apps, and discount offers for attractions," +
                        " dining, and shopping in your destination. ");

                alertDialog.show();  //<-- See This!

            }

        });

        ImageButton skiPak = (ImageButton) findViewById(R.id.skiPackage);

        skiPak.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(HertzLaCarte.this).create(); //Read Update

                alertDialog.setTitle("Skierized Equipment");

                alertDialog.setMessage("Skierized vehicles include a ski rack (holding up to 4 " +
                        "pairs of skis), ice scraper and all season tires, if a city offers tires " +
                        "other than all season, it will be listed in the cities ski information. ");

                alertDialog.show();  //<-- See This!

            }

        });

        ImageButton neverL = (ImageButton) findViewById(R.id.neverLost);

        neverL.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(HertzLaCarte.this).create(); //Read Update

                alertDialog.setTitle("Never Lost Navigation");

                alertDialog.setMessage("Hertz offers you a route-guidance system, providing turn-by" +
                        "-turn directions. A 4-inch LCD video screen, with computer activated voice " +
                        "instruction is dash mounted.");

                alertDialog.show();  //<-- See This!

            }

        });

        ImageButton sirius = (ImageButton) findViewById(R.id.siriusRadio);

        sirius.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(HertzLaCarte.this).create(); //Read Update

                alertDialog.setTitle("Sirius Satellite Radio");

                alertDialog.setMessage("SiriusXM is the country's premier satellite radio " +
                        "entertainment provider.  SiriusXM delivers over 130 channels of satellite " +
                        "radio throughout the North America.  There are 60 original channels of " +
                        "commercial free music, 60 channels of news, sports, entertainment and 11 " +
                        "channels of live traffic and weather (20 major metro areas).\n" +
                        "\n" +
                        " ");

                alertDialog.show();  //<-- See This!

            }

        });

        ImageButton inChiSeat = (ImageButton) findViewById(R.id.infantChildSeat);

        inChiSeat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(HertzLaCarte.this).create(); //Read Update

                alertDialog.setTitle("Infant Child Seat");

                alertDialog.setMessage("Avoid airline baggage charges and have our seats waiting " +
                        "for you. Hertz can provide you with an infant car seat to be used for " +
                        "infants who are less than one year old and weigh up to 20 pounds or up to " +
                        "9 kgs. Children are too large for this type of car seat if they weigh over " +
                        "20 pounds/9 kgs or are longer than 26 inches/66 cms. Infant seats must be " +
                        "installed rear-facing. These seats are desgined to support a child's neck, " +
                        "back and spinal cord.");

                alertDialog.show();  //<-- See This!

            }

        });

        ImageButton chiSeat = (ImageButton) findViewById(R.id.childSeat);

        chiSeat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                AlertDialog alertDialog = new AlertDialog.Builder(HertzLaCarte.this).create(); //Read Update

                alertDialog.setTitle("Child Seat");

                alertDialog.setMessage("Avoid airline baggage charges and have our seats waiting " +
                        "for you. Hertz can provide you with a convertible car seat to be used " +
                        "forward facing for children weighing 20-40 pounds or 8kgs-18 kgs and up " +
                        "to 40 inches/101 cms in height. Parents of children who have outgrown an " +
                        "infant car seat are encouraged to use these seats rear-facing until the " +
                        "child reaches the upper height and weight limits of the seat for rear-facing use.");

                alertDialog.show();  //<-- See This!

            }

        });


        Button aLaC = (Button)findViewById(R.id.aLaCarte);

        aLaC.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent();

                intent.setAction(Intent.ACTION_VIEW);

                intent.addCategory(Intent.CATEGORY_BROWSABLE);

                intent.setData(Uri.parse("https://www.google.com/maps/dir/1861+Oakes+Blvd,+Naples,+FL+34119/Hertz+Corporate+Headquarters,+Williams+Road,+Estero,+FL/@26.3474939,-81.8429092,12z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x88db1c629182f9a5:0x766260ca0b1b7c34!2m2!1d-81.735935!2d26.261895!1m5!1m1!1s0x88db17ac991bbe01:0xb8c5d4b5ac568c40!2m2!1d-81.8108859!2d26.4195394"));

                startActivity(intent);

            }

        });

    }

}




