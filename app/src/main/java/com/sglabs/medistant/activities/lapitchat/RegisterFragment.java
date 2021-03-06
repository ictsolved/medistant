package com.sglabs.medistant.activities.lapitchat;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.sglabs.medistant.R;
import com.sglabs.medistant.activities.donn.main.MainActivity;

import java.util.ArrayList;
import java.util.Locale;

import dmax.dialog.SpotsDialog;

/**
 * Created by rashad on 5/31/16.
 * .
 */
public class RegisterFragment extends Fragment {

    View root;
    Toolbar toolbar;
    Locale[] locale;
    Spinner spinner;
    Spinner bloodspinner;
    Button update;
    String country;
    String bloodlist;
    SharedPreferences spf;
    SharedPreferences.Editor edit;
    ArrayList<String> countries;
    ArrayList<String> bloods;
    ArrayAdapter<String> adapter;
    EditText name, email, phone, blood, facebook, password;
    String nameStr, emailStr, phoneStr, bloodStr, facebookStr, passwordStr;

    String mUserId;
    FirebaseAuth mFirebaseAuth;
    DatabaseReference mDatabase;
    FirebaseUser mFirebaseUser;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.user_prof_update, container, false);
        update = (Button) root.findViewById(R.id.update);
        name = (EditText) root.findViewById(R.id.editText);
        phone = (EditText) root.findViewById(R.id.editText3);
        facebook = (EditText) root.findViewById(R.id.editText5);
        bloodspinner = (Spinner) root.findViewById(R.id.bldtype);
        spinner = (Spinner) root.findViewById(R.id.spinner);

        setupSpinner();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

                int position = spinner.getSelectedItemPosition();

                if (!(position == 0) || !(position == 1)) {

                    country = countries.get(position);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }


        });

        bloodspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

                int position = bloodspinner.getSelectedItemPosition();

                if (!(position == 0) || !(position == 1)) {

                    bloodlist = bloods.get(position);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }


        });


        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nameStr = name.getText().toString();
                phoneStr = phone.getText().toString();
                facebookStr = facebook.getText().toString();

                if (nameStr.isEmpty() || phoneStr.isEmpty() || facebookStr.isEmpty()) {

                    Toast.makeText(getActivity(), "Fill All Information", Toast.LENGTH_LONG).show();


                } else {


                    final AlertDialog dialog = new SpotsDialog(getActivity(), "Updating...");
                    dialog.show();

                    mFirebaseAuth = FirebaseAuth.getInstance();

                    mFirebaseUser = mFirebaseAuth.getCurrentUser();
                    mUserId = mFirebaseUser.getUid();
                    mDatabase = FirebaseDatabase.getInstance().getReference();

                    mDatabase.child("Users").child(mUserId).child("name").setValue((name.getText().toString()));
                    mDatabase.child("Users").child(mUserId).child("phone").setValue((phone.getText().toString()));
                    mDatabase.child("Users").child(mUserId).child("facebook").setValue((facebook.getText().toString()));
                    mDatabase.child("Users").child(mUserId).child("blood").setValue((bloodlist));
                    mDatabase.child("Users").child(mUserId).child("city").setValue((country));
                    FirebaseMessaging.getInstance().subscribeToTopic("Ap");
                    FirebaseMessaging.getInstance().subscribeToTopic("Am");
                    FirebaseMessaging.getInstance().subscribeToTopic("Bp");
                    FirebaseMessaging.getInstance().subscribeToTopic("Bm");
                    FirebaseMessaging.getInstance().subscribeToTopic("Op");
                    FirebaseMessaging.getInstance().subscribeToTopic("Om");
                    FirebaseMessaging.getInstance().subscribeToTopic("ABp");
                    FirebaseMessaging.getInstance().subscribeToTopic("ABm");


                    Log.d("AndroidBash", "Updated");
                    Toast.makeText(getActivity(), "Updated", Toast.LENGTH_SHORT).show();
                    String token = FirebaseInstanceId.getInstance().getToken();
                    Log.d("AndroidBash", token);


                    dialog.dismiss();
                    startActivity(new Intent(getActivity(), SettingsActivity.class));
                    getActivity().finish();
                    save("code", "1");
                }

            }
        });


        return root;


    }


    ////////Methods/////////    ////////Methods/////////    ////////Methods////////

    public void setupSpinner() {

        setupCountriesList();

        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, countries);
        spinner.setAdapter(adapter);

        setupBloodsList();
        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, bloods);
        bloodspinner.setAdapter(adapter);


    }

    public void setupBloodsList() {

        locale = Locale.getAvailableLocales();
        bloods = new ArrayList<String>();

        bloods.add("Select Blood Type");
        bloods.add("O-");
        bloods.add("O+");
        bloods.add("A+");
        bloods.add("A-");
        bloods.add("B+");
        bloods.add("B-");
        bloods.add("AB+");
        bloods.add("AB-");

    }

    public void setupCountriesList() {

        locale = Locale.getAvailableLocales();
        countries = new ArrayList<String>();

        countries.add("Select City");
        countries.add("Kathmandu");
        countries.add("Bhaktapur");
        countries.add("Lalitpur");

    }

    public void save(String key, String value) {

        spf = PreferenceManager.getDefaultSharedPreferences(getActivity());
        edit = spf.edit();
        edit.putString(key, value);
        edit.commit();

    }

}



