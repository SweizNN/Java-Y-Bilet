package com.example.guideneme1;

import com.example.guideneme1.araç.Vehicle;
import com.example.guideneme1.İnsan.Passenger;
import java.util.Random;

public class Reservation {
    //bilet alan kullanıcının atandıgı class
    Passenger passenger;
    private boolean[] doluluk;
    private int dolulukSayac;
    private Vehicle v;



    private Trip trip ;
    public Reservation(Passenger p,Vehicle v,Trip t){
        Random random = new Random();
        setPassenger(p);
        setTrip(t);
        setDolulukSayac(v.getKapasite()-4);
        setV(v);
        boolean[] arr = new boolean[v.getKapasite()];
        arr[0]=arr[1]=arr[2]=arr[3] = true;
        for(int i = 4; i < v.getKapasite(); i++) {
            int j = random.nextInt(10);
            if (j>3) {
                arr[i] = true;
                setDolulukSayac(getDolulukSayac()-1);
            }
            else
                arr[i] = false;
        }
        setDoluluk(arr);
    }



    public Vehicle getV() {
        return v;
    }

    public void setV(Vehicle v) {
        this.v = v;
    }
    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
    public boolean[] getDoluluk() {
        return doluluk;
    }

    public void setDoluluk(boolean[] doluluk) {
        this.doluluk = doluluk;
    }

    public int getDolulukSayac() {
        return dolulukSayac;
    }

    public void setDolulukSayac(int dolulukSayac) {
        this.dolulukSayac = dolulukSayac;
    }
    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

}
