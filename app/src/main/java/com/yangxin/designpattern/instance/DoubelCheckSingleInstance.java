package com.yangxin.designpattern.instance;

/**
 * Created by liangyu on 17/7/23.
 */

public class DoubelCheckSingleInstance {

    private volatile DoubelCheckSingleInstance mInstance = null;

    private DoubelCheckSingleInstance() {

    }

    public DoubelCheckSingleInstance getInstance() {
        if (mInstance == null) {
            synchronized (DoubelCheckSingleInstance.class) {
                if (mInstance == null) {
                    mInstance = new DoubelCheckSingleInstance();
                }
            }
        }
        return mInstance;
    }
}
