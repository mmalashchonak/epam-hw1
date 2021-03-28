package com.epam.webdev.task9;

import java.util.Scanner;

public class CircleCalculator {

    public static double calculateCircleLength(double radius) {
        double circleLength = 2 * radius * Math.PI;
        return circleLength;
    }

    public static double calculateCircleSquare(double radius) {
        double circleSquare = Math.PI * radius * radius;
        return circleSquare;
    }

    @SuppressWarnings("resource")
    public static double readInputRadius() {
        Scanner sc = new Scanner(System.in);
        double input = 0;

        System.out.println("Input radius: ");

        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Your input is incorrect. Please, try again:");
        }

        input = sc.nextDouble();

        return input;
    }
}
