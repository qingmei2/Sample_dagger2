package com.mei_husky.sample_dagger2.module.a02activity.global;

import android.content.SharedPreferences;

import dagger.Component;

/**
 * Created by QingMei on 2017/6/14.
 * desc:
 */
@Component(modules = AppModule.class)
public interface AppComponent {

    SharedPreferences sharedPreferences();

    MyApplication myApplication();
}
