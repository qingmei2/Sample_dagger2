package com.qingmei2.androiddagger2.mvp.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.qingmei2.androiddagger2.R;
import com.qingmei2.androiddagger2.base.BaseActivity;
import com.qingmei2.androiddagger2.mvp.contract.MainContract;
import com.qingmei2.androiddagger2.mvp.presenter.MainPresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by QingMei on 2017/7/28.
 * desc:
 */

public class MainActivity extends BaseActivity implements MainContract.View {

    @Inject
    String className;
    @Inject
    SharedPreferences sp;
    @Inject
    MainPresenter presenter;

    @BindView(R.id.tv_content)
    TextView tvContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvContent.setText(className + "\n" +
                sp.toString() + "\n" +
                presenter.toString());

    }

    public void gotoSecond(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }

    public void requestHttp(View view) {
        presenter.requestHttp();
    }

    public void onGetMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

}
