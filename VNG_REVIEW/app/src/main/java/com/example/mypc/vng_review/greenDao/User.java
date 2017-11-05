package com.example.mypc.vng_review.greenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by MyPC on 11/2/2017.
 */


@Entity(nameInDb = "user")
public class User {

    @Id(autoincrement = true)
    private long id;

    @Property(nameInDb = "name")
    private String name;

    @Property(nameInDb = "created_at")
    private String created_at;

    @Property(nameInDb = "updated_at")
    private String updated_at;

    @Generated(hash = 628104906)
    public User(long id, String name, String created_at, String updated_at) {
        this.id = id;
        this.name = name;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    @Generated(hash = 586692638)
    public User() {
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

    public String getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return this.updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
