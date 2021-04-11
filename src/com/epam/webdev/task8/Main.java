package com.epam.webdev.task8;

public class Main {
    public static void main(String[] args) throws FunctionCanNotBeCalculatedException {
        double x = InputReader.readInputX();
        double resultOfCalculations = CalculateFunction.calculateFunction(x);

        System.out.println("Result of calculations: " + resultOfCalculations);
    }

}
