package com.phoenix.phoenix.layoutmanagers;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StackPaneDemo extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane stackPane = new StackPane();
        Image image = new Image(StackPaneDemo.class.getResourceAsStream("/images/phoenix.jpg"));
        ImageView imageView = new ImageView(image);
        stackPane.getChildren().add(imageView);

        imageView.setFitWidth(600);
        imageView.setFitHeight(400);

        Label label = new Label("Example of StackPane!");
        label.setFont(Font.font("Poppins", 20));
        label.setTextFill(Color.WHITE);
        StackPane.setAlignment(label, Pos.BOTTOM_CENTER);
        stackPane.getChildren().add(label);

        Scene scene = new Scene(stackPane, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
}
