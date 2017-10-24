package com.yangxin.javabasic.thread;

import java.util.concurrent.Callable;

/**
 * 实现了callable接口的线程
 *
 * @author xinyang
 * @time 2017/10/24.
 */

public class CallableThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("CallableThread-currendThread:"+Thread.currentThread().getName());
        return "asd";
    }

}
