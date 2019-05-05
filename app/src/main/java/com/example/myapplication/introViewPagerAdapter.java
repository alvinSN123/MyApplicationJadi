package com.example.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


//alvin satria nugraha
// 10116064

// tanggal 27 - 1 menentukan disign
//tanggal 29 - 2 membuat navigation bar menu
//tanggal 3 mei 2019 membuat Walkthrougt
// tanggal 4 mei 2019 membuat reycle view
// tanggal 5 mei 2019 membuat isi menu

public class introViewPagerAdapter extends PagerAdapter {

    Context mContext ;
    List<ScreenItem> mListScreen;

    public introViewPagerAdapter(Context mContext, List<ScreenItem> mListScreen) {
        this.mContext = mContext;
        this.mListScreen = mListScreen;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.layout_screen,null);

        ImageView imgSlide = layoutScreen.findViewById(R.id.introImg);
        TextView title = layoutScreen.findViewById(R.id.introTitle);
        TextView describtion = layoutScreen.findViewById(R.id.introDescribtion);

        title.setText(mListScreen.get(position).getTitle());
        describtion.setText(mListScreen.get(position).getDesciption());
        imgSlide.setImageResource(mListScreen.get(position).getScreenImg());


        container.addView(layoutScreen);

        return layoutScreen;









    }

    @Override
    public int getCount() {
        return mListScreen.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view ==  o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);
    }
}



















