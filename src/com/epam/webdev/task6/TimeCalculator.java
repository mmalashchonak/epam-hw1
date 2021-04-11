package com.epam.webdev.task6;

public class TimeCalculator {

    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;

    public static int calculateHoursInInputTime(int seconds) throws NegativeTimeException {

        if(seconds < 0){
            throw new NegativeTimeException("Time can not be negative.");
        }

        int hoursInInputTime = seconds / (MINUTES_IN_HOUR * SECONDS_IN_MINUTE);
        return hoursInInputTime;
    }

    public static int calculateMinutesRestInInputTime(int seconds) throws NegativeTimeException {

        if(seconds < 0){
            throw new NegativeTimeException("Time can not be negative.");
        }

        int minutesRestInInputTime = (seconds % (MINUTES_IN_HOUR * SECONDS_IN_MINUTE)) / (SECONDS_IN_MINUTE);
        return minutesRestInInputTime;
    }

    public static int calculateSecondsRestInInputTime(int seconds) throws NegativeTimeException {

        if(seconds < 0){
            throw new NegativeTimeException("Time can not be negative.");
        }

        int secondsRestInInputTime = seconds % SECONDS_IN_MINUTE;
        return secondsRestInInputTime;
    }
}
