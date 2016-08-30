package com.kcrason.horizontaltransformview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnTransformItemClickListener, View.OnClickListener {

    private HorizontalTransformView mHorizontalTransformView;

    private CurTransformAdapter mCurTransformAdapter;

    private ImageView mRefresh;

    private String imageUrl[] = {"http://img2.3lian.com/2014/f6/173/d/51.jpg",
            "http://img.pconline.com.cn/images/upload/upc/tx/wallpaper/1402/12/c1/31189058_1392186616852.jpg",
            "http://a2.att.hudong.com/71/04/300224654811132504044925945_950.jpg",
            "http://www.bz55.com/uploads/allimg/150305/139-1503051FS0.jpg",
            "http://img.pconline.com.cn/images/upload/upc/tx/wallpaper/1212/06/c1/16396010_1354784049718.jpg",
            "http://img.pconline.com.cn/images/upload/upc/tx/wallpaper/1408/07/c0/37179063_1407421362265_800x600.jpg",
            "http://www.qqya.com/qqyaimg/allimg/140227/1KI36229-3.jpg",
            "http://upload.univs.cn/2012/0104/1325645518461.jpg",
            "http://img4.duitang.com/uploads/item/201205/14/20120514001331_wKMLH.thumb.600_0.jpeg",
            "http://img04.tooopen.com/images/20130317/tooopen_16483075.jpg",
            "http://i.k1982.com/design_img/201109/201109011617318631.jpg",
            "http://img4.duitang.com/uploads/blog/201404/01/20140401133842_VQj2t.thumb.600_0.jpeg",
            "http://img15.3lian.com/2015/f1/41/d/80.jpg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRefresh = (ImageView) findViewById(R.id.img_refresh);
        mRefresh.setOnClickListener(this);

        mHorizontalTransformView = (HorizontalTransformView) findViewById(R.id.transform_view);
        ViewHolder viewHolder = new ViewHolder();
        mCurTransformAdapter = new CurTransformAdapter(this, viewHolder);
        mHorizontalTransformView.setAdapter(mCurTransformAdapter);
        mHorizontalTransformView.setOnTransformItemClickListener(this);
        initData();
    }

    private void initData() {
        List<BigVBean> bigVBeens = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            BigVBean bigVBean = new BigVBean();
            bigVBean.mUserName = sUserNames[(int) (Math.random() * 3)];
            bigVBean.mAvatar = imageUrl[(int) (Math.random() * 3) * 4];
            bigVBeens.add(bigVBean);
        }
        mCurTransformAdapter.setData(bigVBeens);
    }

    private String sUserNames[] = {"KCrason", "KNoBaby", "KNight", "KSun"};

    @Override
    public void onItemClickListener(View view, int position) {
        Toast.makeText(this, "position:" + position, Toast.LENGTH_SHORT).show();
    }

    private void startAanimation() {
        RotateAnimation rotateAnimation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setDuration(400);
        mRefresh.startAnimation(rotateAnimation);
        //fsfsdfsdfsfsssdds

    }

    @Override
    public void onClick(View view) {
        startAanimation();
        initData();
    }
}
