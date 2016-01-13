package com.honestme.androidtemplate;

import android.graphics.Movie;

import com.honestme.androidtemplate.login.LoginState;
import com.honestme.androidtemplate.main.movie.MovieState;

import java.util.List;

/**
 * Created by Administrator on 2016/1/13 0013.
 */
public class ApplicationState implements MovieState,LoginState {

    private static ApplicationState mState;

    public static ApplicationState getInstance(){
        if(mState == null){
            synchronized (mState){
                if (mState == null){
                    mState = new ApplicationState();
                }
            }
        }
        return mState;
    }

    @Override
    public void setCollection(List<Movie> collection) {

    }

    @Override
    public boolean hasCollection() {
        return false;
    }

    @Override
    public void registerForEvents(Object receiver) {

    }

    @Override
    public void unRegisterForEvents(Object receiver) {

    }

    @Override
    public void loginIn(String userName, String passWord, LoginCallbacks loginCallbacks) {

    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getHashPassword() {
        return null;
    }
}
