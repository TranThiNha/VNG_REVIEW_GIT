package com.example.mypc.vng_review.test_dagger2;

import android.app.Application;

import com.example.mypc.vng_review.test_dagger2.component.*;
import com.example.mypc.vng_review.test_dagger2.models.Animal;
import com.example.mypc.vng_review.test_dagger2.models.FourLegAnimal;
import com.example.mypc.vng_review.test_dagger2.modules.AnimalModule;
import com.example.mypc.vng_review.test_dagger2.modules.AppModule;
import com.example.mypc.vng_review.test_dagger2.modules.FourLegsAnimalModule;

/**
 * Created by MyPC on 11/5/2017.
 */

public class MyApplication extends Application {
    AppComponent appComponent;
    AnimalComponent animalComponent;



    @Override
    public void onCreate() {
        super.onCreate();
        animalComponent = DaggerAnimalComponent.builder().animalModule(new AnimalModule(new Animal("MEO"))).fourLegsAnimalModule(new FourLegsAnimalModule(new FourLegAnimal(new Animal("DOG")))).build();
        appComponent = com.example.mypc.vng_review.test_dagger2.component.DaggerAppComponent.builder().animalComponent(animalComponent).appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent(){return appComponent;}
    public AnimalComponent getAnimalComponent(){return animalComponent;}
}
