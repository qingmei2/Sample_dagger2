package com.mei_husky.sample_dagger2.module.a02activity.global;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

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
    @Singleton
    SharedPreferences provideSharedPreferences() {
        return application.getSharedPreferences("spfile", Context.MODE_PRIVATE);
    }

    @Provides
    @Singleton
    MyApplication provideApplication() {
        return application;
    }


    /**
     * 下列代码详见a03scope篇的使用
     * 打开该代码需要注释掉下列Module中的 @Provides provideStudent() 方法
     * {@link com.mei_husky.sample_dagger2.module.a03scope.A03Module}
     * {@link com.mei_husky.sample_dagger2.module.a03scope.A04Module}
     * {@link com.mei_husky.sample_dagger2.module.a02activity.A02Module}
     *
     * 以及打开AppComponent中的Student student()方法
     * {@link AppComponent}
     */
//    @Provides
//    @Singleton
//    Student provideStudent() {
//        return new Student();
//    }

}
