package com.example.mypc.vng_review.retrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MyPC on 10/29/2017.
 */

public class YoutubeVideo {

    @SerializedName("source")
    private String source;

    public String getSource()
    {
        return source;
    }
}