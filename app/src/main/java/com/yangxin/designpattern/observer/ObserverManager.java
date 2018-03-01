package com.yangxin.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * xxx
 *
 * @author xinyang
 * @time 2018/2/28.
 */

public class ObserverManager implements IObserveable {

    private List<IObserver> mObservers;

    @Override
    public void addObserver(IObserver observer) {
        if (mObservers == null) {
            mObservers = new ArrayList<>();
            mObservers.add(observer);
        }
    }

    @Override
    public void removeObserver(IObserver observer) {
        if (mObservers != null) {
            mObservers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer : mObservers) {
            observer.notifySuccess();
        }
    }
}
