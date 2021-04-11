package com.epam.webdev.task4;

public class Main {
    public static void main(String[] args) {
        int a = InputReader.readIntegerNumber();
        int b = InputReader.readIntegerNumber();
        int c = InputReader.readIntegerNumber();
        int d = InputReader.readIntegerNumber();

        boolean checkTwoEven = EvenChecker.checkIfTwoEvenNumbers(a, b, c, d);

        System.out.println("Result of even checking: " + checkTwoEven);
    }
}
