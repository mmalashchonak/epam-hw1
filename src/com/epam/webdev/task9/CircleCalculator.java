package com.epam.webdev.task9;

import java.util.Scanner;

public class CircleCalculator {

    public static double calculateCircleLength(double radius) throws IncorrectRadiusException {

        if (radius <= 0) {
            throw new IncorrectRadiusException();
        }

        double circleLength = 2 * radius * Math.PI;
        return circleLength;
    }

    public static double calculateCircleSquare(double radius) throws IncorrectRadiusException {

        if (radius <= 0) {
            throw new IncorrectRadiusException();
        }

        double circleSquare = Math.PI * radius * radius;
        return circleSquare;
    }

    @SuppressWarnings("resource")
    public static double readInputRadius() {
        Scanner sc = new Scanner(System.in);
        double input = 0;

        System.out.println("Input radius: ");
        while (input <= 0) {
            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
            } else {
                System.out.println("Your input is incorrect. Please, try again:");
                sc.nextLine();
            }
        }

        return input;
    }
}
