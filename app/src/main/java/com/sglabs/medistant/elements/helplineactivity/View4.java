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

public class View4 extends PercentRelativeLayout {
    public AppCompatImageView imageView4;

    public AppCompatTextView textView7;

    public AppCompatTextView textView8;

    public AppCompatImageView imageView14;

    public View4(Context context) {
        super(context);
    }

    public View4(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View4(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView4 = (AppCompatImageView) findViewById(R.id.image_view41);

        imageView4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HelplineActivity activity =
                                ((HelplineActivity)
                                        ((HelpScroll)
                                                ((HelpList) ((StaticListTile3) getParent()).getParent().getParent())
                                                        .getParent()
                                                        .getParent())
                                                .getContext());
                        String uri = "tel:" + "103";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse(uri));
                        activity.startActivity(intent);
                    }
                });

        textView7 = (AppCompatTextView) findViewById(R.id.text_view7);

        textView8 = (AppCompatTextView) findViewById(R.id.text_view8);

        imageView14 = (AppCompatImageView) findViewById(R.id.image_view14);
    }
}
