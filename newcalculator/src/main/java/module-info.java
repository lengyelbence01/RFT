module com.example.newcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.newcalculator to javafx.fxml;
    exports com.example.newcalculator;
}