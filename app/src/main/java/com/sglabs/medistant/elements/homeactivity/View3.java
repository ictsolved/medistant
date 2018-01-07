package com.sglabs.medistant.elements.homeactivity;

import android.content.Context;
import android.content.Intent;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;

import com.sglabs.medistant.R;
import com.sglabs.medistant.activities.BloodDonationActivity;
import com.sglabs.medistant.activities.HomeActivity;

public class View3 extends PercentRelativeLayout {
    public AppCompatButton textButton2;

    public AppCompatImageButton imageButton2;

    public View3(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View3(Context context) {
        super(context);
    }

    public View3(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        textButton2 = (AppCompatButton) findViewById(R.id.text_button21);

        textButton2.setTransformationMethod(null);

        textButton2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HomeActivity activity = ((HomeActivity) getContext());
                        Intent transitionIntent = new Intent(activity, BloodDonationActivity.class);
                        activity.startActivity(transitionIntent);
                    }
                });

        imageButton2 = (AppCompatImageButton) findViewById(R.id.image_button2);

        imageButton2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view1) {
                        HomeActivity activity1 = ((HomeActivity) getContext());
                        Intent transitionIntent1 = new Intent(activity1, BloodDonationActivity.class);
                        activity1.startActivity(transitionIntent1);
                    }
                });
    }
}
