package com.qingmei2.androiddagger2.mvp.presenter;

import com.qingmei2.androiddagger2.mvp.activity.MainActivity;
import com.qingmei2.androiddagger2.mvp.contract.MainContract;
import com.qingmei2.androiddagger2.mvp.model.MainModel;

import javax.inject.Inject;

/**
 * Created by QingMei on 2017/8/16.
 * desc:
 */

public class MainPresenter implements MainContract.Presenter {

    private final MainActivity view;
    private final MainModel model;

    @Inject
    public MainPresenter(MainActivity view, MainModel model) {
        this.view = view;
        this.model = model;
    }

    public void requestHttp() {
        view.onGetMessage(model.returnMessage());
    }
}
