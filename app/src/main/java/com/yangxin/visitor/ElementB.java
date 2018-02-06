package com.yangxin.visitor;

/**
 * xxx
 *
 * @author xinyang
 * @time 2018/2/6.
 */

public class ElementB implements IElement {
    @Override
    public void doSomething() {

    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitorB(this);
    }
}
