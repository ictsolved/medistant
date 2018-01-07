package com.sglabs.medistant.elements.helplineactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class StaticListTile1 extends PercentRelativeLayout {
    public View2 view2;

    public StaticListTile1(Context context) {
        super(context);
    }

    public StaticListTile1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StaticListTile1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.view2 = (View2) findViewById(R.id.view21);
    }
}
