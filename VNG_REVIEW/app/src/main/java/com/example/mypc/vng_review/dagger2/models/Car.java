package com.example.mypc.vng_review.dagger2.models;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by MyPC on 11/5/2017.
 */

public class Car {
    List<Wheel> wheelList = new ArrayList<>(4);
    Body Body;

    @Inject
    public Car( Body Body){
        this.Body = Body;
    }

    public void rap(){
        addWheel(new Wheel());
        addWheel(new Wheel());
        addWheel(new Wheel());
        addWheel(new Wheel());

        for (int i = 0 ; i < wheelList.size() ; i++){
            Log.d("XE",wheelList.get(i).getName());
        }

        Log.d("XE",Body.getName());
    }

    @Inject
    void addWheel(Wheel wheel){
        wheelList.add(wheel);
    }
}
