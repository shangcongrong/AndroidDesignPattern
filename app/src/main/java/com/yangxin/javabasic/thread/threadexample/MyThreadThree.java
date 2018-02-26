package com.yangxin.javabasic.thread.threadexample;

/**
 * xxx
 *
 * @author xinyang
 * @time 2018/2/26.
 */

public class MyThreadThree extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("Thread-3-start");
        System.out.println("Thread-3-finish");
    }
}
