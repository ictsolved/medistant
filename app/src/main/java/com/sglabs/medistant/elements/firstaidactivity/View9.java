package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class View9 extends PercentRelativeLayout {
    public AppCompatImageView imageView9;

    public AppCompatButton textButton8;

    public View9(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View9(Context context) {
        super(context);
    }

    public View9(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView9 = (AppCompatImageView) findViewById(R.id.image_view9);

        textButton8 = (AppCompatButton) findViewById(R.id.text_button8);

        textButton8.setTransformationMethod(null);
    }
}
