package com.sglabs.medistant.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sglabs.medistant.R;

public class DonateAvailPage extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        super.onCreateView(inflater, container, bundle);

        View view = inflater.inflate(R.layout.donate_avail_page, container, false);

        return view;
    }
}
