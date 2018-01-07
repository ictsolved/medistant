package com.sglabs.medistant.elements.helplineactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class StaticListTile5 extends PercentRelativeLayout {
    public View6 view6;

    public StaticListTile5(Context context) {
        super(context);
    }

    public StaticListTile5(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StaticListTile5(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.view6 = (View6) findViewById(R.id.view61);
    }
}
