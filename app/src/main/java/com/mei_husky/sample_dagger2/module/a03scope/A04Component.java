package com.mei_husky.sample_dagger2.module.a03scope;

import com.mei_husky.sample_dagger2.module.a02activity.global.AppComponent;
import com.mei_husky.sample_dagger2.module.a03scope.scope.ActivityScope;

import dagger.Component;

/**
 * Created by QingMei on 2017/6/11 21:32
 * email:mei_husky@qq.com
 * desc:Used to
 */
@ActivityScope
@Component(modules = A04Module.class, dependencies = AppComponent.class)
public interface A04Component {

    void inject(A04Activity activity);

}
