package com.epam.webdev.task2;

public class Main {
    public static void main(String[] args) {
        Date date = DaysInMonthCalculator.readInputDate();
        int daysInMonth = DaysInMonthCalculator.calculateDaysInMonth(date);

        System.out.println("The are " + daysInMonth + " days in this month.");
    }
}
