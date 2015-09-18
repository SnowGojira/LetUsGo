package com.jiuxiao.zoubei.letusgo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.jiuxiao.zoubei.letusgo.R;
import com.jiuxiao.zoubei.letusgo.utils.CountDownHelper;

public class LoginRegisterActivity extends Activity {
    private TextView mTvTitle;
    private Button mBtnRegisterLogin;
    private Button mBtnRegisterSendcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_registerandforget);

        mTvTitle= (TextView) findViewById(R.id.tv_include_title);
        mTvTitle.setText("注册");
        mBtnRegisterLogin= (Button) findViewById(R.id.btn_register_login);
        mBtnRegisterLogin.setText("注册");

       mBtnRegisterSendcode= (Button) findViewById(R.id.btn_register_sendcode);
        try{
            mBtnRegisterSendcode.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CountDownHelper helper = new CountDownHelper(mBtnRegisterSendcode,
                            "发送验证码", 60, 1);
                    helper.setOnFinishListener(new CountDownHelper.OnFinishListener() {
                        @Override
                        public void FinishThisFunction() {
                            Toast.makeText(getApplicationContext(), "倒计时结束",
                                    Toast.LENGTH_SHORT).show();
                        }
                    });
                    helper.onStart();
                }
            });
        }catch(Exception e){
            Log.i("count down",e.toString());

        }


    }


}
