package com.yangxin.javabasic.thread;

/**
 * xxx
 *
 * @author xinyang
 * @time 2017/10/24.
 */

public class SingleThread extends Thread {
    @Override
    public void run() {
        System.out.println("SingleThread:" + this);
        super.run();
    }
}
