package com.qingmei2.androiddagger2.di;

import com.qingmei2.androiddagger2.di.component.BaseActivityComponent;
import com.qingmei2.androiddagger2.di.module.MainActivityModule;
import com.qingmei2.androiddagger2.di.module.SecondActivityModule;
import com.qingmei2.androiddagger2.mvp.activity.MainActivity;
import com.qingmei2.androiddagger2.mvp.activity.SecondActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by QingMei on 2017/8/16.
 * desc:
 */
@Module(subcomponents = {
        BaseActivityComponent.class
})
public abstract class AllActivitysModule {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributeMainActivitytInjector();

    @ContributesAndroidInjector(modules = SecondActivityModule.class)
    abstract SecondActivity contributeSecondActivityInjector();

}
