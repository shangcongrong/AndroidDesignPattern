package com.yangxin.designpattern.factory.simplefactory;

import com.yangxin.designpattern.factory.AbstractProduct;

/**
 * Created by liangyu on 17/11/4.
 */

public class SimpleFactoryTwo {

    public <T extends AbstractProduct> T productionProduct(Class<T> clzName) {
        T product = null;

        try {
            product = (T) Class.forName(clzName.getName()).newInstance();
        } catch (Throwable e) {
            e.printStackTrace();
        }


        return product;
    }
}
