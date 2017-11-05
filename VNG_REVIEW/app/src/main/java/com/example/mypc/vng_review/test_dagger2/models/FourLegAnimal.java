package com.example.mypc.vng_review.test_dagger2.models;

import javax.inject.Inject;

/**
 * Created by MyPC on 11/5/2017.
 */

public class FourLegAnimal {
    Animal animal;

    @Inject
    public FourLegAnimal(Animal animal){
        this.animal = animal;
    }
}
