package com.example.mypc.vng_review.test_dagger2.component;

import com.example.mypc.vng_review.MainActivity;
import com.example.mypc.vng_review.test_dagger2.models.Animal;
import com.example.mypc.vng_review.test_dagger2.modules.AppModule;

import dagger.Component;

/**
 * Created by MyPC on 11/5/2017.
 */
@Component(dependencies = AnimalComponent.class, modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
