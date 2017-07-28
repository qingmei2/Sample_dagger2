package com.qingmei2.androiddagger2;


import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by QingMei on 2017/7/28.
 * desc:
 */
@Component(modules = MainActivityModule.class)
public interface MyAppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(MyApplication application);

        MyAppComponent build();

    }

    void inject(MyApplication application);

}
