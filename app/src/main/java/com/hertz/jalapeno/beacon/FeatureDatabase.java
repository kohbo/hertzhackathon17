package com.hertz.jalapeno.beacon;

import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.content.Context;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

import java.util.HashMap;

/*
 * Created by kohbo on 4/1/2017.
 */

class FeatureDatabase {
    Context context;

    public FeatureDatabase(Context context) {
        this.context = context;
        setDetails();
    }

    HashMap<String, Detail> detail = new HashMap();

    public void setDetails() {
        Resources res = this.context.getResources();
        String pkgName = this.context.getPackageName();

        Drawable w = this.context.getDrawable(res.getIdentifier("windshield", "drawable", pkgName));
        detail.put("windshield",
                new Detail("Pull Column Down To Vary Speed Of Wipers",
                        "windshield wipers",
                        w,
                        "Right Side Steering Column",
                        new LatLngAlt(26.419498, -81.810104, 10.10)));

        w = this.context.getDrawable(res.getIdentifier("brightness", "drawable", pkgName));
        detail.put("brightness",
                new Detail("Press '+' Symbol To Increase Brightness and '-' Symbol To Decrease Brightness ",
                        "Brightness control",
                        w,
                        "Left Driver Side Dash",
                        new LatLngAlt(26.419498, -81.810104, 10.10)));

        w = this.context.getDrawable(res.getIdentifier("climate_control", "drawable", pkgName));
        detail.put("climate_control",
                new Detail("Press '+' Symbol To Increase AC and '-' Symbol To Decrease AC...To Adjust Temperature Red Is Warm Temperature And Blue Is Cold Temperature", "Climate Control",
                        w,
                        "Mid Center Console",
                        new LatLngAlt(26.419498, -81.810104, 10.10)));

        w = this.context.getDrawable(res.getIdentifier("cruise_control", "drawable", pkgName));
        detail.put("cruise_control",
                new Detail("To Activate Press 'Cruise' Button To Initiate And Press 'Set' Once Desired Speed Is Reached To Automatically Maintain Desired Speed",
                        "windshield wipers",
                        w,
                        "Lower Left Paddle Steering Wheel",
                        new LatLngAlt(26.419498, -81.810104, 10.10)));

        w = this.context.getDrawable(res.getIdentifier("engine_start", "drawable", pkgName));
        detail.put("engine_start",
                new Detail("Apply Pressure To Break And Clutch While Simultaneously Pressing Ignition/Start",
                        "Ignition/Start",
                        w,
                        "Lower Left Center Consol Underneath Climate Control",
                        new LatLngAlt(26.419498, -81.810104, 10.10)));

        w = this.context.getDrawable(res.getIdentifier("fog_light", "drawable", pkgName));
        detail.put("fog_light",
                new Detail("To Activate Fog Lights Press Fog Light Symbol Which Is The Very Left Of Button Of Headlight Control Module",
                        "Fog Lights",
                        w,
                        "Left Side Of Headlight Control Module Left Of Steering Wheel",
                        new LatLngAlt(26.419498, -81.810104, 10.10)));

        w = this.context.getDrawable(res.getIdentifier("gas_cap", "drawable", pkgName));
        detail.put("gas_cap",
                new Detail("Manually Press On The Rear End Of Gas Cover To Release And Begin Fueling",
                        "Gas Cap Release",
                        w,
                        "Driver Side Rear Quarter Panel",
                        new LatLngAlt(26.419498, -81.810104, 10.10)));

        w = this.context.getDrawable(res.getIdentifier("gas_cap_indicator", "drawable", pkgName));
        detail.put("gas_cap_indicator",
                new Detail("Locate Fuel Indication In Driver Gauges To Determine",
                        "Gas Cap Indicator",
                        w,
                        "Driver Side Fuel Gauge",
                        new LatLngAlt(26.419498, -81.810104, 10.10)));

        w = this.context.getDrawable(res.getIdentifier("hazard_lights", "drawable", pkgName));
        detail.put("hazard_lights",
                new Detail("Press Down To Activate. Once Activated Press Down Again To Re-Activate",
                        "Emergency Hazards",
                        w,
                        "Mid Center Console First Silver Switch Right Of Ignition/Start",
                        new LatLngAlt(26.419498, -81.810104, 10.10)));

        w = this.context.getDrawable(res.getIdentifier("head_light", "drawable", pkgName));
        detail.put("head_light",
                new Detail("To Manually Control Headlights See HeadLight Control Module Left Of Steering Wheel Column",
                        "Headlights(automatic)",
                        w,
                        "Left Driver Side Dash",
                        new LatLngAlt(26.419498, -81.810104, 10.10)));

        w = this.context.getDrawable(res.getIdentifier("seat_warmer", "drawable", pkgName));
        detail.put("seat_warmer",
                new Detail("To Heat Or Cool Seats Please Press Red For Warmer Seat Temperature And Blue For Colder Seat Temperature",
                        "Seat Warmer/Cooler",
                        w,
                        "MidCenter Console Left and Right of Climate Control",
                        new LatLngAlt(26.419498, -81.810104, 10.10)));

        w = this.context.getDrawable(res.getIdentifier("trunk_opener", "drawable", pkgName));
        detail.put("trunk_opener",
                new Detail("Press Button To Release Trunk Latch",
                        "Trunk Release",
                        w,
                        "Lower Driver Side Left Of Steering Column",
                        new LatLngAlt(26.419498, -81.810104, 10.10)));

        w = this.context.getDrawable(res.getIdentifier("voice_control", "drawable", pkgName));
        detail.put("voice_control",
                new Detail("To Activate Voice Control Please Press Button With on Lower Right Steering Wheel Paddle With Voice Activation Symbol",
                        "Voice Control",
                        w,
                        "Lower Right Paddle Steering Wheel",
                        new LatLngAlt(26.419498, -81.810104, 10.10)));
    }

    public Detail getDetails(String name) {
        return detail.get(name);
    }

    public HashMap<String, Detail> getAllDetail() {
        return detail;
    }

    public class Detail {
        public String guide;
        public String name;
        public Drawable symbol;
        public String location;
        public LatLngAlt latlng;

        public Detail(String g, String n, Drawable s, String l, LatLngAlt ll) {
            guide = g;
            name = n;
            symbol = s;
            location = l;
            latlng = ll;
        }
    }

    public class LatLngAlt {
        public double latitude;
        public double longitude;
        public double altitude;

        public LatLngAlt(double lat, double lon, double alt){
            latitude = lat;
            longitude = lon;
            altitude = alt;
        }
    }

}
