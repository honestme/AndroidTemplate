package com.honestme.androidtemplate.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.honestme.androidtemplate.BaseActivity;
import com.honestme.androidtemplate.BaseDisplay;
import com.honestme.androidtemplate.BaseUiPresenter;
import com.honestme.androidtemplate.R;

public class MainActivity extends BaseActivity {

    private MainPresenter mMainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainPresenter = new MainPresenter();
        setPresenter(mMainPresenter);

    }

    @Override
    protected int setLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected void handleIntent(Context context, BaseDisplay display) {

    }



    public static void actionStartIntent(Context context){
        Intent intent = new Intent(context,MainActivity.class);
        context.startActivity(intent);
    }



}
