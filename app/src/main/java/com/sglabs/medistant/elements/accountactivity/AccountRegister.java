package com.sglabs.medistant.elements.accountactivity;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.percent.PercentRelativeLayout;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import com.sglabs.medistant.R;

public class AccountRegister extends PercentRelativeLayout {
    public AppCompatEditText registerName;
    public AppCompatEditText registerEmail;
    public AppCompatEditText registerPw;
    public AppCompatEditText registerConfpw;
    public AppCompatEditText registerDob;
    public RegisterSex registerSex;
    public AppCompatCheckBox bloodDonateCheckbox;
    public AppCompatButton registerSubmit;
    private FragmentManager fragmentManager;

    public AccountRegister(Context context) {
        super(context);
    }

    public AccountRegister(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AccountRegister(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void onPageVisible() {
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        registerName = (AppCompatEditText) findViewById(R.id.register_name);

        registerName.setSupportBackgroundTintList(
                ColorStateList.valueOf(Color.parseColor("#FF009688")));

        registerEmail = (AppCompatEditText) findViewById(R.id.register_email);

        registerEmail.setSupportBackgroundTintList(
                ColorStateList.valueOf(Color.parseColor("#FF009688")));

        registerPw = (AppCompatEditText) findViewById(R.id.register_pw);

        registerPw.setSupportBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF009688")));

        registerConfpw = (AppCompatEditText) findViewById(R.id.register_confpw);

        registerConfpw.setSupportBackgroundTintList(
                ColorStateList.valueOf(Color.parseColor("#FF009688")));

        registerDob = (AppCompatEditText) findViewById(R.id.register_dob);

        registerDob.setSupportBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF009688")));

        registerSex = (RegisterSex) findViewById(R.id.register_sex);

        bloodDonateCheckbox = (AppCompatCheckBox) findViewById(R.id.blood_donate_checkbox);

        bloodDonateCheckbox.setSupportButtonTintList(
                ColorStateList.valueOf(Color.parseColor("#FF009688")));

        registerSubmit = (AppCompatButton) findViewById(R.id.register_submit);

        registerSubmit.setTransformationMethod(null);
    }
}
