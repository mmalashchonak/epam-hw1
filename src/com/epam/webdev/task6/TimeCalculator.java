package com.epam.webdev.task6;

import java.util.Scanner;

public class TimeCalculator {

    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int SECONDS_IN_DAY = 86400;

    public static int calculateHoursInInputTime(int seconds) throws NegativeTimeException {

        if(seconds < 0){
            throw new NegativeTimeException();
        }

        int hoursInInputTime = seconds / (MINUTES_IN_HOUR * SECONDS_IN_MINUTE);
        return hoursInInputTime;
    }

    public static int calculateMinutesRestInInputTime(int seconds) throws NegativeTimeException {

        if(seconds < 0){
            throw new NegativeTimeException();
        }

        int minutesRestInInputTime = (seconds % (MINUTES_IN_HOUR * SECONDS_IN_MINUTE)) / (SECONDS_IN_MINUTE);
        return minutesRestInInputTime;
    }

    public static int calculateSecondsRestInInputTime(int seconds) throws NegativeTimeException {

        if(seconds < 0){
            throw new NegativeTimeException();
        }

        int secondsRestInInputTime = seconds % SECONDS_IN_MINUTE;
        return secondsRestInInputTime;
    }

    @SuppressWarnings("resource")
    public static int readInputSeconds() {
        Scanner sc = new Scanner(System.in);
        int inputSeconds = 0;

        while (inputSeconds < 1 || inputSeconds > SECONDS_IN_DAY) {
            System.out.print("Input seconds: ");
            if (sc.hasNextInt()) {
                inputSeconds = sc.nextInt();
            } else {
                System.out.println("Invalid input. Please try again.");
                sc.nextLine();
            }
        }
        return inputSeconds;
    }
}
