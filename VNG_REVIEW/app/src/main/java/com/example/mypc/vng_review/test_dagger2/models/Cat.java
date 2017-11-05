package com.example.mypc.vng_review.test_dagger2.models;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by MyPC on 11/5/2017.
 */

public class Cat {
    Animal animal;

    @Inject
    public Cat(Animal animal) {
        this.animal = animal;
    }

    public void keu(){
        Log.d(animal.getName(),"Meo meo");
    }
}
