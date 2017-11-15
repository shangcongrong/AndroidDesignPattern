package com.yangxin.designpattern.strategy;

/**
 * xxx
 *
 * @author xinyang
 * @time 2017/11/15.
 */

public class Client {

    private IStrategy mIStrategy;

    public Client(IStrategy strategy) {
        mIStrategy = strategy;
    }

    public void execute() {
        mIStrategy.strategyInterface();
    }
}
