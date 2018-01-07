package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class StaticListTile2 extends PercentRelativeLayout {
    public View2 view2;

    public StaticListTile2(Context context) {
        super(context);
    }

    public StaticListTile2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public StaticListTile2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.view2 = (View2) findViewById(R.id.view2);
    }
}
