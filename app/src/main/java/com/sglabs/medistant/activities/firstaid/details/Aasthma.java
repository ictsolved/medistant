package com.sglabs.medistant.activities.firstaid.details;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sglabs.medistant.R;


/**
 * Created by rashad on 5/23/16.
 *
 */
public class Aasthma extends Fragment {

    View root;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.facts, container, false);

        return root;

    }

}
