package com.example.guideneme1.GUICode;

import com.example.guideneme1.Trip;
import com.example.guideneme1.araç.Otobus;
import com.example.guideneme1.araç.Plane;
import com.example.guideneme1.araç.Train;
import com.jfoenix.controls.JFXSlider;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.util.Objects;


public class CompanyPanel extends GirisPanel {
    //firmanın giriş yapınca karşılaştıgı panel ve firma panel arayüzünün kodlarının oldugu yer
    @FXML
    private AnchorPane companyAnchor;
    @FXML
    private JFXTextArea otobusKapasite;
    @FXML
    private AnchorPane otobusAnchor;
    @FXML
    private JFXTextArea otobusID;
    @FXML
    private AnchorPane ucakAnchor;
    @FXML
    private JFXTextArea ucakID;
    @FXML
    private JFXTextArea ucakkapasite;
    @FXML
    private JFXTextArea trenID;
    @FXML
    private JFXTextArea trenkapasite;
    @FXML
    private AnchorPane trenAnchor;
    @FXML
    private JFXTextArea pilotsoforMaas;
    @FXML
    private  JFXTextArea ucakmuavinMaas;
    @FXML
    private JFXTextArea otobussoforMaas;
    @FXML
    private JFXTextArea otobusmuavinMaas;
    @FXML
    private JFXTextArea trensoforMaas;
    @FXML
    private  JFXTextArea trenmuavinMaas;
    @FXML
    private JFXTextArea seferID;
    @FXML
    private JFXTextArea otobusseferAdı;
    @FXML
    private JFXTextArea trenseferAdı;
    @FXML
    private JFXTextArea ucakseferAdı;
    @FXML
    private Label karzarar;
    @FXML
    private JFXSlider dolulukOran;



public void karZar(){
   /* int gider = 0;
    int gelir = 0;
    int kar = 0;
    for (Vehicle v : c.getAraçlar()){
        if (v.getYakıtTur() == "Benzin") {
            gider += v.getSefer().getToplamMesafe() * c.benzinCost
            gider += c.getOtobussoforMaas() * 2 + c.getOtobussoforMaas() * 2;
        }
        if (v.getYakıtTur() == "motorin") {
            gider += v.getSefer().getToplamMesafe() * c.benzinCost
            gider += c.getOtobussoforMaas() * 2 + c.getOtobussoforMaas() * 2;
        }
    }*/

}



//firamnın ucak görevlilerinin maaslarının belirledigi yer
    public void ucakmaasDegis(ActionEvent event){
        if(!pilotsoforMaas.getText().isEmpty()){
            c.setPilotsoforMaas(Integer.parseInt(pilotsoforMaas.getText()));
        }
        else if(!ucakmuavinMaas.getText().isEmpty())
            c.setUcakmuavinMaas(Integer.parseInt(ucakmuavinMaas.getText()));
        else if(!pilotsoforMaas.getText().isEmpty() && !ucakmuavinMaas.getText().isEmpty()){
            c.setPilotsoforMaas(Integer.parseInt(pilotsoforMaas.getText()));
            c.setUcakmuavinMaas(Integer.parseInt(ucakmuavinMaas.getText()));
        }
    }

