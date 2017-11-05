package com.example.mypc.vng_review;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by MyPC on 10/27/2017.
 */

public class Model {

    ModelRespondToPresenter callBack;
    OkHttpClient client = new OkHttpClient();

    public Model(ModelRespondToPresenter callBack){
        this.callBack = callBack;
    }

    public void handle() throws IOException {
        Bitmap result = run("https://s7d2.scene7.com/is/image/PetSmart/PB1201_STORY_CARO-Authority-HealthyOutside-DOG-20160818?$PB1201$");

        callBack.onClic(result);
    }

    Bitmap run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        InputStream stream =  response.body().byteStream();
        Bitmap bitmap = BitmapFactory.decodeStream(stream);
        return bitmap;

    }
}
