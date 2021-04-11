package com.epam.webdev.task3;

import java.util.Scanner;

public class InputReader {

    @SuppressWarnings("resource")
    public static double readInputSquareArea() {
        Scanner sc = new Scanner(System.in);
        double inputArea = 0;

        System.out.println("Input outer square area: ");

        while (inputArea <= 0) {
            if (sc.hasNextDouble()) {
                inputArea = sc.nextDouble();
            } else {
                System.out.println("Your input is incorrect. Please, try again:");
                sc.nextLine();
            }
        }

        return inputArea;
    }
}
