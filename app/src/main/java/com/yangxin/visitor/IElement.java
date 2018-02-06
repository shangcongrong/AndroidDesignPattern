package com.yangxin.visitor;

/**
 * xxx
 *
 * @author xinyang
 * @time 2018/2/6.
 */

public interface IElement {

    public void doSomething();
    public void accept(IVisitor visitor);
}
