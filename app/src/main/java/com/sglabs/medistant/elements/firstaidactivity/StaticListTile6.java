package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class StaticListTile6 extends PercentRelativeLayout {
    public View6 view6;

    public StaticListTile6(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public StaticListTile6(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StaticListTile6(Context context) {
        super(context);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.view6 = (View6) findViewById(R.id.view6);
    }
}
