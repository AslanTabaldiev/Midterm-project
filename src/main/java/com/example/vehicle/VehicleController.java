package com.example.vehicle;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

import java.text.NumberFormat;
import java.util.Locale;

public class VehicleController {
    @FXML
    private RadioButton carRadio;
    @FXML
    private RadioButton busRadio;
    @FXML
    private RadioButton truckRadio;
    @FXML
    private TextField engineCapacityField;
    @FXML
    private TextField manufactureYearField;
    @FXML
    private Label resultLabel;

    private final NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("ky", "KG")); // For som currency format

    @FXML
    private void calculateTax() {
        try {
            int engineCapacity = Integer.parseInt(engineCapacityField.getText());
            int manufactureYear = Integer.parseInt(manufactureYearField.getText());

            Vehicle vehicle;
            if (carRadio.isSelected()) {
                vehicle = new Car(engineCapacity, manufactureYear);
            } else if (busRadio.isSelected()) {
                vehicle = new Bus(engineCapacity, manufactureYear);
            } else if (truckRadio.isSelected()) {
                vehicle = new Truck(engineCapacity, manufactureYear);
            } else {
                showAlert("Error", "Please select a vehicle type.");
                return;
            }

            double tax = vehicle.calculateTax();
            resultLabel.setText("Calculated Tax: " + currencyFormat.format(tax));

        } catch (NumberFormatException e) {
            showAlert("Invalid Input", "Please enter valid numbers for engine capacity and manufacture year.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
