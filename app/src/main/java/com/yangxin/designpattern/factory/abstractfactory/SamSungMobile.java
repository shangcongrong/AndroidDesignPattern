package com.yangxin.designpattern.factory.abstractfactory;

/**
 * Created by liangyu on 17/11/12.
 */

public class SamSungMobile implements SamSungProduct {
    @Override
    public void desc() {
        System.out.println("create samsung mobile");
    }
}
