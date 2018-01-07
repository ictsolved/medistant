package com.sglabs.medistant.elements.homeactivity;

import android.content.Context;
import android.content.Intent;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;

import com.sglabs.medistant.R;
import com.sglabs.medistant.activities.FirstAidActivity;
import com.sglabs.medistant.activities.HomeActivity;

public class View6 extends PercentRelativeLayout {
    public AppCompatButton textButton8;

    public AppCompatImageButton imageButton4;

    public View6(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View6(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View6(Context context) {
        super(context);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        textButton8 = (AppCompatButton) findViewById(R.id.text_button81);

        textButton8.setTransformationMethod(null);

        textButton8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HomeActivity activity = ((HomeActivity) getContext());
                        Intent transitionIntent = new Intent(activity, FirstAidActivity.class);
                        activity.startActivity(transitionIntent);
                    }
                });

        imageButton4 = (AppCompatImageButton) findViewById(R.id.image_button4);

        imageButton4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view1) {
                        HomeActivity activity1 = ((HomeActivity) getContext());
                        Intent transitionIntent1 = new Intent(activity1, FirstAidActivity.class);
                        activity1.startActivity(transitionIntent1);
                    }
                });
    }
}
