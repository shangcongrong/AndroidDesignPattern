package com.yangxin.designpattern.instance;

/**
 * 懒汉式单例模式
 * Created by liangyu on 17/8/13.
 */

public class LazySingleInstance {

    public static LazySingleInstance getInstance() {
        return new LazySingleInstance();
    }

    private LazySingleInstance() {

    }
}
