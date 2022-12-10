package com.developit;

import com.developit.image.Image;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AppModel {
    private Point destination;
    private StringProperty steps = new SimpleStringProperty("Steps: 0");
    private AppView appView;
    private final String starfish = "Developit_maze/src/main/resources/com.developit/starfish.jpg";
    private final String oyster = "Developit_maze/src/main/resources/com.developit/oyster.jpg";
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
        stepsLabel.setPrefWidth(70);
        stepsLabel.setPrefHeight(10);
        stepsLabel.setAlignment(Pos.CENTER);
        stepsLabel.setLayoutX(AppView.WIDTH - 70);
        stepsLabel.setLayoutY(25 / 2.0 - 8);
        appView.getRoot().getChildren().add(stepsLabel);
    }

    private Rectangle randomRectangle() {
        Random random = new Random();
        int y = random.nextInt(rect_array.length);
        int x = random.nextInt(rect_array[0].length);
        destination = new Point(x, y);

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

        MenuItem menuItem = new MenuItem("DFS");
        menuButton.getItems().add(menuItem);

        Thread algorithmThread = new Thread(() -> {
            var integer = new AtomicInteger();
            integer.set(0);
            Queue<Point> path = findPath(rect_array, destination);
            rect_array[0][0].setFill(Color.WHITE);
            Point prev = new Point(0, 0);
            rect_array[prev.y()][prev.x()].setFill(Color.WHITE);
            while (!path.isEmpty()) {
                Point currentLocation = path.poll();
                Platform.runLater(() -> {
                    steps.set("Steps: " + integer.incrementAndGet());
                });
                if (currentLocation.equals(destination)) {
                    rect_array[currentLocation.y()][currentLocation.x()].setFill(Image.build(starfish));
                } else
                rect_array[currentLocation.y()][currentLocation.x()].setFill(Color.GREEN);
            }
        });
        menuItem.setOnAction((click) -> {
            algorithmThread.start();
        });

        appView.getRoot().getChildren().add(menuButton);
    }

    private void setImage(Rectangle[] rectangles, String[] images) {
        for (int oc = 0; oc < rectangles.length; oc++) {
            rectangles[oc].setFill(Image.build(images[oc]));
        }
    }

    private Queue<Point> findPath(Rectangle[][] matrix, Point destPoint) {
        Point move = null;
        var dir = new ArrayList<Point>();
        dir.add(new Point(1, 0)); // right
        dir.add(new Point(0, 1)); // down
        dir.add(new Point(-1, 0)); // left
        dir.add(new Point(0, -1)); // up

        Point start = new Point(0, 0);

        var tmpPath = new ArrayDeque<Point>();
        var path = new ArrayDeque<Point>();

        tmpPath.add(new Point(0, 0));

        while (!tmpPath.isEmpty()) {

            for (int dc = 0; dc < dir.size(); dc++) {
                move = new Point(start.x() + dir.get(dc).x(), start.y() + dir.get(dc).y());
                if (!move.isValid(matrix[0].length, matrix.length)) {
                    continue;
                }
                if (matrix[move.y()][move.x()].getFill() != Color.MAGENTA) {
                    var tmp = move;

                    tmpPath.add(move);
                    Point p = tmpPath.poll();

                    if (path.contains(tmp) && countWalls(tmp) < 3) {
                        continue;
                    }
                    start = tmp;
                    path.add(start);
                    if (path.getLast().equals(destPoint)) {
                        return path;
                    }

                    break;
                }
            }
        }
        return null;
    }

    private int countWalls(Point point) {
        int count = 0;
        List<Point> direction = new ArrayList<Point>();
        direction.add(new Point(1, 0)); // right
        direction.add(new Point(0, 1)); // down
        direction.add(new Point(-1, 0)); // left
        direction.add(new Point(0, -1)); // up

        for (int i = 0; i < direction.size(); i++) {
            var p = new Point(point.x() + direction.get(i).x(), point.y() + direction.get(i).y());
            if (p.isValid(rect_array[0].length, rect_array.length)) {
                if (rect_array[p.y()][p.x()].getFill() == Color.MAGENTA) {
                    count++;
                }
            } else count++;
        }
        return count;
    }
}
