package com.epam.webdev.task3;

import java.util.Scanner;

public class SquareCalculator {

    @SuppressWarnings("resource")
    public static double readInputSquareArea() {
        Scanner sc = new Scanner(System.in);
        double inputArea = 0;

        System.out.println("Input outer square area: ");

        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Your input is incorrect. Please, try again:");
        }

        inputArea = sc.nextDouble();

        return inputArea;
    }

    public static double calculateInnerSquareArea(double outerSquareArea) {
        double innerSquareDiagonalLength;
        double innerSquareSideLength;
        double innerSquareArea;

        innerSquareDiagonalLength = calculateSideLengthBySquareArea(outerSquareArea);
        innerSquareSideLength = calculateSquareSideLengthByDiagonalLength(innerSquareDiagonalLength);
        innerSquareArea = calculateSquareAreaBySideLength(innerSquareSideLength);

        return innerSquareArea;
    }

    public static double calculateSquaresAreasRatio(double firstArea, double secondArea) {
        double areaRatio = firstArea / secondArea;
        return areaRatio;
    }

    private static double calculateSideLengthBySquareArea(double squareArea) {
        double sideLength = Math.sqrt(squareArea);
        return sideLength;
    }

    private static double calculateSquareAreaBySideLength(double sideLength) {
        double squareArea = sideLength * sideLength;
        return squareArea;
    }

    private static double calculateSquareSideLengthByDiagonalLength(double diagonalLength) {
        double squareSideLength = Math.sqrt(diagonalLength * diagonalLength / 2);
        return squareSideLength;
    }
}
