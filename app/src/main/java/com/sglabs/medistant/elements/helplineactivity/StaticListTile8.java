package com.sglabs.medistant.elements.helplineactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class StaticListTile8 extends PercentRelativeLayout {
    public View9 view9;

    public StaticListTile8(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public StaticListTile8(Context context) {
        super(context);
    }

    public StaticListTile8(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.view9 = (View9) findViewById(R.id.view91);
    }
}
