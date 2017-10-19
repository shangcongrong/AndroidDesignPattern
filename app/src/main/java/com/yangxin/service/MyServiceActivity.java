package com.yangxin.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.TextView;

import com.yangxin.androiddesignpattern.R;
import com.yangxin.annotation.MyAnnotation;
import com.yangxin.app.BaseActivity;

/**
 * @author xinyang
 */
public class MyServiceActivity extends BaseActivity {

    @MyAnnotation(R.id.start_service)
    private TextView mStartService;

    @MyAnnotation(R.id.bind_service)
    private TextView mBindService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_service);
    }

    @Override
    protected void initView() {
        mStartService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(MyServiceActivity.this, MyStartService.class));
            }
        });
        mBindService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bindService(new Intent(MyServiceActivity.this, MyBindService.class), mServiceConnection,
                        BIND_AUTO_CREATE);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(mServiceConnection);
    }

    private ServiceConnection mServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            MyBindService.MyBind myBind = (MyBindService.MyBind) service;
            myBind.showLog();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };
}
