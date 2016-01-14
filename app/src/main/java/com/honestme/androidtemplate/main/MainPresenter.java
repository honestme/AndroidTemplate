package com.honestme.androidtemplate.main;

import com.google.common.base.Preconditions;
import com.honestme.androidtemplate.BasePresenter;
import com.honestme.androidtemplate.BaseUiPresenter;
import com.honestme.androidtemplate.main.movie.MoviePresenter;

/**
 * Created by Administrator on 2015/11/30 0030.
 */
public class MainPresenter extends BaseUiPresenter<MainPresenter.MainUi,MainPresenter.MainUiCallbacks> {

    public interface MainUi extends BaseUiPresenter.Ui<MainUiCallbacks>{

    }

    public interface MainUiCallbacks{}

    private MoviePresenter moviePresenter;
    private MainUiCallbacks mMainUiCallbacks;

    public MainPresenter(){
        moviePresenter = new MoviePresenter();
    }

    public MoviePresenter getMoviePresenter(){
        return moviePresenter;
    }

    @Override
    protected boolean onInited() {
        return moviePresenter.init();
    }

    @Override
    protected MainUiCallbacks createUiCallBacks() {
        return new MainUiCallbacks() {
        };
    }

    @Override
    protected boolean onSuspended() {

        return moviePresenter.suspend();

    }
}
