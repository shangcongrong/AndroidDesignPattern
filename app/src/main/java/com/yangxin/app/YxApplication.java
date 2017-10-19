package com.yangxin.app;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * @author xinyang
 * @time 2017/10/18.
 */

public class YxApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        Logger.addLogAdapter(new AndroidLogAdapter());
    }
}
