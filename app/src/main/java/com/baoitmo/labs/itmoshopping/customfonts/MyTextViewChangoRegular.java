package com.baoitmo.labs.itmoshopping.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


public class MyTextViewChangoRegular extends androidx.appcompat.widget.AppCompatTextView {

    public MyTextViewChangoRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextViewChangoRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewChangoRegular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Chango-Regular.ttf");
            setTypeface(tf);
        }
    }

}