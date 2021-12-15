package com.mochsalmanr.magang.d2.learnrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;
import com.mochsalmanr.magang.R;

import java.util.List;

public class RecyclerActivityAdapter extends RecyclerView.Adapter<RecyclerActivityAdapter.ViewHolder> {
    private List<Produk> listdata;
    Context context;

    public RecyclerActivityAdapter(List<Produk> listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Produk item = listdata.get(position);
        holder.nama.setText(item.getNamaBrg());
        holder.harga.setText(String.valueOf(item.getHargaBrg()));

        //ToDo #1 toast masih belum tampil jadi freeze app
        holder.cvUtama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = item.getNamaBrg();
                String b = String.valueOf(item.getHargaBrg());
                String c = String.format("Nama : %s dan Harga %s .", a, b);

                Snackbar.make(view, a + b, Snackbar.LENGTH_LONG).show();
//                Toast.makeText(context, "Sudah di klik", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nama, harga;
        public CardView cvUtama;
        public ViewHolder(View itemView) {
            super(itemView);
            this.nama = (TextView) itemView.findViewById(R.id.namaBrgUI);
            this.harga = (TextView) itemView.findViewById(R.id.hargaBrgUI);
            this.cvUtama = itemView.findViewById(R.id.cvMain);
        }
    }
}
