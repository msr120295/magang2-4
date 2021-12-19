package com.mochsalmanr.magang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.mochsalmanr.magang.task_one.learnfragment.SecondActivity;
import com.mochsalmanr.magang.task_one.learnmvp.MainActivityContract;
import com.mochsalmanr.magang.task_one.learnmvp.MainActivityPresenter;
import com.mochsalmanr.magang.task_one.learnrecyclerview.RecyclerActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    public Button btnToRecycler;
    public Button btnToFragment;
    @BindView(R.id.inputName) EditText nama;
    @BindView(R.id.inputAge) EditText age;
    @BindView(R.id.opsi) RadioGroup opsi;
    Button btnSave;
    @BindView(R.id.btnToClear) Button btnClear;

    MainActivityPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToRecycler = findViewById(R.id.btnRecycler);
        btnSave = findViewById(R.id.btnToSave);
//        presenter = new MainActivityPresenter(this);

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

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "data", Snackbar.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public void showMessage(String data) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void clearField() {
        nama.setText("");
        age.setText("");
        opsi.clearCheck();
    }

    @Override
    public void showData() {

    }
}