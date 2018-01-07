package com.sglabs.medistant.elements.helplineactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class StaticListTile2 extends PercentRelativeLayout {
    public View3 view3;

    public StaticListTile2(Context context) {
        super(context);
    }

    public StaticListTile2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StaticListTile2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.view3 = (View3) findViewById(R.id.view31);
    }
}
