module com.example.projektquizapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projektquizapp to javafx.fxml;
    exports com.example.projektquizapp;
}