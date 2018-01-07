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

public class View10 extends PercentRelativeLayout {
    public AppCompatImageView imageView10;

    public AppCompatImageView imageView20;

    public AppCompatTextView textView19;

    public AppCompatTextView textView20;

    public View10(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View10(Context context) {
        super(context);
    }

    public View10(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView10 = (AppCompatImageView) findViewById(R.id.image_view101);

        imageView10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HelplineActivity activity =
                                ((HelplineActivity)
                                        ((HelpScroll)
                                                ((HelpList) ((StaticListTile9) getParent()).getParent().getParent())
                                                        .getParent()
                                                        .getParent())
                                                .getContext());
                        String uri = "tel:" + "014234068";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse(uri));
                        activity.startActivity(intent);
                    }
                });

        imageView20 = (AppCompatImageView) findViewById(R.id.image_view20);

        textView19 = (AppCompatTextView) findViewById(R.id.text_view19);

        textView20 = (AppCompatTextView) findViewById(R.id.text_view20);
    }
}
