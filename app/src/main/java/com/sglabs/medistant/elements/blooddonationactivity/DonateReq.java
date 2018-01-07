package com.sglabs.medistant.elements.blooddonationactivity;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.percent.PercentRelativeLayout;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class DonateReq extends PercentRelativeLayout {
    public FloatingActionButton floatingActionButton2;
    private FragmentManager fragmentManager;

    public DonateReq(Context context) {
        super(context);
    }

    public DonateReq(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DonateReq(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void onPageVisible() {
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.floating_action_button2);

        floatingActionButton2.setBackgroundTintList(
                ColorStateList.valueOf(Color.parseColor("#FF009688")));
    }
}
