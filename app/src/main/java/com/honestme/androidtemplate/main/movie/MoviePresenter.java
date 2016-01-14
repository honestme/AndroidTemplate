package com.honestme.androidtemplate.main.movie;

import android.graphics.Movie;

import com.google.common.eventbus.Subscribe;
import com.honestme.androidtemplate.BaseUiPresenter;

import java.util.List;

/**
 * Created by Administrator on 2015/11/27 0027.
 */
public class MoviePresenter extends BaseUiPresenter<MoviePresenter.MovieUi,MoviePresenter.MovieUiCallBacks> {

    public interface MovieUi extends BaseUiPresenter.Ui<MovieUiCallBacks>{
        void setCollection(List<Movie> collection);
    }

    public interface MovieUiCallBacks {}

    private final MovieUiCallBacks mMovieUiCallBacks = new MovieUiCallBacks() {
    };


    @Override
    protected boolean onInited() {
        super.onInited();

        mState.registerForEvents(this);
        return true;
    }

    @Override
    protected boolean populateUi() {
        super.populateUi();

        if(getUi() != null) {

        }

        return true;
    }

    @Override
    protected MovieUiCallBacks createUiCallBacks() {
        return mMovieUiCallBacks;
    }

    @Override
    protected boolean onSuspended() {
        super.onSuspended();
        mState.unRegisterForEvents(this);
        return true;
    }

    @Subscribe
    public void collectionChange(MovieState.CollectionChangedEvent collectionChangedEvent){
        populateUi();
    }

}

