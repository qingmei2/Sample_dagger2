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

    @Inject
    public MainPresenter(MainActivity view, MainModel model) {
    }
}
