package com.sglabs.medistant.elements.accountactivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegisterSex extends Spinner {
    public ArrayAdapter<String> adapter;

    public RegisterSex(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        setupAdapter();
    }

    public RegisterSex(Context context, AttributeSet attrs) {
        super(context, attrs);

        setupAdapter();
    }

    public RegisterSex(Context context) {
        super(context);

        setupAdapter();
    }

    private void setupAdapter() {
        List<String> list = new ArrayList<>(Arrays.asList(new String[]{"Male", "Female", "Other"}));

        adapter =
                new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, list) {
                    @NonNull
                    @Override
                    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
                        View v = super.getView(position, convertView, parent);
                        if (v instanceof TextView) {
                            TextView tv = (TextView) v;
                            tv.setTypeface(Typeface.create("sans-serif", Typeface.NORMAL));
                            tv.setTextSize(16);
                            tv.setTextColor(Color.parseColor("#FF009688"));
                        }
                        return v;
                    }

                    @Override
                    public View getDropDownView(int position, View convertView, @NonNull ViewGroup parent) {
                        View v = super.getDropDownView(position, convertView, parent);
                        if (v instanceof TextView) {
                            TextView tv = (TextView) v;
                            tv.setTypeface(Typeface.create("sans-serif", Typeface.NORMAL));
                            tv.setTextSize(16);
                            tv.setTextColor(Color.parseColor("#FF009688"));
                        }
                        return v;
                    }
                };

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        this.setAdapter(adapter);

        Drawable spinnerDrawable = this.getBackground().mutate();

        spinnerDrawable.setColorFilter(Color.parseColor("#FF009688"), PorterDuff.Mode.SRC_ATOP);

        this.setBackground(spinnerDrawable);

        this.setSelection(0);
    }

    public void setData(List<String> data) {
        adapter.clear();

        boolean wasEmpty = adapter.isEmpty();

        for (String i : data) {
            adapter.insert(i, adapter.getCount());
        }

        adapter.notifyDataSetChanged();

        if (wasEmpty && data.isEmpty()) {
            this.getOnItemSelectedListener().onNothingSelected(this);
        }
    }

    @Override
    public String getSelectedItem() {
        return (String) super.getSelectedItem();
    }

    @Override
    public void setSelection(int position) {
        super.setSelection(position);

        if (getOnItemSelectedListener() != null) {
            getOnItemSelectedListener()
                    .onItemSelected(this, getSelectedView(), position, getItemIdAtPosition(position));
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        this.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    private boolean firstRun = true;

                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        if (firstRun) {
                            firstRun = false;
                        } else {
                            if (parent.getItemAtPosition(position) != null) {
                                String value = ((TextView) view).getText().toString();
                            }
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        firstRun = false;
                    }
                });

        if (this.adapter.isEmpty()) {
            this.getOnItemSelectedListener().onNothingSelected(this);
        }
    }
}
