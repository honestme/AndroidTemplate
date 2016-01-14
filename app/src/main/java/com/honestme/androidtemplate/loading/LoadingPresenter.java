package com.honestme.androidtemplate.loading;

import com.honestme.androidtemplate.BaseUiPresenter;

/**
 * Created by Administrator on 2015/11/26 0026.
 */
public class LoadingPresenter extends
        BaseUiPresenter<LoadingPresenter.LoadingUi,LoadingPresenter.LoadingUiCallbacks> {


    public interface LoadingUi extends BaseUiPresenter.Ui<LoadingUiCallbacks>{

    }

    public interface LoadingUiCallbacks{}



    @Override
    protected LoadingUiCallbacks createUiCallBacks() {
        return new LoadingUiCallbacks() {
        };
    }


}
