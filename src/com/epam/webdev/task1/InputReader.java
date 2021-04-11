package com.epam.webdev.task1;

import java.util.Scanner;

public class InputReader {

    @SuppressWarnings("resource")
    public static double readInputNumber() {
        Scanner sc = new Scanner(System.in);
        double input;

        System.out.println("Input your number: ");

        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Your input is incorrect. Please, try again:");
        }

        input = sc.nextDouble();

        return input;
    }
}
