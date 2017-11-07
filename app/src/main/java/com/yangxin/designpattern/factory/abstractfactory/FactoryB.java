package com.yangxin.designpattern.factory.abstractfactory;

import com.yangxin.designpattern.factory.AbstractProduct;
import com.yangxin.designpattern.factory.ProductB;

/**
 * Created by liangyu on 17/11/4.
 */

public class FactoryB extends AbstractFactory {
    @Override
    protected AbstractProduct productionProduct() {
        return new ProductB();
    }
}
