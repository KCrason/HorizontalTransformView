package com.kcrason.randomtransforview;

import android.view.View;

/**
 * @author Created by KCrason on 2016/9/2.
 * @email 535089696@qq.com
 */
public abstract class BaseViewHolder {

    public abstract <T extends View> T getChildView(int id);

    public abstract void setItemView(View view);
}
