package com.yangxin.androiddesignpattern;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.yangxin.androidbasic.service.MyServiceActivity;
import com.yangxin.app.BaseActivity;
import com.yangxin.javabasic.annotation.MyAnnotation;
import com.yangxin.javabasic.thread.ThreadManager;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xinyang
 */

public class MainActivity extends BaseActivity implements OnClickListener {

    @MyAnnotation(R.id.start_service)
    private TextView mStartService;

    @MyAnnotation(R.id.start_thread)
    private TextView mStartThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initView() {
        mStartService.setOnClickListener(this);
        mStartThread.setOnClickListener(this);
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        try{

        }finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start_service:
                startActivity(new Intent(MainActivity.this, MyServiceActivity.class));
                break;
            case R.id.start_thread:
                ThreadManager.startTestThread();
                break;
            default:
                break;
        }
    }
}
