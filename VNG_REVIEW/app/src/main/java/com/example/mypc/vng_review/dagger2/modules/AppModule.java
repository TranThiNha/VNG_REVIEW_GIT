package com.example.mypc.vng_review.dagger2.modules;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by MyPC on 11/5/2017.
 */
@Module
public class AppModule {
    Application application;

    public AppModule(Application application){
        this.application = application;
    }


    //Cung cấp app nơi mà mọi thứ được khởi tạo
    @Provides
    @Singleton
    Application getApplication(){
        return application;
    }
}
