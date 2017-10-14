package com.yangxin.designpattern.instance;


/**
 * 静态内部类的单例，因为静态内部类当且仅当它内部的方法或者属性被调用时这个类才会加载，所以延迟了加载，
 * 而且静态内部类只会存在一个
 *
 * 非静态内部类会持有一个外部类的引用，静态内部类则不会；
 *
 * 1.静态内部类可以有静态成员(方法，属性)，而非静态内部类则不能有静态成员(方法，属性)。
 *
 * 2.静态内部类只能够访问外部类的静态成员,而非静态内部类则可以访问外部类的所有成员(方法，属性)
 * <p>
 * Created by liangyu on 17/7/23.
 */

public class StaticInnerClassSingleInstance {

    public static StaticInnerClassSingleInstance getInstance() {
        return StaticInnerClassSingleInstanceInner.staticInnerClassSingleInstance;
    }

    private StaticInnerClassSingleInstance() {
    }


    private static class StaticInnerClassSingleInstanceInner {
        private static StaticInnerClassSingleInstance staticInnerClassSingleInstance
                = new StaticInnerClassSingleInstance();
    }

}
