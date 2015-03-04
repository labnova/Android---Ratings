package com.example.android.materialtest.ratings;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;



public class MyLayout extends FrameLayout {
    public static final String TAG="Tag";
    Paint paint = null;

    public MyLayout(Context context, Paint paint) {
        super(context);

    }

    public MyLayout(Context context, AttributeSet attrs, Paint paint) {
        super(context, attrs);

    }

    public MyLayout(Context context, AttributeSet attrs, int defStyleAttr, Paint paint) {
        super(context, attrs, defStyleAttr);

    }

    //init();


}

   /* public void init() {
        paint = new Paint();
        paint.setAntiAlias(true);
        setWillNotDraw(false);
    }
*/


