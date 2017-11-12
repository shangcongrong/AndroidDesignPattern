package com.yangxin.designpattern.factory.methodfactory;

import com.yangxin.designpattern.factory.AbstractProduct;

/**
 * 工厂方法模式
 *
 * Created by liangyu on 17/11/4.
 */

public interface MethodFactory {

    AbstractProduct createProduct();
}
