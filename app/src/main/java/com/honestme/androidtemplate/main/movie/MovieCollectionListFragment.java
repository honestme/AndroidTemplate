package com.honestme.androidtemplate.main.movie;

import android.app.ListFragment;
import android.graphics.Movie;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2015/11/30 0030.
 */
public class MovieCollectionListFragment extends ListFragment implements MoviePresenter.MovieUi{

    MoviePresenter mMovieController;

    private MoviePresenter.MovieUiCallBacks mMovieUiCallBacks;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setListShown(false);
    }

    @Override
    public void onResume() {
        super.onResume();
        mMovieController.attachUi(this);

    }

    @Override
    public void onPause() {
        mMovieController.detachUi(this);
        super.onPause();

    }

    @Override
    public void setCollection(List<Movie> collection) {
        setListShown(true);
    }

    @Override
    public void setCallBack(MoviePresenter.MovieUiCallBacks callbacks) {
        mMovieUiCallBacks = callbacks;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
