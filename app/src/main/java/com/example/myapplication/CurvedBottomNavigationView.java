package com.example.myapplication;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.support.design.widget.BottomNavigationView;
import android.util.AttributeSet;

import java.nio.file.Path;

//alvin satria nugraha
// 10116064

// tanggal 27 - 1 menentukan disign
//tanggal 29 - 2 membuat navigation bar menu
//tanggal 3 mei 2019 membuat Walkthrougt
// tanggal 4 mei 2019 membuat reycle view
// tanggal 5 mei 2019 membuat isi menu

public class CurvedBottomNavigationView extends BottomNavigationView {

    //deklarasi
     private Path mPath;
     private Paint mPaint;

     public final int CURVE_CIRCLE_RADIUS = 90;

     public Point mFirstCurveStartPoint = new Point();
     public Point mFirstCurveEndPoint = new Point();
     public Point mFirstCurveControlPoint1 = new Point();
     public Point mFirstCurveControlPoint2 = new Point();

    public Point mSecondCurveStartPoint = new Point();
    public Point mSecondCurveEndPoint = new Point();
    public Point mSecondCurveControlPoint1 = new Point();
    public Point mSecondCurveControlPoint2 = new Point();


    public int mNavigationBarWidth,getmNavigationBarHeight;







    public CurvedBottomNavigationView(Context context) {
        super(context);
        initView();
    }

    public CurvedBottomNavigationView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public CurvedBottomNavigationView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
    }
}
