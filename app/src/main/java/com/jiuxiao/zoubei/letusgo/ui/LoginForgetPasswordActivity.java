package com.jiuxiao.zoubei.letusgo.ui;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.jiuxiao.zoubei.letusgo.R;

public class LoginForgetPasswordActivity extends Activity {
    private TextView mTvTitle;
    private Button mBtnRegisterLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_registerandforget);

        mTvTitle= (TextView) findViewById(R.id.tv_include_title);
        mTvTitle.setText("忘记密码");

        mBtnRegisterLogin= (Button) findViewById(R.id.btn_register_login);
        mBtnRegisterLogin.setText("重置密码");





    }


}
