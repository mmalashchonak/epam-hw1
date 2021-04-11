package com.epam.webdev.task8;

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
                throw new FunctionCanNotBeCalculatedException("Division by 0 Exception.");
            }
            result = 1 / divider;
            return result;
        }

    }
}
