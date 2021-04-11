package com.epam.webdev.task4;

import java.util.Scanner;

public class InputReader {

    @SuppressWarnings("resource")
    public static int readIntegerNumber() {
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("Input your number: ");

        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Your input is incorrect. Please, try again:");
        }

        input = sc.nextInt();

        return input;
    }
}
