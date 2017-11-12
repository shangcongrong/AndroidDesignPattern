package com.yangxin.designpattern.factory.methodfactory;

import com.yangxin.designpattern.factory.AbstractProduct;
import com.yangxin.designpattern.factory.ProductA;
import com.yangxin.designpattern.factory.abstractfactory.AbstractFactory;

/**
 * Created by xinyang on 2017/10/18.
 */

public class FactoryA implements MethodFactory {

    @Override
    public AbstractProduct createProduct() {
        return new ProductA();
    }
}
