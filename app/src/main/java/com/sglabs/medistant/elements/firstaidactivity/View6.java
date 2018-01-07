package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class View6 extends PercentRelativeLayout {
    public AppCompatImageView imageView6;

    public AppCompatButton textButton5;

    public View6(Context context) {
        super(context);
    }

    public View6(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View6(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView6 = (AppCompatImageView) findViewById(R.id.image_view6);

        textButton5 = (AppCompatButton) findViewById(R.id.text_button5);

        textButton5.setTransformationMethod(null);
    }
}
