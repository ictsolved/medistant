package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class View3 extends PercentRelativeLayout {
    public AppCompatImageView imageView3;

    public AppCompatButton textButton2;

    public View3(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View3(Context context) {
        super(context);
    }

    public View3(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView3 = (AppCompatImageView) findViewById(R.id.image_view3);

        textButton2 = (AppCompatButton) findViewById(R.id.text_button2);

        textButton2.setTransformationMethod(null);
    }
}
