package com.developIt;

import java.util.ArrayList;
import java.util.List;

public class FindPath {
    private static boolean NOT_BLOCKED = true;
    private static boolean NOT_FOUND = true;
    static List<Point> path = new ArrayList<>();
    static int[][] dir = new int[][]{{1, 0}, //down
            {0, 1}, //right
            {0, -1}, //left
            {-1, 0} //up
    };
    private static boolean[][] visited;

    public static void main(String[] args) {
        System.out.println();
        Point start = new Point(0, 0);
        Point end = new Point(3, 4);
        findPath(new int[][]{{1, 0, 0, 0, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 1, 1, 1, 1}, {0, 0, 0, 1, 0}}, start, end);
        path.stream().forEach(System.out::println);
    }

    private static boolean findPath(int[][] matrix, Point start, Point end) {
        int count = 0;
        path.add(start);
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
                    if (matrix[moveY][moveX] != 1) {
                        count++;
                        continue;
                    }
                    if (visited[moveY][moveX]) {
                        count++;
                        continue;
                    }

                    if (moveX == end.X() && moveY == end.Y()) {
                        NOT_FOUND = false;
                        path.add(end);
                        return true;
                    }
                    count = 0;
                    Point newPoint = new Point(moveX, moveY);
                    visited[newPoint.Y()][newPoint.X()] = true;
                    start = newPoint;
                    path.add(start);
                    mi = 0;
                    continue;
                }
                count++;
            }
        }
        return false;
    }
}
