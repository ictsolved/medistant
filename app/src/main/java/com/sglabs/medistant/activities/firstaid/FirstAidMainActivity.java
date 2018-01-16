package com.sglabs.medistant.activities.firstaid;

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
import com.sglabs.medistant.activities.firstaid.FirstAidHomeFragment;
import com.sglabs.medistant.activities.firstaid.details.Aasthma;
import com.sglabs.medistant.activities.firstaid.details.Panic;
import com.sglabs.medistant.activities.firstaid.details.Stroke;
import com.sglabs.medistant.activities.firstaid.details.Attack;

public class FirstAidMainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        setContentView(R.layout.firstaid_main);

        setupToolbar();
        setupNavigationActivity();
        loadPreferences();

        if (getIntent().getExtras() != null) {

            for (String key : getIntent().getExtras().keySet()) {

                String value = getIntent().getExtras().getString(key);

                if (key.equals("AnotherActivity")) {

                    Toast.makeText(this, value, Toast.LENGTH_LONG).show();

                }

            }
        }

        setCurrentFragment(new FirstAidHomeFragment(), "First Aid");

        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();

    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        id = item.getItemId();
        navigationView.getMenu().findItem(R.id.home).setChecked(false);


        switch (id) {

            case R.id.home:

                setCurrentFragment(new Aasthma(), "Facts");

                break;


            case R.id.donor:


                setCurrentFragment(new Panic(), "Types");


                break;

            case R.id.get:

                setCurrentFragment(new Stroke(), "Info");

                break;

            case R.id.bloodsched:

                setCurrentFragment(new Attack(), "Reason");

                break;


        }

        drawer.closeDrawer(GravityCompat.START);

        return true;
    }


    public void setCurrentFragment(Fragment newFragment, String title) {

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_left);
        fragmentTransaction.replace(R.id.mainFrame, newFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        toolbar.setTitle(title);

    }


    public void loadPreferences() {

        nav_donor = navigationView.getMenu().findItem(R.id.donor);
        nav_donor.setTitle("My Profile");

    }


    public void setupNavigationActivity() {

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getMenu().findItem(R.id.home).setChecked(true);

    }


    public void setupToolbar() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setTitle("First Aid");

    }

}
