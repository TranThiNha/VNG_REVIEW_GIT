package com.example.mypc.vng_review.dagger2.models;

import javax.inject.Inject;

/**
 * Created by MyPC on 11/5/2017.
 */

public class Body {
    String name;

    @Inject
    public Body(){
        name = "Body";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
