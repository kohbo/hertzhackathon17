package com.hertz.jalapeno.beacon;

import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import java.util.HashMap;

/**
 * Created by kohbo on 4/1/2017.
 */

class FeatureDatabase {

    HashMap<String, Detail> details = new HashMap();




    public void setDetails(String name) {
        Resources res = getResources();
        Drawable d = res.getIdentifier("WindShield", "drawable", getPackageName());
        Detail.put(name, new Detail("Pull Column Down To Vary Speed Of Wipers", "windshield wipers", d ,"Right Side Steering Column"));


    }

    public HashMap<String, Detail> getDetails(){
        return details;
    }



    public class Detail {
        public String guide;
        public String name;
        public Drawable symbol;
        public String location;


        public Detail(String g, String n, Drawable s, String l){
            guide = g;
            name = n;
            symbol = s;
            location = l;

        }


    }



}
