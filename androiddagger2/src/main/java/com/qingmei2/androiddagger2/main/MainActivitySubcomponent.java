package com.qingmei2.androiddagger2.main;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by QingMei on 2017/7/28.
 * desc:
 */
@Subcomponent(modules = {
        AndroidInjectionModule.class,
        MainActivitySubcomponent.SubModule.class
})
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }

    @Module
    class SubModule {
        @Provides
        String provideName() {
            return MainActivity.class.getName();
        }
    }
}
