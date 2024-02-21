package com.example.guideneme1.İnsan;

public class Personel extends Person {
    //araclarda çalışan personellerin bilgilerinin tutuldugu yer
    private String personelTur;

    public Personel(String isim, String soyisim, String personelTur){
        this.setIsim(isim);
        this.setSoyisim(soyisim);
        this.personelTur=personelTur;
    }



}
