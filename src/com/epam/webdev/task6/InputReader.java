package com.epam.webdev.task6;

import java.util.Scanner;

public class InputReader {

    public static final int SECONDS_IN_DAY = 86400;

    @SuppressWarnings("resource")
    public static int readInputSeconds() {
        Scanner sc = new Scanner(System.in);
        int inputSeconds = 0;

        while (inputSeconds < 1 || inputSeconds > SECONDS_IN_DAY) {
            System.out.print("Input seconds: ");
            if (sc.hasNextInt()) {
                inputSeconds = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please try again.");
                sc.nextLine();
            }
        }
        return inputSeconds;
    }
}
