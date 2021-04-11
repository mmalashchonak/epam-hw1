package com.epam.webdev.task7;

import java.io.Serializable;

public class Point implements Comparable<Point>, Serializable {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Double calculateDistanceToOrigin() {
        Double distanceToOrigin = Math.sqrt(x * x + y * y);
        return distanceToOrigin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o.getClass() == Point.class)) return false;
        Point point = (Point) o;
        return getX() == point.getX() &&
                getY() == point.getY();
    }

    @Override
    public int hashCode() {
        int result = 31 * getX() + getY();
        return result;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }

    @Override
    public int compareTo(Point o) {
        int result = this.calculateDistanceToOrigin().compareTo(o.calculateDistanceToOrigin());
        return result;
    }
}
