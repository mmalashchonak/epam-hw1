package com.epam.webdev.task9;

public class CircleCalculator {

    public static double calculateCircleLength(double radius) throws IncorrectRadiusException {

        if (radius <= 0) {
            throw new IncorrectRadiusException("Radius can not be negative or zero.");
        }

        double circleLength = 2 * radius * Math.PI;
        return circleLength;
    }

    public static double calculateCircleSquare(double radius) throws IncorrectRadiusException {

        if (radius <= 0) {
            throw new IncorrectRadiusException("Radius can not be negative or zero.");
        }

        double circleSquare = Math.PI * radius * radius;
        return circleSquare;
    }
}
