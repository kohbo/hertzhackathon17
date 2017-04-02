package com.example.mudshark426.eaglevision;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.hertz.jalapeno.beacon.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchGuide(View view){
        Intent intent = new Intent(this, GuideActivity.class);
        startActivity(intent);
    }

    public void launchAR(View view){
        Intent intent = new Intent(this, FeatureView.class);
        startActivity(intent);
    }

    public void launchALC(View view){
        Intent intent = new Intent(this, HertzLaCarte.class);
        startActivity(intent);
    }
}
