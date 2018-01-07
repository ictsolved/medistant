package com.sglabs.medistant.elements.blooddonationactivity;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;

public class DonateAvail extends PercentRelativeLayout {
    private FragmentManager fragmentManager;

    public DonateAvail(Context context) {
        super(context);
    }

    public DonateAvail(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DonateAvail(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void onPageVisible() {
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }
}
