package com.mei_husky.sample_dagger2.module.a01activity;

import dagger.Module;

/**
 * Created by QingMei on 2017/6/11 21:33
 * email:mei_husky@qq.com
 * desc:Used to
 */
@Module
public class A01SimpleModule {

    private A01SimpleActivity activity;

    public A01SimpleModule(A01SimpleActivity activity) {
        this.activity = activity;
    }

}
