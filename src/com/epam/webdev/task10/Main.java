package com.epam.webdev.task10;

import java.util.Map;

public class Main {

    public static void main(String[] args) throws IncorrectBordersException, IncorrectStepException {
        System.out.println("Input left border: ");
        double leftBorder = FunctionCalculator.readInputData();

        System.out.println("Input right border: ");
        double rightBorder = FunctionCalculator.readInputData();

        System.out.println("Input calculation step: ");
        double calculationStep = FunctionCalculator.readInputData();

        Map<Double, Double> results = FunctionCalculator.calculateFunctionValues(leftBorder, rightBorder, calculationStep);

        FunctionCalculator.printResults(results);
    }
}
