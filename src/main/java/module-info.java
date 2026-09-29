module com.example.firstprogram {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstprogram to javafx.fxml;
    exports com.example.firstprogram;
}