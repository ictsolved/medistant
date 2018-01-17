package com.sglabs.medistant.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import com.sglabs.medistant.R;
import com.sglabs.medistant.elements.appointmentactivity.ApptViewPager;
import com.sglabs.medistant.elements.appointmentactivity.HistoryPagerView;

public class HistoryPagerViewPage extends Fragment {
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
    super.onCreateView(inflater, container, bundle);

    View view = inflater.inflate(R.layout.history_pager_view_page, container, false);

    return view;
  }
}
