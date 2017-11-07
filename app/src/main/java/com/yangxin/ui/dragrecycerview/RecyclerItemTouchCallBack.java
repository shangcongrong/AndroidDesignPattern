package com.yangxin.ui.dragrecycerview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.orhanobut.logger.Logger;

import java.util.Collections;
import java.util.List;

/**
 * xxx
 *
 * @author xinyang
 * @time 2017/10/31.
 */

public class RecyclerItemTouchCallBack extends ItemTouchHelper.Callback {

    private List<String> mResults;
    private DragRecyclerViewAdapter mAdapter;

    public RecyclerItemTouchCallBack(DragRecyclerViewAdapter dragRecyclerViewAdapter, List<String> results) {
        this.mResults = results;
        this.mAdapter = dragRecyclerViewAdapter;
    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int dragFlags = ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
        int swipeFlags = 0;
        return makeMovementFlags(dragFlags, swipeFlags);
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder,
            RecyclerView.ViewHolder target) {
        //得到拖动ViewHolder的position
        int fromPosition = viewHolder.getAdapterPosition();
        //得到目标ViewHolder的position
        int toPosition = target.getAdapterPosition();
        if (toPosition == mResults.size() - 1) {
            return false;
        }
        if (fromPosition < toPosition) {
            for (int i = fromPosition; i < toPosition; i++) {
                Collections.swap(mResults, i, i + 1);
            }
        } else {
            for (int i = fromPosition; i > toPosition; i--) {
                Collections.swap(mResults, i, i - 1);
            }
        }
        mAdapter.notifyItemMoved(fromPosition, toPosition);
        return true;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

    }

    @Override
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
        super.onSelectedChanged(viewHolder, actionState);
    }

    @Override
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        Logger.d("mResults:" + mResults);
    }

    /**
     * 因为最后一个有可能是选择图片而不是真正的图片，因此这里要返回false，在longClick事件中处理是否可以长按的事件
     */
    @Override
    public boolean isLongPressDragEnabled() {
        return true;
    }
}
