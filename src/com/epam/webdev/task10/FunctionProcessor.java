package com.epam.webdev.task10;

import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionProcessor {

    public static Map<Double, Double> calculateFunctionValues(double leftBorder, double rightBorder, double step)
            throws IncorrectBordersException, IncorrectStepException {

        if (leftBorder >= rightBorder) {
            throw new IncorrectBordersException("Left border can no be bigger than right border.");
        }

        if (step <= 0) {
            throw new IncorrectStepException("Step can not be negative or zero.");
        }

        Map<Double, Double> results = new LinkedHashMap<>();

        for (double i = leftBorder; i <= rightBorder; i += step) {
            double result = Math.tan(i);
            results.put(i, result);
        }

        return results;
    }
}
