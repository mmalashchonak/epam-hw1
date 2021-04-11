package com.epam.webdev.task3;

public class SquareProcessor {

    public static double calculateInnerSquareArea(double outerSquareArea) throws IncorrectAreaException, IncorrectLengthException {

        if (outerSquareArea <= 0){
            throw new IncorrectAreaException("Area can not be negative or null.");
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
            throw new IncorrectAreaException("Area can not be negative or null.");
        }

        double areaRatio = firstArea / secondArea;
        return areaRatio;
    }

    private static double calculateSideLengthBySquareArea(double squareArea) throws IncorrectAreaException {

        if(squareArea <= 0){
            throw new IncorrectAreaException("Area can not be negative or null.");
        }

        double sideLength = Math.sqrt(squareArea);
        return sideLength;
    }

    private static double calculateSquareAreaBySideLength(double sideLength) throws IncorrectLengthException {

        if(sideLength <= 0){
            throw new IncorrectLengthException("Length can not be negative or null.");
        }

        double squareArea = sideLength * sideLength;
        return squareArea;
    }

    private static double calculateSquareSideLengthByDiagonalLength(double diagonalLength) throws IncorrectLengthException {

        if(diagonalLength <= 0){
            throw new IncorrectLengthException("Length can not be negative or null.");
        }

        double squareSideLength = Math.sqrt(diagonalLength * diagonalLength / 2);
        return squareSideLength;
    }
}
