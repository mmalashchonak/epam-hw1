package com.epam.webdev.task5;

import java.util.Scanner;

public class PerfectNumberProcessor {

    @SuppressWarnings("resource")
    public static int readIntegerNumber() {
        Scanner sc = new Scanner(System.in);
        int input = 0;

        System.out.println("Input your number: ");

        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Your input is incorrect. Please, try again:");
        }

        input = sc.nextInt();
        return input;
    }

    public static boolean isNumberPerfect(int inputNumber) {

        int sumOfDividers = 0;

        for (int i = 1; i < inputNumber; i++) {
            if (inputNumber % i == 0) {
                sumOfDividers += i;
            }
        }

        return sumOfDividers == inputNumber;
    }
}
