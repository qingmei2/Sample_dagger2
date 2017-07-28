package com.qingmei2.androiddagger2.b01android;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;


/**
 * Created by QingMei on 2017/7/28.
 * desc:
 */

public class MyApplicaition2 extends Application implements HasActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;


    @Override
    public void onCreate() {
        super.onCreate();
        inject();
    }

    private void inject() {
//        AppComponent appComponent = DaggerAppComponent.builder()
//                .appModule(new AppModule(this))
//                .build();
//        ComponentHolder.setAppComponent(appComponent);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

}
