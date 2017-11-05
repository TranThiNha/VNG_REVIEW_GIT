package com.example.mypc.vng_review.greenDao;

import android.app.Application;


/**
 * Created by MyPC on 11/2/2017.
 */

public class DemoAPP extends Application {

    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        mDaoSession = new DaoMaster(new DbOpenHelper(this, "greendao_demo.db").getWritableDb()).newSession();

        //USER CREATION FOR DEMO PURPOSE
        if (mDaoSession.getUserDao().loadAll().size() == 0){
            mDaoSession.getUserDao().insert(new User(1L, "Nha","",""));
        }

        if (mDaoSession.getStudentDao().loadAll().size() == 0){
            mDaoSession.getStudentDao().insert(new Student(11,"TRAN THI NHA"));
            mDaoSession.getStudentDao().insert(new Student(12,"DOAN HIEU TAM"));
            mDaoSession.getStudentDao().insert(new Student(13,"DOAN THI PHUOWNG HUYEN"));

        }

    }

    public DaoSession getmDaoSession(){
        return mDaoSession;
    }
}
