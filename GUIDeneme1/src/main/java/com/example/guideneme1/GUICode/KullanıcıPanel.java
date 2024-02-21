package com.example.guideneme1.GUICode;

import com.example.guideneme1.Reservation;
import com.example.guideneme1.Trip;
import com.example.guideneme1.araç.Vehicle;
import com.example.guideneme1.İnsan.Passenger;
import com.jfoenix.controls.JFXTextArea;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class KullanıcıPanel extends GirisPanel{
    //kullanıcı bilet al butonuna basıp karşılaştıgı ekranın kodlarının oldugu yer
    @FXML
    private AnchorPane kullanıcıAnchor;
    @FXML
    private JFXTextArea kullanıcıBinisYer;
    @FXML
    private DatePicker kullanıcıDogum;
    @FXML
    private JFXTextArea kullanıcıHangiSefer;
    @FXML
    private JFXTextArea kullanıcıKisiSayısı;
    @FXML
    private DatePicker kullanıcıSeferTarih;
    @FXML
    private JFXTextArea kullanıcıSoyad;
    @FXML
    private JFXTextArea kullanıcıTC;
    @FXML
    private JFXTextArea kullanıcıİnisYer;
    @FXML
    private JFXTextArea kullanıcıİsim;
    @FXML
    private Label uygunSeferler;
    @FXML
    private Label biletBilgileriGoster;
    @FXML
    private Label bosKoltuklar;

    @FXML
    private Label sayisi;


    private ArrayList<Trip> uygunSeferArrayleri = new ArrayList<>();
    private Reservation reservation;




//kullanıcı binicegi yeri ve inicegi yeri girip uygun seferleri ve seferin tarihini seçip aracları gördügü yerin kodu
    public void seferBul(){

        ArrayList<Trip> uygunSeferArrayleri = new ArrayList<>();
        for (Trip t : admin.tripler)
                for (int i = 0;i< t.getSefer().length;i++){
                    if (Objects.equals(t.getSefer()[i].toLowerCase(),kullanıcıBinisYer.getText().toLowerCase())) {
                        for (int j = i+1;j<t.getSefer().length;j++){
                            if (Objects.equals(t.getSefer()[j].toLowerCase(),kullanıcıİnisYer.getText().toLowerCase())) {
                                uygunSeferler.setText(uygunSeferler.getText() + "\n"+"--------------------"+"\n" + t.getSeferadı().toUpperCase()+arrayYazdır(t.getSeferAraclar()));
                                uygunSeferArrayleri.add(t);
                                break;
                            }
                        }
                        break;
                    }
            }
        setUygunSeferArrayleri(uygunSeferArrayleri);
    }

    public void aracSec(){
        LocalDate date=kullanıcıDogum.getValue();
        String formatlıDate=date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        Passenger yolcu=new Passenger(kullanıcıİsim.getText(),kullanıcıSoyad.getText(),kullanıcıTC.getText(),formatlıDate);
        for (Trip t:getUygunSeferArrayleri()){
            for(Vehicle v:t.getSeferAraclar()){
                if(Objects.equals(v.getAracID(),kullanıcıHangiSefer.getText())){
                    System.out.println("SAA");
                    setReservation(new Reservation(yolcu,v,t));
                }
            }
        }
        sayisi.setText(String.valueOf(getReservation().getDolulukSayac()));

        for (int i = 0;i<getReservation().getDoluluk().length;i++)
            if (!getReservation().getDoluluk()[i]) {
                System.out.println(i);
                bosKoltuklar.setText(bosKoltuklar.getText() + i + ",");
            }
    }

//kullanıcı isim soyisim tc ve dogum tarihi gibi bilgileri girip sisteme otomatik kaydeden ve kendi sectigi aracı girip bilet bilgilerini gösteren kod
    public void odemeYap() {
        if (reservation.getDolulukSayac()>=Integer.parseInt(kullanıcıKisiSayısı.getText()))
        {
            //bilet bilgilerinin yazdırıldıgı yer
                    LocalDate date2=kullanıcıSeferTarih.getValue();
                    String formatlidate2=date2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    biletBilgileriGoster.setText(biletBilgileriGoster.getText()+ "Seferin adı: "+getReservation().getTrip().getSeferadı()+"\n" +"Seferin sirketi ve aracı: "+getReservation().getV().getAracID()+"\n"+"Seferin tarihi: "+"\n"+formatlidate2+"\n");
                    biletBilgileriGoster.setText(biletBilgileriGoster.getText()+ "Yolcu adı: "+getReservation().getPassenger().getIsim()+"\n"+"Yolcu soyadı: "+getReservation().getPassenger().getSoyisim()+"\n"+"Yolcu tc: "+getReservation().getPassenger().getTckimlik()+"\n"+"Yolcu dogum tarihi: "+getReservation().getPassenger().getDogumTarih());
        }





    }





















//arac arraylistini arayüzde yazdırmak için kullandıgımız yer
    public String arrayYazdır(ArrayList<Vehicle> arr){
        String a ="";
        for (Vehicle v : arr){
            System.out.println(v.getAracID());
            a = a + "\n" + v.getAracID();
        }
        return a;
    }

    @FXML
    public void geriGel() throws IOException{
        new EkranDegis(kullanıcıAnchor,"PencereDuzen.fxml");
    }
    public ArrayList<Trip> getUygunSeferArrayleri() {
        return uygunSeferArrayleri;
    }

    public void setUygunSeferArrayleri(ArrayList<Trip> uygunSeferArrayleri) {
        this.uygunSeferArrayleri = uygunSeferArrayleri;
    }
    public Reservation getReservation() {
        return reservation;
    }


    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
