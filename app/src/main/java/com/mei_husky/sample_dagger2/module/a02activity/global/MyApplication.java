package com.mei_husky.sample_dagger2.module.a02activity.global;

import android.app.Application;

/**
 * Created by QingMei on 2017/6/14.
 * desc：
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        inject();
    }

    private void inject() {
        AppComponent appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        ComponentHolder.setAppComponent(appComponent);
    }
}
