package com.sglabs.medistant.activities.donn.needblood;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.sglabs.medistant.R;

import com.ontbee.legacyforks.cn.pedant.SweetAlert.SweetAlertDialog;
import dmax.dialog.SpotsDialog;

import com.sglabs.medistant.activities.donn.fragments.RegisterFragment;

/**
 * .
 * Created by rashad on 5/31/16.
 * .
 * .
 */


public class ProfileFragment extends Fragment {

    FirebaseAuth mFirebaseAuth;
    Button edit;
    TextView name, email, phone, blood, facebook, country;

    String mUserId;
    FirebaseUser mFirebaseUser;

    FragmentTransaction fragmentTransaction;
    Toolbar toolbar;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.blood_user_profile, container, false);
        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.setTitle("My Profile");


        name = (TextView) root.findViewById(R.id.name);
        email = (TextView) root.findViewById(R.id.email);
        country = (TextView) root.findViewById(R.id.country);
        phone = (TextView) root.findViewById(R.id.phone);
        facebook = (TextView) root.findViewById(R.id.facebook);
        blood = (TextView) root.findViewById(R.id.blood);

        edit = (Button) root.findViewById(R.id.edit);

        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        mUserId = mFirebaseUser.getUid();

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();

        final AlertDialog dialog = new SpotsDialog(getActivity(), "Loading..");

        dialog.show();
        mDatabase.child("Users").child(mUserId).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                name.setText("" + dataSnapshot.child("name").getValue());
                email.setText("Email : " + dataSnapshot.child("email").getValue());
                facebook.setText("Facebook : " + dataSnapshot.child("facebook").getValue());
                country.setText("City : " + dataSnapshot.child("city").getValue());
                phone.setText("Phone : " + dataSnapshot.child("phone").getValue());
                blood.setText("Blood Type : " + dataSnapshot.child("blood").getValue());

                save("email", "" + dataSnapshot.child("email").getValue());
                save("phone", "" + dataSnapshot.child("phone").getValue());
                save("facebook", "" + dataSnapshot.child("facebook").getValue());
                save("name", "" + dataSnapshot.child("name").getValue());

                dialog.dismiss();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                                setCurrentFragment(new RegisterFragment(), "Edit Details");

            }
        });


        return root;

    }

    public void save(String key, String value) {

        SharedPreferences spf = PreferenceManager.getDefaultSharedPreferences(getActivity());
        SharedPreferences.Editor edit = spf.edit();
        edit.putString(key, value);
        edit.commit();

    }

    public void setCurrentFragment(Fragment newFragment, String title) {

        toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);

        fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.mainFrame, newFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        toolbar.setTitle(title);

    }

}
