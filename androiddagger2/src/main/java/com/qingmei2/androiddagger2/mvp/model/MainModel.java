package com.qingmei2.androiddagger2.mvp.model;

import com.qingmei2.androiddagger2.mvp.contract.MainContract;

import javax.inject.Inject;

/**
 * Created by QingMei on 2017/8/16.
 * desc:
 */

public class MainModel implements MainContract.Model {

    @Inject
    public MainModel() {
    }

    public String returnMessage() {
        return "qingmei2";
    }
}
