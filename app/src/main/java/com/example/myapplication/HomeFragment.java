package com.example.myapplication;

import android.animation.ArgbEvaluator;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    ViewPager viewPagerr;
    Adapter adapter;
    List<Model> models;
    Integer[] color = null;
    ArgbEvaluator argbEvaluator;

    //alvin satria nugraha
    // 10116064

    // tanggal 27 - 1 menentukan disign
    //tanggal 29 - 2 membuat navigation bar menu
    //tanggal 3 mei 2019 membuat Walkthrougt
    // tanggal 4 mei 2019 membuat reycle view
    // tanggal 5 mei 2019 membuat isi menu

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_homw, container, false);


//        models  = new ArrayList<>();
//        models.add(new Model(R.drawable.brochure, "Brosur","yang yang yang yang yang yang yang yang yang yang"));
//        models.add(new Model(R.drawable.sticker, "Brosur","yang yang yang yang yang yang yang yang yang yang"));
//        models.add(new Model(R.drawable.poster, "Brosur","yang yang yang yang yang yang yang yang yang yang"));
//        models.add(new Model(R.drawable.namecard, "Brosur","yang yang yang yang yang yang yang yang yang yang"));
//
//        adapter = new Adapter(models,this);
//
//        viewPagerr = viewPagerr.findViewById(R.id.viewPager);
//        viewPagerr.setAdapter(adapter);
//        viewPagerr.setPadding(130,0, 130,0);
//
//        viewPagerr.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int i, float v, int i1) {
//                if (postion < ())
//            }
//
//            @Override
//            public void onPageSelected(int i) {
//
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int i) {
//
//            }
//        });
    }
}
