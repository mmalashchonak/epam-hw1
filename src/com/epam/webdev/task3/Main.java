package com.epam.webdev.task3;

public class Main {

    public static void main(String[] args) {

        double outerSquareArea = SquareCalculator.readInputSquareArea();
        double innerSquareArea = SquareCalculator.calculateInnerSquareArea(outerSquareArea);
        double squareAreasRatio = SquareCalculator.calculateSquaresAreasRatio(outerSquareArea, innerSquareArea);

        System.out.println("Inner square area = " + innerSquareArea);
        System.out.println("Square areas ratio = " + squareAreasRatio);
    }
}
