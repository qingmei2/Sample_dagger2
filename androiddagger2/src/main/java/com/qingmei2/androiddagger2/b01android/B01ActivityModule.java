package com.qingmei2.androiddagger2.b01android;

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
@Module(subcomponents = B01ActivitySubcomponent.class)
abstract class B01ActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(B01Activity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindB01ActivityInjectorFactory(B01ActivitySubcomponent.Builder builder);

}
