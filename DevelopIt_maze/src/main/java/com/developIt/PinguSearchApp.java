package com.developIt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class PinguSearchApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PinguSearchApp.class.getResource("hungryPingu.fxml"));
        System.setProperty("javafx.version", "17.0.2");
        Scene scene = new Scene(fxmlLoader.load());
        cancelAllThreadsWhenClosed(stage);

        stage.setTitle("Hungry Pingu");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    private static void cancelAllThreadsWhenClosed(Stage stage) {
        stage.setOnCloseRequest((e) -> {
            MainController.timer.cancel();
        });
    }

    public static void main(String[] args) {
        launch();
    }
}