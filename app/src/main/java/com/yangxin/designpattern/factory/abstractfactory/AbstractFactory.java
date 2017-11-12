package com.yangxin.designpattern.factory.abstractfactory;

/**
 * Created by xinyang on 2017/10/18.
 */

public abstract class AbstractFactory {

    protected abstract AppleProduct createApple();

    protected  abstract SamSungProduct createSamSung();
}
