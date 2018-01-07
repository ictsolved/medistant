package com.sglabs.medistant.activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.support.percent.PercentRelativeLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.sglabs.medistant.R;
import com.sglabs.medistant.elements.appointmentactivity.ApptScroll;
import com.sglabs.medistant.elements.appointmentactivity.ApptViewPager;

public class AppointmentActivity extends AppCompatActivity {
    public LinearLayout mMainLayout;

    public PercentRelativeLayout _apptPending;

    public Toolbar appBar;

    public ApptScroll apptScroll;

    public ApptViewPager apptViewPager;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.appointment);

        mMainLayout = (LinearLayout) findViewById(R.id.appointment);

        Intent intent = getIntent();

        this._apptPending =
                intent.hasExtra("appt_pending")
                        ? (new Gson()
                        .fromJson(
                                intent.getStringExtra("appt_pending"),
                                android.support.percent.PercentRelativeLayout.class))
                        : (null);

        this.setup();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public AppointmentActivity getContext() {
        return this;
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor("#FF00897B"));
        }
    }

    private void setup() {
        appBar = (Toolbar) findViewById(R.id.app_bar1);

        AppointmentActivity.this.setSupportActionBar(appBar);

        for (int i = 0; i < appBar.getChildCount(); ++i) {
            View child = appBar.getChildAt(i);
            if (child instanceof TextView) {
                child.setBackgroundColor(Color.TRANSPARENT);
                break;
            }
        }

        appBar.setNavigationIcon(ContextCompat.getDrawable(getContext(), R.drawable.back_btn_ffffffff));

        appBar
                .getNavigationIcon()
                .mutate()
                .setColorFilter(Color.parseColor("#FFFFFFFF"), PorterDuff.Mode.SRC_ATOP);

        appBar.setNavigationOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AppointmentActivity activity = AppointmentActivity.this;
                        Intent transitionIntent = new Intent(activity, HomeActivity.class);
                        activity.startActivity(transitionIntent);

                    }
                });

        this.apptScroll = (ApptScroll) findViewById(R.id.appt_scroll);

        apptViewPager = (ApptViewPager) findViewById(R.id.appt_view_pager);
    }
}
