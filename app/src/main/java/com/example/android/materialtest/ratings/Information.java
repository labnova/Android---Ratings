package com.example.android.materialtest.ratings;


public class Information {
    int iconId;
    String title;

    public void InfoNumeration() {
        String visualizer= "";
        int info = 1;
        double info2 = 2.3;

        int count= 0;
        while(count < 20) {
            info=info+1;
            info2 = info2+3;
            count++;
            visualizer = "il numero visualizzato è " +Integer.toString(info)+ " \n";
        }

    }


    public void InfoFoto() {

    }

}
