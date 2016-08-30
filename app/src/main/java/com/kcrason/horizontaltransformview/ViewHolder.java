package com.kcrason.horizontaltransformview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author Created by KCrason on 2016/8/30.
 * @email 535089696@qq.com
 */
public class ViewHolder {

    public TextView mTextView;
    public ImageView mAvatar;

    public void setView(View view) {
        mTextView = (TextView) view.findViewById(R.id.txt_username);
        mAvatar = (ImageView) view.findViewById(R.id.img_avatar);
    }

}
