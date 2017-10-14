package com.yangxin.designpattern.instance;

/**
 * 饿汉式单例
 *
 * Created by liangyu on 17/7/23.
 */

public class HungrySingleInstance {

    public static HungrySingleInstance sInstance = new HungrySingleInstance();

    private HungrySingleInstance getInstance() {
        return sInstance;
    }
}
