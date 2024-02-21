package com.example.guideneme1.araç;

import com.example.guideneme1.Trip;
import com.example.guideneme1.İnsan.Personel;

public class Otobus extends Vehicle{
    public Otobus(){ }
    public Otobus( String ad, int kapasite, String yakıt, Trip sefer){
        //otobüse çalışanlarını ekledik
        Personel sofor1=new Personel("İbo","Saykı","Sofor");
        Personel sofor2=new Personel("Muhammet","Yalmun","Sofor");
        Personel muavin=new Personel("Onur","Unluefe","Muavin");
        Personel muavin2=new Personel("Tunahan","Ozcelik","Muavin");
        getInsanlar().add(sofor1);
        getInsanlar().add(sofor2);
        getInsanlar().add(muavin);
        getInsanlar().add(muavin2);
        //arac bilgilerini atadık
        setAracID(ad);
        setKapasite(kapasite);
        setYakıtTur(yakıt);
        setSefer(sefer);

    }



}
