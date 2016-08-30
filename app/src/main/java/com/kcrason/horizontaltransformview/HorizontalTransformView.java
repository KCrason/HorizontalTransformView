package com.kcrason.horizontaltransformview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * @author Created by KCrason on 2016/8/30.
 * @email 535089696@qq.com
 */
public class HorizontalTransformView extends LinearLayout {

    private Context mContext;

    private OnTransformItemClickListener mOnTransformItemClickListener;

    public HorizontalTransformView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
    }

    public HorizontalTransformView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public HorizontalTransformView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public HorizontalTransformView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    public void setOnTransformItemClickListener(OnTransformItemClickListener onTransformItemClickListener){
        this.mOnTransformItemClickListener = onTransformItemClickListener;
    }

    public OnTransformItemClickListener getOnTransformItemClickListener(){
        return mOnTransformItemClickListener;
    }


    public void setAdapter(TransformAdapter transformAdapter) {
        transformAdapter.setHorizontalTransformView(mContext, this);
    }


}
