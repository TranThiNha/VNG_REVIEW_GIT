package com.example.mypc.vng_review.greenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MyPC on 11/2/2017.
 */

@Entity(nameInDb = "student")
public class Student {
    @Id
    private long id;

    @Property(nameInDb = "name")
    private String name;

    @Generated(hash = 1314737876)
    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Generated(hash = 1556870573)
    public Student() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
