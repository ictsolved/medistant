package com.sglabs.medistant.elements.helplineactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class StaticListTile6 extends PercentRelativeLayout {
    public View7 view7;

    public StaticListTile6(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StaticListTile6(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public StaticListTile6(Context context) {
        super(context);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.view7 = (View7) findViewById(R.id.view71);
    }
}
