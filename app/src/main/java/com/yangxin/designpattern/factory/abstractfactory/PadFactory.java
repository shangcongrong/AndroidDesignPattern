package com.yangxin.designpattern.factory.abstractfactory;

/**
 * 生产pad的工厂
 *
 * Created by liangyu on 17/11/12.
 */

public class PadFactory extends AbstractFactory {
    @Override
    protected AppleProduct createApple() {
        return new AppleIpad();
    }

    @Override
    protected SamSungProduct createSamSung() {
        return new SamSungPad();
    }
}
