package com.example.mypc.vng_review.dagger2.component;

import com.example.mypc.vng_review.dagger2.models.Body;
import com.example.mypc.vng_review.dagger2.models.Wheel;
import com.example.mypc.vng_review.dagger2.modules.BodyModule;
import com.example.mypc.vng_review.dagger2.modules.WheelModule;
import com.example.mypc.vng_review.test_dagger2.modules.AppModule;

import dagger.Component;

/**
 * Created by MyPC on 11/5/2017.
 */
@Component(modules = {WheelModule.class, BodyModule.class})
public interface ElementComponent {

    //để hàm Provide kiểu Wheel được gọi
    Wheel wheel();

    //Để hàm provide kiểu Body được gọi
    Body body();
}
