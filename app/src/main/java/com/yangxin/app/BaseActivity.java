package com.yangxin.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.orhanobut.logger.Logger;
import com.yangxin.javabasic.annotation.AnnotationUtils;

/**
 * @author xinyang
 * @time 2017/10/18.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("onCreate");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Logger.d("onPostCreate");
        AnnotationUtils.injectViews(this);
        initView();
    }

    /**
     * 初始化Activity中的iew
     */
    protected abstract void initView();
}
