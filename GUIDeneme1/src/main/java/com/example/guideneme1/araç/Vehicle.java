package com.example.guideneme1.araç;


import com.example.guideneme1.Trip;
import com.example.guideneme1.İnsan.Person;
import java.util.ArrayList;

public abstract class Vehicle {
    private String aracID;
    private String yakıtTur;
    private int kapasite;
    // seferin aracını alıyoruz
    private Trip sefer;

    //insanları tutan arraylist
    private ArrayList<Person> insanlar=new ArrayList<>();
    public ArrayList<Person> getInsanlar() {
        return insanlar;
    }







    public Trip getSefer() {
        return sefer;
    }
    public void setSefer(Trip sefer) {
        this.sefer = sefer;
    }
    public String getAracID() {
        return aracID;
    }
    public void setAracID(String aracID) {
        this.aracID = aracID;
    }
    public String getYakıtTur() {
        return yakıtTur;
    }
    public void setYakıtTur(String yakıtTur) {
        this.yakıtTur = yakıtTur;
    }
    public int getKapasite() {
        return kapasite;
    }
    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }
}
