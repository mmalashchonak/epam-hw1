package com.epam.webdev.task8;

import java.util.Scanner;

public class CalculateFunction {
    private static final double CALCULATIONS_ERROR = 0.001;

    public static double calculateFunction(double x) throws FunctionCanNotBeCalculatedException {
        double result;

        if (x >= 3) {
            result = -(x * x) + (x * 3) + 9;
            return result;
        } else {
        double divider = Math.pow(x, 3) - 6;

        if (Math.abs(divider) < CALCULATIONS_ERROR) {
            throw new FunctionCanNotBeCalculatedException();
        }
        result = 1 / divider;
        return result;
    }

}

    @SuppressWarnings("resource")
    public static double readInputX() {
        Scanner sc = new Scanner(System.in);
        double input = 0;

        System.out.println("Input X: ");

        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Your input is incorrect. Please, try again:");
        }

        input = sc.nextDouble();

        return input;
    }
}
