package com.epam.webdev.task1;

import java.util.Scanner;

public class LastSquareDigitCalculator {

    @SuppressWarnings("resource")
    public static double readInputNumber() {
        Scanner sc = new Scanner(System.in);
        double input = 0;

        System.out.println("Input your number: ");

        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Your input is incorrect. Please, try again:");
        }

        input = sc.nextDouble();

        return input;
    }

    public static int calcSquareLastDigit(double input) {
        String inputStr = String.valueOf(input);
        int lastDigit = Character.getNumericValue(inputStr.charAt(inputStr.length() - 1));
        int lastDigitSquared = lastDigit * lastDigit;
        int lastDigitOfNumberSquared = lastDigitSquared % 10;
        return lastDigitOfNumberSquared;
    }
}
