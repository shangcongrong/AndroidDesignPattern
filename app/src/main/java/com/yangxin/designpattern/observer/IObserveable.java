package com.yangxin.designpattern.observer;

/**
 * xxx
 *
 * @author xinyang
 * @time 2018/2/26.
 */

public interface IObserveable {

    void addObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObserver();
}
