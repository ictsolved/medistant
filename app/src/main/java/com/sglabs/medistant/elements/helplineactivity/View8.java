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

public class View8 extends PercentRelativeLayout {
    public AppCompatImageView imageView8;

    public AppCompatTextView textView15;

    public AppCompatTextView textView16;

    public AppCompatImageView imageView18;

    public View8(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View8(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View8(Context context) {
        super(context);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView8 = (AppCompatImageView) findViewById(R.id.image_view81);

        imageView8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HelplineActivity activity =
                                ((HelplineActivity)
                                        ((HelpScroll)
                                                ((HelpList) ((StaticListTile7) getParent()).getParent().getParent())
                                                        .getParent()
                                                        .getParent())
                                                .getContext());
                        String uri = "tel:" + "015521333";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse(uri));
                        activity.startActivity(intent);
                    }
                });

        textView15 = (AppCompatTextView) findViewById(R.id.text_view15);

        textView16 = (AppCompatTextView) findViewById(R.id.text_view16);

        imageView18 = (AppCompatImageView) findViewById(R.id.image_view18);
    }
}
