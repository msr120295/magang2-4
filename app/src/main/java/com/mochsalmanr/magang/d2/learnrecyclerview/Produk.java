package com.mochsalmanr.magang.d2.learnrecyclerview;

public class Produk {
    public String namaBrg;
    public int hargaBrg;

    public Produk(String namaBrg, int hargaBrg) {
        this.namaBrg = namaBrg;
        this.hargaBrg = hargaBrg;
    }

    public String getNamaBrg() {
        return namaBrg;
    }

    public void setNamaBrg(String namaBrg) {
        this.namaBrg = namaBrg;
    }

    public int getHargaBrg() {
        return hargaBrg;
    }

    public void setHargaBrg(int hargaBrg) {
        this.hargaBrg = hargaBrg;
    }
}
