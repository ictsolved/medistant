package com.sglabs.medistant.elements.helplineactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class StaticListTile9 extends PercentRelativeLayout {
    public View10 view10;

    public StaticListTile9(Context context) {
        super(context);
    }

    public StaticListTile9(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StaticListTile9(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.view10 = (View10) findViewById(R.id.view101);
    }
}
