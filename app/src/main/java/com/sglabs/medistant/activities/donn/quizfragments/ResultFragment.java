package com.sglabs.medistant.activities.donn.quizfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.sglabs.medistant.R;
import com.sglabs.medistant.activities.donn.needblood.ScheduleFragment;

/**
 * .
 * Created by rashad on 5/26/16.
 * .
 */
public class ResultFragment extends Fragment {

    int flag = 0;

    View root;
    TextView resultt, data;
    Button learn, sched;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.blood_test_result, container, false);

        resultt = (TextView) root.findViewById(R.id.textRes);
        data = (TextView) root.findViewById(R.id.data);

        sched = (Button) root.findViewById(R.id.sched);


        Bundle bundle = getArguments();

        int q1 = bundle.getInt("q1");
        int q2 = bundle.getInt("q2");
        int q3 = bundle.getInt("q3");
        int q4 = bundle.getInt("q4");
        int q5 = bundle.getInt("q5");
        int q6 = bundle.getInt("q6");
        int q7 = bundle.getInt("q7");
        int q8 = bundle.getInt("q8");


        if (q1 == 0 || q2 == 0 || q3 == 0 || q4 == 0 || q5 == 0 || q6 == 0 || q7 == 0 || q8 == 0) {


            sched.setVisibility(View.INVISIBLE);

            resultt.setText("Sorry, you did not pass the test!");

            data.setText("\nYou seem to not meet one of the criterias of being a blood donor. " +
                    "Either your blood is not safe for transfusion or this blood donation may affect your health.");

        } else {


            resultt.setText("Congrats, you passed the test!");

            data.setText("\nYou met the criteria. You seem eligble to donate your blood.\n" +
                    "Make your own blood donation schedule " +
                    "to notify the donor is available.");


        }


        sched.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment currentFragment = new ScheduleFragment();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.mainFrame, currentFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });


        return root;
    }


}