package com.example.guideneme1.kullanıcı;


public abstract class User {
    //adminin ve firmanın kullanıcı adı ve sifresinin tutuldugu yer

    private String KullaniciAdi;
    private String Sifre;







    public String getKullaniciAdi() {
        return KullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        KullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return Sifre;
    }

    public void setSifre(String sifre) {
        Sifre = sifre;
    }
}
