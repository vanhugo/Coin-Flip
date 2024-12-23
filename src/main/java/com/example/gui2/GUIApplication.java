package com.example.gui2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUIApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Load the FXML layout file for the GUI
        FXMLLoader fxmlLoader = new FXMLLoader(GUIApplication.class.getResource("hello-view.fxml"));

        // Create a scene with the specified layout and size
        Scene scene = new Scene(fxmlLoader.load(), 320, 350);

        // Set the title of the application window
        stage.setTitle("CoinFlip");

        // Attach the scene to the stage and show the window
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch();
    }
}
