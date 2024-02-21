package com.example.guideneme1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class GUIMain extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
//pencere oluşturma
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("PencereDuzen.fxml")));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Uygulama");
            primaryStage.setScene(scene);
            primaryStage.show();

    }


    public static void main(String[] args) {
        launch();
    }

}