package com.qingmei2.androiddagger2.b01android;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by QingMei on 2017/7/28.
 * desc:
 */
@Subcomponent(modules = B01ActivityModule.class)
public interface B01ActivitySubcomponent extends AndroidInjector<B01Activity> {

    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<B01Activity> {
    }

    @Module
    class SubModule {

        @Provides
        String provideActivityName() {
            return B01Activity.class.getName();
        }

    }
}
