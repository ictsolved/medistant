package com.sglabs.medistant.elements.homeactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class Doctors extends PercentRelativeLayout {
    public AppCompatButton textButton4;

    public AppCompatImageButton imageButton7;

    public Doctors(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Doctors(Context context) {
        super(context);
    }

    public Doctors(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        textButton4 = (AppCompatButton) findViewById(R.id.text_button41);

        textButton4.setTransformationMethod(null);

        imageButton7 = (AppCompatImageButton) findViewById(R.id.image_button7);
    }
}
