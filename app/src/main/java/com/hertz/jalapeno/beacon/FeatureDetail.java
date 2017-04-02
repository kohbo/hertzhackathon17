package com.hertz.jalapeno.beacon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.hertz.jalapeno.beacon.FeatureDatabase.Detail;

public class FeatureDetail extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_feature_detail);

        Intent i = getIntent();

        Bundle extras = i.getExtras();

        String feature = extras.getString("name");

        FeatureDatabase db = new FeatureDatabase(this);
        Detail detail = db.getDetails(feature);

        TextView name = (TextView) findViewById(R.id.nameText);

        TextView location = (TextView) findViewById(R.id.locationText);

        TextView guide = (TextView) findViewById(R.id.guideText);

        ImageView symbol = (ImageView) findViewById(R.id.iconSymbol);

        name.setText(detail.name);

        location.setText(detail.location);

        guide.setText(detail.guide);

        symbol.setImageDrawable(detail.symbol);

    }







    /*public FeatureDetail(String featureName, String featureDetail, String featureLocation){

        this._featureName = featureName;
        this._featureDetail = featureDetail;
        this._featureLocation = featureLocation;
    }

        //private variables

        String _featureName;
        String _featureDetail;
        String _featureLocation;

    public String get_featureName() {
        return _featureName;
    }

    public void set_featureName(String _featureName) {
        this._featureName = _featureName;
    }

    public String get_featureDetail() {
        return _featureDetail;
    }

    public void set_featureDetail(String _featureDetail) {
        this._featureDetail = _featureDetail;
    }

    public String get_featureLocation() {
        return _featureLocation;
    }

    public void set_featureLocation(String _featureLocation) {
        this._featureLocation = _featureLocation;
    }*/

}
