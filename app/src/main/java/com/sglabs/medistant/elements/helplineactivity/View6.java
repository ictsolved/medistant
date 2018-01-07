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

public class View6 extends PercentRelativeLayout {
    public AppCompatImageView imageView6;

    public AppCompatTextView textView11;

    public AppCompatTextView textView12;

    public AppCompatImageView imageView16;

    public View6(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View6(Context context) {
        super(context);
    }

    public View6(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView6 = (AppCompatImageView) findViewById(R.id.image_view61);

        imageView6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HelplineActivity activity =
                                ((HelplineActivity)
                                        ((HelpScroll)
                                                ((HelpList) ((StaticListTile5) getParent()).getParent().getParent())
                                                        .getParent()
                                                        .getParent())
                                                .getContext());
                        String uri = "tel:" + "014493684";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse(uri));
                        activity.startActivity(intent);
                    }
                });

        textView11 = (AppCompatTextView) findViewById(R.id.text_view11);

        textView12 = (AppCompatTextView) findViewById(R.id.text_view12);

        imageView16 = (AppCompatImageView) findViewById(R.id.image_view16);
    }
}
