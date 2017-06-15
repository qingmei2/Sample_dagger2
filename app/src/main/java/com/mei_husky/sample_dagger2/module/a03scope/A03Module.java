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
public class A03Module {

    private A03Activity activity;

    public A03Module(A03Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    Student provideStudent() {
        return new Student();
    }

    /**
     * 下列代码打开后会编译报错
     * 因为同一个Module中有两处提供Student对象，每个方法都会生成一个Student_Factory
     * 这样Component在初始化Student_Factory工厂时就会不知道用哪个
     */
//    @Provides
//    @ActivityScope2
//    Student provideStudent2() {
//        return new Student();
//    }

}
