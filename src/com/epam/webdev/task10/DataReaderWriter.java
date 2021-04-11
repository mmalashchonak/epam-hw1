package com.epam.webdev.task10;

import java.util.Map;
import java.util.Scanner;

public class DataReaderWriter {

    @SuppressWarnings("resource")
    public static double readInputData() {
        Scanner sc = new Scanner(System.in);
        double input;

        System.out.println("Input: ");

        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Your input is incorrect. Please, try again:");
        }

        input = sc.nextDouble();

        return input;
    }

    public static void printResults(Map<Double, Double> results) {
        System.out.println("Input x: | Result");
        results.forEach((key, value) -> System.out.println(key + " | " + value));
    }
}
