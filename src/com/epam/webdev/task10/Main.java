package com.epam.webdev.task10;

import java.util.Map;

public class Main {

    public static void main(String[] args) throws IncorrectBordersException, IncorrectStepException {
        System.out.println("Input left border: ");
        double leftBorder = DataReaderWriter.readInputData();

        System.out.println("Input right border: ");
        double rightBorder = DataReaderWriter.readInputData();

        System.out.println("Input calculation step: ");
        double calculationStep = DataReaderWriter.readInputData();

        Map<Double, Double> results = FunctionProcessor.calculateFunctionValues(leftBorder, rightBorder, calculationStep);

        DataReaderWriter.printResults(results);
    }
}
