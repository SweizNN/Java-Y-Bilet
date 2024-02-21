package com.example.guideneme1.İnsan;

public class Passenger extends Person {
    //yolcunun bilgilerinin tutuldugu ve atandıgı yer
    private String Tckimlik;
    private String dogumTarih;



    public Passenger(String isim, String soyisim, String tckimlik, String dogumTarih) {
        this.setIsim(isim);
        this.setSoyisim(soyisim);
        setTckimlik(tckimlik);
        setDogumTarih(dogumTarih);
        System.out.println(isim);
        System.out.println(soyisim);
        System.out.println(tckimlik);
        System.out.println(dogumTarih);
    }



    public String getDogumTarih() {
        return dogumTarih;
    }

    public void setDogumTarih(String dogumTarih) {
        this.dogumTarih = dogumTarih;
    }
    public String getTckimlik() {
        return Tckimlik;
    }

    public void setTckimlik(String tckimlik) {
        Tckimlik = tckimlik;
    }
}
