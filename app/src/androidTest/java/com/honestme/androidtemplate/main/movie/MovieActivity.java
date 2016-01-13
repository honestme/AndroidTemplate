package com.honestme.androidtemplate.main.movie;

import android.content.Context;
import android.graphics.Movie;
import android.os.Bundle;

import com.honestme.androidtemplate.BaseActivity;
import com.honestme.androidtemplate.BaseDisplay;

import java.util.List;

public class MovieActivity extends BaseActivity implements MoviePresenter.MovieUi{

    @Override
    public void setCallBack(MoviePresenter.MovieUiCallBacks callbacks) {

    }


    @Override
    public void setCollection(List<Movie> collection) {

    }

    @Override
    protected int setLayoutResource() {
        return 0;
    }

    @Override
    protected void handleIntent(Context context, BaseDisplay display) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
