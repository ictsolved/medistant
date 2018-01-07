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

public class View5 extends PercentRelativeLayout {
    public AppCompatImageView imageView5;

    public AppCompatTextView textView9;

    public AppCompatTextView textView10;

    public AppCompatImageView imageView15;

    public View5(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View5(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View5(Context context) {
        super(context);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView5 = (AppCompatImageView) findViewById(R.id.image_view51);

        imageView5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HelplineActivity activity =
                                ((HelplineActivity)
                                        ((HelpScroll)
                                                ((HelpList) ((StaticListTile4) getParent()).getParent().getParent())
                                                        .getParent()
                                                        .getParent())
                                                .getContext());
                        String uri = "tel:" + "1098";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse(uri));
                        activity.startActivity(intent);
                    }
                });

        textView9 = (AppCompatTextView) findViewById(R.id.text_view9);

        textView10 = (AppCompatTextView) findViewById(R.id.text_view10);

        imageView15 = (AppCompatImageView) findViewById(R.id.image_view15);
    }
}
