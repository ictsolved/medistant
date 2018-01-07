package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class View8 extends PercentRelativeLayout {
    public AppCompatImageView imageView8;

    public AppCompatButton textButton7;

    public View8(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View8(Context context) {
        super(context);
    }

    public View8(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView8 = (AppCompatImageView) findViewById(R.id.image_view8);

        textButton7 = (AppCompatButton) findViewById(R.id.text_button7);

        textButton7.setTransformationMethod(null);
    }
}
