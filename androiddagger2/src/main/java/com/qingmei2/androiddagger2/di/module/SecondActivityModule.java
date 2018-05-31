package com.qingmei2.androiddagger2.di.module;

import com.qingmei2.androiddagger2.mvp.activity.SecondActivity;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class SecondActivityModule {

    @Provides
    static String provideName() {
        return SecondActivity.class.getName();
    }

}
