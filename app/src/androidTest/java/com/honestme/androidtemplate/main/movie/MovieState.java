package com.honestme.androidtemplate.main.movie;

import android.graphics.Movie;

import com.honestme.androidtemplate.BaseState;
import com.squareup.otto.Bus;

import java.util.List;

/**
 * Created by Administrator on 2015/11/29 0029.
 */
public class MovieState extends BaseState {
    public MovieState(Bus bus) {
        super(bus);
    }

    public List<Movie> getCollection(){
        return null;
    }

    public void setCollection(List<Movie> collection){}

    public boolean hasCollection(){return true;}

    public static class CollectionChangedEvent{}
}
