package com.example.guideneme1;

public class Route {

//mesafelerin tutuldugu yer
    static String[] karayoluİstanbul={"İstanbul=0","Kocaeli=100","Ankara=500","Eskişehir=300","Konya=600"};
    static String[] karayoluKocaeli={"İstanbul=100","Kocaeli=0","Ankara=400","Eskişehir=200","Konya=500"};
    static String[] karayoluAnkara={"İstanbul=500","Kocaeli=400","Ankara=0","Eskişehir=0","Konya=0"};
    static String[] karayoluEskişehir={"İstanbul=300","Kocaeli=200","Ankara=0","Eskişehir=0","Konya=300"};
    static String[] karayoluKonya={"İstanbul=600","Kocaeli=500","Ankara=0","Eskişehir=300","Konya=0"};
    static  String[] demiryoluİstanbul={"İstanbul=0","Kocaeli=75","Bilecik=225","Ankara=375","Eskişehir=300","Konya=450"};
    static String[] demiryoluKocaeli={"İstanbul=75","Kocaeli=0","Bilecik=75","Ankara=300","Eskişehir=150","Konya=350"};
    static  String[] demiryoluBilecik={"İstanbul=225","Kocaeli=75","Bilecik=0","Ankara=225","Eskişehir=75","Konya=300"};
    static String[] demiryoluAnkara={"İstanbul=375","Kocaeli=300","Bilecik=225","Ankara=0","Eskişehir=150","Konya=0"};
    static String[] demiryoluEskişehir={"İstanbul=300","Kocaeli=150","Bilecik=75","Ankara=150","Eskişehir=0","Konya=225"};
    static  String[] demiryoluKonya={"İstanbul=450","Kocaeli=350","Bilecik=300","Ankara=0","Eskişehir=225","Konya=0"};
    static String[] havayoluİstanbul={"İstanbul=0","Ankara=250","Konya=300"};
    static String[] havayoluAnkara={"İstanbul=250","Ankara=0","Konya=0"};
    static String[] havayoluKonya={"İstanbul=300","Ankara=0","Konya=0"};












    public static String[] getKarayoluİstanbul() {
        return karayoluİstanbul;
    }

    public static String[] getKarayoluKocaeli() {
        return karayoluKocaeli;
    }

    public static String[] getKarayoluAnkara() {
        return karayoluAnkara;
    }

    public static String[] getKarayoluEskişehir() {
        return karayoluEskişehir;
    }

    public static String[] getKarayoluKonya() {
        return karayoluKonya;
    }

    public static String[] getDemiryoluİstanbul() {
        return demiryoluİstanbul;
    }

    public static String[] getDemiryoluKocaeli() {
        return demiryoluKocaeli;
    }

    public static String[] getDemiryoluBilecik() {
        return demiryoluBilecik;
    }

    public static String[] getDemiryoluAnkara() {
        return demiryoluAnkara;
    }

    public static String[] getDemiryoluEskişehir() {
        return demiryoluEskişehir;
    }

    public static String[] getDemiryoluKonya() {
        return demiryoluKonya;
    }

    public static String[] getHavayoluİstanbul() {
        return havayoluİstanbul;
    }

    public static String[] getHavayoluAnkara() {
        return havayoluAnkara;
    }

    public static String[] getHavayoluKonya() {
        return havayoluKonya;
    }

}
