package com.developit;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        AppModel model = new AppModel();
        primaryStage.setScene(model.getScene());
        primaryStage.setTitle("Maze");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
