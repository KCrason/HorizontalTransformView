package com.kcrason.randomtransforview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * @author Created by KCrason on 2016/8/30.
 * @email 535089696@qq.com
 */
public class RandomTransformView extends LinearLayout {

    private Context mContext;

    private OnTransformItemClickListener mOnTransformItemClickListener;

    public RandomTransformView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
    }

    public RandomTransformView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public RandomTransformView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void setOnTransformClickListener(OnTransformItemClickListener onTransformClickListener) {
        this.mOnTransformItemClickListener = onTransformClickListener;
    }

    public OnTransformItemClickListener getOnTransformItemClickListener() {
        return mOnTransformItemClickListener;
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public RandomTransformView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    public void setOnTransformItemClickListener(OnTransformItemClickListener onTransformItemClickListener){
        this.mOnTransformItemClickListener = onTransformItemClickListener;
    }

    public void setAdapter(TransformAdapter transformAdapter) {
        transformAdapter.setHorizontalTransformView(mContext, this);
    }
}
