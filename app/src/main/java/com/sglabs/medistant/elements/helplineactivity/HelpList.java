package com.sglabs.medistant.elements.helplineactivity;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

import com.sglabs.medistant.R;

public class HelpList extends ScrollView {
    public ListPolice listPolice;

    public StaticListTile1 staticListTile1;

    public StaticListTile2 staticListTile2;

    public StaticListTile3 staticListTile3;

    public StaticListTile4 staticListTile4;

    public StaticListTile5 staticListTile5;

    public StaticListTile6 staticListTile6;

    public StaticListTile7 staticListTile7;

    public StaticListTile8 staticListTile8;

    public StaticListTile9 staticListTile9;

    public HelpList(Context context) {
        super(context);
    }

    public HelpList(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HelpList(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        this.listPolice = (ListPolice) findViewById(R.id.list_police);

        this.staticListTile1 = (StaticListTile1) findViewById(R.id.static_list_tile11);

        this.staticListTile2 = (StaticListTile2) findViewById(R.id.static_list_tile21);

        this.staticListTile3 = (StaticListTile3) findViewById(R.id.static_list_tile31);

        this.staticListTile4 = (StaticListTile4) findViewById(R.id.static_list_tile41);

        this.staticListTile5 = (StaticListTile5) findViewById(R.id.static_list_tile51);

        this.staticListTile6 = (StaticListTile6) findViewById(R.id.static_list_tile61);

        this.staticListTile7 = (StaticListTile7) findViewById(R.id.static_list_tile71);

        this.staticListTile8 = (StaticListTile8) findViewById(R.id.static_list_tile81);

        this.staticListTile9 = (StaticListTile9) findViewById(R.id.static_list_tile91);
    }
}
