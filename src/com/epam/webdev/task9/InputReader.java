package com.epam.webdev.task9;

import java.util.Scanner;

public class InputReader {

    @SuppressWarnings("resource")
    public static double readInputRadius() {
        Scanner sc = new Scanner(System.in);
        double input = 0;

        System.out.println("Input radius: ");
        while (input <= 0) {
            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
            } else {
                System.out.println("Your input is incorrect. Please, try again:");
                sc.nextLine();
            }
        }

        return input;
    }
}
