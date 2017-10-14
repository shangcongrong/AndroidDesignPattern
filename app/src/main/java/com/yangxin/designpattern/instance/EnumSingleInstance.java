package com.yangxin.designpattern.instance;

import android.util.Log;

/**
 * 枚举类型的单例模式
 *
 * Created by liangyu on 17/7/29.
 */

public enum EnumSingleInstance {

    INSTANCE;

    private static String TAG = EnumSingleInstance.class.getSimpleName();

    public void init() {
        Log.d(TAG, "init");
    }
}
