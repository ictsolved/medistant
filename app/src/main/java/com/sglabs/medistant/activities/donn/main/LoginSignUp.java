package com.sglabs.medistant.activities.donn.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.sglabs.medistant.R;
import com.sglabs.medistant.activities.donn.needblood.RegisterWelcomeFragment;

public class LoginSignUp extends AppCompatActivity {

    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blood_content_main);
        setCurrentFragment(new RegisterWelcomeFragment());

    }


    public void setCurrentFragment(Fragment newFragment) {

        fragmentTransaction = getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.mainFrame, newFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();


    }


}
