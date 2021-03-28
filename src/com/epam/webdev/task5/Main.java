package com.epam.webdev.task5;

public class Main {
    public static void main(String[] args) {
        int inputNumber = PerfectNumberChecker.readIntegerNumber();
        boolean isNumberPerfect = PerfectNumberChecker.isNumberPerfect(inputNumber);

        System.out.println("Result of perfect number checking: " + isNumberPerfect);
    }
}
