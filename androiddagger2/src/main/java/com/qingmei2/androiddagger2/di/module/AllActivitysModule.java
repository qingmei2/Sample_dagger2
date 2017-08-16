package com.qingmei2.androiddagger2.di.module;

import android.app.Activity;

import com.qingmei2.androiddagger2.di.component.MainActivitySubcomponent;
import com.qingmei2.androiddagger2.di.component.SecondActivitySubcomponent;
import com.qingmei2.androiddagger2.mvp.activity.MainActivity;
import com.qingmei2.androiddagger2.mvp.activity.SecondActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by QingMei on 2017/8/16.
 * desc:
 */
@Module(subcomponents = {
        MainActivitySubcomponent.class,
        SecondActivitySubcomponent.class
})
public abstract class AllActivitysModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindMainActivityInjectorFactory(MainActivitySubcomponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(SecondActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
    bindSecondActivityInjectorFactory(SecondActivitySubcomponent.Builder builder);
}
