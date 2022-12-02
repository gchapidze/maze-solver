package com.developIt;

import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Algorithms {
    private static final List<Point> path = new ArrayList<>();
    private static final int[][] dir = new int[][]{{1, 0}, //down
            {0, 1}, //right
            {0, -1}, //left
            {-1, 0} //up
    };
    private static final boolean NOT_FOUND = true;
    private static boolean[][] visited;

    public void choose(String algorithmName, Rectangle[][] matrix, Point fishPoint, String pinguImage) {
        switch (algorithmName) {
            case "Path-Find" -> findPath(matrix, new Point(0, 0), fishPoint, pinguImage);
        }
    }

    private boolean findPath(Rectangle[][] matrix, Point start, Point end, String pinguImage) {
        ImagePattern pingu = Image.build(pinguImage);
        int count = 0;
        visited = new boolean[matrix.length][matrix[0].length];
        visited[0][0] = true;
        while (NOT_FOUND) {
            for (int mi = 0; mi < dir.length; mi++) {
                int moveY = start.Y() + dir[mi][0];
                int moveX = start.X() + dir[mi][1];
                if (moveY >= 0 && moveY < matrix.length && moveX >= 0 && moveX < matrix[0].length) {
                    if (count > 4) {
                        if (visited[moveY][moveX]) {
                            visited[moveY][moveX] = false;
                            count = 0;
                        } else {
                            continue;
                        }
                    }
                    if (matrix[moveY][moveX].getFill() == Color.BLACK) {
                        count++;
                        continue;
                    }
                    if (visited[moveY][moveX]) {
                        count++;
                        continue;
                    }
                    if (moveX == end.X() && moveY == end.Y()) {
                        matrix[end.Y()][end.X()].setFill(pingu);
                        matrix[start.Y()][start.X()].setFill(Color.GREEN);
                        System.out.println("I am not hungry anymore!");
                        return true;
                    }
                    count = 0;
                    Point newPoint = new Point(moveX, moveY);
                    visited[newPoint.Y()][newPoint.X()] = true;
                    //TODO make visualization a little bit slower
//                    Platform.runLater(() -> {
//                        try {
//                            Thread.sleep(50);
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//                    });
                    matrix[start.Y()][start.X()].setFill(Color.GREEN);
                    start = newPoint;
                    matrix[start.Y()][start.X()].setFill(pingu);
                    mi = 0;
                    continue;
                }
                count++;
            }
        }
    }
}
