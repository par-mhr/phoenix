package com.phoenix.phoenix.layoutmanagers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class VBoxDemo extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        for (int i = 0; i <= 5; i++) {
            Button button = new Button("Hello "+i);
            vBox.getChildren().add(button);
        }

        Scene scene = new Scene(vBox, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
}
