package com.qingmei2.androiddagger2.di.component;

import android.content.Context;
import android.content.SharedPreferences;

import com.qingmei2.androiddagger2.bean.Student;
import com.qingmei2.androiddagger2.mvp.activity.MainActivity;
import com.qingmei2.androiddagger2.mvp.model.MainModel;

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

        @Provides
        Student provideStudent() {
            return new Student();
        }

        @Provides
        SharedPreferences provideSp(MainActivity activity) {
            return activity.getSharedPreferences("def", Context.MODE_PRIVATE);
        }

        @Provides
        MainModel provideModel() {
            return new MainModel();
        }
    }
}
