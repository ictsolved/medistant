package com.sglabs.medistant.elements.helplineactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class ListPolice extends PercentRelativeLayout {
    public View1 view1;

    public ListPolice(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ListPolice(Context context) {
        super(context);
    }

    public ListPolice(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.view1 = (View1) findViewById(R.id.view11);
    }
}
