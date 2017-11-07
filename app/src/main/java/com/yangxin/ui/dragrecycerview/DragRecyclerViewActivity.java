package com.yangxin.ui.dragrecycerview;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.yangxin.androiddesignpattern.R;
import com.yangxin.app.BaseActivity;
import com.yangxin.javabasic.annotation.MyAnnotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xinyang
 * @time 2017-10-31
 */
public class DragRecyclerViewActivity extends BaseActivity {

    @MyAnnotation(R.id.drag_image_rv)
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag_recycler_view);
    }

    @Override
    protected void initView() {
        final List<String> seeding = new ArrayList<>();
        seeding.add("aaaa");
        seeding.add("bbbb");
        seeding.add("cccc");
        seeding.add("dddd");
        seeding.add("eeee");
        seeding.add("ffff");
        seeding.add("gggg");
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        DragRecyclerViewAdapter dragRecyclerViewAdapter = new DragRecyclerViewAdapter(this, seeding);
        mRecyclerView.setAdapter(dragRecyclerViewAdapter);
        final ItemTouchHelper itemTouchHelper =
                new ItemTouchHelper(new RecyclerItemTouchCallBack(dragRecyclerViewAdapter, seeding));
        itemTouchHelper.attachToRecyclerView(mRecyclerView);
        //mRecyclerView.addOnItemTouchListener(new OnRecyclerItemClickListener(mRecyclerView) {
        //    @Override
        //    public void onItemClick(RecyclerView.ViewHolder vh) {
        //
        //    }
        //
        //    @Override
        //    public void onItemLongClick(RecyclerView.ViewHolder vh) {
        //        //如果item不是最后一个，则执行拖拽
        //        Logger.d(vh.getLayoutPosition() + "--" + (seeding.size() - 1));
        //        itemTouchHelper.startDrag(vh);
        //    }
        //});
    }
}
