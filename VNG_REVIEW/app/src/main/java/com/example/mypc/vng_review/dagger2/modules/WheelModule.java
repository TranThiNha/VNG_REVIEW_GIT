package com.example.mypc.vng_review.dagger2.modules;

import com.example.mypc.vng_review.dagger2.models.Wheel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by MyPC on 11/5/2017.
 */
@Module
public class WheelModule {

    Wheel Wheel;

    public WheelModule(Wheel Wheel){
        this.Wheel = Wheel;
    }

    @Provides
    Wheel getWheel(){
        return Wheel;
    }

}
