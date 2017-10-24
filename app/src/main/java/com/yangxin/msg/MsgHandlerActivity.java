package com.yangxin.msg;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.yangxin.androiddesignpattern.R;

/**
 * 消息机制管理页面
 *
 * @author xinyang
 */
public class MsgHandlerActivity extends AppCompatActivity {

    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg_handler);
        mHandler.sendEmptyMessage(0);
    }
}
