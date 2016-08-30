package com.kcrason.horizontaltransformview;

/**
 * @author Created by KCrason on 2016/8/30.
 * @email 535089696@qq.com
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Created by KCrason on 2016/8/30.
 * @email 535089696@qq.com
 */
public abstract class TransformAdapter<T> {

    private HorizontalTransformView mHorizontalTransformView;

    private List<T> mTList;

    private Context mContext;

    private ViewHolder mViewHolder;

    public TransformAdapter(ViewHolder viewHolder) {
        this.mViewHolder = viewHolder;
    }

    public void setHorizontalTransformView(Context context, HorizontalTransformView horizontalTransformView) {
        this.mContext = context;
        this.mHorizontalTransformView = horizontalTransformView;
    }

    public void setData(List<T> data) {
        if (mTList == null) {
            mTList = new ArrayList<>();
        }
        mTList.clear();
        mTList.addAll(data);
        refreshChangeData();
    }

    private void refreshChangeData() {
        if (mTList == null) {
            return;
        }
        if (mHorizontalTransformView != null) {
            mHorizontalTransformView.removeAllViews();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.weight = 1;
        for (int i = 0; i < mTList.size(); i++) {
            View view = getView(i);
            mHorizontalTransformView.addView(view, i, layoutParams);
        }
    }

    public T getItem(int position) {
        if (mTList == null) {
            return null;
        }
        return mTList.get(position);
    }

    public int getCount() {
        if (mTList == null) {
            return 0;
        }
        return mTList.size();
    }


    private View getView(final int position) {
        View view = LayoutInflater.from(mContext).inflate(getLayoutId(), null);
        if (mViewHolder == null) {
            throw new RuntimeException("before set data , please set ViewHolder!");
        }
        mViewHolder.setView(view);
        setItemData(mViewHolder, mTList.get(position));
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnTransformItemClickListener onTransformItemClickListener = mHorizontalTransformView.getOnTransformItemClickListener();
                if (onTransformItemClickListener != null) {
                    onTransformItemClickListener.onTransformListener(view, position);
                }
            }
        });

        return view;
    }

    public abstract int getLayoutId();

    public abstract void setItemData(ViewHolder viewHolder, T t);


}
