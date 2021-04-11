package com.epam.webdev.task2;

public class Main {
    public static void main(String[] args) throws NegativeYearException {
        Date date = InputReader.readInputDate();
        int daysInMonth = DaysInMonthProcessor.calculateDaysInMonth(date);

        System.out.println("The are " + daysInMonth + " days in this month.");
    }
}
