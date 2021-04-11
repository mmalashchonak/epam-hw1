package com.epam.webdev.task2;

import java.time.Month;

public class DaysInMonthProcessor {

    public static final int LEAP_YEAR_DIVIDER_FOUR = 4;
    public static final int LEAP_YEAR_DIVIDER_HUNDRED = 100;
    public static final int LEAP_YEAR_DIVIDER_FOUR_HUNDRED = 400;

    public static boolean isLeapYear(int year) throws NegativeYearException {

        if(year < 0) {
            throw new NegativeYearException("Year can not be negative.");
        }

        boolean isLeapYear;

        boolean isDividedByFour = year % LEAP_YEAR_DIVIDER_FOUR == 0;
        boolean isDividedByHundred = year % LEAP_YEAR_DIVIDER_HUNDRED == 0;
        boolean isDividedByFourHundred = year % LEAP_YEAR_DIVIDER_FOUR_HUNDRED == 0;

        boolean leapYearFirstCase = isDividedByFour && !isDividedByHundred;
        boolean leapYearSecondCase = isDividedByFourHundred;

        isLeapYear = leapYearFirstCase || leapYearSecondCase;

        return isLeapYear;
    }


    public static int calculateDaysInMonth(Date date) throws NegativeYearException {
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
}
