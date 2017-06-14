package com.mei_husky.sample_dagger2.module.a01activity;

import dagger.Component;

/**
 * Created by QingMei on 2017/6/11 21:32
 * email:mei_husky@qq.com
 * desc:Used to
 */
@Component(modules = A01SimpleModule.class)
public interface A01SimpleComponent {

    void inject(A01SimpleActivity activity);

}
