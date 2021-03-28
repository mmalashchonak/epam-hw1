package com.epam.webdev.task7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input first point.");
        Point firstPoint = PointProcessor.readInputPoint();
        System.out.println("Input second point.");
        Point secondPoint = PointProcessor.readInputPoint();

        System.out.println(firstPoint + (firstPoint.compareTo(secondPoint) > 0 ? " farther " : " closer ") +
                "to origin than " + secondPoint);
    }
}
