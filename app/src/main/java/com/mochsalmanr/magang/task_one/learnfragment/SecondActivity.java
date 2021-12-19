package com.mochsalmanr.magang.task_one.learnfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mochsalmanr.magang.R;

public class SecondActivity extends AppCompatActivity {

    // create a FragmentManager
    FragmentManager fm;
    // create a FragmentTransaction to begin the transaction and replace the Fragment
    FragmentTransaction fragmentTransaction;
    Button firstFragment, secondFragment, btnToMain, btnPage1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        firstFragment = (Button) findViewById(R.id.btnPage1);
        secondFragment = (Button) findViewById(R.id.btnSubmit);
        btnToMain = (Button) findViewById(R.id.buttonToMain);

        loadFragment(new FirstFragment(), null);

        btnToMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();

            }
        });
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();

        if(fm.getBackStackEntryCount() == 0 || fm.getBackStackEntryCount() == 1) {
            finish();
        } else if(fm.getBackStackEntryCount() == 2 || fm.getBackStackEntryCount() == 3) {
            fm.popBackStack();
        }
    }

    public void loadFragment(Fragment fragment, String hint) {
        fm = getSupportFragmentManager();
        fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frameContainer, fragment);
        fragmentTransaction.addToBackStack(hint);
        fragmentTransaction.commit(); // save the changes
    }
}