package com.example.vehicle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class VehicleApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("vehicle.fxml"));
        VBox root = loader.load();
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Vehicle Tax Calculator");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
