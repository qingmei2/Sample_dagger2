package com.mei_husky.sample_dagger2.module.a03scope;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.mei_husky.sample_dagger2.R;
import com.mei_husky.sample_dagger2.bean.Student;
import com.mei_husky.sample_dagger2.module.a02activity.global.ComponentHolder;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class A04Activity extends AppCompatActivity {

    @BindView(R.id.tv_student)
    TextView tvStudent;

    @Inject
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a04);
        ButterKnife.bind(this);
        DaggerA04Component.builder()
                .appComponent(ComponentHolder.getAppComponent())
                .a04Module(new A04Module(this))
                .build()
                .inject(this);

        tvStudent.setText(student.toString());
    }
}
