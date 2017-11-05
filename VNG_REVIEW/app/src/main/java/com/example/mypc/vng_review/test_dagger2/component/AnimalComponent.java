package com.example.mypc.vng_review.test_dagger2.component;

import com.example.mypc.vng_review.MainActivity;
import com.example.mypc.vng_review.test_dagger2.models.Animal;
import com.example.mypc.vng_review.test_dagger2.models.FourLegAnimal;
import com.example.mypc.vng_review.test_dagger2.modules.AnimalModule;
import com.example.mypc.vng_review.test_dagger2.modules.FourLegsAnimalModule;

import dagger.Component;

/**
 * Created by MyPC on 11/5/2017.
 */
@Component(modules = {AnimalModule.class, FourLegsAnimalModule.class})
public interface AnimalComponent {
   Animal animal();
   FourLegAnimal fourLegsAnimal();
}
