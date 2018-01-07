package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class StaticListTile4 extends PercentRelativeLayout {
    public View4 view4;

    public StaticListTile4(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StaticListTile4(Context context) {
        super(context);
    }

    public StaticListTile4(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.view4 = (View4) findViewById(R.id.view4);
    }
}
