package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class StaticListTile8 extends PercentRelativeLayout {
    public View8 view8;

    public StaticListTile8(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public StaticListTile8(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StaticListTile8(Context context) {
        super(context);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.view8 = (View8) findViewById(R.id.view8);
    }
}
