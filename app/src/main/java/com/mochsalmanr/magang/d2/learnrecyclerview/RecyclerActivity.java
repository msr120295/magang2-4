package com.mochsalmanr.magang.d2.learnrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mochsalmanr.magang.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerActivityAdapter pAdapter;
    private List<Produk> pList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);



        pList = new ArrayList<>();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerViewUI);

        pAdapter = new RecyclerActivityAdapter(pList);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(pAdapter);

        addData();
    }

    private void addData() {
        Produk p = new Produk("Kopi", 15000);
        pList.add(p);

        p = new Produk("Susu", 14000);
        pList.add(p);
        p = new Produk("Teh", 10000);
        pList.add(p);
        p = new Produk("Gula", 15000);
        pList.add(p);
        p = new Produk("Gelas", 15000);
        pList.add(p);
        p = new Produk("Teko", 15000);
        pList.add(p);
        p = new Produk("Susu", 14000);
        pList.add(p);
        p = new Produk("Teh", 10000);
        pList.add(p);
        p = new Produk("Gula", 15000);
        pList.add(p);
        p = new Produk("Gelas", 15000);
        pList.add(p);
        p = new Produk("Teko", 15000);
        pList.add(p);

        pAdapter.notifyDataSetChanged();

    }
}