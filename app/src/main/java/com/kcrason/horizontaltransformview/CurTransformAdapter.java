package com.kcrason.horizontaltransformview;

import android.content.Context;

import com.bumptech.glide.Glide;

/**
 * Created by KCrason on 2016/8/30.
 */
public class CurTransformAdapter extends TransformAdapter<BigVBean> {

    Context mContext;

    public CurTransformAdapter(Context context, ViewHolder viewHolder) {
        super(viewHolder);
        this.mContext = context;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item;
    }

    @Override
    public void setItemData(ViewHolder viewHolder, BigVBean bigVBean) {
        viewHolder.mTextView.setText(bigVBean.mUserName);
        Glide.with(mContext).load(bigVBean.mAvatar).asBitmap().into(viewHolder.mAvatar);
    }
}
