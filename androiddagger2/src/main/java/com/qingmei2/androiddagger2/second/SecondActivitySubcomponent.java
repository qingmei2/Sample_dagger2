package com.qingmei2.androiddagger2.second;

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
        SecondActivitySubcomponent.SubModule.class,
        AndroidInjectionModule.class,
})
public interface SecondActivitySubcomponent extends AndroidInjector<SecondActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SecondActivity> {
    }

    @Module
    class SubModule {
        @Provides
        String provideName() {
            return SecondActivity.class.getName();
        }
    }
}
