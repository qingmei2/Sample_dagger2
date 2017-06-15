package com.mei_husky.sample_dagger2.module.a03scope.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by QingMei on 2017/6/15.
 * desc:
 */
@Scope
@Retention(RUNTIME)
public @interface ActivityScope2 {
}
