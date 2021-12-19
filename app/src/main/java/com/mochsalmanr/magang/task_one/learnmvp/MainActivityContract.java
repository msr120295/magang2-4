package com.mochsalmanr.magang.task_one.learnmvp;

public class MainActivityContract {
    public interface View{
        void showMessage(String data);
        void clearField();
        void showData();
    }
    interface Presenter{
        void addData(String email, String age, String status);
//        void loadData();
    }
}
