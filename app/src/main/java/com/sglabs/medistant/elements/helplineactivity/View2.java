package com.sglabs.medistant.elements.helplineactivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.percent.PercentRelativeLayout;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;

import com.sglabs.medistant.R;
import com.sglabs.medistant.activities.HelplineActivity;

public class View2 extends PercentRelativeLayout {
    public AppCompatImageView imageView2;

    public AppCompatTextView textView3;

    public AppCompatTextView textView4;

    public AppCompatImageView imageView12;

    public View2(Context context) {
        super(context);
    }

    public View2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView2 = (AppCompatImageView) findViewById(R.id.image_view21);

        imageView2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HelplineActivity activity =
                                ((HelplineActivity)
                                        ((HelpScroll)
                                                ((HelpList) ((StaticListTile1) getParent()).getParent().getParent())
                                                        .getParent()
                                                        .getParent())
                                                .getContext());
                        String uri = "tel:" + "101";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse(uri));
                        activity.startActivity(intent);
                    }
                });

        textView3 = (AppCompatTextView) findViewById(R.id.text_view3);

        textView4 = (AppCompatTextView) findViewById(R.id.text_view4);

        imageView12 = (AppCompatImageView) findViewById(R.id.image_view12);
    }
}
