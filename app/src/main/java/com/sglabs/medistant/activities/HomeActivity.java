package com.sglabs.medistant.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ServerValue;
import com.sglabs.medistant.R;
import com.sglabs.medistant.activities.lapitchat.MainActivity;
import com.sglabs.medistant.activities.lapitchat.SettingsActivity;
import com.sglabs.medistant.activities.lapitchat.StartActivity;
import com.sglabs.medistant.activities.lapitchat.UsersActivity;
import com.sglabs.medistant.elements.homeactivity.Appointment;
import com.sglabs.medistant.elements.homeactivity.BloodDonation;
import com.sglabs.medistant.elements.homeactivity.Chat;
import com.sglabs.medistant.elements.homeactivity.Doctors;
import com.sglabs.medistant.elements.homeactivity.FirstAid;
import com.sglabs.medistant.elements.homeactivity.HealthPlaces;
import com.sglabs.medistant.elements.homeactivity.Helpline;
import com.sglabs.medistant.elements.homeactivity.Reminder;

public class HomeActivity extends AppCompatActivity {
    public static final String ANONYMOUS = "anonymous";
    public static final String MESSAGES_CHILD = "messages";
    private static final String TAG = "ChatActivity";
    private static final int REQUEST_INVITE = 1;
    private static final int REQUEST_IMAGE = 2;
    private static final String LOADING_IMAGE_URL = "https://www.google.com/images/spin-32.gif";
    public LinearLayout mMainLayout;
    public Appointment view1;
    public BloodDonation view3;
    public Doctors view4;
    public Chat view5;
    public Reminder view2;
    public HealthPlaces view7;
    public FirstAid view6;
    public Helpline view8;
    boolean doubleBackToExitPressedOnce = false;
    private FirebaseAuth mFirebaseAuth;
    private GoogleApiClient mGoogleApiClient;
    private FirebaseUser mFirebaseUser;
    private String mUsername;
    private String mPhotoUrl;
    private DatabaseReference mFirebaseDatabaseReference;
    private FirebaseAnalytics mFirebaseAnalytics;
    private SharedPreferences mSharedPreferences;
    private FirebaseAuth mAuth;
    private DatabaseReference mUserRef;


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
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.medistant_home);

        mAuth = FirebaseAuth.getInstance();

        if (mAuth.getCurrentUser() != null) {


            mUserRef = FirebaseDatabase.getInstance().getReference().child("Users").child(mAuth.getCurrentUser().getUid());

        }

        mMainLayout = (LinearLayout) findViewById(R.id.home);

        this.setup();
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();

        if (currentUser == null) {

            sendToStart();

        } else {

            mUserRef.child("online").setValue("true");

        }

    }

    private void sendToStart() {

        Intent startIntent = new Intent(HomeActivity.this, StartActivity.class);
        startActivity(startIntent);
        finish();

    }

    public HomeActivity getContext() {
        return this;
    }

    private void setup() {

        this.view1 = (Appointment) findViewById(R.id.view12);

        this.view3 = (BloodDonation) findViewById(R.id.view32);

        this.view4 = (Doctors) findViewById(R.id.view42);

        this.view5 = (Chat) findViewById(R.id.view52);

        this.view2 = (Reminder) findViewById(R.id.view22);

        this.view7 = (HealthPlaces) findViewById(R.id.view72);

        this.view6 = (FirstAid) findViewById(R.id.view62);

        this.view8 = (Helpline) findViewById(R.id.view82);
    }

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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == R.id.main_settings_btn) {

            Intent settingsIntent = new Intent(HomeActivity.this, SettingsActivity.class);
            startActivity(settingsIntent);

        }

        return true;
    }


}
