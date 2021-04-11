package com.epam.webdev.task8;

import java.util.Scanner;

public class InputReader {

    @SuppressWarnings("resource")
    public static double readInputX() {
        Scanner sc = new Scanner(System.in);
        double input;

        System.out.println("Input X: ");

        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Your input is incorrect. Please, try again:");
        }

        input = sc.nextDouble();

        return input;
    }
}
