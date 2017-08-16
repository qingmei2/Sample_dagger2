package com.qingmei2.androiddagger2.di.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.qingmei2.androiddagger2.bean.Student;
import com.qingmei2.androiddagger2.mvp.activity.MainActivity;
import com.qingmei2.androiddagger2.mvp.model.MainModel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by QingMei on 2017/8/16.
 * desc:
 */
@Module
public class MainActivityModule {

    @Provides
    static String provideName() {
        return MainActivity.class.getName();
    }

    @Provides
    static Student provideStudent() {
        return new Student();
    }

    @Provides
    static SharedPreferences provideSp(MainActivity activity) {
        return activity.getSharedPreferences("def", Context.MODE_PRIVATE);
    }

    @Provides
    static MainModel provideModel() {
        return new MainModel();
    }

}
