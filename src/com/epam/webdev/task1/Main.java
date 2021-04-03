package com.epam.webdev.task1;

public class Main {

    public static void main(String[] args) {
        double inputDigit = LastSquareDigitProcessor.readInputNumber();
        int lastSquareDigit = LastSquareDigitProcessor.calcSquareLastDigit(inputDigit);

        System.out.println("Last digit of your number squared = " + lastSquareDigit);
    }
}
