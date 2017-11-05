package com.example.mypc.vng_review.retrofit.api;


import com.example.mypc.vng_review.retrofit.model.NowPlaying;
import com.example.mypc.vng_review.retrofit.model.Trailer;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by MyPC on 10/29/2017.
 */

public interface MovieApi {
    @GET("now_playing")
    Call<NowPlaying> getNowPlaying();

    @GET("{videoId}/trailers")
    Call<Trailer> getTrailers(@Path("videoId") String videoId);

    @GET("popular")
    Call<NowPlaying> getPopular(@Query("page") Integer page);
}