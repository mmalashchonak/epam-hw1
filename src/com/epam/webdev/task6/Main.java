package com.epam.webdev.task6;

public class Main {
    public static void main(String[] args) {
        int seconds = TimeCalculator.readInputSeconds();
        int secondsRestInInputTime = TimeCalculator.calculateSecondsRestInInputTime(seconds);
        int minutesRestInInputTime = TimeCalculator.calculateMinutesRestInInputTime(seconds);
        int hoursInInputTime = TimeCalculator.calculateHoursInInputTime(seconds);

        System.out.println("Current time: " + hoursInInputTime + " h "
                + minutesRestInInputTime + " m " + secondsRestInInputTime + " s.");
    }
}
