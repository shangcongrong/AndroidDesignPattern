package com.yangxin.designpattern.observer;

/**
 * xxx
 *
 * @author xinyang
 * @time 2018/2/28.
 */

public class Client {

    public void testObserver(){
        ObserverManager observerManager = new ObserverManager();
        observerManager.addObserver(new IObserver() {
            @Override
            public void notifySuccess() {

            }

            @Override
            public void notifyFailed() {

            }
        });
    }
}
