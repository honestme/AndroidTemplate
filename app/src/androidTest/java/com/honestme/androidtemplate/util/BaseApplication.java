package com.honestme.androidtemplate.util;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2015/11/1 0001.
 */
public class BaseApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
