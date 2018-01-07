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
import com.sglabs.medistant.elements.firstaidactivity.ScrollView1;

public class FirstAidActivity extends AppCompatActivity {
    public LinearLayout mMainLayout;

    public Toolbar appBar;

    public ScrollView1 scrollView1;

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

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

        setContentView(R.layout.first_aid);

        mMainLayout = (LinearLayout) findViewById(R.id.first_aid);

        this.setup();
    }

    public FirstAidActivity getContext() {
        return this;
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.parseColor("#FF00897B"));
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void setup() {
        appBar = (Toolbar) findViewById(R.id.app_bar);

        FirstAidActivity.this.setSupportActionBar(appBar);

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
                        FirstAidActivity activity = FirstAidActivity.this;
                        Intent transitionIntent = new Intent(activity, HomeActivity.class);
                        activity.startActivity(transitionIntent);
                    }
                });

        this.scrollView1 = (ScrollView1) findViewById(R.id.scroll_view1);
    }
}
