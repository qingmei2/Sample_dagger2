package com.qingmei2.androiddagger2.di.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.qingmei2.androiddagger2.bean.Student;
import com.qingmei2.androiddagger2.di.scope.ActivityScope;
import com.qingmei2.androiddagger2.mvp.activity.MainActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    static String provideName() {
        return MainActivity.class.getName();
    }

    @Provides
    static SharedPreferences provideSp(MainActivity activity) {
        return activity.getSharedPreferences("def", Context.MODE_PRIVATE);
    }

    @Provides
    @ActivityScope
    static Student provideStudent() {
        return new Student();
    }
}
