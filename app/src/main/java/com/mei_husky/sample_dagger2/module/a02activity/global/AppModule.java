package com.mei_husky.sample_dagger2.module.a02activity.global;

import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

/**
 * Created by QingMei on 2017/6/14.
 * desc:
 */
@Module
public class AppModule {

    private MyApplication application;

    public AppModule(MyApplication application) {
        this.application = application;
    }

    @Provides
    SharedPreferences provideSharedPreferences(){
        return application.getSharedPreferences("spfile", Context.MODE_PRIVATE);
    }

    @Provides
    MyApplication provideApplication(){
        return application;
    }

}
