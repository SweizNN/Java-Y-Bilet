package com.example.guideneme1;

import com.example.guideneme1.araç.Vehicle;
import java.util.ArrayList;


public class Trip {


    private String[] sefer;
    private String seferadı;
    private int toplamMesafe = 0;


//seferin araclarının tutuldugu arraylist
    private ArrayList<Vehicle> seferAraclar = new ArrayList();





//seferin adının ve seferin bilgilerinin atandıgı yer
    public Trip(String seferadı,String[] sefer,int seferToplamMesafe){
        setSeferadı(seferadı);
        setSefer(sefer);
        setToplamMesafe(seferToplamMesafe);
        sefersayisi++;
    }


    static int sefersayisi = 1;








    public ArrayList<Vehicle> getSeferAraclar() {
        return seferAraclar;
    }


    public static int getSefersayisi() {
        return sefersayisi;
    }

    public String[] getSefer() {
        return sefer;
    }

    public void setSefer(String[] sefer) {
        this.sefer = sefer;
    }

    public String getSeferadı() {
        return seferadı;
    }

    public void setSeferadı(String seferadı) {
        this.seferadı = seferadı;
    }

    public void setToplamMesafe(int toplamMesafe) {
        this.toplamMesafe = toplamMesafe;
    }

}
