package com.example.administrator.tour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/7/19.
 */


public class MyFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //寻找对应的布局
        View view = inflater.inflate(R.layout.myfragment, container,false);
        return view;
    }
}
