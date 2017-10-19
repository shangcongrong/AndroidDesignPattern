package com.yangxin.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;

import com.orhanobut.logger.Logger;

/**
 * @author xinyang
 */
public class MyStartService extends Service {

    public MyStartService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.d("onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Logger.d("onStartCommand");
        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
                mHandler.sendEmptyMessageDelayed(0, 100);
            }
        };
        thread.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        Logger.d("onBind");
        throw new UnsupportedOperationException("Not yet implemented");
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
