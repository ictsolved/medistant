package com.sglabs.medistant.elements.blooddonationactivity;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

import com.sglabs.medistant.R;
import com.sglabs.medistant.fragments.DonateAvailPage;
import com.sglabs.medistant.fragments.DonateReqPage;

public class BloodViewPager extends ViewPager {
    public Adapter adapter;
    Integer[] titles;
    TabLayout tabs;
    BloodViewPager self = this;

    private int lastPageIndex = 0;

    public BloodViewPager(Context context) {
        this(context, null);
    }

    public BloodViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.setOffscreenPageLimit(1);

        titles = new Integer[]{R.string.donate_avail_title, R.string.donate_req_title};

        setupAdapter(((FragmentActivity) getContext()).getSupportFragmentManager());
    }

    private void setupTabs() {
        for (int i = 0; i < titles.length; i++) {
            if (titles[i] != null && tabs.getTabAt(i) != null) tabs.getTabAt(i).setText(titles[i]);
        }
    }

    public void setupAdapter(FragmentManager fragmentManager) {
        adapter = new Adapter(fragmentManager);

        this.setAdapter(adapter);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        tabs = (TabLayout) (((View) getParent()).findViewById(R.id.blood_view_pager_tabs));

        tabs.setupWithViewPager(this);

        setupTabs();

        this.setOnPageChangeListener(
                new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrollStateChanged(int state) {
                    }

                    @Override
                    public void onPageScrolled(
                            int position, float positionOffset, int positionOffsetPixels) {
                    }

                    @Override
                    public void onPageSelected(int position) {
                        Boolean wasSwipedLeft = position > lastPageIndex;
                        lastPageIndex = position;
                        switch (position) {
                            case 0:
                                ((DonateAvail)
                                        ((DonateAvailPage)
                                                BloodViewPager.this.adapter.instantiateItem(
                                                        BloodViewPager.this, position))
                                                .getView()
                                                .findViewById(R.id.donate_avail))
                                        .onPageVisible();
                                break;
                            case 1:
                                ((DonateReq)
                                        ((DonateReqPage)
                                                BloodViewPager.this.adapter.instantiateItem(
                                                        BloodViewPager.this, position))
                                                .getView()
                                                .findViewById(R.id.donate_req))
                                        .onPageVisible();
                                break;
                        }
                    }
                });
    }

    public class Adapter extends FragmentPagerAdapter {
        private final int NUM_ITEMS = 2;

        public Adapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new DonateAvailPage();
                case 1:
                    return new DonateReqPage();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }
    }
}
