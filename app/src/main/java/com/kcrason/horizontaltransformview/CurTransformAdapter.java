package com.kcrason.horizontaltransformview;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kcrason.randomtransforview.BaseViewHolder;
import com.kcrason.randomtransforview.TransformAdapter;

/**
 * Created by KCrason on 2016/8/30.
 */
public class CurTransformAdapter extends TransformAdapter<BigVBean> {

    Context mContext;

    public CurTransformAdapter(Context context, BaseViewHolder baseViewHolder) {
        super(baseViewHolder);
        this.mContext = context;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item;
    }

    @Override
    public void setItemData(BaseViewHolder baseViewHolder, BigVBean bigVBean) {
        TextView mUserName = baseViewHolder.getChildView(R.id.txt_username);
        mUserName.setText(bigVBean.mUserName);
        ImageView mAvatar = baseViewHolder.getChildView(R.id.img_avatar);
        Glide.with(mContext).load(bigVBean.mAvatar).asBitmap().into(mAvatar);
    }
}
