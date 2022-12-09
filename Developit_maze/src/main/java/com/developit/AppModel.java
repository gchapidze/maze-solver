package com.developit;

import com.developit.image.Image;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class AppModel {
    private StringProperty steps = new SimpleStringProperty("Steps: 0");
    private AppView appView;
    private String starfish = "Developit_maze/src/main/resources/com.developit/starfish.jpg";
    private String oyster = "Developit_maze/src/main/resources/com.developit/oyster.jpg";
    private Rectangle[][] rect_array;
    private Scene scene;

    public AppModel() {
        appView = new AppView();
        rect_array = appView.getData();
        scene = new Scene(appView.getRoot(), AppView.WIDTH, AppView.HEIGHT);
        setImage(new Rectangle[]{rect_array[0][0], randomRectangle()}, new String[]{starfish, oyster});
        addLabel();
        addMenuButton();
    }

    private void addLabel() {
        Label stepsLabel = new Label();
        stepsLabel.setStyle("-fx-background-color: WHITE; -fx-text-fill: Green");
        stepsLabel.setText(steps.get());
        stepsLabel.textProperty().bind(steps);
        stepsLabel.setPrefWidth(60);
        stepsLabel.setPrefHeight(10);
        stepsLabel.setAlignment(Pos.CENTER);
        stepsLabel.setLayoutX(AppView.WIDTH - 60);
        stepsLabel.setLayoutY(25/2.0 - 8);
        appView.getRoot().getChildren().add(stepsLabel);
    }

    private Rectangle randomRectangle() {
        Random random = new Random();
        int y = random.nextInt(rect_array.length);
        int x = random.nextInt(rect_array[0].length);

        return rect_array[y][x];
    }

    public Scene getScene() {
        return scene;
    }

    private void addMenuButton() {
        MenuButton menuButton = new MenuButton();
        menuButton.setText("Algorithms");
        menuButton.setLayoutX(0);
        menuButton.setLayoutY(0);

        MenuItem menuItem = new MenuItem("Path-Find");
        menuButton.getItems().add(menuItem);

        appView.getRoot().getChildren().add(menuButton);
    }

    private void setImage(Rectangle[] rectangles, String[] images) {
        for (int oc = 0; oc < rectangles.length; oc++) {
            rectangles[oc].setFill(Image.build(images[oc]));
        }
    }
}
