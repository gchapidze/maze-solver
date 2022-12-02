package com.developIt;

final class Point {
    private int x;

    public int X() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int Y() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int y;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            return x == ((Point) obj).X() && y == ((Point) obj).Y();
        }
        return false;
    }

    @Override
    public String toString() {
        return "X:" + x + " Y:" + y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Point(x, y);
    }
}
