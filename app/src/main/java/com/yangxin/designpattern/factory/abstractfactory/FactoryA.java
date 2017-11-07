package com.yangxin.designpattern.factory.abstractfactory;

import com.yangxin.designpattern.factory.AbstractProduct;
import com.yangxin.designpattern.factory.ProductA;

/**
 * Created by xinyang on 2017/10/18.
 */

public class FactoryA extends AbstractFactory {

    @Override
    protected AbstractProduct productionProduct() {
        return new ProductA();
    }
}
