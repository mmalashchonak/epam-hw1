package com.epam.webdev.task2;

import java.time.Month;
import java.util.Scanner;

public class InputReader {

    public static final String YEAR_PATTERN = "[0-9]+";
    public static final String MONTH_PATTERN = "^(1[0-2]|[1-9])$";

    public static Date readInputDate() {
        int year;
        Month month;
        Date date;

        System.out.println("Input year: ");

        year = readIntByPattern(YEAR_PATTERN);

        System.out.println("Input month from 1 to 12: ");

        month = Month.of(readIntByPattern(MONTH_PATTERN));
        date = new Date(year, month);

        return date;
    }

    @SuppressWarnings("resource")
    public static int readIntByPattern(String pattern) {
        Scanner sc = new Scanner(System.in);
        int output;

        while (!sc.hasNext(pattern)) {
            System.out.println("Your input is incorrect. Please, try again:");
            sc.nextLine();
        }

        output = sc.nextInt();
        return output;
    }
}
