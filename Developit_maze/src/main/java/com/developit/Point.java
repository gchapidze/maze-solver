package com.developit;

import java.util.Objects;

public class Point {
    private int y;
    private int x;

    public Point(int x, int y) {
        this.y = y;
        this.x = x;
    }

    public int y() {
        return y;
    }

    public int x() {
        return x;
    }

    public Point left() {
        return new Point(x - 1, y);
    }

    public Point right() {
        return new Point(x + 1, y);
    }
    public Point down() {
        return new Point(x, y + 1);
    }
    public Point up() {
        return new Point(x, y - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return y == point.y && x == point.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(y, x);
    }

    public boolean isValid(int maxX, int maxY) {
        return (x < maxX && x > -1) && (y < maxY && y > -1);
    }

    @Override
    public String toString() {
        return "Point{" +
                "y=" + y +
                ", x=" + x +
                '}';
    }

    enum DIRECTION {
        LEFT(new Point(-1, 0)),
        RIGHT(new Point(1, 0)),
        UP(new Point(0, -1)),
        DOWN(new Point(0, 1));
        private Point point;
        DIRECTION(Point point) {
            this.point = point;
        }
    }
}
