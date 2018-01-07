package com.sglabs.medistant.elements.homeactivity;

import android.content.Context;
import android.content.Intent;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;

import com.sglabs.medistant.R;
import com.sglabs.medistant.activities.AccountActivity;
import com.sglabs.medistant.activities.HomeActivity;

public class View5 extends PercentRelativeLayout {
    public AppCompatButton textButton3;

    public AppCompatImageButton imageButton3;

    public View5(Context context) {
        super(context);
    }

    public View5(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View5(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        textButton3 = (AppCompatButton) findViewById(R.id.text_button31);

        textButton3.setTransformationMethod(null);

        textButton3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HomeActivity activity = ((HomeActivity) getContext());
                        Intent transitionIntent = new Intent(activity, AccountActivity.class);
                        activity.startActivity(transitionIntent);
                    }
                });

        imageButton3 = (AppCompatImageButton) findViewById(R.id.image_button3);

        imageButton3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view1) {
                        HomeActivity activity1 = ((HomeActivity) getContext());
                        Intent transitionIntent1 = new Intent(activity1, AccountActivity.class);
                        activity1.startActivity(transitionIntent1);
                    }
                });
    }
}
