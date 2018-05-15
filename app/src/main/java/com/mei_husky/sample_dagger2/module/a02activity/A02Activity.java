package com.mei_husky.sample_dagger2.module.a02activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.mei_husky.sample_dagger2.R;
import com.mei_husky.sample_dagger2.bean.Student;
import com.mei_husky.sample_dagger2.module.a02activity.global.ComponentHolder;

import javax.inject.Inject;

public class A02Activity extends AppCompatActivity {

    @Inject
    Student student;
    @Inject
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a02);
        inject();
    }

    private void inject() {
        DaggerA02Component.builder()
                .appComponent(ComponentHolder.getAppComponent())
                .build()
                .inject(this);

        Log.i("tag", "注入完毕，Student = " + student.toString());
        Log.i("tag", "注入完毕，sp = " + sp.toString());
    }
}
