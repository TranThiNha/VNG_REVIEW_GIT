package com.example.mypc.vng_review.test_dagger2.modules;

import android.app.Application;

import com.example.mypc.vng_review.test_dagger2.MyApplication;

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

    @Provides
    @Singleton
    Application provideApplication(){
        return application;
    }
}
