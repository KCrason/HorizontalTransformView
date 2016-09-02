package com.kcrason.horizontaltransformview;

import android.view.View;

import com.kcrason.randomtransforview.BaseViewHolder;

/**
 * @author Created by KCrason on 2016/8/30.
 * @email 535089696@qq.com
 */
public class ViewHolder extends BaseViewHolder {

    private View mView;

    @Override
    public <T extends View> T getChildView(int id) {
        return (T) mView.findViewById(id);
    }

    @Override
    public void setItemView(View view) {
        this.mView = view;
    }
}
