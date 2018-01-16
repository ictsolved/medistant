package com.sglabs.medistant.activities.donn.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.sglabs.medistant.R;
import com.sglabs.medistant.activities.donn.fragments.HomeFragment;
import com.sglabs.medistant.activities.donn.needblood.GetBloodFragment;
import com.sglabs.medistant.activities.donn.needblood.ProfileFragment;
import com.sglabs.medistant.activities.donn.needblood.ScheduleFragment;

public class MainActivity extends AppCompatActivity {

    int id;

    String mUserId;
    Toolbar toolbar;
    MenuItem nav_donor;
    DrawerLayout drawer;
    FirebaseUser mFirebaseUser;
    FirebaseAuth mFirebaseAuth;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;
    FragmentTransaction fragmentTransaction;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blood_main);

        setupToolbar();

        if (getIntent().getExtras() != null) {

            for (String key : getIntent().getExtras().keySet()) {

                String value = getIntent().getExtras().getString(key);

                if (key.equals("AnotherActivity")) {

                    Toast.makeText(this, value, Toast.LENGTH_LONG).show();

                }

            }
        }

        setCurrentFragment(new HomeFragment(), "Blood Donation");

        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();

        if (mFirebaseUser == null) {

            startActivity(new Intent(this, LoginSignUp.class));
            finish();

        } else {

            mUserId = mFirebaseUser.getUid();

        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {

            if (getSupportFragmentManager().findFragmentById(R.id.mainFrame) instanceof HomeFragment) {

                finish();
            }

            else {
                getSupportFragmentManager().popBackStack();
            }

        }
    }


    public void setCurrentFragment(Fragment newFragment, String title) {

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
        fragmentTransaction.replace(R.id.mainFrame, newFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        toolbar.setTitle(title);

    }


    public void setupToolbar() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setTitle("Blood Donation");

    }

}
