package com.example.myapplication;

import android.content.Intent;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

//alvin satria nugraha
// 10116064

// tanggal 27 - 1 menentukan disign
//tanggal 29 - 2 membuat navigation bar menu
//tanggal 3 mei 2019 membuat Walkthrougt
// tanggal 4 mei 2019 membuat reycle view
// tanggal 5 mei 2019 membuat isi menu

public class WalkActivity extends AppCompatActivity {

    private ViewPager screenPager;
    introViewPagerAdapter introViewPagerAdapter1;
    TabLayout tabIndicator;
    Button btn_next;
    int position = 0;
    Button btnGetStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,
                WindowManager.LayoutParams.TYPE_STATUS_BAR);


        setContentView(R.layout.activity_walk);



            //hide bar

//            getSupportActionBar().hide();

        //variable
             btn_next = findViewById(R.id.btn_next);
             btnGetStarted = findViewById(R.id.btnGetStarted);
             tabIndicator = findViewById(R.id.tab_indicator);

          //next



            final List<ScreenItem> mList = new ArrayList<>();
            mList.add(new ScreenItem("Home","Menunjukan ada nya galeri dan juga aktivity yang menampung semua poto yang di simpan secara berkala sehingga membuat menarik",R.drawable.hs1));
            mList.add(new ScreenItem("Dialy Acivity","Merupakan bagian dari home dan untuk mengetahu semua kegiatan dalam aplikasi ini",R.drawable.contract));
            mList.add(new ScreenItem("Galeri","Memiliki gambar gambar yang terdapat di apliakasi ini",R.drawable.gallery));




        screenPager = findViewById(R.id.screenViewPager);
        introViewPagerAdapter1 = new introViewPagerAdapter(this, mList);
        screenPager.setAdapter(introViewPagerAdapter1);


        tabIndicator.setupWithViewPager(screenPager);

        //btn intent
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WalkActivity.this, BottomNavbar.class);
                startActivity(intent);
            }
        });



        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                position = screenPager.getCurrentItem();
                if (position < mList.size()) {

                    position++;
                    screenPager.setCurrentItem(position);
                }

                if (position == mList.size()) {

                    //TODO : show the GETSTARTED Button and hide the indicator and the next button



                    loadLastScreen();


                }

            }
        });



    }

    private void loadLastScreen() {

        btn_next.setVisibility(View.INVISIBLE);
        btnGetStarted.setVisibility(View.VISIBLE);
        tabIndicator.setVisibility(View.VISIBLE);






    }
}
