package com.sglabs.medistant.activities.bloodbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.sglabs.medistant.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class main2 extends AppCompatActivity {
    private DatabaseReference mFirebaseDatabase;
    private FirebaseDatabase mFirebaseInstance;
    private Button newb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        // get reference to 'users' node
        mFirebaseInstance = FirebaseDatabase.getInstance();
        mFirebaseDatabase = mFirebaseInstance.getReference();
        final EditText name = (EditText) findViewById(R.id.editText);
        final EditText mobile = (EditText) findViewById(R.id.editText3);
        newb = (Button) findViewById(R.id.button2);
        final Spinner blood = (Spinner) findViewById(R.id.spinner);
        final AutoCompleteTextView panchhh = (AutoCompleteTextView) findViewById(R.id.panch_auto);
        String[] pa_n = getResources().getStringArray(R.array.panch);
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pa_n);
        panchhh.setAdapter(adapter);

//        usr user = new usr("Cee", "gg","hh");
//
//        var fireRef = new Firebase('https://<CHANGE_APP_NAME>.firebaseio.com/fireRef');
//        var newUserRef = fireRef.push();
//        newUserRef.set({ 'name': 'fred', 'age': '32' });

        newb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name1 = name.getText().toString();
                String mobile1 = mobile.getText().toString();
                String blood1 = blood.getSelectedItem().toString();
                String panch1 = panchhh.getText().toString();
                String combo = name1 + "," + mobile1 + "," + panch1;
                usr newuser = new usr(name1, blood1, panch1);
                if (blood1.equals("") || mobile1.equals("") || panch1.equals("")) {
                    Toast.makeText(main2.this, "Please fill all the details.", Toast.LENGTH_SHORT).show();
                } else {

                    mFirebaseDatabase.child("users").child(blood1).child(mobile1).setValue(combo);
                    Toast.makeText(main2.this,"Donor Added",Toast.LENGTH_SHORT).show();

                    Intent home=new Intent(main2.this,Home.class);
                    startActivity(home);
                    finish();
                }
            }
        });


    }
}
