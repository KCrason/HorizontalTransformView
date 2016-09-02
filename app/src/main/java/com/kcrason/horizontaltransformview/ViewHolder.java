package com.kcrason.horizontaltransformview;

import android.view.View;

import com.kcrason.randomtransforview.BaseViewHolder;


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
