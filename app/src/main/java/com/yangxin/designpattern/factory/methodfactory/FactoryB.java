package com.yangxin.designpattern.factory.methodfactory;

import com.yangxin.designpattern.factory.AbstractProduct;
import com.yangxin.designpattern.factory.ProductB;

/**
 * Created by liangyu on 17/11/4.
 */

public class FactoryB implements MethodFactory {

    @Override
    public AbstractProduct createProduct() {
        return new ProductB();
    }
}
