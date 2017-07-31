package com.qingmei2.androiddagger2.second;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by QingMei on 2017/7/28.
 * desc:
 */
@Module(subcomponents = SecondActivitySubcomponent.class)
public abstract class SecondActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(SecondActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindSecondActivityInjectorFactory(SecondActivitySubcomponent.Builder builder);

}
