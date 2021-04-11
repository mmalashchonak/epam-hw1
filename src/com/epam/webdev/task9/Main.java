package com.epam.webdev.task9;

public class Main {
    public static void main(String[] args) throws IncorrectRadiusException {
        double radius = InputReader.readInputRadius();

        double circleLength = CircleCalculator.calculateCircleLength(radius);
        double circleSquare = CircleCalculator.calculateCircleSquare(radius);

        System.out.println("Circle length: " + circleLength);
        System.out.println("Circle square: " + circleSquare);
    }
}
