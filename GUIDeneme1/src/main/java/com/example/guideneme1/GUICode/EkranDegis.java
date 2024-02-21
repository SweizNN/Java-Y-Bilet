package com.example.guideneme1.GUICode;

import com.example.guideneme1.GUIMain;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class EkranDegis {
    //ekran degistirmek icin kullanılan class
    public EkranDegis(AnchorPane currentAnchorPane, String fxml) throws IOException{
        AnchorPane nextAnchorPane= FXMLLoader.load(Objects.requireNonNull(GUIMain.class.getResource(fxml)));
        currentAnchorPane.getChildren().removeAll();
        currentAnchorPane.getChildren().setAll(nextAnchorPane);
    }
}
