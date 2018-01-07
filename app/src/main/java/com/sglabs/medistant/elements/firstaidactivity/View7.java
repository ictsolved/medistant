package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class View7 extends PercentRelativeLayout {
    public AppCompatImageView imageView7;

    public AppCompatButton textButton6;

    public View7(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View7(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View7(Context context) {
        super(context);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView7 = (AppCompatImageView) findViewById(R.id.image_view7);

        textButton6 = (AppCompatButton) findViewById(R.id.text_button6);

        textButton6.setTransformationMethod(null);
    }
}
