package com.yangxin.androiddesignpattern;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.yangxin.annotation.MyAnnotation;
import com.yangxin.app.BaseActivity;
import com.yangxin.service.MyServiceActivity;

/**
 * @author xinyang
 */

public class MainActivity extends BaseActivity {

    @MyAnnotation(R.id.start_service)
    private TextView mStartService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initView() {
        mStartService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MyServiceActivity.class));
            }
        });
    }
}
