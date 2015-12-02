package com.honestme.androidtemplate.loading;

import android.app.Activity;

import com.honestme.androidtemplate.BaseDisplay;
import com.honestme.androidtemplate.main.MainActivity;

/**
 * Created by Administrator on 2015/11/26 0026.
 */
public class LoadingDisplay extends BaseDisplay {
    private  Activity mActivity;

    public void action_start_mainactivity(){

        MainActivity.actionStartIntent(mActivity);
    }

    public LoadingDisplay(Activity activity) {
        mActivity = activity;
    }
}
