package com.sglabs.medistant.activities.bloodbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.sglabs.medistant.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class fsave extends AppCompatActivity {
    private DatabaseReference mFirebaseDatabase;
    private FirebaseDatabase mFirebaseInstance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fsave);
        mFirebaseInstance = FirebaseDatabase.getInstance();
        mFirebaseDatabase = mFirebaseInstance.getReference();

        final String blood1=getIntent().getStringExtra("blood1");
        final String mobile1=getIntent().getStringExtra("mobile1");
        final String combo=getIntent().getStringExtra("combo");

        mFirebaseDatabase.child("users").child(blood1).child(mobile1).setValue(combo);
        Toast.makeText(fsave.this,"Donor Added",Toast.LENGTH_SHORT).show();

        Intent home=new Intent(fsave.this,Home.class);
        startActivity(home);
        finish();
    }
}
