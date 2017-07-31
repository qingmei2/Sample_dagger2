package com.qingmei2.androiddagger2.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.qingmei2.androiddagger2.R;
import com.qingmei2.androiddagger2.base.BaseActivity;
import com.qingmei2.androiddagger2.second.SecondActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by QingMei on 2017/7/28.
 * desc:
 */

public class MainActivity extends BaseActivity {

    @Inject
    String className;

    @BindView(R.id.tv_content)
    TextView tvContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvContent.setText(className);
    }

    public void gotoSecond(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }

}
