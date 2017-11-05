package com.example.mypc.vng_review.SugarDao;

import com.orm.SugarRecord;

/**
 * Created by MyPC on 11/2/2017.
 */

public class Book extends SugarRecord{
    private String title;
    private String author_name;

    public Book(){

    }

    public Book(String title, String author_name){
        this.title = title;
        this.author_name = author_name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor_name() {
        return author_name;
    }
}
