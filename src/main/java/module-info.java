module com.example.vehicle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vehicle to javafx.fxml;
    exports com.example.vehicle;
}