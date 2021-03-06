package com.sglabs.medistant.activities.donn.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sglabs.medistant.R;
import com.sglabs.medistant.activities.donn.needblood.GetBloodFragment;
import com.sglabs.medistant.activities.donn.needblood.ProfileFragment;


public class HomeFragment extends Fragment {

    View root;
    Toolbar toolbar;
    TextView joinText;
    CardView join, check, get;
    FragmentTransaction fragmentTransaction;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.blood_home, container, false);

        toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.setTitle("Blood Donation");

        join = (CardView) root.findViewById(R.id.join);
        check = (CardView) root.findViewById(R.id.check);
        get = (CardView) root.findViewById(R.id.get);

        joinText = (TextView) root.findViewById(R.id.text);

        joinText.setText("My Profile");


        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setCurrentFragment(new GetBloodFragment(), "Search or Request Blood");

            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setCurrentFragment(new QuizFragment(), "Donate Blood");
            }
        });

        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setCurrentFragment(new ProfileFragment(), "My Profile");

            }
        });

        return root;
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
