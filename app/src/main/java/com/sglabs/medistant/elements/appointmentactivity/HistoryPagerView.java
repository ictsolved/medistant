package com.sglabs.medistant.elements.appointmentactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;

public class HistoryPagerView extends PercentRelativeLayout {
    private FragmentManager fragmentManager;

    public HistoryPagerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public HistoryPagerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HistoryPagerView(Context context) {
        super(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onPageVisible() {
    }
}
