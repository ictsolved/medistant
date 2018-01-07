package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

import com.sglabs.medistant.R;

public class ScrollView1 extends ScrollView {
    public StaticList1 staticList1;

    public ScrollView1(Context context) {
        super(context);
    }

    public ScrollView1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ScrollView1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.staticList1 = (StaticList1) findViewById(R.id.static_list1);
    }
}
