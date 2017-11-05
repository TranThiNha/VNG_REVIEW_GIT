package com.example.mypc.vng_review.test_dagger2.modules;

import com.example.mypc.vng_review.test_dagger2.models.Animal;

import dagger.Module;
import dagger.Provides;

/**
 * Created by MyPC on 11/5/2017.
 */
@Module
public class AnimalModule {

    Animal animal;
    public AnimalModule(Animal animal){
        this.animal = animal;
    }

    @Provides
    Animal provideAnimal(){
        return animal;
    }
}
