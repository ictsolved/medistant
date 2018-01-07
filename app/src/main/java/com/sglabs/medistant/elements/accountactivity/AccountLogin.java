package com.sglabs.medistant.elements.accountactivity;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.percent.PercentRelativeLayout;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class AccountLogin extends PercentRelativeLayout {
    public AppCompatEditText loginEmail;
    public AppCompatEditText loginPw;
    public AppCompatButton loginBtn;
    private FragmentManager fragmentManager;

    public AccountLogin(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public AccountLogin(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AccountLogin(Context context) {
        super(context);
    }

    public void onPageVisible() {
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        loginEmail = (AppCompatEditText) findViewById(R.id.login_email);

        loginEmail.setSupportBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF009688")));

        loginPw = (AppCompatEditText) findViewById(R.id.login_pw);

        loginPw.setSupportBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF009688")));

        loginBtn = (AppCompatButton) findViewById(R.id.login_btn);

        loginBtn.setTransformationMethod(null);
    }
}
