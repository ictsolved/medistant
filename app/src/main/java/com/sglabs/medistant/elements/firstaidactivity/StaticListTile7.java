package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class StaticListTile7 extends PercentRelativeLayout {
    public View7 view7;

    public StaticListTile7(Context context) {
        super(context);
    }

    public StaticListTile7(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public StaticListTile7(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.view7 = (View7) findViewById(R.id.view7);
    }
}
