package com.epam.webdev.task3;

import java.util.Scanner;

public class SquareProcessor {

    @SuppressWarnings("resource")
    public static double readInputSquareArea() {
        Scanner sc = new Scanner(System.in);
        double inputArea = 0;

        System.out.println("Input outer square area: ");

        while (inputArea <= 0) {
            if (sc.hasNextDouble()) {
                inputArea = sc.nextDouble();
            } else {
                System.out.println("Your input is incorrect. Please, try again:");
                sc.nextLine();
            }
        }

        return inputArea;
    }

    public static double calculateInnerSquareArea(double outerSquareArea) throws IncorrectAreaException, IncorrectLengthException {

        if (outerSquareArea <= 0){
            throw new IncorrectAreaException();
        }

        double innerSquareDiagonalLength;
        double innerSquareSideLength;
        double innerSquareArea;

        innerSquareDiagonalLength = calculateSideLengthBySquareArea(outerSquareArea);
        innerSquareSideLength = calculateSquareSideLengthByDiagonalLength(innerSquareDiagonalLength);
        innerSquareArea = calculateSquareAreaBySideLength(innerSquareSideLength);

        return innerSquareArea;
    }

    public static double calculateSquaresAreasRatio(double firstArea, double secondArea) throws IncorrectAreaException {

        if(firstArea <= 0 || secondArea <= 0){
            throw new IncorrectAreaException();
        }

        double areaRatio = firstArea / secondArea;
        return areaRatio;
    }

    private static double calculateSideLengthBySquareArea(double squareArea) throws IncorrectAreaException {

        if(squareArea <= 0){
            throw new IncorrectAreaException();
        }

        double sideLength = Math.sqrt(squareArea);
        return sideLength;
    }

    private static double calculateSquareAreaBySideLength(double sideLength) throws IncorrectLengthException {

        if(sideLength <= 0){
            throw new IncorrectLengthException();
        }

        double squareArea = sideLength * sideLength;
        return squareArea;
    }

    private static double calculateSquareSideLengthByDiagonalLength(double diagonalLength) throws IncorrectLengthException {

        if(diagonalLength <= 0){
            throw new IncorrectLengthException();
        }

        double squareSideLength = Math.sqrt(diagonalLength * diagonalLength / 2);
        return squareSideLength;
    }
}
