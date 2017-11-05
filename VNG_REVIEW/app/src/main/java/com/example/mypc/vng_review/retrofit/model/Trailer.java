package com.example.mypc.vng_review.retrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by MyPC on 10/29/2017.
 */

public class Trailer {
    @SerializedName("youtube")
    private List<YoutubeVideo> trailers;

    public List<YoutubeVideo> getTrailers() {
        return trailers;
    }
}