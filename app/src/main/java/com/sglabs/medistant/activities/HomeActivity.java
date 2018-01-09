package com.sglabs.medistant.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;

import com.sglabs.medistant.R;
import com.sglabs.medistant.elements.homeactivity.View1;
import com.sglabs.medistant.elements.homeactivity.View2;
import com.sglabs.medistant.elements.homeactivity.View3;
import com.sglabs.medistant.elements.homeactivity.View4;
import com.sglabs.medistant.elements.homeactivity.View5;
import com.sglabs.medistant.elements.homeactivity.View6;
import com.sglabs.medistant.elements.homeactivity.View7;
import com.sglabs.medistant.elements.homeactivity.View8;

public class HomeActivity extends AppCompatActivity {
    public LinearLayout mMainLayout;

    public Toolbar appBar;

    public View1 view1;

    public View3 view3;

    public View4 view4;

    public View5 view5;

    public View2 view2;

    public View7 view7;

    public View6 view6;

    public View8 view8;

    @Override
    protected void onResume() {
        super.onResume();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor("#FF00897B"));
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home);

        mMainLayout = (LinearLayout) findViewById(R.id.home);

        this.setup();
    }

    public HomeActivity getContext() {
        return this;
    }

    private void setup() {
        appBar = (Toolbar) findViewById(R.id.app_bar3);

        HomeActivity.this.setSupportActionBar(appBar);

        for (int i = 0; i < appBar.getChildCount(); ++i) {
            View child = appBar.getChildAt(i);
            if (child instanceof TextView) {
                child.setBackgroundColor(Color.TRANSPARENT);
                break;
            }
        }

        this.view1 = (View1) findViewById(R.id.view12);

        this.view3 = (View3) findViewById(R.id.view32);

        this.view4 = (View4) findViewById(R.id.view42);

        this.view5 = (View5) findViewById(R.id.view52);

        this.view2 = (View2) findViewById(R.id.view22);

        this.view7 = (View7) findViewById(R.id.view72);

        this.view6 = (View6) findViewById(R.id.view62);

        this.view8 = (View8) findViewById(R.id.view82);
    }

    boolean doubleBackToExitPressedOnce = false;
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

}
