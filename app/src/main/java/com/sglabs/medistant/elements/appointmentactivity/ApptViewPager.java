package com.sglabs.medistant.elements.appointmentactivity;

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
import com.sglabs.medistant.fragments.HistoryPagerViewPage;
import com.sglabs.medistant.fragments.PendingPagerViewPage;

public class ApptViewPager extends ViewPager {
    public Adapter adapter;
    ApptViewPager self = this;
    Integer[] titles;
    TabLayout tabs;
    private int lastPageIndex = 0;

    public ApptViewPager(Context context) {
        this(context, null);
    }

    public ApptViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.setOffscreenPageLimit(1);

        titles = new Integer[]{R.string.pending_pager_view_title, R.string.history_pager_view_title};

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

        tabs = (TabLayout) (((View) getParent()).findViewById(R.id.appt_view_pager_tabs));

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
                                ((PendingPagerView)
                                        ((PendingPagerViewPage)
                                                ApptViewPager.this.adapter.instantiateItem(
                                                        ApptViewPager.this, position))
                                                .getView()
                                                .findViewById(R.id.pending_pager_view))
                                        .onPageVisible();
                                break;
                            case 1:
                                ((HistoryPagerView)
                                        ((HistoryPagerViewPage)
                                                ApptViewPager.this.adapter.instantiateItem(
                                                        ApptViewPager.this, position))
                                                .getView()
                                                .findViewById(R.id.history_pager_view))
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
                    return new PendingPagerViewPage();
                case 1:
                    return new HistoryPagerViewPage();
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
