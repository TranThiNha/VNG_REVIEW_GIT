package com.example.mypc.vng_review.test_dagger2.models;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * Created by MyPC on 11/5/2017.
 */

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Inject
    public Animal(String name) {
        this.name = name;
    }

}
