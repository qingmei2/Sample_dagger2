package com.mei_husky.sample_dagger2.module.a01activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mei_husky.sample_dagger2.R;
import com.mei_husky.sample_dagger2.bean.Student;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class A01SimpleActivity extends AppCompatActivity {

    @BindView(R.id.btn_01)
    Button btn01;

    @Inject
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a01_simple);
        ButterKnife.bind(this);
        //新添代码
        DaggerA01SimpleComponent.builder()
                .a01SimpleModule(new A01SimpleModule(this))
                .build()
                .inject(this);
    }

    @OnClick(R.id.btn_01)
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.btn_01:
                Toast.makeText(this,student.toString(),Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
