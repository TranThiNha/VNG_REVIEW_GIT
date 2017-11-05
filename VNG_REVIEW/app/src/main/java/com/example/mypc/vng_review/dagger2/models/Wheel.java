package com.example.mypc.vng_review.dagger2.models;

import javax.inject.Inject;

/**
 * Created by MyPC on 11/5/2017.
 */

public class Wheel {
    String name;

    @Inject
    public Wheel(){
        name = "Wheel";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
