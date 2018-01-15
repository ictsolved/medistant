package com.sglabs.medistant.elements.homeactivity;

import android.content.Context;
import android.content.Intent;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;

import com.sglabs.medistant.R;
import com.sglabs.medistant.activities.HomeActivity;
import com.sglabs.medistant.activities.bloodbank.MainActivity;

public class BloodDonation extends PercentRelativeLayout {
    public AppCompatButton textButton2;

    public AppCompatImageButton imageButton2;

    public BloodDonation(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public BloodDonation(Context context) {
        super(context);
    }

    public BloodDonation(Context context, AttributeSet attrs) {
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
                        Intent transitionIntent = new Intent(activity, com.sglabs.medistant.activities.donn.main.MainActivity.class);
                        activity.startActivity(transitionIntent);
                    }
                });

        imageButton2 = (AppCompatImageButton) findViewById(R.id.image_button2);

        imageButton2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view1) {
                        HomeActivity activity1 = ((HomeActivity) getContext());
                        Intent transitionIntent1 = new Intent(activity1, com.sglabs.medistant.activities.donn.main.MainActivity.class);
                        activity1.startActivity(transitionIntent1);
                    }
                });
    }
}
