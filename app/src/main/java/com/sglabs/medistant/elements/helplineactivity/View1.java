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

public class View1 extends PercentRelativeLayout {
    public AppCompatImageView imageView1;

    public AppCompatTextView textView1;

    public AppCompatTextView textView2;

    public AppCompatImageView imageView11;

    public View1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View1(Context context) {
        super(context);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView1 = (AppCompatImageView) findViewById(R.id.image_view11);

        imageView1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HelplineActivity activity =
                                ((HelplineActivity)
                                        ((HelpScroll)
                                                ((HelpList) ((ListPolice) getParent()).getParent().getParent())
                                                        .getParent()
                                                        .getParent())
                                                .getContext());
                        String uri = "tel:" + "100";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse(uri));
                        activity.startActivity(intent);
                    }
                });

        textView1 = (AppCompatTextView) findViewById(R.id.text_view1);

        textView2 = (AppCompatTextView) findViewById(R.id.text_view2);

        imageView11 = (AppCompatImageView) findViewById(R.id.image_view111);
    }
}
