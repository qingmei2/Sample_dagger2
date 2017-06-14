package com.mei_husky.sample_dagger2.module.a02activity;

import com.mei_husky.sample_dagger2.module.a02activity.global.AppComponent;

import dagger.Component;

/**
 * Created by QingMei on 2017/6/11 21:32
 * email:mei_husky@qq.com
 * desc:Used to
 */
@Component(modules = A02Module.class, dependencies = AppComponent.class)
public interface A02Component {

    void inject(A02Activity activity);

}
