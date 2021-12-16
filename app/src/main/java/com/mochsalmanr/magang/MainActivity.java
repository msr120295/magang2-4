package com.mochsalmanr.magang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mochsalmanr.magang.d2.learnfragment.SecondActivity;
import com.mochsalmanr.magang.d2.learnrecyclerview.RecyclerActivity;

public class MainActivity extends AppCompatActivity {

    public Button btnToRecycler;
    public Button btnToFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToRecycler = findViewById(R.id.btnRecycler);
        btnToRecycler.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
                startActivity(intent);
            }
        });

        btnToFragment = findViewById(R.id.btnToFragment);
        btnToFragment.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}