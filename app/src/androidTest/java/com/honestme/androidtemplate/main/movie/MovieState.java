package com.honestme.androidtemplate.main.movie;

import android.graphics.Movie;

import com.honestme.androidtemplate.BaseState;

import java.util.List;

/**
 * Created by Administrator on 2015/11/29 0029.
 */
public interface MovieState extends BaseState {


    public void setCollection(List<Movie> collection);

    public boolean hasCollection();

    public static class CollectionChangedEvent{}
}
