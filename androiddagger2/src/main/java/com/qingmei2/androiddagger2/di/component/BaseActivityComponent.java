package com.qingmei2.androiddagger2.di.component;

import com.qingmei2.androiddagger2.base.BaseActivity;
import com.qingmei2.androiddagger2.di.module.MainActivityModule;
import com.qingmei2.androiddagger2.di.module.SecondActivityModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by QingMei on 2017/7/28.
 * desc:
 */
@Subcomponent(modules = {
        AndroidInjectionModule.class,
        MainActivityModule.class,
        SecondActivityModule.class
})
public interface BaseActivityComponent extends AndroidInjector<BaseActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseActivity> {
    }

}
