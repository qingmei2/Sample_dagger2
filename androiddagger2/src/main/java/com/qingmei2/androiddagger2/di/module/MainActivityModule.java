package com.qingmei2.androiddagger2.di.module;

import android.app.Activity;

import com.qingmei2.androiddagger2.di.component.MainActivitySubcomponent;
import com.qingmei2.androiddagger2.mvp.activity.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by QingMei on 2017/7/28.
 * desc:
 */
@Module(subcomponents = MainActivitySubcomponent.class)
public abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivityInjectorFactory(MainActivitySubcomponent.Builder builder);

}
