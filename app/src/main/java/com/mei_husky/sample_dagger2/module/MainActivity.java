package com.mei_husky.sample_dagger2.module;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.mei_husky.sample_dagger2.R;
import com.mei_husky.sample_dagger2.module.a01activity.A01SimpleActivity;
import com.mei_husky.sample_dagger2.module.a02activity.A02Activity;
import com.mei_husky.sample_dagger2.module.a03scope.A03Activity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_a01_base)
    Button btnA01Base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_a01_base, R.id.btn_a02, R.id.btn_a03})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_a01_base:
                startActivity(new Intent(this, A01SimpleActivity.class));
                break;
            case R.id.btn_a02:
                startActivity(new Intent(this, A02Activity.class));
                break;
            case R.id.btn_a03:
                startActivity(new Intent(this, A03Activity.class));
                break;
        }
    }
}
