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

public class View9 extends PercentRelativeLayout {
    public AppCompatImageView imageView9;

    public AppCompatImageView imageView19;

    public AppCompatTextView textView17;

    public AppCompatTextView textView18;

    public View9(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public View9(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public View9(Context context) {
        super(context);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();

        imageView9 = (AppCompatImageView) findViewById(R.id.image_view91);

        imageView9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        HelplineActivity activity =
                                ((HelplineActivity)
                                        ((HelpScroll)
                                                ((HelpList) ((StaticListTile8) getParent()).getParent().getParent())
                                                        .getParent()
                                                        .getParent())
                                                .getContext());
                        String uri = "tel:" + "015521333";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse(uri));
                        activity.startActivity(intent);
                    }
                });

        imageView19 = (AppCompatImageView) findViewById(R.id.image_view19);

        textView17 = (AppCompatTextView) findViewById(R.id.text_view17);

        textView18 = (AppCompatTextView) findViewById(R.id.text_view18);
    }
}
