package com.sglabs.medistant.elements.helplineactivity;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

import com.sglabs.medistant.R;

public class HelpScroll extends ScrollView {
    public HelpList helpList;

    public HelpScroll(Context context) {
        super(context);
    }

    public HelpScroll(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HelpScroll(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.helpList = (HelpList) findViewById(R.id.help_list);
    }
}
