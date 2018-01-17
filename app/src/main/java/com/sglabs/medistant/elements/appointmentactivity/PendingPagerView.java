package com.sglabs.medistant.elements.appointmentactivity;

import android.support.percent.PercentRelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.FloatingActionButton;
import com.sglabs.medistant.R;
import android.content.res.ColorStateList;
import android.graphics.Color;

public class PendingPagerView extends PercentRelativeLayout {
  private FragmentManager fragmentManager;

  public FloatingActionButton floatingActionButton1;

  public PendingPagerView(Context context) {
    super(context);
  }

  public PendingPagerView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  public PendingPagerView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public void onPageVisible() {}

  @Override
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();

    floatingActionButton1 = (FloatingActionButton) findViewById(R.id.floating_action_button11);

    floatingActionButton1.setBackgroundTintList(
        ColorStateList.valueOf(Color.parseColor("#FF009688")));
  }
}
