package com.example.guideneme1.kullanıcı;

import com.example.guideneme1.Trip;
import com.example.guideneme1.araç.Otobus;
import com.example.guideneme1.araç.Plane;
import com.example.guideneme1.araç.Train;
import com.example.guideneme1.araç.Vehicle;
import java.util.ArrayList;
import java.util.Objects;

public class Company extends User  {

//sirket islemlerinin methodlarının oldugu yer
    private int otobussoforMaas;
    private int otobusmuavinMaas;
    private int trenmuavinMaas;
    private int trensoforMaas;
    private int pilotsoforMaas;
    private int ucakmuavinMaas;
    private int benzinCost;
    private int motorinCost;
    private int elektrikCost;
    private int gazCost;


//sirketin kullanıcı adı ve sifresinin belirlendigi yer
    public Company(String KullaniciAdi, String Sifre) {//sirketin kullanıcı adı ve sifresinin alındıgı yer
        setKullaniciAdi(KullaniciAdi);
        setSifre(Sifre);
    }
    //giris paneldeki nesneyi olusturmak icin
    public Company() {}



//yeni eklenen aracların tutuldugu arraylist
    ArrayList<Vehicle> Araçlar = new ArrayList<>();

    //otobus classına yeni olsuturdugumuz otobüsü gönderdigimiz yer
    public Otobus otobusEkle(String ad, int kapasite, String yakıt,Trip sefer){
        Otobus otobus=new Otobus(ad,kapasite,yakıt,sefer);
        otobusEkle(otobus);
        return otobus;

    }
    //araclar arraylistine yeni aracı ekledigimiz yer
    public void otobusEkle(Otobus o){
        Araçlar.add(o);
        System.out.println(o.getAracID());
        System.out.println(o.getKapasite());
        System.out.println(o.getYakıtTur());
        System.out.println(o.getSefer().getSeferadı());
    }
    //plane classına yeni olsuturdugumuz ucagı gönderdigimiz yer
    public Plane ucakEkle(String ad,int kapasite,Trip trip){
        Plane plane=new Plane(ad,kapasite,trip);
        Araçlar.add(plane);
        return plane;
    }
    //araclar arraylistine yeni aracı ekledigimiz yer
    public void ucakEkle(Plane p){
        Araçlar.add(p);
        System.out.println(p.getAracID());
        System.out.println(p.getKapasite());
        System.out.println(p.getYakıtTur());
        System.out.println(p.getSefer().getSeferadı());
    }
    //plane classına yeni olsuturdugumuz ucagı gönderdigimiz yer
    public Train trenEkle(String ad,int kapasite,Trip trip){
        Train tren= new Train(ad,kapasite,trip);
        Araçlar.add(tren);

        return tren;
    }
    //araclar arraylistine yeni aracı ekledigimiz yer
    public void trenEkle(Train t){
        Araçlar.add(t);
        System.out.println(t.getAracID());
        System.out.println(t.getKapasite());
        System.out.println(t.getYakıtTur());
        System.out.println(t.getSefer().getSeferadı());
    }
    //ismi girilen aracı sildigimiz yer
    public void aracSilme(String aracID) {//sirketin aracı sildigi yer
        String silinecek=aracID;
        for (int i = 0; i < Araçlar.size(); i++) {
            if(Objects.equals(Araçlar.get(i).getAracID(),silinecek))
                Araçlar.remove(Araçlar.get(i));
        }
        System.out.println(aracID+"- silindi");
    }


















    public void setOtobussoforMaas(int otobussoforMaas) {
        this.otobussoforMaas = otobussoforMaas;
    }
    public void setOtobusmuavinMaas(int otobusmuavinMaas) {
        this.otobusmuavinMaas = otobusmuavinMaas;
    }
    public void setTrenmuavinMaas(int trenmuavinMaas) {
        this.trenmuavinMaas = trenmuavinMaas;
    }
    public void setTrensoforMaas(int trensoforMaas) {
        this.trensoforMaas = trensoforMaas;
    }
    public void setPilotsoforMaas(int pilotsoforMaas) {
        this.pilotsoforMaas = pilotsoforMaas;
    }
    public void setUcakmuavinMaas(int ucakmuavinMaas) {
        this.ucakmuavinMaas = ucakmuavinMaas;
    }



}
