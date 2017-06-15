package com.mei_husky.sample_dagger2.module.a03scope;

import com.mei_husky.sample_dagger2.bean.Student;
import com.mei_husky.sample_dagger2.module.a03scope.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by QingMei on 2017/6/11 21:33
 * email:mei_husky@qq.com
 * desc:Used to
 */
@Module
public class A04Module {

    private A04Activity activity;

    public A04Module(A04Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    Student provideStudent() {
        return new Student();
    }

}
