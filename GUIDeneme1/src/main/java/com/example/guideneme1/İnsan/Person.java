package com.example.guideneme1.İnsan;

public abstract class Person {
    //sistemdeki tüm insanların isim soyisim bilgilerini tutan yer
    private String isim;
    private String soyisim;





    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }


    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getSoyisim() {
        return soyisim;
    }
}
