package com.jiuxiao.zoubei.letusgo.ui;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.jiuxiao.zoubei.letusgo.R;


public class LoginMainActivity extends Activity {
    private TextView mTvForget;
    private TextView mTvRegister;

    private Intent mIntent = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);

        InitiVariebles();
        /*
        跳转到forget页面
         */
        StartActivity(mTvForget, LoginForgetPasswordActivity.class);
        /*
        跳转到register页面
         */
        StartActivity(mTvRegister, LoginRegisterActivity.class);
    }


    /*
          初始化变量
     */
    private void InitiVariebles() {
        mTvForget = (TextView) findViewById(R.id.tv_forgetpassword);
        mTvRegister = (TextView) findViewById(R.id.tv_register);
    }

    /*
      跳转页面的方法
     */

    private void StartActivity(TextView textview, final Class target) {
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIntent = new Intent(getApplicationContext(), target);
                startActivity(mIntent);
            }
        });
    }


}
