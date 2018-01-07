package com.sglabs.medistant.elements.helplineactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class StaticListTile3 extends PercentRelativeLayout {
    public View4 view4;

    public StaticListTile3(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StaticListTile3(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public StaticListTile3(Context context) {
        super(context);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.view4 = (View4) findViewById(R.id.view41);
    }
}
