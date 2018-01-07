package com.sglabs.medistant.elements.accountactivity;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

import com.sglabs.medistant.R;

public class AcntScroll extends ScrollView {
    public AccountViewPager accountViewPager;

    public AcntScroll(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AcntScroll(Context context) {
        super(context);
    }

    public AcntScroll(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        accountViewPager = (AccountViewPager) findViewById(R.id.account_view_pager);
    }
}
