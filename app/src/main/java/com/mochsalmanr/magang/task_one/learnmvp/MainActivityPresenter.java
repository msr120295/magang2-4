package com.mochsalmanr.magang.task_one.learnmvp;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mochsalmanr.magang.R;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivityPresenter implements MainActivityContract.Presenter{

    Context context;
    Gson gson = new Gson();
    MainActivityContract.View view;
    @BindView(R.id.laki) RadioButton rbLaki;;
    @BindView(R.id.perempuan) RadioButton rbPerempuan;
    @BindView(R.id.btnToSave) Button btnSave;
    @BindView(R.id.btnToClear) Button btnClear;
    SharedPreferences prefs = context.getSharedPreferences("test", Context.MODE_PRIVATE);

    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void addData(String nama, String age, String status) {
        if (TextUtils.isEmpty(nama) || TextUtils.isEmpty(age) || !rbLaki.isChecked() || !rbPerempuan.isChecked()) {
            view.showMessage("Data belum diisi semua");
        } else {
            prefs.edit().putString("nama", nama).apply();
            prefs.edit().putString("umur", age).apply();
            prefs.edit().putString("status", status).apply();

            view.showMessage("Data Sudah Terinput");
            view.clearField();
        }

    }

//    @Override
//    public void loadData() {
//        //load
//        String a = prefs.getString("nama", "Salman");
//        String b = prefs.getString("umur", "12");
//        String c = prefs.getString("status", "Yes");
//
//
//    }
}
