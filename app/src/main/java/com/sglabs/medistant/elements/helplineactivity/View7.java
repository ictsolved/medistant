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

public class View7 extends PercentRelativeLayout {
    public AppCompatImageView imageView7;

    public AppCompatTextView textView13;

    public AppCompatTextView textView14;

    public AppCompatImageView imageView17;

    public View7(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View7(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View7(Context context) {
        super(context);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView7 = (AppCompatImageView) findViewById(R.id.image_view71);

        imageView7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HelplineActivity activity =
                                ((HelplineActivity)
                                        ((HelpScroll)
                                                ((HelpList) ((StaticListTile6) getParent()).getParent().getParent())
                                                        .getParent()
                                                        .getParent())
                                                .getContext());
                        String uri = "tel:" + "014225344";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse(uri));
                        activity.startActivity(intent);
                    }
                });

        textView13 = (AppCompatTextView) findViewById(R.id.text_view13);

        textView14 = (AppCompatTextView) findViewById(R.id.text_view14);

        imageView17 = (AppCompatImageView) findViewById(R.id.image_view17);
    }
}
