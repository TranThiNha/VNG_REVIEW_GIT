package com.example.mypc.vng_review.test_dagger2.modules;

import com.example.mypc.vng_review.test_dagger2.models.FourLegAnimal;

import dagger.Module;
import dagger.Provides;

/**
 * Created by MyPC on 11/5/2017.
 */
@Module
public class FourLegsAnimalModule {
    FourLegAnimal fourLegAnimal;

    public FourLegsAnimalModule(FourLegAnimal animal){
        fourLegAnimal = animal;
    }

    @Provides
    FourLegAnimal provideAnimal(){
        return fourLegAnimal;
    }
}
