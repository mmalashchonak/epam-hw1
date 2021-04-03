package com.epam.webdev.task10;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FunctionProcessor {

    public static Map<Double, Double> calculateFunctionValues(double leftBorder, double rightBorder, double step)
            throws IncorrectBordersException, IncorrectStepException {

        if (leftBorder >= rightBorder) {
            throw new IncorrectBordersException();
        }

        if (step <= 0) {
            throw new IncorrectStepException();
        }

        Map<Double, Double> results = new LinkedHashMap<>();

        for (double i = leftBorder; i <= rightBorder; i += step) {
            double result = Math.tan(i);
            results.put(i, result);
        }

        return results;
    }

    @SuppressWarnings("resource")
    public static double readInputData() {
        Scanner sc = new Scanner(System.in);
        double input = 0;

        System.out.println("Input: ");

        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Your input is incorrect. Please, try again:");
        }

        input = sc.nextDouble();

        return input;
    }

    public static void printResults(Map<Double, Double> results) {
        System.out.println("Input x: | Result");
        results.forEach((key, value) -> System.out.println(key + " | " + value));
    }
}
