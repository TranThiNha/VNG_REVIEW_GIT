package com.example.mypc.vng_review.dagger2.component;

import com.example.mypc.vng_review.MainActivity;
import com.example.mypc.vng_review.dagger2.modules.AppModule;
import com.example.mypc.vng_review.test_dagger2.models.Animal;

import dagger.Component;

/**
 * Created by MyPC on 11/5/2017.
 */
@Component(dependencies = ElementComponent.class, modules = AppModule.class)
public interface AppComponent {

    //Là nơi khởi tạo app để sử dụng, nếu hàm này k được dùng thì app k được khởi tạo và mọi Inject đều không được dùng
    //Phải là một nơi mà khởi tạo được app => mainActivity
    void inject(MainActivity mainActivity);
}
