package com.example.myapplication;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    //alvin satria nugraha
    // 10116064

    // tanggal 27 - 1 menentukan disign
    //tanggal 29 - 2 membuat navigation bar menu
    //tanggal 3 mei 2019 membuat Walkthrougt
    // tanggal 4 mei 2019 membuat reycle view
    // tanggal 5 mei 2019 membuat isi menu


    TextView ivLogo, ivSubtitle, ivbtn;
    ImageView ivSplash;
    Animation smalltobig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);



        ivLogo = (TextView) findViewById(R.id.ivLogo);
        ivSubtitle = (TextView) findViewById(R.id.ivSubtitle);
        ivbtn = (TextView) findViewById(R.id.ivbtn);




        ivbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,WalkActivity.class);
                startActivity(intent);
            }
        });






        ivSplash = (ImageView) findViewById(R.id.ivSplash);

        ivSplash.startAnimation(smalltobig);

        ivLogo.setTranslationX(400);
        ivSubtitle.setTranslationX(400);
        ivbtn.setTranslationX(400);

        ivLogo.setAlpha(0);
        ivSubtitle.setAlpha(0);
        ivbtn.setAlpha(0);

        ivLogo.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        ivSubtitle.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        ivbtn.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(900).start();


    }
}
