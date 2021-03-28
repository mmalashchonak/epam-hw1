package com.epam.webdev.task4;

public class Main {
    public static void main(String[] args) {
        int a = EvenChecker.readIntegerNumber();
        int b = EvenChecker.readIntegerNumber();
        int c = EvenChecker.readIntegerNumber();
        int d = EvenChecker.readIntegerNumber();

        boolean checkTwoEven;

        int countEvenNumbers = EvenChecker.countEvenNumbers(a, b, c, d);

        checkTwoEven = countEvenNumbers >= 2;

        System.out.println("Result of even checking: " + checkTwoEven);
    }
}
