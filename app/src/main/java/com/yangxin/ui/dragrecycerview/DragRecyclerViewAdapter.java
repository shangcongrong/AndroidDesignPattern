package com.yangxin.ui.dragrecycerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * xxx
 *
 * @author xinyang
 * @time 2017/10/31.
 */

public class DragRecyclerViewAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private List<String> mImgUrls;

    public DragRecyclerViewAdapter(Context context, List<String> imgUrls) {
        mContext = context;
        mImgUrls = imgUrls;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView textView = new TextView(mContext);
        return new ImgHolder(textView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ImgHolder) {
            ((ImgHolder) holder).bindData(mImgUrls.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return mImgUrls.size();
    }

    private class ImgHolder extends RecyclerView.ViewHolder {
        private TextView mTextView;

        public ImgHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView;
        }

        public void bindData(String string) {
            mTextView.setText(string);
            mTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
            mTextView.setPadding(20, 20, 20, 20);
        }
    }
}
