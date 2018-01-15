package com.sglabs.medistant.elements.homeactivity;

import android.content.Context;
import android.content.Intent;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;

import com.sglabs.medistant.R;
import com.sglabs.medistant.activities.HealthPlacesActivity;
import com.sglabs.medistant.activities.HomeActivity;

public class HealthPlaces extends PercentRelativeLayout {
    public AppCompatButton textButton1;

    public AppCompatImageButton imageButton6;

    public HealthPlaces(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public HealthPlaces(Context context) {
        super(context);
    }

    public HealthPlaces(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        textButton1 = (AppCompatButton) findViewById(R.id.text_button11);

        textButton1.setTransformationMethod(null);

        textButton1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HomeActivity activity = ((HomeActivity) getContext());
                        Intent transitionIntent = new Intent(activity, HealthPlacesActivity.class);
                        activity.startActivity(transitionIntent);
                    }
                });

        imageButton6 = (AppCompatImageButton) findViewById(R.id.image_button6);

        imageButton6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view1) {
                        HomeActivity activity1 = ((HomeActivity) getContext());
                        Intent transitionIntent1 = new Intent(activity1, HealthPlacesActivity.class);
                        activity1.startActivity(transitionIntent1);
                    }
                });
    }
}
