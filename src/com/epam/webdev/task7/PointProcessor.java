package com.epam.webdev.task7;

import java.util.Scanner;

public class PointProcessor {

    public static Point readInputPoint() {
        int x;
        int y;

        System.out.println("Input point x coordinate: ");
        x = readIntFromConsole();

        System.out.println("Input point y coordinate: ");
        y = readIntFromConsole();

        Point point = new Point(x, y);

        return point;
    }

    @SuppressWarnings("resource")
    public static int readIntFromConsole() {
        Scanner sc = new Scanner(System.in);
        int output;

        while (!sc.hasNextInt()) {
            System.out.println("Your input is incorrect. Please, try again:");
            sc.nextLine();
        }

        output = sc.nextInt();
        return output;
    }
}
