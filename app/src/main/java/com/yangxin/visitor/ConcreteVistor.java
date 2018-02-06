package com.yangxin.visitor;

/**
 * xxx
 *
 * @author xinyang
 * @time 2018/2/6.
 */

public class ConcreteVistor implements IVisitor {
    @Override
    public void visitorA(ElementA a) {
        a.doSomething();
    }

    @Override
    public void visitorB(ElementB b) {
        b.doSomething();
    }
}
