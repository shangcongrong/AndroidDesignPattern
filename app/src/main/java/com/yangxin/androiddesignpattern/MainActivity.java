package com.yangxin.androiddesignpattern;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.orhanobut.logger.Logger;
import com.yangxin.androidbasic.service.MyServiceActivity;
import com.yangxin.app.BaseActivity;
import com.yangxin.javabasic.annotation.MyAnnotation;
import com.yangxin.javabasic.thread.ThreadManager;
import com.yangxin.ui.dragrecycerview.DragRecyclerViewActivity;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xinyang
 */

public class MainActivity extends BaseActivity implements OnClickListener {

    @MyAnnotation(R.id.start_service)
    private TextView mStartService;

    @MyAnnotation(R.id.start_thread)
    private TextView mStartThread;

    @MyAnnotation(R.id.jump_to_other_page)
    private TextView mJumpToOtherPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initView() {
        mStartService.setOnClickListener(this);
        mStartThread.setOnClickListener(this);
        mJumpToOtherPage.setOnClickListener(this);
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        try {

        } finally {
            reentrantLock.unlock();
        }
        String test = "asdsadasdsad.sdf";
        Logger.d("test:"+test.matches("^.*(\\.|,|\\uff0c|\\u3002)$"));
        String test1 = "asdsadasdsad,sdf";
        Logger.d("test1:"+test1.matches("^.*(\\.|,|\\uff0c|\\u3002)$"));
        String test2 = "asdsadasdsad，sdf";
        Logger.d("test2:"+test2.matches("^.*(,|\\.|\\uff0c|\\u3002)$"));
        String test3 = "asdsadasdsad。sdf";
        Logger.d("test3:"+test3.matches("^.*(,|\\.|\\uff0c|\\u3002)$"));
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
            case R.id.jump_to_other_page:
                startActivity(new Intent(MainActivity.this, DragRecyclerViewActivity.class));
                break;
            default:
                break;
        }
    }
}
