package com.hk.bd.lx_banner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

import com.hk.bd.lx_banner.adapter.MyAdapter;

import java.util.List;

public class MyView extends RelativeLayout {

    private Context context = null;
    private List<String> list = null;


    public void setContext(Context context) {
        this.context = context;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public MyView(Context context) {
        super(context);
        init();
    }


    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

        View inflate = View.inflate(context, R.layout.my_viewpager_layout, null);
        ViewPager myviewpager_1 = inflate.findViewById(R.id.myviewpager_1);
        MyAdapter myAdapter = new MyAdapter(context);
        myviewpager_1.setAdapter(myAdapter);


    }





}
