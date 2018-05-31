package com.qingmei2.androiddagger2.di;

import com.qingmei2.androiddagger2.di.module.MainActivityModule;
import com.qingmei2.androiddagger2.di.module.SecondActivityModule;
import com.qingmei2.androiddagger2.di.scope.ActivityScope;
import com.qingmei2.androiddagger2.mvp.activity.MainActivity;
import com.qingmei2.androiddagger2.mvp.activity.SecondActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class AllActivitiesModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributeMainActivitytInjector();

    @ActivityScope
    @ContributesAndroidInjector(modules = SecondActivityModule.class)
    abstract SecondActivity contributeSecondActivityInjector();
}
