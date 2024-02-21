
module com.example.guideneme1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;


    opens com.example.guideneme1 to javafx.fxml;
    exports com.example.guideneme1;
    exports com.example.guideneme1.GUICode;
    opens com.example.guideneme1.GUICode to javafx.fxml;


}
