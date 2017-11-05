package com.example.mypc.vng_review.retrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by MyPC on 10/29/2017.
 */

public class NowPlaying {
    @SerializedName("results")
    private List<Movie>movies;

    public List<Movie> getMovies() {
        return movies;
    }
}
