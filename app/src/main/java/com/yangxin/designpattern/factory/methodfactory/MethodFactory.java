package com.yangxin.designpattern.factory.methodfactory;

import com.yangxin.designpattern.factory.AbstractProduct;
import com.yangxin.designpattern.factory.ProductA;
import com.yangxin.designpattern.factory.ProductB;

/**
 * 工厂方法模式
 *
 * Created by liangyu on 17/11/4.
 */

public class MethodFactory {

    public static AbstractProduct productionProductA() {
        return new ProductA();
    }

    public static AbstractProduct productionProductB() {
        return new ProductB();
    }
}
