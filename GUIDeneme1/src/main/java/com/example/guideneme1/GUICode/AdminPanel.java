package com.example.guideneme1.GUICode;

import com.example.guideneme1.kullanıcı.Company;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AdminPanel extends GirisPanel  {

    //Admin panelinin arayüz kodlarının oldugu yer

    @FXML
    private AnchorPane adminAnchor;

    @FXML
    private JFXButton ekleButon;

    @FXML
    private TextField eklesirketAd;

    @FXML
    private PasswordField eklesirketSifre;

    @FXML
    private JFXButton hizmetBedelButon;

    @FXML
    private JFXButton silButon;

    @FXML
    private TextField silSirket;

    @FXML
    private JFXButton sirketGosterButon;
    @FXML
    private Label sirketler;
    @FXML
    private TextField hizmetBedel;
    @FXML
    private Label hizmetBedelLabel;


//yeni bir şirket nesnesi oluşturuyoruz ve admin classındaki şirket ekleme methoduna gönderiyoruz
    public void sirketEkle(ActionEvent event){
        Company c=new Company(eklesirketAd.getText(),eklesirketSifre.getText());
        admin.addCompany(c);
    }
    //var olan ve eklene sirketleri gösteriyoruz
    public void sirketGoster(ActionEvent event){
        sirketler.setText(admin.showCompanys());
    }

    //sirketleri siliyoruz
    public void sirketSil(ActionEvent event){
        admin.deleteCompany(silSirket.getText());
    }

    //var olan yada yeni girilen hizmet bedelini gösteriyoruz
    public void hizmetBedelCost(ActionEvent event){
        if (!hizmetBedel.getText().isEmpty())
            admin.setHizmetBedel(Integer.parseInt(hizmetBedel.getText()));
        hizmetBedelLabel.setText(String.valueOf(admin.getHizmetBedel()));
    }

    public void ekranDegis() throws IOException {
        new EkranDegis(adminAnchor,"PencereDuzen.fxml");
    }


}