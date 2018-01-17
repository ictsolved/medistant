package com.sglabs.medistant.elements.homeactivity;

import android.content.Context;
import android.content.Intent;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;

import com.sglabs.medistant.R;
import com.sglabs.medistant.activities.AppointmentActivity;
import com.sglabs.medistant.activities.HomeActivity;
/*import com.sglabs.medistant.activities.MainActivityAppointment;*/

public class Appointment extends PercentRelativeLayout {
    public AppCompatButton textButton5;

    public AppCompatImageButton imageButton1;

    public Appointment(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Appointment(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public Appointment(Context context) {
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
                    }
                });
    }
}
