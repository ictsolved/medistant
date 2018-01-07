package com.sglabs.medistant.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.sglabs.medistant.R;


public class Splash extends AppCompatActivity {

    private TextView it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        it = (TextView) findViewById(R.id.appname);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.home_anim);
        it.startAnimation(myanim);
        final Intent i = new Intent(this, SlideActivity.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(1050);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();

    }
}
