package com.qingmei2.androiddagger2.di;


import com.qingmei2.androiddagger2.base.MyApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AllActivitiesModule.class
})
public interface MyAppComponent {

    void inject(MyApplication application);
}
