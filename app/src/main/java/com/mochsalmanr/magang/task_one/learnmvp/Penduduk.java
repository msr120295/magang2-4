package com.mochsalmanr.magang.task_one.learnmvp;

//ToDo masih bingung menggunakan model untuk mvpnya
public class Penduduk {
    String namaP;
    int umurP;
    boolean statusWni;

    public Penduduk(String namaP, int umurP, boolean statusWni) {
        this.namaP = namaP;
        this.umurP = umurP;
        this.statusWni = statusWni;
    }

    public String getNamaP() {
        return namaP;
    }

    public void setNamaP(String namaP) {
        this.namaP = namaP;
    }

    public int getUmurP() {
        return umurP;
    }

    public void setUmurP(int umurP) {
        this.umurP = umurP;
    }

    public boolean isStatusWni() {
        return statusWni;
    }

    public void setStatusWni(boolean statusWni) {
        this.statusWni = statusWni;
    }
}
