package com.epam.webdev.task5;

public class Main {
    public static void main(String[] args) {
        int inputNumber = InputReader.readIntegerNumber();
        boolean isNumberPerfect = PerfectNumberProcessor.isNumberPerfect(inputNumber);

        System.out.println("Result of perfect number checking: " + isNumberPerfect);
    }
}
