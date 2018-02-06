package com.yangxin.visitor;

/**
 * xxx
 *
 * @author xinyang
 * @time 2018/2/6.
 */

public class ElementA implements IElement {
    @Override
    public void doSomething() {

    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitorA(this);
    }
}
