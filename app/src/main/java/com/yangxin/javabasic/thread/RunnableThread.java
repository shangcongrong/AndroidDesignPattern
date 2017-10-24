package com.yangxin.javabasic.thread;

/**
 * xxx
 *
 * @author xinyang
 * @time 2017/10/24.
 */

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("RunnableThread-currendThread:"+Thread.currentThread().getName());
    }
}
