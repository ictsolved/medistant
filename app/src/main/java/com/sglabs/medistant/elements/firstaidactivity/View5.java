package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class View5 extends PercentRelativeLayout {
    public AppCompatImageView imageView5;

    public AppCompatButton textButton4;

    public View5(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View5(Context context) {
        super(context);
    }

    public View5(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView5 = (AppCompatImageView) findViewById(R.id.image_view5);

        textButton4 = (AppCompatButton) findViewById(R.id.text_button4);

        textButton4.setTransformationMethod(null);
    }
}
