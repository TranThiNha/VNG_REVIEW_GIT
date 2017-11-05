package com.example.mypc.vng_review;

import android.graphics.Bitmap;

import java.io.IOException;

/**
 * Created by MyPC on 10/27/2017.
 */

public class Presenter implements ModelRespondToPresenter {

    Model model;
    ViewLisstener callBack;

    public Presenter(ViewLisstener callBack){
        this.callBack = callBack;
    }

    public void recieveHandle() throws IOException {
        model = new Model(this);
        model.handle();
    }

    @Override
    public void onClic(Bitmap respond) {
        callBack.onClicked(respond);
    }
}
