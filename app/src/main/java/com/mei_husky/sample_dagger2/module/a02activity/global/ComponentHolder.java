package com.mei_husky.sample_dagger2.module.a02activity.global;


/**
 * Created by fcn-mq on 2017/4/11.
 */

public class ComponentHolder {
    private static AppComponent myAppComponent;

    public static void setAppComponent(AppComponent component) {
        myAppComponent = component;
    }

    public static AppComponent getAppComponent() {
        return myAppComponent;
    }
}
