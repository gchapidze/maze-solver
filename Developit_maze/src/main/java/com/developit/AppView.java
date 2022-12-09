package com.developit;

import com.developit.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class AppView {
    private AnchorPane root;
    protected static final double WIDTH = 600;
    protected static final double HEIGHT = 425;
    private Rectangle[][] rect_array;

    public AppView() {
        root = new AnchorPane();
        rect_array = new Rectangle[10][10];
        createContent();
    }

    public AnchorPane getRoot() {
        return root;
    }

    private Region createContent() {
        for (int yc = 25, ya = 0; yc < HEIGHT; yc+=40, ya++) {
            for (int xc = 0, xa = 0; xc < WIDTH; xc+= 60, xa++) {
                var rect = new Rectangle();
                rect.setFill(Color.WHITE);
                rect.setStroke(Color.BLACK);
                rect.setLayoutX(xc);
                rect.setLayoutY(yc);
                rect.setWidth(60);
                rect.setHeight(40);
                rect.setOnMouseClicked((click) -> {
                    if (rect.getFill() instanceof ImagePattern)
                        return;
                    if (rect.getFill() == Color.WHITE)
                        rect.setFill(Color.MAGENTA);
                    else rect.setFill(Color.WHITE);
                });

                rect_array[ya][xa] = rect;

                root.getChildren().add(rect);
            }
        }
        return root;
    }

    protected Rectangle[][] getData() {
        return rect_array;
    }
}
