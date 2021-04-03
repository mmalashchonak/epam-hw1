package com.epam.webdev.task10;

import java.util.Map;

public class Main {

    public static void main(String[] args) throws IncorrectBordersException, IncorrectStepException {
        System.out.println("Input left border: ");
        double leftBorder = FunctionProcessor.readInputData();

        System.out.println("Input right border: ");
        double rightBorder = FunctionProcessor.readInputData();

        System.out.println("Input calculation step: ");
        double calculationStep = FunctionProcessor.readInputData();

        Map<Double, Double> results = FunctionProcessor.calculateFunctionValues(leftBorder, rightBorder, calculationStep);

        FunctionProcessor.printResults(results);
    }
}
