package com.sglabs.medistant.elements.accountactivity;

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
import com.sglabs.medistant.fragments.AccountLoginPage;
import com.sglabs.medistant.fragments.AccountRegisterPage;

public class AccountViewPager extends ViewPager {
    public Adapter adapter;
    AccountViewPager self = this;

    TabLayout tabs;

    Integer[] titles;
    private int lastPageIndex = 0;

    public AccountViewPager(Context context) {
        this(context, null);
    }

    public AccountViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.setOffscreenPageLimit(1);

        titles = new Integer[]{R.string.account_login_title, R.string.account_register_title};

        setupAdapter(((FragmentActivity) getContext()).getSupportFragmentManager());
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        tabs = (TabLayout) (((View) getParent()).findViewById(R.id.account_view_pager_tabs));

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
                                ((AccountLogin)
                                        ((AccountLoginPage)
                                                AccountViewPager.this.adapter.instantiateItem(
                                                        AccountViewPager.this, position))
                                                .getView()
                                                .findViewById(R.id.account_login))
                                        .onPageVisible();
                                break;
                            case 1:
                                ((AccountRegister)
                                        ((AccountRegisterPage)
                                                AccountViewPager.this.adapter.instantiateItem(
                                                        AccountViewPager.this, position))
                                                .getView()
                                                .findViewById(R.id.account_register))
                                        .onPageVisible();
                                break;
                        }
                    }
                });
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

    public class Adapter extends FragmentPagerAdapter {
        private final int NUM_ITEMS = 2;

        public Adapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new AccountLoginPage();
                case 1:
                    return new AccountRegisterPage();
                default:
                    return null;
            }
        }
    }
}
