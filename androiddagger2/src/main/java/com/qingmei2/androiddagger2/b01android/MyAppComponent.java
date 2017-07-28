package com.qingmei2.androiddagger2.b01android;

import com.mei_husky.sample_dagger2.module.a02activity.global.MyApplication;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by QingMei on 2017/7/28.
 * desc:
 */
@Component(modules = B01ActivityModule.class)
public interface MyAppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(MyApplication application);

        MyAppComponent build();

    }

    void inject(MyApplication application);

}
