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

public class View3 extends PercentRelativeLayout {
    public AppCompatImageView imageView3;

    public AppCompatTextView textView5;

    public AppCompatTextView textView6;

    public AppCompatImageView imageView13;

    public View3(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View3(Context context) {
        super(context);
    }

    public View3(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView3 = (AppCompatImageView) findViewById(R.id.image_view31);

        imageView3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HelplineActivity activity =
                                ((HelplineActivity)
                                        ((HelpScroll)
                                                ((HelpList) ((StaticListTile2) getParent()).getParent().getParent())
                                                        .getParent()
                                                        .getParent())
                                                .getContext());
                        String uri = "tel:" + "102";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse(uri));
                        activity.startActivity(intent);
                    }
                });

        textView5 = (AppCompatTextView) findViewById(R.id.text_view5);

        textView6 = (AppCompatTextView) findViewById(R.id.text_view6);

        imageView13 = (AppCompatImageView) findViewById(R.id.image_view13);
    }
}
