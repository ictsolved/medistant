package com.sglabs.medistant.elements.firstaidactivity;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

import com.sglabs.medistant.R;

public class StaticList1 extends ScrollView {
    public StaticListTile1 staticListTile1;

    public StaticListTile2 staticListTile2;

    public StaticListTile3 staticListTile3;

    public StaticListTile4 staticListTile4;

    public StaticListTile5 staticListTile5;

    public StaticListTile6 staticListTile6;

    public StaticListTile7 staticListTile7;

    public StaticListTile8 staticListTile8;

    public StaticListTile9 staticListTile9;

    public StaticListTile10 staticListTile10;

    public StaticList1(Context context) {
        super(context);
    }

    public StaticList1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public StaticList1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.staticListTile1 = (StaticListTile1) findViewById(R.id.static_list_tile1);

        this.staticListTile2 = (StaticListTile2) findViewById(R.id.static_list_tile2);

        this.staticListTile3 = (StaticListTile3) findViewById(R.id.static_list_tile3);

        this.staticListTile4 = (StaticListTile4) findViewById(R.id.static_list_tile4);

        this.staticListTile5 = (StaticListTile5) findViewById(R.id.static_list_tile5);

        this.staticListTile6 = (StaticListTile6) findViewById(R.id.static_list_tile6);

        this.staticListTile7 = (StaticListTile7) findViewById(R.id.static_list_tile7);

        this.staticListTile8 = (StaticListTile8) findViewById(R.id.static_list_tile8);

        this.staticListTile9 = (StaticListTile9) findViewById(R.id.static_list_tile9);

        this.staticListTile10 = (StaticListTile10) findViewById(R.id.static_list_tile10);
    }
}
