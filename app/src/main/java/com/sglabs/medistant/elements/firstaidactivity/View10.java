package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class View10 extends PercentRelativeLayout {
    public AppCompatImageView imageView10;

    public AppCompatButton textButton9;

    public View10(Context context) {
        super(context);
    }

    public View10(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View10(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView10 = (AppCompatImageView) findViewById(R.id.image_view10);

        textButton9 = (AppCompatButton) findViewById(R.id.text_button9);

        textButton9.setTransformationMethod(null);
    }
}
