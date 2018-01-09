package com.sglabs.medistant.elements.homeactivity;

import android.content.Context;
import android.content.Intent;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;

import com.sglabs.medistant.R;
import com.sglabs.medistant.activities.HelplineActivity;
import com.sglabs.medistant.activities.HomeActivity;

public class Helpline extends PercentRelativeLayout {
    public AppCompatButton textButton7;

    public AppCompatImageButton imageButton8;

    public Helpline(Context context) {
        super(context);
    }

    public Helpline(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public Helpline(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        textButton7 = (AppCompatButton) findViewById(R.id.text_button71);

        textButton7.setTransformationMethod(null);

        textButton7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HomeActivity activity = ((HomeActivity) getContext());
                        Intent transitionIntent = new Intent(activity, HelplineActivity.class);
                        activity.startActivity(transitionIntent);
                    }
                });

        imageButton8 = (AppCompatImageButton) findViewById(R.id.image_button8);

        imageButton8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view1) {
                        HomeActivity activity1 = ((HomeActivity) getContext());
                        Intent transitionIntent1 = new Intent(activity1, HelplineActivity.class);
                        activity1.startActivity(transitionIntent1);
                    }
                });
    }
}