    //firmanın tren görevlilerinin maaslarının belirledigi yer
    public void trenmaasDegis(ActionEvent event){
        if(!trensoforMaas.getText().isEmpty()){
            c.setTrensoforMaas(Integer.parseInt(trensoforMaas.getText()));
        }
        else if(!trenmuavinMaas.getText().isEmpty())
            c.setTrenmuavinMaas(Integer.parseInt(trenmuavinMaas.getText()));
        else if(!trensoforMaas.getText().isEmpty() && !trenmuavinMaas.getText().isEmpty()){
            c.setTrensoforMaas(Integer.parseInt(trensoforMaas.getText()));
            c.setTrenmuavinMaas(Integer.parseInt(trenmuavinMaas.getText()));
        }
    }
    //firmanın otobus görevlilerinin maaslarının belirledigi yer
    public void otobusmaasDegis(ActionEvent event){
        if(!otobussoforMaas.getText().isEmpty()){
            c.setOtobussoforMaas(Integer.parseInt(otobussoforMaas.getText()));
        }
        else if(!otobusmuavinMaas.getText().isEmpty())
            c.setOtobusmuavinMaas(Integer.parseInt(otobusmuavinMaas.getText()));
        else if(!otobussoforMaas.getText().isEmpty() && !otobusmuavinMaas.getText().isEmpty()){
            c.setOtobussoforMaas(Integer.parseInt(otobussoforMaas.getText()));
            c.setOtobusmuavinMaas(Integer.parseInt(otobusmuavinMaas.getText()));
        }
    }
    //firmanın benzinli otobüs olusturup eklediği yer
    public void otobusEkleBenzin(ActionEvent event){
                Otobus o = new Otobus(otobusID.getText(),Integer.parseInt(otobusKapasite.getText()),"Benzin",admin.tripler.get(Integer.parseInt(otobusseferAdı.getText())-1));
                c.otobusEkle(o);
                admin.tripler.get(Integer.parseInt(otobusseferAdı.getText())-1).getSeferAraclar().add(o);

    }
    //firmanın motorinli otobüs olusturup eklediği yer
    public void otobusEkleMotorin(ActionEvent event){
        Otobus o1=new Otobus(otobusID.getText(),Integer.parseInt(otobusKapasite.getText()),"Motorin", admin.tripler.get(Integer.parseInt(otobusseferAdı.getText())-1));
        c.otobusEkle(o1);
        admin.tripler.get(Integer.parseInt(otobusseferAdı.getText())-1).getSeferAraclar().add(o1);

    }
    //firmanın ucak olusturup ekledigi yer
    public void ucakEkle(ActionEvent event){
        Plane p=new Plane(ucakID.getText(),Integer.parseInt(ucakkapasite.getText()),admin.tripler.get(Integer.parseInt(ucakseferAdı.getText())-1));
        c.ucakEkle(p);
        admin.tripler.get(Integer.parseInt(ucakseferAdı.getText())-1).getSeferAraclar().add(p);
    }
    //firmanın tren olusturup ekledigi yer
    public void trenEkle(ActionEvent event){
        Train t=new Train(trenID.getText(),Integer.parseInt(trenkapasite.getText()), admin.tripler.get(Integer.parseInt(trenseferAdı.getText())-1));
        c.trenEkle(t);
        admin.tripler.get(Integer.parseInt(trenseferAdı.getText())-1).getSeferAraclar().add(t);
    }

    //firmanın var olan otobüsü sildigi yer
    public void otobusSil(ActionEvent event){
        c.aracSilme(otobusID.getText());

    }
    //firmanın var olan ucagı sildigi yer
    public void ucakSil(ActionEvent event){
        c.aracSilme(ucakID.getText());

    }
    //firmanın var olan treni sildigi yer
    public void trenSil(ActionEvent event){
        c.aracSilme(trenID.getText());

    }

    //butonlara action alarak atadıgımız methodlar
    public void seferOlustur(ActionEvent event){
        seferOlustur1();
    }
    public void seferSil(ActionEvent event){
        seferSil1();
    }

    //firmanın yeni bir sefer olusturdugu yer
    public void seferOlustur1(){
        Trip sefer = new Trip("Sefer" + Trip.getSefersayisi(),seferID.getText().split(" "),500);
        admin.tripler.add(sefer);
        System.out.println(admin.tripler.getLast().getSeferadı());
        System.out.println(admin.tripler.size());
        arrayyazdır(sefer.getSefer());
    }
//kontrol etmek icin bir arrayi yazdırdıgımız yer
    public void arrayyazdır(String[] arr){
        String a ="";
        for (String s : arr){
            a = a + " " + s;
        }
        System.out.println(a);
    }

//firmanın seferin adını girip seferi sildigi yer
    public void seferSil1(){
        for (int i = 0;i<admin.tripler.size();i++){
            if(Objects.equals(admin.tripler.get(i).getSeferadı(), seferID.getText()))
            {
                System.out.println("silindi");
                admin.tripler.remove(i);
            }
        }

    }









































//butonların yeni bir ekrana geçirdigi methodlar
    @FXML
    public void geriGel() throws IOException {
        new EkranDegis(companyAnchor,"PencereDuzen.fxml");
    }
    @FXML
    public void ekranDegis2()throws IOException{
        new EkranDegis(companyAnchor,"Otobus.fxml");
    }
    @FXML
    public void ekranDegis3()throws IOException{
        new EkranDegis(companyAnchor,"Ucak.fxml");
    }
    @FXML
    public void ekranDegis4()throws IOException{
        new EkranDegis(companyAnchor,"Tren.fxml");
    }
    @FXML
    public void geriGel1()throws IOException{
        new EkranDegis(otobusAnchor,"CompanyPanel.fxml");


    }
    @FXML
    public void geriGel2()throws IOException{
        new EkranDegis(ucakAnchor,"CompanyPanel.fxml");
    }

    @FXML
    public void geriGel3()throws IOException{
        new EkranDegis(trenAnchor,"CompanyPanel.fxml");
    }





}
