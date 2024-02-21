package com.example.guideneme1.kullanıcı;

import com.example.guideneme1.Trip;
import java.util.ArrayList;
import java.util.Objects;



public class Admin extends User {

    //sirketlerin tutuldugu yer
    public ArrayList<Company> Companyler=new ArrayList<>();
    //seferlerin tutuldugu yer
    public ArrayList<Trip> tripler = new ArrayList<>();
    private int hizmetBedel = 1000;


//program çalışınca çalışıcak olan ilk constructor admininin kullanıcı adı ve sifresini belirler ve var olan sirketleri olusturup arrayliste atar
    public Admin(){
        setKullaniciAdi("admin123");
        setSifre("admin321");
        Company A=new Company("A","A123");
        Companyler.add(A);
        Company B=new Company("B","B123");
        Companyler.add(B);
        Company C=new Company("C","C123");
        Companyler.add(C);
        Company D=new Company("D","D123");
       Companyler.add(D);
        Company F=new Company("F","F123");
        Companyler.add(F);
        dataBase();
    }


    public void dataBase(){
        //seferlerin rotasının olusturuldugu yer
        String[] sefer1={"Istanbul" , "Kocaeli" , "Bilecik" ,"Eskisehir" , "Ankara" , "Eskisehir","Bilecik" , "Kocaeli" , "Istanbul"};
        String[] sefer2={"Istanbul" , "Kocaeli" , "Bilecik" ,"Eskisehir" , "Konya" , "Eskisehir","Bilecik" , "Kocaeli" , "Istanbul"};
        String[] sefer3={"Istanbul" , "Kocaeli" , "Ankara" , "Kocaeli" , "Istanbul","Kocaeli" , "Ankara" , "Kocaeli" , "Istanbul"};
        String[] sefer4={"Istanbul" , "Kocaeli" , "Eskisehir" , "Konya" , "Eskisehir","Kocaeli" , "Istanbul"};
        String[] sefer5={"Istanbul" , "Konya" , "Istanbul"};
        String[] sefer6={"Istanbul" , "Ankara" , "Istanbul"};
        //var olan seferlerin olusturuldugu yer
        Trip trip1 = new Trip("sefer1",sefer1,750);
        Trip trip2 = new Trip("sefer2",sefer2,900);
        Trip trip3 = new Trip("sefer3",sefer3,2000);
        Trip trip4 = new Trip("sefer4",sefer4,1200);
        Trip trip5 = new Trip("sefer5",sefer5,600);
        Trip trip6 = new Trip("sefer6",sefer6,500);

        //seferlere gerekli aracların atandıgı ve sofor muavin maaslarının belirlendigi yer
        trip3.getSeferAraclar().add(Companyler.get(0).otobusEkle("A_Otobus1",20,"Benzin",trip3));
        trip3.getSeferAraclar().add(Companyler.get(0).otobusEkle("A_Otobus2",15,"Benzin",trip3));
        Companyler.get(0).setOtobussoforMaas(5000);
        Companyler.get(0).setOtobusmuavinMaas(2000);
        trip3.getSeferAraclar().add(Companyler.get(1).otobusEkle("B_Otobus1",15,"Motorin",trip3));
        trip4.getSeferAraclar().add(Companyler.get(1).otobusEkle("B_Otobus2",20,"Motorin",trip4));
        Companyler.get(1).setOtobussoforMaas(3000);
        Companyler.get(1).setOtobusmuavinMaas(1500);
        trip4.getSeferAraclar().add(Companyler.get(2).otobusEkle("C_Otobus1",20,"Motorin",trip4));
        trip5.getSeferAraclar().add(Companyler.get(2).ucakEkle("C_Ucak1",30,trip5));
        trip5.getSeferAraclar().add(Companyler.get(2).ucakEkle("C_Ucak2",30,trip5));
        Companyler.get(2).setOtobussoforMaas(3000);
        Companyler.get(2).setOtobusmuavinMaas(1500);
        Companyler.get(2).setPilotsoforMaas(10000);
        Companyler.get(2).setUcakmuavinMaas(6000);
        trip1.getSeferAraclar().add(Companyler.get(3).trenEkle("D_Tren1",25,trip1));
        trip2.getSeferAraclar().add(Companyler.get(3).trenEkle("D_Tren2",25,trip2));
        trip2.getSeferAraclar().add(Companyler.get(3).trenEkle("D_Tren3",25,trip2));
        Companyler.get(3).setTrensoforMaas(2000);
        Companyler.get(3).setTrenmuavinMaas(1000);
        trip6.getSeferAraclar().add(Companyler.get(4).ucakEkle("F_Ucak1",30,trip6));
        trip6.getSeferAraclar().add(Companyler.get(4).ucakEkle("F_Ucak2",30,trip6));
        Companyler.get(4).setPilotsoforMaas(7500);
        Companyler.get(4).setUcakmuavinMaas(4000);
        System.out.println("--------------------");



//seferler arraylistine var olan seferlerin atandıgı yer
        tripler.add(trip1);
        tripler.add(trip2);
        tripler.add(trip3);
        tripler.add(trip4);
        tripler.add(trip5);
        tripler.add(trip6);
    }
    //olusturulan sirketi arrayliste attıgımız yer
    public void addCompany(Company c){Companyler.add(c);}

    public String showCompanys(){//var olan sirketleri gösterme
        String sirketAdları="";
        for(Company c:Companyler){
            sirketAdları = sirketAdları+ "Sirket adı:"+c.getKullaniciAdi() + "\n" ;
        }
        return sirketAdları;
    }
    //ismi girilen sirketi sildigimiz yer
    public void deleteCompany(String silinecek){//sirketleri silme

        for(int i=0;i<Companyler.size();i++){
            if(Objects.equals(Companyler.get(i).getKullaniciAdi(), silinecek))
                Companyler.remove(Companyler.get(i));
        }
    }

    public int getHizmetBedel() {
        return hizmetBedel;
    }

    public void setHizmetBedel(int hizmetBedel) {
        this.hizmetBedel = hizmetBedel;
    }
}
