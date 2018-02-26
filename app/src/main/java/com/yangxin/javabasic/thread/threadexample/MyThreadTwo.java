package com.yangxin.javabasic.thread.threadexample;

/**
 * xxx
 *
 * @author xinyang
 * @time 2018/2/26.
 */

public class MyThreadTwo extends Thread {

    private ThreadMsg mThreadMsg;

    public MyThreadTwo(ThreadMsg threadMsg) {
        mThreadMsg = threadMsg;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Thread-2-start");
        System.out.println("Thread-2-finish");
        synchronized (mThreadMsg) {
            if (mThreadMsg.isMsg()) {
                MyThreadThree myThreadThree = new MyThreadThree();
                myThreadThree.start();
            } else {
                mThreadMsg.setMsg(true);
            }
        }
    }
}
