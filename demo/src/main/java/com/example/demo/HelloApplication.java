package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.sizeToScene();
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/icon.png"))));


//        scene.getStylesheets().add(HelloApplication.class.getResource("styles.css").toExternalForm());

    }

    public static void main(String[] args) {
        launch();
    }
}