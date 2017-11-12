package com.yangxin.designpattern.factory.abstractfactory;

/**
 * Created by liangyu on 17/11/12.
 */

public class AppleIpad implements AppleProduct {
    @Override
    public void desc() {
        System.out.println("create apple ipad");
    }
}
