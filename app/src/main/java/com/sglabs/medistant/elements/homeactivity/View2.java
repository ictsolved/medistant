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
import com.sglabs.medistant.activities.MainActivity;
import com.sglabs.medistant.activities.ReminderActivity;

public class View2 extends PercentRelativeLayout {
    public AppCompatButton textButton6;

    public AppCompatImageButton imageButton5;

    public View2(Context context) {
        super(context);
    }

    public View2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        textButton6 = (AppCompatButton) findViewById(R.id.text_button61);

        textButton6.setTransformationMethod(null);

        textButton6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HomeActivity activity = ((HomeActivity) getContext());
                        Intent transitionIntent = new Intent(activity, MainActivity.class);
                        activity.startActivity(transitionIntent);
                    }
                });

        imageButton5 = (AppCompatImageButton) findViewById(R.id.image_button5);

        imageButton5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view1) {
                        HomeActivity activity1 = ((HomeActivity) getContext());
                        Intent transitionIntent1 = new Intent(activity1, MainActivity.class);
                        activity1.startActivity(transitionIntent1);
                    }
                });
    }
}
