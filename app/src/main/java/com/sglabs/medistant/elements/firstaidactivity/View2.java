package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class View2 extends PercentRelativeLayout {
    public AppCompatImageView imageView2;

    public AppCompatButton textButton26;

    public View2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View2(Context context) {
        super(context);
    }

    public View2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView2 = (AppCompatImageView) findViewById(R.id.image_view2);

        textButton26 = (AppCompatButton) findViewById(R.id.text_button26);

        textButton26.setTransformationMethod(null);
    }
}
