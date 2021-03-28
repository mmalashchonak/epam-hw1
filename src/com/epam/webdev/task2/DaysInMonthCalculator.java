package com.epam.webdev.task2;

import java.time.Month;
import java.util.Scanner;

public class DaysInMonthCalculator {

    public static final int LEAP_YEAR_DIVIDER_FOUR = 4;
    public static final int LEAP_YEAR_DIVIDER_HUNDRED = 100;
    public static final int LEAP_YEAR_DIVIDER_FOUR_HUNDRED = 400;

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

    public static boolean isLeapYear(int year) {

        boolean isLeapYear;

        boolean isDividedByFour = year % LEAP_YEAR_DIVIDER_FOUR == 0;
        boolean isDividedByHundred = year % LEAP_YEAR_DIVIDER_HUNDRED == 0;
        boolean isDividedByFourHundred = year % LEAP_YEAR_DIVIDER_FOUR_HUNDRED == 0;

        boolean leapYearFirstCase = isDividedByFour && !isDividedByHundred;
        boolean leapYearSecondCase = isDividedByFourHundred;

        isLeapYear = leapYearFirstCase || leapYearSecondCase;

        return isLeapYear;
    }


    public static int calculateDaysInMonth(Date date) {
        int days;

        Month month = date.getMonth();
        int year = date.getYear();

        if (month == Month.FEBRUARY && isLeapYear(year)) {
            days = 29;
        } else if (month == Month.FEBRUARY && !isLeapYear(year)) {
            days = 28;
        } else if (month == Month.APRIL || month == Month.JUNE || month == Month.SEPTEMBER || month == Month.NOVEMBER) {
            days = 30;
        } else {
            days = 31;
        }

        return days;
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
