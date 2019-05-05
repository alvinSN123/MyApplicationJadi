 package com.example.myapplication;

import android.content.ClipData;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Gallery;


//alvin satria nugraha
 // 10116064

 // tanggal 27 - 1 menentukan disign
 //tanggal 29 - 2 membuat navigation bar menu
 //tanggal 3 mei 2019 membuat Walkthrougt
 // tanggal 4 mei 2019 membuat reycle view
 // tanggal 5 mei 2019 membuat isi menu

 public class BottomNavbar extends AppCompatActivity {


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_bottom_navbar);


         BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottom_navigator);
         bottomNav.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) navListener);

         getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();

     }

     private BottomNavigationView.OnNavigationItemSelectedListener navListener =
             new BottomNavigationView.OnNavigationItemSelectedListener() {
                 @Override
                 public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                     Fragment SelectFragment = null;

                     switch (menuItem.getItemId()) {
                         case R.id.nav_home:
                             SelectFragment = new HomeFragment();
                             break;

                         case R.id.nav_activity:
                             SelectFragment = new DialyFragment();
                             break;

                         case R.id.nav_gallery:
                             SelectFragment = new GalleryFragment();
                             break;

                         case R.id.nav_musik:
                             SelectFragment = new MusikFragment();
                             break;

                         case R.id.nav_profile:
                             SelectFragment = new ProfileFragment();
                             break;

                     }

                     getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                             SelectFragment).commit();



                     return true;

                 }

             };
 }
