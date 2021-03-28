package com.epam.webdev.task4;

import java.util.Scanner;

public class EvenChecker {

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

    public static int countEvenNumbers(int... input) {
        int evenCount = 0;

        for (int i : input) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }
}
