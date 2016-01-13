package com.honestme.androidtemplate.main;

import com.google.common.base.Preconditions;
import com.honestme.androidtemplate.BasePresenter;
import com.honestme.androidtemplate.main.movie.MoviePresenter;

/**
 * Created by Administrator on 2015/11/30 0030.
 */
public class MainPresenter extends BasePresenter {

    MoviePresenter mMovieController;

    public MainPresenter(MoviePresenter movieController){
        mMovieController = Preconditions.checkNotNull(movieController,"movieController can't be null");
    }

    public MoviePresenter getMovieController(){
        return  mMovieController;
    }

    @Override
    protected boolean onInited() {
        return mMovieController.init();
    }

    @Override
    protected boolean onSuspended() {

        return mMovieController.suspend();

    }
}
