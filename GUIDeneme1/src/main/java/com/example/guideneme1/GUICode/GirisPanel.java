package com.example.guideneme1.GUICode;


import com.example.guideneme1.kullanıcı.Admin;
import com.example.guideneme1.kullanıcı.Company;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.util.Objects;


public class GirisPanel {
    //program çalışınca kullanıcıyı karşılayacak ilk ekran
    @FXML
    private JFXButton KullanıcıButon;

    @FXML
    private JFXButton admingirButon;

    @FXML
    private AnchorPane anaAnchor;

    @FXML
    private JFXButton companygirButon;

    @FXML
    private TextField kullaniciAdi;

    @FXML
    private TextField kullaniciAdi2;

    @FXML
    private PasswordField sifre;

    @FXML
    private PasswordField sifre2;

//giris ekranında admin ve sirket nesneleri tanımladık
    static Admin admin = new Admin();
    static Company c = new Company();



//adminin kullanıcı adı ve sifre girerek kendi paneline ulaşmasını saglayan kod
    @FXML
    public void admingirisEkran(ActionEvent actionEvent) throws IOException {
        if (Objects.equals(sifre.getText(), admin.getSifre()) && Objects.equals(admin.getKullaniciAdi(), kullaniciAdi.getText())) {
           ekranDegis();
        }
    }
    //firmanın kullanıcı adı ve sifre girerek kendi paneline ulaşmasını saglayan kod
    @FXML
    public void companygirisEkran(ActionEvent actionEvent) throws IOException {

        for (Company c : admin.Companyler) {
            if (Objects.equals(c.getKullaniciAdi(), kullaniciAdi2.getText()) && Objects.equals(c.getSifre(), sifre2.getText())){
                ekranDegis2();
                this.c = c;
            }
             }
    }

    @FXML
    public void ekranDegis() throws IOException {
        new EkranDegis(anaAnchor,"AdminPanel.fxml");
    }
    @FXML
    public void ekranDegis2() throws IOException {
        new EkranDegis(anaAnchor,"CompanyPanel.fxml");
    }
    @FXML
    public void ekranDegis3() throws IOException{
        new EkranDegis(anaAnchor,"KullanıcıPanel.fxml");
    }


}
