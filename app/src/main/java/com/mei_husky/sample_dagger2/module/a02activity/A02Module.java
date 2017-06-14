package com.mei_husky.sample_dagger2.module.a02activity;

import com.mei_husky.sample_dagger2.bean.Student;

import dagger.Module;
import dagger.Provides;

/**
 * Created by QingMei on 2017/6/11 21:33
 * email:mei_husky@qq.com
 * desc:Used to
 */
@Module
public class A02Module {

    private A02Activity activity;

    public A02Module(A02Activity activity) {
        this.activity = activity;
    }

    @Provides
    Student provideStudent() {
        return new Student();
    }

}
