package com.kcrason.randomtransforview;

import android.view.View;


public abstract class BaseViewHolder {

    public abstract <T extends View> T getChildView(int id);

    public abstract void setItemView(View view);
}
