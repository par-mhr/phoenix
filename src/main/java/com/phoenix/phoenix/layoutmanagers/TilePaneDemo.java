package com.phoenix.phoenix.layoutmanagers;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneDemo extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        TilePane tilePane = new TilePane();
        for (int i = 0; i <= 20 ; i++) {
            Button button = new Button("Hello " +i);
            tilePane.getChildren().add(button);
        }

        Scene scene = new Scene(tilePane, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
}
