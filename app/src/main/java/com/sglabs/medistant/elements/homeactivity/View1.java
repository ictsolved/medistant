package com.sglabs.medistant.elements.homeactivity;

import android.support.percent.PercentRelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageButton;
import com.sglabs.medistant.R;
import android.view.View;
import android.content.Intent;
import com.sglabs.medistant.activities.AppointmentActivity;
import com.sglabs.medistant.activities.HomeActivity;

public class View1 extends PercentRelativeLayout {
  public AppCompatButton textButton5;

  public AppCompatImageButton imageButton1;

  public View1(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public View1(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  public View1(Context context) {
    super(context);
  }

  @Override
  public void onFinishInflate() {
    super.onFinishInflate();

    textButton5 = (AppCompatButton) findViewById(R.id.text_button51);

    textButton5.setTransformationMethod(null);

    textButton5.setOnClickListener(
        new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            HomeActivity activity = ((HomeActivity) getContext());
            Intent transitionIntent = new Intent(activity, AppointmentActivity.class);
            activity.startActivity(transitionIntent);
            activity.overridePendingTransition(
                android.R.anim.slide_in_left, android.R.anim.slide_out_right);
          }
        });

    imageButton1 = (AppCompatImageButton) findViewById(R.id.image_button1);

    imageButton1.setOnClickListener(
        new View.OnClickListener() {
          @Override
          public void onClick(View view1) {
            HomeActivity activity1 = ((HomeActivity) getContext());
            Intent transitionIntent1 = new Intent(activity1, AppointmentActivity.class);
            activity1.startActivity(transitionIntent1);
            activity1.overridePendingTransition(
                android.R.anim.slide_in_left, android.R.anim.slide_out_right);
          }
        });
  }
}
