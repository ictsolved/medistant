package com.sglabs.medistant.activities.bloodbank;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Celento on 3/30/2017.
 */
@IgnoreExtraProperties
public class usr {

    public String name;
    public String btype;
    public String town;

    public usr() {
        //
    }

    public usr(String name, String btype, String town) {
        this.name = name;
        this.btype=btype;
        this.town=town;
    }

}