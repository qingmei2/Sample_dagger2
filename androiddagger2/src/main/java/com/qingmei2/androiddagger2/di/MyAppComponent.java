package com.qingmei2.androiddagger2.di;


import com.qingmei2.androiddagger2.base.MyApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by QingMei on 2017/7/28.
 * desc:
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AllActivitysModule.class
})
public interface MyAppComponent {

    void inject(MyApplication application);
}
