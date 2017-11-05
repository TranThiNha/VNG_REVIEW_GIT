package com.example.mypc.vng_review.dagger2.modules;

import com.example.mypc.vng_review.dagger2.models.Body;

import dagger.Module;
import dagger.Provides;

/**
 * Created by MyPC on 11/5/2017.
 */
@Module
public class BodyModule {
    Body body;

    public BodyModule(Body body){
        this.body = body;
    }

    @Provides
    Body getBody(){
        return body;
    }
}
