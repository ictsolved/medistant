package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class StaticListTile9 extends PercentRelativeLayout {
    public View9 view9;

    public StaticListTile9(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StaticListTile9(Context context) {
        super(context);
    }

    public StaticListTile9(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.view9 = (View9) findViewById(R.id.view9);
    }
}
