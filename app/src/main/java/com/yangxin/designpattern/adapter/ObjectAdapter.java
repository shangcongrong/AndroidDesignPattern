package com.yangxin.designpattern.adapter;

/**
 * 对象适配器
 *
 * @author xinyang
 * @time 2017/11/15.
 */

public class ObjectAdapter implements AdapterTarget {

    private Adaptee mAdaptee;

    public ObjectAdapter(Adaptee adaptee) {
        mAdaptee = adaptee;
    }

    @Override
    public void adapterFunction1() {
        mAdaptee.adapterFunction1();
    }

    @Override
    public void adapterFunction2() {
        //需要做的其他事情
    }
}
