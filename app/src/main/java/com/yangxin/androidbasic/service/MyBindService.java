package com.yangxin.androidbasic.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;

/**
 * 绑定服务
 *
 * @author xinyang
 */
public class MyBindService extends Service {

    public MyBindService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new MyBind();
    }

    public class MyBind extends Binder {
        public void showLog() {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    super.run();
                    mHandler.sendEmptyMessageDelayed(0, 100);
                }
            };
            thread.start();
        }
    }

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what < 100) {
                msg.what += 1;
                mHandler.sendEmptyMessageDelayed(msg.what, 100);
                Log.d("service", "msg.what:" + msg.what);
            }
        }
    };
}
