package com.example.mypc.vng_review.dagger2;

import android.app.Application;

import com.example.mypc.vng_review.dagger2.component.AppComponent;
import com.example.mypc.vng_review.dagger2.component.DaggerAppComponent;
import com.example.mypc.vng_review.dagger2.component.DaggerElementComponent;
import com.example.mypc.vng_review.dagger2.component.ElementComponent;
import com.example.mypc.vng_review.dagger2.models.Body;
import com.example.mypc.vng_review.dagger2.models.Wheel;
import com.example.mypc.vng_review.dagger2.modules.AppModule;
import com.example.mypc.vng_review.dagger2.modules.BodyModule;
import com.example.mypc.vng_review.dagger2.modules.WheelModule;

/**
 * Created by MyPC on 11/5/2017.
 */

public class MyApplication2 extends Application {

    AppComponent appComponent;
    ElementComponent elementComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        //nhớ gọi đầy đủ các module hay component mà nó cần
        elementComponent = DaggerElementComponent.builder().bodyModule(new BodyModule(new Body())).wheelModule(new WheelModule(new Wheel())).build();
        appComponent = DaggerAppComponent.builder().elementComponent(elementComponent).appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }

    public ElementComponent getElementComponent(){
        return elementComponent;
    }
}
