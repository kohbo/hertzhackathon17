package com.hertz.jalapeno.beacon;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageView;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchGuide(View view){
        Intent intent = new Intent(this, GuideActivity.class);
        Log.v("DOIND","Starting guideact");
        startActivity(intent);
    }

    public void launchAR(View view){
        Intent intent = new Intent(this, FeatureView.class);
        startActivity(intent);
    }
}
