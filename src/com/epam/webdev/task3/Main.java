package com.epam.webdev.task3;

public class Main {

    public static void main(String[] args) throws IncorrectAreaException, IncorrectLengthException {

        double outerSquareArea = InputReader.readInputSquareArea();
        double innerSquareArea = SquareProcessor.calculateInnerSquareArea(outerSquareArea);
        double squareAreasRatio = SquareProcessor.calculateSquaresAreasRatio(outerSquareArea, innerSquareArea);

        System.out.println("Inner square area = " + innerSquareArea);
        System.out.println("Square areas ratio = " + squareAreasRatio);
    }
}
