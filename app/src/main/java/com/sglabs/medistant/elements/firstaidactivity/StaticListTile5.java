package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class StaticListTile5 extends PercentRelativeLayout {
    public View5 view5;

    public StaticListTile5(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public StaticListTile5(Context context) {
        super(context);
    }

    public StaticListTile5(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.view5 = (View5) findViewById(R.id.view5);
    }
}
