package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class View4 extends PercentRelativeLayout {
    public AppCompatImageView imageView4;

    public AppCompatButton textButton3;

    public View4(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View4(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View4(Context context) {
        super(context);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView4 = (AppCompatImageView) findViewById(R.id.image_view4);

        textButton3 = (AppCompatButton) findViewById(R.id.text_button3);

        textButton3.setTransformationMethod(null);
    }
}
