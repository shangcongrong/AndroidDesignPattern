package com.yangxin.javabasic.thread;

import com.yangxin.javabasic.thread.threadexample.MyThreadOne;
import com.yangxin.javabasic.thread.threadexample.MyThreadTwo;
import com.yangxin.javabasic.thread.threadexample.ThreadMsg;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 多种线程方式实现的管理类
 *
 * @author xinyang
 * @time 2017/10/24.
 */

public class ThreadManager {

    public static void startTestThread() {
        startCallableThread();
        startSingleThread();
        startRunnableThread();
        //线程1,2执行完成后在执行线程3
        startMyThreadThree();
    }

    private static void startMyThreadThree() {
        ThreadMsg threadMsg = new ThreadMsg();
        MyThreadOne myThreadOne = new MyThreadOne(threadMsg);
        MyThreadTwo myThreadTwo = new MyThreadTwo(threadMsg);
        myThreadOne.start();
        myThreadTwo.start();
    }

    private static void startRunnableThread() {
        new Thread(new RunnableThread(), "runnable线程1").start();
    }

    private static void startSingleThread() {
        new SingleThread().start();
    }

    private static void startCallableThread() {
        CallableThread callableThread = new CallableThread();
        FutureTask<String> ft = new FutureTask<>(callableThread);
        System.out.println("ThreadActivity:" + Thread.currentThread().getName());
        new Thread(ft).start();
        try {
            System.out.println("子线程返回值:" + ft.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
