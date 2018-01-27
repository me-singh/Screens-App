package com.example.user.screensapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.ZoomControls;

/**
 * Created by user on 1/26/2018.
 */

public class CurFragment extends Fragment {

    public static CurFragment newInstance(int position) {

        Bundle args = new Bundle();
        args.putInt("KEY",position);
        CurFragment fragment = new CurFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.image_resource,container,false);
        final ImageView imageView=view.findViewById(R.id.image_id);
        imageView.setImageResource(MainActivity.screens[getArguments().getInt("KEY")]);
        return view;
    }
}
