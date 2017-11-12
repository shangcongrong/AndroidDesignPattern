package com.yangxin.designpattern.factory.abstractfactory;

/**
 * 生产手机的工厂
 *
 * Created by liangyu on 17/11/12.
 */

public class MobileFactory extends AbstractFactory {
    @Override
    protected AppleProduct createApple() {
        return new IphoneMobile();
    }

    @Override
    protected SamSungProduct createSamSung() {
        return new SamSungMobile();
    }
}
