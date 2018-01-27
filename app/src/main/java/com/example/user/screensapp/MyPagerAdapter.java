package com.example.user.screensapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ZoomControls;

/**
 * Created by user on 1/25/2018.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return CurFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 14;
    }

//    Context context;
//    LayoutInflater layoutInflater;
//    int[] screens;
//
//    public MyPagerAdapter(Context context, int[] screens) {
//        this.context = context;
//        this.screens=screens;
//        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//    }
//
//    @Override
//    public int getCount() {
//        return screens.length;
//    }
//
//    @Override
//    public boolean isViewFromObject(View view, Object object) {
//        return view == ( (LinearLayout)object);
//    }
//
//    @Override
//    public Object instantiateItem(ViewGroup container, final int position) {
//        View itemView = layoutInflater.inflate(R.layout.image_resource, container, false);
//
//        ImageView imageView = itemView.findViewById(R.id.image_id);
//        imageView.setImageResource(screens[position]);
//        container.addView(itemView);
//
////        PhotoView photoView = (PhotoView) findViewById(R.id.photo_view);
////        photoView.setImageResource(R.drawable.image);
//
//        //listening to image click
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "you clicked image " + (position + 1), Toast.LENGTH_LONG).show();
//            }
//        });
//        return itemView;
//    }
//
//    @Override
//    public void destroyItem(ViewGroup container, int position, Object object) {
//        container.removeView((LinearLayout) object);
//    }

}
