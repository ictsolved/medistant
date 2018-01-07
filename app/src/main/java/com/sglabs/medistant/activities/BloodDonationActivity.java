package com.sglabs.medistant.activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sglabs.medistant.R;
import com.sglabs.medistant.elements.blooddonationactivity.BloodScroll;
import com.sglabs.medistant.elements.blooddonationactivity.BloodViewPager;

public class BloodDonationActivity extends AppCompatActivity {
    public LinearLayout mMainLayout;

    public Toolbar appBar;

    public BloodScroll bloodScroll;

    public BloodViewPager bloodViewPager;

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.blood_donation);

        mMainLayout = (LinearLayout) findViewById(R.id.blood_donation);

        this.setup();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor("#FF00897B"));
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public BloodDonationActivity getContext() {
        return this;
    }

    private void setup() {
        appBar = (Toolbar) findViewById(R.id.app_bar7);

        BloodDonationActivity.this.setSupportActionBar(appBar);

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
                        BloodDonationActivity activity = BloodDonationActivity.this;
                        Intent transitionIntent = new Intent(activity, HomeActivity.class);
                        activity.startActivity(transitionIntent);

                    }
                });

        this.bloodScroll = (BloodScroll) findViewById(R.id.blood_scroll);

        bloodViewPager = (BloodViewPager) findViewById(R.id.blood_view_pager);
    }
}
