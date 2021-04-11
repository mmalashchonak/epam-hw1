package com.epam.webdev.task7;

public class Main {
    public static void main(String[] args) throws SameDistanceException {
        System.out.println("Input first point.");
        Point firstPoint = InputReader.readInputPoint();
        System.out.println("Input second point.");
        Point secondPoint = InputReader.readInputPoint();

        Point closerPoint = PointProcessor.returnPointCloserToOrigin(firstPoint, secondPoint);

        System.out.println(closerPoint + " closer to origin.");
    }
}
