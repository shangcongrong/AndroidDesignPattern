package com.yangxin.javabasic.thread.threadexample;

/**
 * xxx
 *
 * @author xinyang
 * @time 2018/2/26.
 */

public class MyThreadOne extends Thread {

    private ThreadMsg mThreadMsg;

    public MyThreadOne(ThreadMsg threadMsg) {
        mThreadMsg = threadMsg;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Thread-1-start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread-1-finish");
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
