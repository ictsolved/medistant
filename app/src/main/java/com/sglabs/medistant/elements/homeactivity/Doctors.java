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
import com.sglabs.medistant.activities.lapitchat.UsersActivity;

public class Doctors extends PercentRelativeLayout {
    public AppCompatButton textButton4;

    public AppCompatImageButton imageButton7;

    public Doctors(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Doctors(Context context) {
        super(context);
    }

    public Doctors(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        textButton4 = (AppCompatButton) findViewById(R.id.text_button41);

        textButton4.setTransformationMethod(null);

        textButton4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HomeActivity activity = ((HomeActivity) getContext());
                        Intent transitionIntent = new Intent(activity, UsersActivity.class);
                        activity.startActivity(transitionIntent);
                    }
                });

        imageButton7 = (AppCompatImageButton) findViewById(R.id.image_button7);

        imageButton7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view1) {
                        HomeActivity activity1 = ((HomeActivity) getContext());
                        Intent transitionIntent1 = new Intent(activity1, UsersActivity.class);
                        activity1.startActivity(transitionIntent1);
                    }
                });
    }
}
