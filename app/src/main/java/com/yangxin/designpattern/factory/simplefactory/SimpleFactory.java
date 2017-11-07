package com.yangxin.designpattern.factory.simplefactory;

import com.yangxin.designpattern.factory.AbstractProduct;
import com.yangxin.designpattern.factory.ProductA;

/**
 * 简单工厂模式，通过type来区分不同的产品
 *
 * Created by liangyu on 17/11/4.
 */

public class SimpleFactory {

    public static final int PRODUCTION_A = 0;
    public static final int PRODUCTION_B = 1;

    public AbstractProduct productionProduct(int type) {
        switch (type) {
            case PRODUCTION_A:
                return new ProductA();
            case PRODUCTION_B:
                return new ProductA();
            default:
                return null;
        }
    }
}
