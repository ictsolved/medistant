package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class View1 extends PercentRelativeLayout {
    public AppCompatImageView imageView1;

    public AppCompatButton textButton1;

    public View1(Context context) {
        super(context);
    }

    public View1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView1 = (AppCompatImageView) findViewById(R.id.image_view1);

        textButton1 = (AppCompatButton) findViewById(R.id.text_button1);

        textButton1.setTransformationMethod(null);
    }
}
