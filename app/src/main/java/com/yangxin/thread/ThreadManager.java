package com.yangxin.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * xxx
 *
 * @author xinyang
 * @time 2017/10/24.
 */

public class ThreadManager {

    public static void startTestThread() {
        startCallableThread();
        startSingleThread();
        startRunnableThread();
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
